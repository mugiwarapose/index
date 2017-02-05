package com.ft.config.interceptors;

import com.ft.annotation.Token;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created by poseture on 2017/2/5.
 */
public class TokenIterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {

        HandlerMethod handlerMethod  = (HandlerMethod) handler;

        Class clazz = handlerMethod.getBeanType();

        if(clazz.isAnnotationPresent(Controller.class) || clazz.isAnnotationPresent(RestController.class)){

            Token token = handlerMethod.getMethodAnnotation(Token.class);

            HttpSession session = httpServletRequest.getSession();

            if(token!=null && session!=null){

                boolean need = token.need();

                if(need){
                    String tk = UUID.randomUUID().toString();
                    httpServletRequest.getSession().setAttribute("token", tk);
                    System.out.println("add token:"+tk);
                }

                boolean valid = token.valid();

                if(valid){
                    if(isRepeatSubmit((String) session.getAttribute("token"),httpServletRequest.getParameter("token"))){

                        System.out.println("重复提交");
                        return false;
                    }

                    session.removeAttribute("toekn");
                }
            }

        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

    private boolean isRepeatSubmit(String sessionToen,String requestToken){
        if(sessionToen==null){
            return true;
        }
        if(requestToken==null){
            return true;
        }

        if(!sessionToen.equals(requestToken)){
            return true;
        }

        return false;
    }
}

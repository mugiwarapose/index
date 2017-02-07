package com.ft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.ft.servlet.IndexServlet;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan // 开启通用注解扫描
@ServletComponentScan // 扫描使用注解方式的servlet
public class IndexApplication {

	@Bean
	public ServletRegistrationBean MyServlet(){
		return new ServletRegistrationBean(new IndexServlet(),"/vy");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(IndexApplication.class, args);
	}
}

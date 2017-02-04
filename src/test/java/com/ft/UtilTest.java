package com.ft;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ft.dao.UserMapper;
import com.ft.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)

//指定我们SpringBoot工程的Application启动类
@SpringBootTest(classes = IndexApplication.class)

//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration
@WebAppConfiguration
public class UtilTest {
	
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
    public void test1(){
		List<User> users = userMapper.findAllUser();
		System.out.println(users);
    }
	
}

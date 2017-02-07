package com.ft.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyStartupRunner implements CommandLineRunner  {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("祝你鸡年大吉吧");
		
	}

}

package com.ft.schdule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SchedulingConfig {

	@Scheduled(cron="0/20 * * * * ?")//没20秒执行一次
	public void doSchedule(){
		System.out.println("run schedule");
	}
}

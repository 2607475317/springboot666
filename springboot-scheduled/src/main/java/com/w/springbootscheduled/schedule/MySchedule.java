package com.w.springbootscheduled.schedule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class MySchedule {
     //每隔三秒执行一次任务
    //Scheduled用于设置定时任务
    //conn属性:cron表达式（形式）
    @Scheduled(cron ="0/3 * * * * ?")
    public void test1(){
        System.out.println("执行任务调度");
    }
}

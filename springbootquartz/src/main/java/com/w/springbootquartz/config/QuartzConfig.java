package com.w.springbootquartz.config;

import com.w.springbootquartz.quartz.MyJob;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

@Configuration
public class QuartzConfig {
    //1、创建job对象
      @Bean
      public JobDetailFactoryBean getJobDetailFactoryBean(){
            JobDetailFactoryBean factoryBean=new JobDetailFactoryBean();
            //关联job类(自己写的)
            factoryBean.setJobClass(MyJob.class);
            return factoryBean;
      }
    //2、创建Triger对象
    @Bean
      public SimpleTriggerFactoryBean simpleTriggerFactoryBean(JobDetailFactoryBean DetailFactoryBean){
            SimpleTriggerFactoryBean factoryBean=new SimpleTriggerFactoryBean();
            //关联JobDetail对象
            factoryBean.setJobDetail(DetailFactoryBean.getObject());
            //重复间隔的时间（毫秒为单位）
             factoryBean.setRepeatInterval(5000);
             //重复次数
            factoryBean.setRepeatCount(4);
            return factoryBean;
      }
    //3、创建Scheduler对象
      @Bean
      public SchedulerFactoryBean getSchedulerFactoryBean( SimpleTriggerFactoryBean  TriggerFactoryBean){
           SchedulerFactoryBean factoryBean=new SchedulerFactoryBean();
           //关联triger对象
            factoryBean.setTriggers(TriggerFactoryBean.getObject());
            return factoryBean;
      }

}

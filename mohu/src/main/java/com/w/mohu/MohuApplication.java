package com.w.mohu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.w.mohu.mapper")
public class MohuApplication {

	public static void main(String[] args) {
		SpringApplication.run(MohuApplication.class, args);
	}

}


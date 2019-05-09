package com.w.poi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.w.poi.mapper")
@SpringBootApplication
public class PoiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoiApplication.class, args);
	}

}


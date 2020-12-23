package com.kgc.laws.law;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.CacheConfig;

@CacheConfig
@MapperScan(basePackages ="com.kgc.laws.law.mapper")
@SpringBootApplication
public class LawApplication {

	public static void main(String[] args) {
		SpringApplication.run(LawApplication.class, args);
	}

}

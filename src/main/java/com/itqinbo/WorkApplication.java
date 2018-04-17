package com.itqinbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 		@SpringBootApplication注解用于，开启组件扫描和自动配置。
 * 			实际@SpringBootApplication包含了三个注解功能
 * 		1：Spring的@Configuration：标明该类使用Spring基于Java的配置。
 * 		2：Spring的@ComponentScan：启用组件扫描，比如扫描扫描controller,service注解等，如果不设置basePackage的话 默认会扫描包的所有类，所以在springboot最好也配置扫描的包
 * 		3：Spring Boot 的 @EnableAutoConfiguration：这一行配置开启了Spring Boot自动配置
 */

@SpringBootApplication//开启组件扫描和自动配置
public class WorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkApplication.class, args);
	}
}

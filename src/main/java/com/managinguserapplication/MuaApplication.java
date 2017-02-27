package com.managinguserapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan(basePackages = {"com.racex.managinguserapplication.controller", "com.racex.managinguserapplication.service"})
//@EntityScan("com.racex.managinguserapplication.model")
//@EnableJpaRepositories("com.racex.managinguserapplication.repository")
public class MuaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuaApplication.class, args);
	}
}

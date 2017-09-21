package com.cymon.pygmalion;

import com.cymon.pygmalion.domain.User;
import com.cymon.pygmalion.repositories.BrandRepository;
import com.cymon.pygmalion.repositories.UserRepository;
import com.cymon.pygmalion.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class PygmalionApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(PygmalionApplication.class, args);

		//BrandRepository br = ac.getBean("brandRepository", BrandRepository.class);
		//System.out.println(br.selectPopularAge());

		/*UserRepository ur = ac.getBean("userRepository", UserRepository.class);
		System.out.println(ur.selectFemaleUsers().toString());
		System.out.println(ur.selectMaleUsers().toString());*/


		/*
		//Userdata
		UserService us = ac.getBean("userService", UserService.class);

		UserRepository ur = ac.getBean("userRepository", UserRepository.class);

		List<User> ul = ur.findAll();*/

		/*for (User u1 : ul) {
			System.out.println("Hello " + u1.getFirstName());
		}*/
	}
}

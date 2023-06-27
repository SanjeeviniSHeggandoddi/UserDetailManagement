package com.assignment.springbootapplication;

import com.assignment.springbootapplication.entity.User;
import com.assignment.springbootapplication.entity.UserBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootapplicationApplication{
	public static void main(String[] args) {
		SpringApplication.run(SpringbootapplicationApplication.class, args);
		User userDetails1=new User();
		User userDetails2=new User();

		System.out.println(userDetails1.hashCode());
		System.out.println(userDetails2.hashCode());

		User userDetailsbuilder=new UserBuilder().setId(1).setEmail("sanju123").setName("sanju").getUser();
		System.out.println(userDetailsbuilder);
	}
}

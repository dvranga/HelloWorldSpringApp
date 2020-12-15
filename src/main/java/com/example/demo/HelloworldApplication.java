package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.component.DemoBean;


@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		System.out.println("Hello world");
		ApplicationContext context=SpringApplication.run(HelloworldApplication.class, args);
		DemoBean demoBean=context.getBean(DemoBean.class);
		System.out.println("demoBean  "+demoBean.toString());
	}

}

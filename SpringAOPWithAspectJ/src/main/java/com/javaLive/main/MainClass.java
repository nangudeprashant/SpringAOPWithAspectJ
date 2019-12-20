package com.javaLive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaLive.bussiness.Operation;

public class MainClass {
	public static void main(String[] args){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
		Operation e=(Operation)context.getBean("opBean");
		System.out.println("====================================");
		System.out.println("calling msg...");
		e.msg();
		System.out.println("====================================");
		System.out.println("calling a...");
		e.a();
		System.out.println("====================================");
		System.out.println("calling b...");
		e.b();
		System.out.println("====================================");
		}
	
}

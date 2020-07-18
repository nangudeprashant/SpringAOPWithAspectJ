package com.javaLive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaLive.bussiness.Operation1;
import com.javaLive.bussiness.Operation2;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Operation1 e1 = (Operation1) context.getBean("opBean1");
		Operation2 e2 = (Operation2) context.getBean("opBean2");

		// Now in this case 'e1' is 'Proxy Object' and when process of weaving takes
		// place at runtime,
		// it create 'Target Object'.
		System.out.println("====================================");
		System.out.println("calling msg of bean1...");
		e1.msg();
		System.out.println("====================================");
		System.out.println("calling a of bean1...");
		e1.a();
		System.out.println("====================================");
		System.out.println("calling b of bean1...");
		e1.b();
		System.out.println("====================================");

		// Now here also 'e2' is 'Proxy Object' and when process of weaving takes
		// place at runtime,
		// it create 'Target Object'.
		System.out.println("calling method1 of bean2...");
		e2.method1();
		System.out.println("====================================");

		System.out.println("calling method2 of bean2...");
		e2.method2();
		System.out.println("====================================");
	}
}

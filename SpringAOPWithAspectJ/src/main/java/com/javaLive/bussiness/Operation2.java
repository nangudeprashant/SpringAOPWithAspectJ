package com.javaLive.bussiness;

public class Operation2 {
	public void method1() {//This is one of the Joint Point i.e. Pointcut+Advice as this matches the expression
						   //specified in @Pointcut
		System.out.println("Method1 of class Operation2.");
	}

	public void method2() {//This is one of the Joint Point i.e. Pointcut+Advice as this matches the expression
		                   //specified in @Pointcut
		System.out.println("Method2 of class Operation2.");
	}
}

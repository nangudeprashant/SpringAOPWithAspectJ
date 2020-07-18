package com.javaLive.bussiness;

public class Operation1 {
	public void msg() {//This is one of the Joint Point i.e. Pointcut+Advice as this matches the expression 
		System.out.println("***********msg method invoked"); // specified in @Pointcut
	}

	public int a() {//This is one of the Joint Point i.e. Pointcut+Advice as this matches the expression
		System.out.println("*********a method invoked");// specified in @Pointcut
		return 2;
	}

	public int b(){//This is one of the Joint Point i.e. Pointcut+Advice as this matches the expression
		System.out.println("************b method invoked");// specified in @Pointcut
		return 3;
	}
}

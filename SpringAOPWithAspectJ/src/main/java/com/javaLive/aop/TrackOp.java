package com.javaLive.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOp {
	@Pointcut("execution (* com.javaLive.bussiness.Operation.*(..))")
	public void k() {
	}

	@Before("k()") // applying pointcut on before advice
	public void myadvice(JoinPoint jp) {
		System.out.println("additional concern before method call");
	}
	
	@After("k()") // applying pointcut on before advice
	public void myadvice1(JoinPoint jp) {
		System.out.println("additional concern after method call");
	}
}
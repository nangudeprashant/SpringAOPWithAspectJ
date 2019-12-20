package com.javaLive.aop;

import org.aspectj.lang.JoinPoint;
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
		System.out.println("additional concern");
	}
}
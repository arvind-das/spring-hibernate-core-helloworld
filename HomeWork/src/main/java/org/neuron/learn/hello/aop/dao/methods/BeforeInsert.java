package org.neuron.learn.hello.aop.dao.methods;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;



public class BeforeInsert implements MethodBeforeAdvice{

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before inserting customer");
	}
	
}

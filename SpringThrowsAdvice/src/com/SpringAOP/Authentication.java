package com.SpringAOP;

import org.springframework.aop.ThrowsAdvice;

public class Authentication implements ThrowsAdvice  {
	public void afterThrowing(NullPointerException e) {
		System.out.println("null values");
	}
	

}

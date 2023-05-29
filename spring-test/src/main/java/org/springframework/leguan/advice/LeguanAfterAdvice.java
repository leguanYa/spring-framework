package org.springframework.leguan.advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.advice
 * @Date: 2023/5/24
 */
public class LeguanAfterAdvice implements AfterReturningAdvice {



	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("after");
	}
}

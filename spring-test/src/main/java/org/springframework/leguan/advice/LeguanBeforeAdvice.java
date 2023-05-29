package org.springframework.leguan.advice;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.advice
 * @Date: 2023/5/24
 */
@Component
public class LeguanBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("before");
	}
}

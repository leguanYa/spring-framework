package org.springframework.leguan.advisor;

import org.aopalliance.aop.Advice;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.leguan.advice.LeguanBeforeAdvice;
import org.springframework.leguan.service.UserService;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.advice
 * @Date: 2023/5/24
 */
@Component
public class LeguanPointcutAdvisor implements PointcutAdvisor {
	@Override
	public Advice getAdvice() {
		return new LeguanBeforeAdvice();
	}

	@Override
	public boolean isPerInstance() {
		return true;
	}

	@Override
	public Pointcut getPointcut() {
		return new Pointcut() {
			@Override
			public ClassFilter getClassFilter() {
				return clazz -> clazz.equals(UserService.class);
			}

			@Override
			public MethodMatcher getMethodMatcher() {
				return new MethodMatcher() {
					@Override
					public boolean matches(Method method, Class<?> targetClass) {
						return method.getName().equals("test");
					}

					@Override
					public boolean isRuntime() {
						return true;
					}

					@Override
					public boolean matches(Method method, Class<?> targetClass, Object... args) {
						return true;
					}
				};
			}
		};
	}
}

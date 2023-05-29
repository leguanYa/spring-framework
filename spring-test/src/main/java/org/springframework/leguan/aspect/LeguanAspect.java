package org.springframework.leguan.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.aspect
 * @Date: 2023/3/16
 */
@Aspect
@Component
public class LeguanAspect {

	@Before("execution(public void org.springframework.leguan.service.AService.test())")
	public void leguanLeguan(JoinPoint joinPoint) {
		System.out.println("before");
	}
}

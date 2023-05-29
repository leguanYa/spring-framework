package org.springframework.leguan.aspect;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.leguan.advisor.LeguanPointcutAdvisor;
import org.springframework.leguan.service.UserService;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.aspect
 * @Date: 2023/4/25
 */
public class Test {

	public static void main(String[] args) {


		UserService userService = new UserService();
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(userService);
		proxyFactory.addAdvisor(new LeguanPointcutAdvisor());

		UserService proxy = (UserService) proxyFactory.getProxy();
		proxy.test();

	}
}

package org.springframework.leguan.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.service
 * @Date: 2023/3/1
 */
@Component
//@Scope("prototype")
public class PersonService implements DisposableBean {

	public void test(){
		System.out.println("test");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("关闭了");
	}
}

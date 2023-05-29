package org.springframework.leguan.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @Description：不会在初始化的时候实例化这个bean
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.service
 * @Date: 2023/3/1
 */
@Component
public class OrderFactoryService implements FactoryBean<User> {


	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}

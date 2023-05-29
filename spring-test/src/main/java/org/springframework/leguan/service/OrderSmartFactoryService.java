package org.springframework.leguan.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

/**
 * @Description：如果实现的是SmartFactoryBean接口并且重写的isEagerInit这个接口返回true，那么就会在启动的时候去实例化这个bean
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.service
 * @Date: 2023/3/1
 */
@Component
public class OrderSmartFactoryService implements SmartFactoryBean<User> {



	@Override
	public boolean isEagerInit() {
		return true;
	}

	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}

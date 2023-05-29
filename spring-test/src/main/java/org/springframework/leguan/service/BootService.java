package org.springframework.leguan.service;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.service
 * @Date: 2023/3/6
 */
@Component
public class BootService implements SmartInitializingSingleton {

	//所有的非懒加载的单例bean创建完了之后会一起调用实现了SmartInitializingSingleton接口的中的方法
	@Override
	public void afterSingletonsInstantiated() {

	}
}

package org.springframework.leguan.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.service
 * @Date: 2023/3/6
 */
@Component
public class LisiBeanPostProcessor implements MergedBeanDefinitionPostProcessor {

	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		if (beanName.equals("userService")) {
			//可以进行属性的赋值这些操作
			//beanDefinition.setInitMethodName("");
			//beanDefinition.getPropertyValues().add("orderService", new OrderService());
			//执行销毁的方法
//			beanDefinition.setDestroyMethodName("()");
			System.out.println("执行到了--实例化之后，属性赋值之前处理的一个处理步骤");
		}
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userService")) {
			System.out.println("执行到了--初始化前");
		}
		return MergedBeanDefinitionPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userService")) {
			System.out.println("执行到了--初始化后");
		}
		return MergedBeanDefinitionPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}

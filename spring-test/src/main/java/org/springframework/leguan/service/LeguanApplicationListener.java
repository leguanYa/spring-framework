package org.springframework.leguan.service;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.service
 * @Date: 2023/3/23
 */
@Component
public class LeguanApplicationListener implements ApplicationListener<ApplicationEvent> {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("jianting");
	}
}

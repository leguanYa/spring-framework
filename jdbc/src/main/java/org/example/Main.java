package org.example;

import org.example.shiwu.ShiwuApplication;
import org.example.shiwu.ShiwuService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.example
 * @Date: ${DATE}
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ShiwuApplication.class);
		ShiwuService shiwuService = (ShiwuService) context.getBean("shiwuService");
		shiwuService.test();
	}
}
package org.springframework.leguan.shiwu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.shiwu
 * @Date: 2023/5/30
 */
public class TestTTTT {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ShiWu.class);
		ZhangSanService zhangSanService = (ZhangSanService) context.getBean("zhangSanService");
		zhangSanService.test();
	}
}

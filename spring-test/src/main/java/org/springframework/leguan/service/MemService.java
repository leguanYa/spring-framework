package org.springframework.leguan.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.service
 * @Date: 2023/3/11
 */
public class MemService {

	@Autowired
	private UserService userService;

	/*public void setUserService(UserService userService) {
		this.userService = userService;
	}*/


	public void test1(){
		System.out.println(userService+"ssssss");
	}
}

package org.springframework.leguan;


import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.leguan.service.MemService;
import org.springframework.leguan.service.UserService;


/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan
 * @Date: 2023/3/1
 */
@ComponentScan("org.springframework.leguan")
@EnableAspectJAutoProxy
public class AppCofig {

	@Bean("userService3")
	public UserService userService(){
		return new UserService();
	}


	@Bean(autowire = Autowire.BY_NAME)
	public MemService memService(){
		return new MemService();
	}
}

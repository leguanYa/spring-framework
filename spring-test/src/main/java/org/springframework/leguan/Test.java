package org.springframework.leguan;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.leguan.service.AService;
import org.springframework.leguan.service.MemService;
import org.springframework.leguan.service.UserService;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan
 * @Date: 2023/3/1
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCofig.class);

		/*AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();
		context1.refresh();*/

		//声明bean的时候可以采用声明式的（也就是通过注解或者xml）也可以通过编程式的去声明
		//这个上面可以不加任何的注解也可以成为一个bean 读取器
		/*AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(UserService.class);
		beanDefinition.setScope("prototype");
		context.registerBeanDefinition("userService", beanDefinition);*/

		//这个上面可以不加任何的注解也可以成为一个bean 读取器
		/*AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(context);
		annotatedBeanDefinitionReader.register(UserService.class);*/

		//这个上面可以不加任何的注解也可以成为一个bean 扫描 器
		/*XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(context);
		xmlBeanDefinitionReader.loadBeanDefinitions("spring.xml");*/

		//这个类是会扫描指定路径下的类，并且检查是否有用@Component,如果有生成bean
		/*ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
		scanner.scan("org.springframework.leguan");*/


//		UserService userService = (UserService) context.getBean("userService");
//		userService.test();

		//System.out.println(context.getBean("orderFactoryService"));
		//如果想拿取他本身需要加上&这个符号可以一个或者多个
		//System.out.println(context.getBean("&orderFactoryService"));
		//System.out.println(context.getBean("orderSmartFactoryService"));
		System.out.println(context.getBean("userService"));

		MemService memService = context.getBean("memService", MemService.class);
		memService.test1();


		AService serviceService = context.getBean("AService", AService.class);
		serviceService.test();
		context.publishEvent("12321231");
	}
}

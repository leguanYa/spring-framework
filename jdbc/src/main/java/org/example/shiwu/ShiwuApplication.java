package org.example.shiwu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.example.shiwu
 * @Date: 2023/5/30
 */
@ComponentScan("org.example.shiwu")
@Configuration
@EnableTransactionManagement
public class ShiwuApplication {

	@Bean
	public JdbcTemplate jdbcTemplate(){
		return new JdbcTemplate(dataSource());
	}

	@Bean
	public PlatformTransactionManager transactionManager(){
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());
//		transactionManager.setGlobalRollbackOnParticipationFailure(false);
		return transactionManager;
	}


	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/study_test?characterEncoding=utf-8&serverTimezone=Asia/Shanghai");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("zhang1556190727");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return driverManagerDataSource;
	}
}

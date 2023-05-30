package org.example.shiwu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.example.shiwu
 * @Date: 2023/5/30
 */
@Component
public class ShiwuService {


	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void test(){
		jdbcTemplate.execute("insert into look_test values (7,7)");
	}

	public void test1(){
		jdbcTemplate.execute("insert into look_test values (7,7)");
	}
}

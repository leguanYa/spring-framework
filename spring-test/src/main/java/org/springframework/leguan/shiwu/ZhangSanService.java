package org.springframework.leguan.shiwu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.springframework.leguan.shiwu
 * @Date: 2023/5/30
 */
@Component
public class ZhangSanService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void test(){
		jdbcTemplate.execute("insert into look_test values (7,7)");
	}


	public void test1(){
		jdbcTemplate.execute("insert into look_test values (8,8)");
	}
}

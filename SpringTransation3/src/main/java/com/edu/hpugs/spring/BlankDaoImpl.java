package com.edu.hpugs.spring;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Description 类描述
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年9月13日 下午2:36:52
 */
public class BlankDaoImpl implements IBlankDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void outMonery(String userName, double monery) {
		// TODO Auto-generated method stub
		String sql = "UPDATE userAccount SET monery = monery - ? WHERE name = ?";
		jdbcTemplate.update(sql, monery, userName);
	}

	public void inMonery(String userName, double monery) {
		// TODO Auto-generated method stub
		String sql = "UPDATE userAccount SET monery = monery + ? WHERE name = ?";
		jdbcTemplate.update(sql, monery, userName);
	}

}

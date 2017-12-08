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
	
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void outMonery(String userName, double monery) {
		// TODO Auto-generated method stub
		String sql = "UPDATE userAccount SET monery = monery - ? WHERE name = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, monery, userName);
	}

	public void inMonery(String userName, double monery) {
		// TODO Auto-generated method stub
		String sql = "UPDATE userAccount SET monery = monery + ? WHERE name = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, monery, userName);
	}

}

package com.edu.hpugs.spring;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年9月13日 下午2:36:52
 */
public class BlankDaoImpl extends JdbcDaoSupport implements IBlankDao {

	public void outMonery(String userName, double monery) {
		// TODO Auto-generated method stub
		String sql = "UPDATE userAccount SET monery = monery - ? WHERE name = ?";
		this.getJdbcTemplate().update(sql, monery, userName);
	}

	public void inMonery(String userName, double monery) {
		// TODO Auto-generated method stub
		String sql = "UPDATE userAccount SET monery = monery + ? WHERE name = ?";
		this.getJdbcTemplate().update(sql, monery, userName);
	}

}

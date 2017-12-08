package com.edu.hpugs.spring;

/**
 * @Description 类描述
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年9月13日 下午2:34:14
 */
public interface IBlankDao {

	void outMonery(final String userName, final double monery);
	
	void inMonery(final String userName, final double monery);
	
}

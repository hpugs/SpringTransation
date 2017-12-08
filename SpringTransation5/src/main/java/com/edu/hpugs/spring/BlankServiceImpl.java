package com.edu.hpugs.spring;

/**
 * @Description 类描述
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年9月13日 下午2:33:53
 */
public class BlankServiceImpl implements IBlankService {
	
	private IBlankDao blankDao;
	
	public void setBlankDao(IBlankDao blankDao) {
		this.blankDao = blankDao;
	}
	
	public void transferAccounts(final String outName, final String inName, final double monery) {
		// TODO Auto-generated method stub
		blankDao.outMonery(outName, monery);
		int i = 1 / 0;
		blankDao.inMonery(inName, monery);
	}

}

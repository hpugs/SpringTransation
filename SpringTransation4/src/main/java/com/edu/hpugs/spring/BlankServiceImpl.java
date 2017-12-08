package com.edu.hpugs.spring;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

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
	
	private TransactionTemplate transactionTemplate;
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void transferAccounts(final String outName, final String inName, final double monery) {
		// TODO Auto-generated method stub
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				blankDao.outMonery(outName, monery);
				int i = 1 / 0;
				blankDao.inMonery(inName, monery);
			}
		});
	}

}

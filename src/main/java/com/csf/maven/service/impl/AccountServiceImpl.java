package com.csf.maven.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.csf.maven.dao.impl.AccountDaoImpl;
import com.csf.maven.service.IAccountService;
@Service("accountServiceImpl")
@Transactional
public class AccountServiceImpl implements IAccountService {
@Autowired
	private AccountDaoImpl accountDaoImpl;

@Autowired
private TransactionTemplate transactionTemplate;

	@Override
	public void transfer( final Integer from, final Integer to,final double money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				accountDaoImpl.increaseMoney(from, money);
				
				accountDaoImpl.decreaseMoney(to, money);
			}
		});
		
		
		
	}
	

}

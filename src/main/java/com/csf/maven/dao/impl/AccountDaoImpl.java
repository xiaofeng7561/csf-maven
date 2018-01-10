package com.csf.maven.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.csf.maven.dao.IAccountDao;
@Repository
public class AccountDaoImpl  implements IAccountDao {
@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void increaseMoney(Integer id, Double money) {
		jdbcTemplate.update("update ar_account set money = money + ? where id = ? ;",money,id);
		
	}

	@Override
	public void decreaseMoney(Integer id, Double money) {
		jdbcTemplate.update("update ar_account set money = money - ? where id = ? ;",money,id);
		
	}

}

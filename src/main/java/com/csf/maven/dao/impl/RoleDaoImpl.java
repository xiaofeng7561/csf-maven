package com.csf.maven.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.csf.maven.dao.IRoleDao;

public class RoleDaoImpl extends JdbcDaoSupport implements IRoleDao  {
	
	

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select() {
		 

		        String sql = "select count(*) from role ;";

		        Integer count = getJdbcTemplate().queryForObject(sql,Integer.class);

		       System.out.println(count); 
		    }
	

}

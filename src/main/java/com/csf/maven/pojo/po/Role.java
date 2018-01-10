package com.csf.maven.pojo.po;

import org.springframework.stereotype.Repository;

@Repository("role")
public class Role {
	
	 private Integer cid;
	    private String  rname;
	    private String  alias;
		public Integer getCid() {
			return cid;
		}
		public void setCid(Integer cid) {
			this.cid = cid;
		}
		public String getRname() {
			return rname;
		}
		public void setRname(String rname) {
			this.rname = rname;
		}
		public String getAlias() {
			return alias;
		}
		public void setAlias(String alias) {
			this.alias = alias;
		}
	    
	    
	    
}

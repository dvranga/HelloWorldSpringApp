package com.example.demo.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
	
	private String deptname;
	
	public String getDeptname() {
		return deptname;
	}
	
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
}

package com.jiuqi.xuheyao.dna.demo.ui;

import java.util.Date;

public class DeptInfo {
	private String deptName;
	private Date deptDate;
	
	public DeptInfo()
	{
		
	}
	
	public DeptInfo(String deptName, Date deptDate)
	{
		this.setDeptName(deptName);
		this.setDeptDate(deptDate);
	}
	
	public Date getDeptDate() {
		return deptDate;
	}
	
	public void setDeptDate(Date deptDate) {
		this.deptDate = deptDate;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}

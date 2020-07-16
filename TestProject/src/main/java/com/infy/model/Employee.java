package com.infy.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int eid;
	private String ename;
	private String eprofile;
	private double salary;
	@Autowired
	public Laptop lap;
	
	public Employee() {}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEprofile() {
		return eprofile;
	}
	public void setEprofile(String eprofile) {
		this.eprofile = eprofile;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eprofile=" + eprofile + ", salary=" + salary + ", lap="
				+ lap + "]";
	}
	
	public void print() {
		System.out.println(eid+" "+ename+" "+eprofile+" "+salary+" "+lap.getSystemId()+" "+lap.getSystemName());
	}
	
}

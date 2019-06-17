package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emptab_query")
public class Employee {

	@Id
	private Integer empId;
	private String empName;
	private double empSal;
	private String empLoc;
	
	
	
	public Employee() {
		super();
	}



	public Employee(Integer empId, String empName, double empSal, String empLoc) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empLoc = empLoc;
	}



	public Integer getEmpId() {
		return empId;
	}



	public void setEmpId(Integer empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public double getEmpSal() {
		return empSal;
	}



	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}



	public String getEmpLoc() {
		return empLoc;
	}



	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empLoc=" + empLoc + "]";
	}
	
	
}

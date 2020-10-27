package com.lts.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
	String Name;
	Integer Id;
	String dept;
	@Autowired
	Adreess address;
	
	
	public Adreess getAddress() {
		return address;
	}
	public void setAddress(Adreess address) {
		this.address = address;
	}
	public String getName() {
		return Name;
	}
	@Value("${employee.Name}")
	public void setName(String name) {
		Name = name;
	}
	public Integer getId() {
		return Id;
	}
	@Value("${employee.Id}")
	public void setId(Integer id) {
		Id = id;
	}
	public String getDept() {
		return dept;
	}
	@Value("${employee.dept}")
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Id=" + Id + ", dept=" + dept + ", address=" + address + "]";
	}
	
	
	
}

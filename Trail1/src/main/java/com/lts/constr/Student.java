package com.lts.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	String Name;
	Integer Id;
	String Dept;
	Course course;
	@Autowired
	public Student(Course course) {
		this.course = course;
	}
	
	
	public String getName() {
		return Name;
	}
	@Value("${student.Name}")
	public void setName(String name) {
		Name = name;
	}
	public Integer getId() {
		return Id;
	}
	@Value("${student.Id}")
	public void setId(Integer id) {
		Id = id;
	}
	public String getDept() {
		return Dept;
	}
	@Value("${student.Dept}")
	public void setDept(String dept) {
		Dept = dept;
	}


	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Id=" + Id + ", Dept=" + Dept + ", course=" + course + "]";
	}
	
	

}

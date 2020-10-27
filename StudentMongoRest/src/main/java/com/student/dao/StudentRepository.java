package com.student.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.student.exception.StudentNotFoundException;
import com.student.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {
	//derived
	 List<Student> getStudentsByCity(String city) throws StudentNotFoundException;
	  List<Student> getStudentsByDepartment(String department) throws StudentNotFoundException;
	//JPQL
	  List<Student> findByAge(int age);
}

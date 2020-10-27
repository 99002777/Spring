package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.dao.StudentRepository;
import com.student.exception.StudentNotFoundException;
import com.student.model.Student;

public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		Student newStudent=studentRepository.save(student);
		return newStudent;
	}

	@Override
	public Student getStudentById(int id) {
		
		return null;
	}

	@Override
	public boolean deleteStudentById(int id) throws StudentNotFoundException{
		studentRepository.deleteById(id);
		return false;
	}

	@Override
	public List<Student> getStudentsByCity(String city) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentsByDepartment(String department) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}

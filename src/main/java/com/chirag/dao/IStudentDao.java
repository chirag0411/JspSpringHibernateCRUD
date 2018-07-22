package com.chirag.dao;

import java.util.List;

import com.chirag.model.Student;

public interface IStudentDao {
	
	public List<Student> getAllStudent();

	public void addStudent(Student student);

	public Student updateStudent(Student student);

	public void deleteStudent(int studentId);

	public Student getStudent(int studentId);

}

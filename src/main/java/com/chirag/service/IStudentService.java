package com.chirag.service;

import java.util.List;

import com.chirag.model.Student;

public interface IStudentService {

	public List<Student> getAllStudent();

	public void addStudent(Student student);

	public Student updateStudent(Student student);

	public void deleteStudent(int studentId);

	public Student getStudent(int studentId);

}

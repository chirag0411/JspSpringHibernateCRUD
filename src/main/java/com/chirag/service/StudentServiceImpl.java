package com.chirag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chirag.dao.IStudentDao;
import com.chirag.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao iStudentDao;
	
	public void setEmployeeDAO(IStudentDao iStudentDao) {
		this.iStudentDao = iStudentDao;
	}
	
	@Override
	@Transactional
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return iStudentDao.getAllStudent();
	}

	@Override
	@Transactional
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		iStudentDao.addStudent(student);
	}

	@Override
	@Transactional
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return iStudentDao.updateStudent(student);
	}

	@Override
	@Transactional
	public void deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		iStudentDao.deleteStudent(studentId);
	}

	@Override
	@Transactional
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		return iStudentDao.getStudent(studentId);
	}

}

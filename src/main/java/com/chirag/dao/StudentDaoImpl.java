package com.chirag.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chirag.model.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Student")
				.list();
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(student);
		return student;
	}

	@Override
	public void deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		Student student = (Student) sessionFactory.getCurrentSession().load(
				Student.class, studentId);
		if (null != student) {
			this.sessionFactory.getCurrentSession().delete(student);
		}
	}

	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		return (Student) sessionFactory.getCurrentSession().get(
				Student.class, studentId);
	}

}

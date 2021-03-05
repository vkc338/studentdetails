package com.example.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.dao.DaoInterface;
import com.example.school.entity.Course;
import com.example.school.entity.Student;

@Service
public class ServiceInterfaceImpl implements ServiceInterface
{
	@Autowired
	DaoInterface dao;

	@Override
	public Student addstudent(Student student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}

	@Override
	public List<Student> deleteStudent(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return dao.save(course);
	}

	@Override
	public List<Course> deleteCourse(int courseId) {
		// TODO Auto-generated method stub
		return dao.delete(courseId);
	}

	@Override
	public Student editStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> updateStudent(Student student) {
		// TODO Auto-generated method stub
		dao.save(student);
		return (List<Student>)dao.finAll();
	}

}

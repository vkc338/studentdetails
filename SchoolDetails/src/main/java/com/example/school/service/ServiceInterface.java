package com.example.school.service;

import java.util.List;

import com.example.school.entity.Course;
import com.example.school.entity.Student;


public interface ServiceInterface 

{
	public Student addstudent(Student student);

	public List<Student> deleteStudent(int id);

	public Course addCourse(Course course);

	public List<Course> deleteCourse(int courseId);

	public Student editStudent(int id);

	public List<Student> updateStudent(Student student);

}

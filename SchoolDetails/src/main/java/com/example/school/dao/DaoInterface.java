package com.example.school.dao;

import java.util.List;

import javax.management.loading.ClassLoaderRepository;

import com.example.school.entity.Student;

public interface DaoInterface extends ClassLoaderRepository
{

	public Student findAll(String StudentName);
	Student save(Student student);
	public List<Student> finAll();
}

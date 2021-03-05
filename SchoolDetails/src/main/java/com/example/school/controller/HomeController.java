package com.example.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.school.entity.Course;
import com.example.school.entity.Student;
import com.example.school.service.ServiceInterface;



@Controller
public class HomeController 
{
	@Autowired
	ServiceInterface service;
	
	@PostMapping("/addStudent")
	public ModelAndView addStudent(@RequestBody Student student)
	{
		ModelAndView model= new ModelAndView();
		student=service.addstudent(student);
		return model;
		
		
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteStudent(@RequestParam int id,ModelMap map)
	{
		java.util.List<Student> list=service.deleteStudent(id); 
		map.addAttribute("List", list);
		return null ;
	}
	
	@PostMapping("/addCourse")
	public ModelAndView addCourse(@RequestBody Course course)
	{
		ModelAndView model= new ModelAndView();
		course=service.addCourse(course);
		return model;
	}
	
	@RequestMapping("/deleteCourse")
	public ModelAndView deleteCourse(@RequestParam int courseId,ModelMap map)
	{
		java.util.List<Course> list=service.deleteCourse(courseId); 
		map.addAttribute("List", list);
		return null ;
	}
	
	@RequestMapping("/editStudent")
	public String editStudent(@RequestParam int id,ModelMap map)
	{
		Student student= service.editStudent(id);
		map.addAttribute("Student",student);
		return "update";
	}
	@RequestMapping("/editCourse")
	public String editCourse(@RequestParam int id,ModelMap map)
	{
		Student student= service.editStudent(id);
		map.addAttribute("Student",student);
		return "update";
	}
	
	@RequestMapping("/updateStudent")
	public String updateStudent(@ModelAttribute Student student,@ModelAttribute Course course, ModelMap map)
	{
		java.util.List<Student>list=service.updateStudent(student);
		map.addAttribute("StudentList", list);
		return"success";
	}
}

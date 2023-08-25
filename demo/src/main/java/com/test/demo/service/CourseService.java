package com.test.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.demo.entity.Course;


public interface CourseService {

	
	List<Course> getCourses();
	Course getCourse(long courseId);
	Course addCourse(Course course);
	
}


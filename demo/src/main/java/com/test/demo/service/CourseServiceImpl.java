package com.test.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.demo.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	
	List<Course> list;
	
	 public CourseServiceImpl() {
		// TODO Auto-generated constructor stub
	
		list =new ArrayList<>();
		list.add(new  Course(145,"java Course","lear coding java "));
		list.add(new Course(125,"spring boot","java framework"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId ) {
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	
}

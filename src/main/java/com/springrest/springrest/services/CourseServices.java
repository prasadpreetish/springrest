package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseServices {
	
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public String addCourse(Course course);
	public String updateCourse(Course course,long courseId);
	public String deleteCourse(long courseId);
}

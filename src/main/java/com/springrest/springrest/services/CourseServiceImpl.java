package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseServices {

	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"Java Core Course","This course contains basics of Java."));
		list.add(new Course(139,"SpringBoot Course","This course contains basics of SpringBoot."));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	
	public Course getCourse(long courseId) {
		Course c = null;
		
		for(Course course : list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		
		return c;
	}
	
	public String addCourse(Course course) {
		list.add(course);
		return "The course " + course.getTitle()+" has been added to the list of courses";
	}
	
	public String updateCourse(Course course, long courseId) {
		for(Course c: list) {
			if(c.getId()==courseId) {
				c.setTitle(course.getTitle());
				c.setDescription(course.getDescription());
			}
		}
		
		return "Course updated succesfully to "+ course.getTitle();
	}
	
	public String deleteCourse(long courseId) {
		for(Course c : list) {
			if(c.getId()==courseId) {
				list.remove(c);
				break;
			}
		}
		return "Course Deleted Successfully";
	}

}

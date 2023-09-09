package com.springrest.springrest.mapper;

import com.springrest.springrest.dto.CourseDto;
import com.springrest.springrest.entities.Course;

import java.util.List;
import java.util.stream.Collectors;

public class CourseMapper {
    public static CourseDto toDto(Course course){
        return CourseDto.builder()
                .id(course.getId())
                .title(course.getTitle())
                .description(course.getDescription())
                .build();
    }
    public static Course toCoure(CourseDto courseDto){
        return Course.builder()
                .id(courseDto.getId())
                .title(courseDto.getTitle())
                .description(courseDto.getDescription())
                .build();
    }
    public static List<Course> toCourse(List<CourseDto> courseDtoList){
        return courseDtoList.stream().map(CourseMapper::toCoure).collect(Collectors.toList());
    }
    public static List<CourseDto> toDto(List<Course> courseList){
        return courseList.stream().map(CourseMapper::toDto).collect(Collectors.toList());
    }
}

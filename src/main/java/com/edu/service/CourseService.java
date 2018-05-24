package com.edu.service;

import java.util.List;

import com.edu.pojo.Course;

public interface CourseService {

	
	List<Course> getCourseByTeacherId(int teacher_id);
	int addCourse(Course record);
	int deleteCourseById(int id);
	Course getCourseByCourseId(int id);
	int updateCourse(Course record);
	List<Course> getCourseByType(int type);
	
	
}

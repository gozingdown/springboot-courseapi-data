package com.zheng.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Services are singletons
@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {
		return courseRepository.findByTopicId(topicId);
	}

	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	public void addCourse(Course courses) {
		courseRepository.save(courses);
	}

	public void updateCourse(Course courses) {
		courseRepository.save(courses);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}

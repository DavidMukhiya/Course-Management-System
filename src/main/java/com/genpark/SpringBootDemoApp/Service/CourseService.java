package com.genpark.SpringBootDemoApp.Service;

import com.genpark.SpringBootDemoApp.Entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourse();
    Course getCourseById(int CourseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    String deleteCourseById(int id);


}

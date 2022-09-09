package com.genpark.SpringBootDemoApp.Service;

import com.genpark.SpringBootDemoApp.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(101, "Spring Framework", "Pradeep"));
        list.add(new Course(102, "Spring Boot", "Sukvinder"));
        list.add(new Course(103, "Web Application", "Adam"));
    }

    @Override
    public List<Course> getAllCourse() {
        return list;
    }

    @Override
    public Course getCourseById(int CourseId) {
        Course c = null;
        for (Course course : list) {
            if (course.getCourseid() == CourseId) {
                c = course;
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

    @Override
    public Course updateCourse(Course course) {
        String title = course.getTitle();
        String instructor = course.getInstructor();
        Course e = null;
        for (Course cour : list) {
            if (cour.getCourseid() == course.getCourseid()) {
                cour.setTitle(title);
                cour.setInstructor(instructor);
                e = cour;
                break;
            }
        }
        return e;
    }

    @Override
    public String deleteCourseById(int courseId){
        for(Course course : list){
            if(course.getCourseid()==courseId){
                list.remove(course);
            }
        }
        return "Deleted Sucessfully with Course ID "+courseId;
    }

}

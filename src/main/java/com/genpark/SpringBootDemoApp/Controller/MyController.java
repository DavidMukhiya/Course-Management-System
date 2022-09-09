package com.genpark.SpringBootDemoApp.Controller;

import com.genpark.SpringBootDemoApp.Entity.Course;
import com.genpark.SpringBootDemoApp.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home(){
        return "<HTML><H1>Welcome to My First Boot Application. This is David Mukhiya.</H1></HTML>";
    }
    @GetMapping("/name")
    public String name(@RequestParam(value = "name", defaultValue = "World") String name,@RequestParam(value = "msg", defaultValue = "Good Morning.") String msg){
        return "Hello "+name+"! "+msg;
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getAllCourse();
    }

    @GetMapping("/courses/{courseID}")
    public Course getCourse(@PathVariable String courseID){
        return this.courseService.getCourseById(Integer.parseInt(courseID));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable String courseId){
        return this.courseService.deleteCourseById(Integer.parseInt(courseId));
    }
}

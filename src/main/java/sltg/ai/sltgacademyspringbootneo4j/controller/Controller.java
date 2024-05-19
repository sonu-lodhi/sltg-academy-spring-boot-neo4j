package sltg.ai.sltgacademyspringbootneo4j.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sltg.ai.sltgacademyspringbootneo4j.models.Course;
import sltg.ai.sltgacademyspringbootneo4j.services.CourseService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/courses")
public class Controller {
    private final CourseService courseService;

    public Controller(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<Course>> getCoursesList(){
        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);
    }
}

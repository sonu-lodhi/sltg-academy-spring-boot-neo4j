package sltg.ai.sltgacademyspringbootneo4j.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sltg.ai.sltgacademyspringbootneo4j.models.Course;
import sltg.ai.sltgacademyspringbootneo4j.repositories.CourseRepository;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
}

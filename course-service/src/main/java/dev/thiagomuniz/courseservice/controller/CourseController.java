package dev.thiagomuniz.courseservice.controller;

import dev.thiagomuniz.courseservice.model.Course;
import dev.thiagomuniz.courseservice.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return service.findAll();
    }

    @PostMapping
    public Course createCourse(@RequestBody @Valid Course course) {
        return service.save(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        service.deleteById(id);
    }

    @GetMapping("/paged")
    public Page<Course> getAllCoursesPaged(Pageable pageable) {
        return service.getAllCourses(pageable);
    }

}
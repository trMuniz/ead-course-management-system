package dev.thiagomuniz.courseservice.service;

import dev.thiagomuniz.courseservice.model.Course;
import dev.thiagomuniz.courseservice.repository.CourseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public List<Course> findAll() {
        return repository.findAll();
    }

    public Course save(Course course) {
        return repository.save(course);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Page<Course> getAllCourses(Pageable pageable) {
        return repository.findAll(pageable);
    }

}
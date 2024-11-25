package dev.thiagomuniz.courseservice.repository;

import dev.thiagomuniz.courseservice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

package com.example.springpract.repo;

import com.example.springpract.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepos extends CrudRepository<Course, Long> {
}

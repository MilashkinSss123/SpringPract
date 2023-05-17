package com.example.springpract.repo;

import com.example.springpract.models.CompleteCourse;
import org.springframework.data.repository.CrudRepository;

public interface CompleteCourseRepos extends CrudRepository<CompleteCourse, Long> {
}

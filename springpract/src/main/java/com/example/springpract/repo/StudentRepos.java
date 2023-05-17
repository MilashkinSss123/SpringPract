package com.example.springpract.repo;

import com.example.springpract.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepos extends CrudRepository<Student, Long> {
}

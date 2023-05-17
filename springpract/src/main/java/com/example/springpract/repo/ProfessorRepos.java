package com.example.springpract.repo;

import com.example.springpract.models.Professor;
import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepos extends CrudRepository<Professor, Long> {
}

package com.example.springpract.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompleteCourse {
    String studentName;
    String courseName;
    String profName;
    List<Integer> grades;

    public CompleteCourse(String studentName, String courseName, List<Integer> grades) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.grades = grades;
    }
}

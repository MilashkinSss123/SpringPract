package com.example.springpract.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;
    private String telNumber;
    private String email;
    private Integer bookNumber;
    private Float avgProgress;

    public Student(String name, String address, String telNumber, String email, Integer bookNumber, Float avgProgress) {
    }
}

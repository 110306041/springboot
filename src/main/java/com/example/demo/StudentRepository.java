package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {

    List<Student> findByName(String name);

    Student findByIdAndName(Integer id, String name);

}

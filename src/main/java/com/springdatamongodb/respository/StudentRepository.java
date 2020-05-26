package com.springdatamongodb.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springdatamongodb.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}

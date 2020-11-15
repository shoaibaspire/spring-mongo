package com.crud.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.crud.mongodb.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}
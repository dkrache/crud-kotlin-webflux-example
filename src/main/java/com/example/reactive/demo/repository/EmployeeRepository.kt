package com.example.reactive.demo.repository

import com.example.reactive.demo.model.Employee
import com.example.reactive.demo.model.Tweet
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : ReactiveMongoRepository<Employee, String>
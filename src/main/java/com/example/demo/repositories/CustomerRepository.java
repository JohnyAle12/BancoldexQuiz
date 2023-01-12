package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
}

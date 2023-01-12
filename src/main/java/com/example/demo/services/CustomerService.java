package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Customer;
import com.example.demo.repositories.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public ArrayList<Customer> getCustomers()
    {
        return (ArrayList<Customer>) customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }
}

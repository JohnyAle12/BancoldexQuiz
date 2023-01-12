package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Customer;
import com.example.demo.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping
    public ArrayList<Customer> getCustomers()
    {
        return customerService.getCustomers();
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer)
    {
        return customerService.saveCustomer(customer);
    }
}

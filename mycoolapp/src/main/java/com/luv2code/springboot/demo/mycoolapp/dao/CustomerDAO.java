package com.luv2code.springboot.demo.mycoolapp.dao;

import com.luv2code.springboot.demo.mycoolapp.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// CrudRepository < Customer , int > ---> int represents the primary key

// When we inject CustomerRepository into Customer service, we can write business logic functions using some other fuctions like findall,findmsave,deletebyid | not by using Sql queries

@Repository
public interface CustomerDAO extends CrudRepository<Customer,Integer> {



}

package com.luv2code.springboot.demo.mycoolapp.api;

import com.luv2code.springboot.demo.mycoolapp.model.Customer;
import com.luv2code.springboot.demo.mycoolapp.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping( value = "/customers" )
public class CustomerResource {

    // automatically injects another class into current class
@Autowired

// reference variable of the class customerService, use @component annotation in class that needs to be injected
private customerService customer_service;

// using @RequestBody annotation simply converts json from client to java object

@PostMapping
public Customer addCustomer(@RequestBody Customer customer){
    return customer_service.addCustomer(customer);
}

@GetMapping
public List<Customer>getCustomers(){
    return customer_service.getCustomers();
}

// @PathVariable annotation simply extracts variable from path and makes it available to use
@GetMapping(value="/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") int customerId) {
     return customer_service.getCustomer(customerId);
}

@PutMapping(value="/{customerId}")
public Customer updateCustomer(@PathVariable("customerId") int customerId, @RequestBody Customer customer){
return customer_service.updateCustomer(customerId,customer);
}


@DeleteMapping(value="/{customerId}")

public void deleteCustomer(@PathVariable("customerId") int customerId){
 customer_service.deleteCustomer(customerId);
}



}
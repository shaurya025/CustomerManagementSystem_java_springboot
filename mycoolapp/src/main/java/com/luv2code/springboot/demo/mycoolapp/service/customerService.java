package com.luv2code.springboot.demo.mycoolapp.service;

import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import java.util.List;

import com.luv2code.springboot.demo.mycoolapp.dao.CustomerDAO;
import com.luv2code.springboot.demo.mycoolapp.exception.CustomerNotFoundException;
import com.luv2code.springboot.demo.mycoolapp.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// When


@Component

public class customerService {
    // used to inject a class/interface into another class
    @Autowired
    private CustomerDAO customerDAO;
    private int customerIdCount=1;
    private List<Customer>customerList=new CopyOnWriteArrayList<>();
   public Customer addCustomer(Customer customer){
   return  customerDAO.save(customer);
    }

    public List<Customer>getCustomers(){
      return (List<Customer>) customerDAO.findAll();
    }


    public Customer getCustomer(int customerId){
       Optional <Customer> optional_customer=customerDAO.findById(customerId);
       if(!optional_customer.isPresent()){
           throw new CustomerNotFoundException("Customer Record not available");
       }
       return optional_customer.get();
    }

    public Customer updateCustomer(int customerId,Customer customer ){
      Optional<Customer> existingCustomer = customerDAO.findById(customerId);
        if(!existingCustomer.isPresent()){
            return null;
        }else{
           Customer customerToUpdate = existingCustomer.get();
           customerToUpdate.setCustomerFirstName(customer.getCustomerFirstName());
           customerToUpdate.setCustomerLastName(customer.getCustomerLastName());
           customerToUpdate.setCustomerEmail(customer.getCustomerEmail());
           return customerDAO.save(customerToUpdate);
        }
       }

     public void deleteCustomer(int customerId){
         customerDAO.deleteById(customerId);
     }
}



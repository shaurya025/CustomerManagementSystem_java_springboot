package com.luv2code.springboot.demo.mycoolapp.exception;

// checked exceptions and unchecked exceptions
// checked : IOexception,sql_exception,File_not_found_exception,
// unchecked : array_out_of_boounds,null_ptr_ex,arithmetic_ex


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String message){
     super(message);
    }
}

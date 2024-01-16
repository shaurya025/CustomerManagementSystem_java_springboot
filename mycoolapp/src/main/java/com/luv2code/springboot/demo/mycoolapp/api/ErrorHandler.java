package com.luv2code.springboot.demo.mycoolapp.api;

import com.luv2code.springboot.demo.mycoolapp.exception.ApplicationError;
import com.luv2code.springboot.demo.mycoolapp.exception.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ErrorHandler extends ResponseEntityExceptionHandler {
// basic centralised way to customise errors

    // Value annotation is used to access property from application.properties file
    @Value("${api_doc_url}")
    private String details;

    public ResponseEntity<ApplicationError> handleCustomerNotFoundException(CustomerNotFoundException exception, WebRequest webRequest ){

        ApplicationError error = new ApplicationError();
        error.setCode(101);
        error.setMessage(exception.getMessage());
        error.setDetails("");
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

}

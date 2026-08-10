package com.ClinicDoctor.Doctor.exeption;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.List;

@RestControllerAdvice
public class Exeptionerror {
    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<Globalersponse<?>>handlerexeption(NoResourceFoundException exe)
    {
        var errors= List.of(new Globalersponse.Erroritem("REsource not found"));
        return  new ResponseEntity<>(new Globalersponse<>(errors), HttpStatus.NOT_FOUND);
    }


}

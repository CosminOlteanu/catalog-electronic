package com.application;


import javassist.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.*;

@ControllerAdvice(basePackageClasses = {MainController.class})
@Component
@ResponseBody
@Slf4j
public class ServiceExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    @ResponseBody
    public String handledEntityNotFoundException(NotFoundException exception){
        return exception.getMessage();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(INTERNAL_SERVER_ERROR)
    @ResponseBody
    public String handledException (Exception ex) {
        log.error("Something unexpectedly crashed", ex);
        return "Something unexpectedly crashed";
    }
}

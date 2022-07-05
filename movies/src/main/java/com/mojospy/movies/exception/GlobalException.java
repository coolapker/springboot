package com.mojospy.movies.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(Exception.class)
    public String notFoundException(HttpServletResponse response, Exception e) {
        e.printStackTrace();
        if (response.getStatus() == 404) {
            return "404";
        } else {return "error";}


    }
}

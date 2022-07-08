package com.mojospy.movies.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;

/**
 * @author mojospy
 */
@Slf4j
@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(Exception.class)
    public String notFoundException(HttpServletResponse response, Exception e) {
        e.printStackTrace();
        log.info("response", response);
        return response.getStatus() == 404 ? "404" : "error";


    }
}

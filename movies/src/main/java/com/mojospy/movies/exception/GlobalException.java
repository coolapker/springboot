//package com.mojospy.movies.exception;
//
//import com.mojospy.movies.entity.Movie;
//import com.mojospy.movies.service.MovieService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.List;
//
///**
// * @author mojospy
// */
//@Slf4j
//@RestControllerAdvice
//public class GlobalException {
//
//    @ExceptionHandler(Exception.class)
//    public String notFoundException(HttpServletRequest request, Exception e) {
//        log.info("request---->>>>>>>{}",request.getMethod());
//        return "404";
//
//
//    }
//}

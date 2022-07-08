package com.mojospy.movies;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
//@MapperScan("com.mojospy.movies.dao")
public class MoviesApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoviesApplication.class);
    }
}


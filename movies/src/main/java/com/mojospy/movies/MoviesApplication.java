package com.mojospy.movies;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@Slf4j
@EnableCaching
@SpringBootApplication
//@MapperScan("com.mojospy.movies.dao")
public class MoviesApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoviesApplication.class);
        log.info("66666666666666666666666666");
    }
}


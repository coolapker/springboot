package com.mojospy.movies.controller;

import com.mojospy.movies.entity.Movie;
import com.mojospy.movies.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author mojospy
 */
@Slf4j
@RestController
@RequestMapping("/movies")
public class MovieNameController {
    @Autowired
    private MovieService movieService;


    /**
    * 根据id搜索
    *
    */
    @GetMapping("/{id}")
    Movie getById(@PathVariable Long id) {
        log.info("日志id是"+id);
        return movieService.getById(id);
    }

    @PostMapping
    boolean save(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

}

package com.mojospy.movies.controller;

import com.mojospy.movies.dto.Result;
import com.mojospy.movies.entity.Movie;
import com.mojospy.movies.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    Result getById(@PathVariable Long id) {
        log.info("获取id{}",id);

        Movie movie = movieService.getById(id);
        return new Result(movie,true, "成功");
    }

    @GetMapping
    Result getAll() {
        log.info("获取全部");
        List<Movie> list = movieService.list();
        return new Result(list,true,"成功");
    }

    @PostMapping
    boolean save(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

}

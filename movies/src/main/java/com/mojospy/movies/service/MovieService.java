package com.mojospy.movies.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mojospy.movies.entity.Movie;

import java.util.List;


public interface MovieService extends IService<Movie> {
    List<Movie> order();
}

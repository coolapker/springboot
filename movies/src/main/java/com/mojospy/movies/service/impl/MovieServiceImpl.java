package com.mojospy.movies.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mojospy.movies.dao.MovieDao;
import com.mojospy.movies.entity.Movie;
import com.mojospy.movies.service.MovieService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
@Cacheable
public class MovieServiceImpl extends ServiceImpl<MovieDao, Movie> implements MovieService {

}

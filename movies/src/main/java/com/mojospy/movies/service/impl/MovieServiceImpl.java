package com.mojospy.movies.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mojospy.movies.dao.MovieDao;
import com.mojospy.movies.entity.Movie;
import com.mojospy.movies.service.MovieService;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MovieServiceImpl extends ServiceImpl<MovieDao, Movie> implements MovieService {
    @Override
    @Select("select * from movie order by id")
    public List<Movie> order() {
        return null;
    }
}

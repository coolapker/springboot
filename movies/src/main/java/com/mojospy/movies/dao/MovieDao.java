package com.mojospy.movies.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mojospy.movies.entity.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface MovieDao extends BaseMapper<Movie> {
    @Select("select name from movie order by id")
    List<Movie> order();
}
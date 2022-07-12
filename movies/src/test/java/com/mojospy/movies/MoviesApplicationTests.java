package com.mojospy.movies;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.pagehelper.PageHelper;
import com.mojospy.movies.dao.MovieDao;
import com.mojospy.movies.entity.Movie;
import com.mojospy.movies.service.MovieService;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mapping.TargetAwareIdentifierAccessor;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class MoviesApplicationTests {

    @Autowired
    MovieService movieService;
    @Autowired
    MovieDao dao;

    @Autowired
    DataSource dataSource;

    @Test
    void testTransaction() {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie(0,"事务测试"));
        movies.add(new Movie(0,"事务测试2"));
        movieService.saveBatch(movies);
    }



    @Test
    void add() {
        LambdaQueryWrapper<Movie> lqm = new LambdaQueryWrapper<>();
        Integer id = 4;
        lqm.like(Movie::getId, id)
        ;
        movieService.save(new Movie(0,"6666"));
    }

    @Test
    void testPageHelper() {
        PageHelper.offsetPage(40,10);
        movieService.list()
        ;
    }
    @Test
    void testDataSource() {

        System.out.println("--------->>"+dataSource.getClass());

    }

    @Test
    void testLambda() {
        List<Integer> ls = Arrays.asList(1, 2, 3);
        ls.forEach(System.out::println);
        System.out.println();
    }

    @Test
    void select() {
        movieService.findOne(6);
    }


}




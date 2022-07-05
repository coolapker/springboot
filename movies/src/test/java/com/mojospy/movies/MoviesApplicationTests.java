package com.mojospy.movies;

import com.github.pagehelper.PageHelper;
import com.mojospy.movies.dao.MovieDao;
import com.mojospy.movies.entity.Movie;
import com.mojospy.movies.service.MovieService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoviesApplicationTests {

    @Autowired
    MovieService movieService;
    @Autowired
    MovieDao dao;

    @Test
    void testTransaction() {
        movieService.save(new Movie(0, "test23"));

    }

    @Test
    void add() {
        for (int i = 1; i < 30; i++) {
            movieService.save(new Movie(0,"test"+i));
        }
    }

    @Test
    void testPageHelper() {
        PageHelper.offsetPage(40,10);
        dao.order();

    }
}




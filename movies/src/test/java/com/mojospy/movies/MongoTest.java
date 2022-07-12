package com.mojospy.movies;

import com.mojospy.movies.entity.Movie;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@Slf4j
@SpringBootTest
public class MongoTest {

    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    void save() {
        Movie movie = mongoTemplate.save(new Movie(5, "test"));
        log.info("打印movie>>>>>{}",movie);
    }

    @Test
    void find() {
        List<Movie> list = mongoTemplate.findAll(Movie.class);
        list.forEach(System.out::println);

    }



}

package com.mojospy.movies.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Component
@Data
//@TableName("Movie")
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private Integer id;
    private String name;

    public Movie(String name){
        this.name=name;
    }


}

package com.mojospy.movies.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mojospy
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class Movie {
    private Integer id;
    private String name;

    public Movie(String name){
        this.name=name;
    }


}

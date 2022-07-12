package com.mojospy.movies.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author mojospy
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class Movie implements Serializable {
    private Integer id;
    private String name;

    public Movie(String name){
        this.name=name;
    }


}

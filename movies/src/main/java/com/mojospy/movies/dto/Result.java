package com.mojospy.movies.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Result<T> {
    private T data;
    private Boolean success;
    private String error;

    public Result(T data,Boolean success) {
        this.success=success;
        this.data= data;
    }
}

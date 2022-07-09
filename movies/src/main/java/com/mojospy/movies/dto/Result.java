package com.mojospy.movies.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Result {
    private Object data;
    private Boolean success;
    private String msg;


}

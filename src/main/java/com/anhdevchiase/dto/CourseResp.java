package com.anhdevchiase.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class CourseResp {
    private String name;
    private Double price;
    private Integer time;
}

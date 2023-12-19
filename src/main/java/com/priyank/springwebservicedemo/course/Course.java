package com.priyank.springwebservicedemo.course;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor()
public class Course {
    private long id;
    private String name;

}

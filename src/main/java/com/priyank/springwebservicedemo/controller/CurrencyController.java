package com.priyank.springwebservicedemo.controller;

import com.priyank.springwebservicedemo.configuration.CurrencyServiceConfiguration;
import com.priyank.springwebservicedemo.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency")
    public CurrencyServiceConfiguration currency() {
        return configuration;
    }

}

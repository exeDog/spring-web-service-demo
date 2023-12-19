package com.priyank.springwebservicedemo.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("currency-service")
@Getter
@Setter
public class CurrencyServiceConfiguration {

    private String url;
    private String username;
    private String key;
}

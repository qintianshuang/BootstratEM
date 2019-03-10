package com.huayuan.danke.bootstrat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ServletComponentScan
@ComponentScan(value = "com.huayuan.danke")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class BootstratAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootstratAppApplication.class, args);
    }
}


package com.scb.apipoc;

/**
 * Created by Krit on 1/4/2017.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class TurbineHostApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineHostApplication.class, args);
    }
}

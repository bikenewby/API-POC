package com.scb.apipoc;

/**
 * Created by Krit on 12/19/2016.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import java.net.*;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
@RequestMapping(value="/rest/v1/poc")
public class POCAPIs {

    @RequestMapping(value = "/available")
    public String available() {
        return "Spring in Action";
    }

    @RequestMapping(value = "/checked-out")
    public String checkedOut() {
        String ipAddr = "";
        NetworkInterface netInt;

        try {
            ipAddr = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return "Spring Boot in Action: " + ipAddr;
    }

    public static void main(String[] args) {
        SpringApplication.run(POCAPIs.class, args);
    }
}

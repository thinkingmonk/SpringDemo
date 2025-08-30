package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBackendApplication {

    public static void main(String[] args) {
        // Running with Spring Boot
        ApplicationContext context = SpringApplication.run(SpringBackendApplication.class, args);
//        var orderService = context.getBean(OrderService.class);
//        orderService.placeOrder();

        // Manually wiring dependencies without Spring
        // StripePaymentService can be injected using setter as well but it should be used for optional dependencies
        // Constructor injection is preferred for mandatory dependencies
        // var orderService = new OrderService(new StripePaymentService());
        // orderService.placeOrder();
    }

}

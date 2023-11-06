package com.example.orderservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @GetMapping("/")
    public void doIt() {
        CustomerPaymentMethodResource customerPaymentMethodResource =
                new RestTemplate().getForObject("http://localhost:8080/customerPaymentMethod/{id}", CustomerPaymentMethodResource.class, 13);

        System.out.println(customerPaymentMethodResource);

    }
}

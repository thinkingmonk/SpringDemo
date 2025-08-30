package com.spring.demo;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        var paymentService = "Stripe";
        System.out.println("Processing payment of $" + amount + " through " + paymentService);
    }
}

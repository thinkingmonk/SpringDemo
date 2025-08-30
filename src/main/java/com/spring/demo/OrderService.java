package com.spring.demo;

public class OrderService {

    // Dependency Injection via constructor
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        // Below is how it was before introducing dependency injection
        // var paymentService = new StripePaymentService();
        paymentService.processPayment(1);
    }
}

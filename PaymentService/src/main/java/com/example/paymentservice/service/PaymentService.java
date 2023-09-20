package com.example.paymentservice.service;

import com.example.paymentservice.model.PaymentRequest;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);
}

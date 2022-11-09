package com.wendt.paymentservice.service;

import com.wendt.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(final Payment payment);
}

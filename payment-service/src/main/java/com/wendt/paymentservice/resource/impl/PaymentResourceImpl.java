package com.wendt.paymentservice.resource.impl;

import com.wendt.paymentservice.model.Payment;
import com.wendt.paymentservice.resource.PaymentResource;
import com.wendt.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "payments")
public class PaymentResourceImpl implements PaymentResource {

    private final PaymentService paymentservice;

    @Override
    public ResponseEntity<Payment> payment(final Payment payment) {
        paymentservice.sendPayment(payment);
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .build();
    }

}

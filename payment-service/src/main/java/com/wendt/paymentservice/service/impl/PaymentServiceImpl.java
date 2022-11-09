package com.wendt.paymentservice.service.impl;

import com.wendt.paymentservice.model.Payment;
import com.wendt.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void sendPayment(final Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento {}", payment);
    }

}

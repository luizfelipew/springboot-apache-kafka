package com.wendt.strproducer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Log4j2
@Service
@RequiredArgsConstructor
public class StringProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(final String message) {
        kafkaTemplate.send("str-topic", message)
            .addCallback(
                success -> {
                    if (Objects.nonNull(success)) {
                        log.info("Send message with success {}", message);
                        log.info("Partition {}, offset {}",
                            success.getRecordMetadata().partition(),
                            success.getRecordMetadata().offset());
                    }
                },
                error -> log.error("Error send message"));
    }

}

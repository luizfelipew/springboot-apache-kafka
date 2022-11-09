package com.wendt.strconsumer.listeners;

import com.wendt.strconsumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @StrConsumerCustomListener(groupId = "group-1")
    public void create(final String message) {
        log.info("CREATE ::: Receive message {}", message);
    }

    @StrConsumerCustomListener(groupId = "group-1")
    public void log(final String message) {
        log.info("LOG ::: Receive message {}", message);
    }

    @StrConsumerCustomListener(groupId = "group-2")
    public void history(final String message) {
        log.info("HISTORY ::: Receive message {}", message);
    }
}

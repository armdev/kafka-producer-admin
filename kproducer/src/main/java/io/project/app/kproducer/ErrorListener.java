package io.project.app.kproducer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
@Slf4j
public class ErrorListener {

    @KafkaListener(topics = "mperrors")
    public void processOutput(String output, Acknowledgment acknowledgment) {
        if (output != null) {
            log.error("ERROR CHANNEL RECEIVED MESSAGE");
            acknowledgment.acknowledge();
        }
        log.error("Message:mperrors: " + output);
    }
}

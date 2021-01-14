package io.project.app.kadmin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
@Slf4j
public class MpLogsListener {
 

    @KafkaListener(topics = "mplogs")
    public void processOutput(String output, Acknowledgment acknowledgment) {
        if (output != null) {
            log.info("Request from mplogs recieved " + output);
            acknowledgment.acknowledge();
        }
      
       
    }
}

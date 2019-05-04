/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.app.kproducer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

/**
 *
 * @author armena
 */
@Service
@Component
@Slf4j
public class ProducerService {

    /**
     * The Kafka sender
     */
    private final KafkaSender kafkaSender;

    /**
     * Creates new engine input channel listener
     *
     * @param kafkaSender The Kafka sender
     */
    @Autowired
    public ProducerService(KafkaSender kafkaSender) {
        this.kafkaSender = kafkaSender;
    }

    public String sendMessage(String data) {
        ListenableFuture<SendResult<String, String>> sendGeneratedOutput = kafkaSender.sendData(data);
        boolean done = sendGeneratedOutput.isCancelled();
        if (done) {
            kafkaSender.sendErrors(data);
        }
        return sendGeneratedOutput.toString();
    }
}

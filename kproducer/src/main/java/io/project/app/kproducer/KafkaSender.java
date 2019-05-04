package io.project.app.kproducer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
@Component
@Slf4j
public class KafkaSender {

    /**
     * The output data store
     */
    private final KafkaTemplate<String, String> kafkaTemplate;

    private final String mainTopic = "mpturbine";
    private final String errorTopic = "mperrors";

    /**
     * Sender to pass output data to output module
     *
     * @param kafkaTemplate The Kafka handler
     */
    @Autowired
    public KafkaSender(KafkaTemplate<String, String> kafkaTemplate) {
        super();
        this.kafkaTemplate = kafkaTemplate;
    }

    @Async
    public ListenableFuture<SendResult<String, String>> sendData(String payload) {

        ListenableFuture<SendResult<String, String>> future = this.kafkaTemplate.send(mainTopic, payload);

        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info("KAFKA to  Success sent message='{}' with offset={}", payload, result.getRecordMetadata().offset());
            }

            @Override
            public void onFailure(Throwable ex) {
                log.error("KAFKA FAIL: Unable to send message='{}'", payload, ex);

            }
        });
        return future;
    }

    @Async
    public ListenableFuture<SendResult<String, String>> sendErrors(String payload) {

        ListenableFuture<SendResult<String, String>> future = this.kafkaTemplate.send(errorTopic, payload);

        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info("KAFKA to  Success sent to error topic message='{}' with offset={}", payload, result.getRecordMetadata().offset());
            }

            @Override
            public void onFailure(Throwable ex) {
                log.error("KAFKA FAIL: Unable send also to error channel: message='{}'", payload, ex);

            }
        });
        return future;
    }
}

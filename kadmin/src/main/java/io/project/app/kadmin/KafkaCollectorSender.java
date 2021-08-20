package io.project.app.kadmin;

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
public class KafkaCollectorSender {

    /**
     * The output data store
     */
    private final KafkaTemplate<String, String> kafkaTemplate;

    private final String mainTopic = "mplogs";

    /**
     * Sender to pass output data to output module
     *
     * @param kafkaTemplate The Kafka handler
     */
    @Autowired
    public KafkaCollectorSender(KafkaTemplate<String, String> kafkaTemplate) {
        super();
        this.kafkaTemplate = kafkaTemplate;
    }

    @Async
    public ListenableFuture<SendResult<String, String>> sendData(String payload) {

        ListenableFuture<SendResult<String, String>> future = this.kafkaTemplate.send(mainTopic, payload);

        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info("KAFKA to  mplogs Success sent message='{}' with offset={}", payload, result.getRecordMetadata().offset());
            }

            @Override
            public void onFailure(Throwable ex) {
                log.error("KAFKA FAIL: mplogs Unable to send message='{}'", payload, ex);

            }
        });
        return future;
    }

}

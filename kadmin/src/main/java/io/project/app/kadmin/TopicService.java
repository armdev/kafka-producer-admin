/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.app.kadmin;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.common.PartitionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author armena
 */
@Service
@Component
public class TopicService {

    @Autowired
    private ConsumerFactory<Integer, String> consumerFactory;

    @Autowired
    private KafkaAdmin kafkaAdmin;

    public Set<String> getTopics() {

        try (Consumer<Integer, String> consumer
                = consumerFactory.createConsumer()) {
            Map<String, List<PartitionInfo>> map = consumer.listTopics();

            return map.keySet();
        }

    }
}

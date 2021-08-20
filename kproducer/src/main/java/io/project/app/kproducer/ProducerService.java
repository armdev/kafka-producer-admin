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

        ListenableFuture<SendResult<String, String>> sendGeneratedOutput = kafkaSender.sendData(json);

        boolean done = sendGeneratedOutput.isCancelled();

        if (done) {
            kafkaSender.sendErrors(data);
        }
        return sendGeneratedOutput.toString();
    }

    String json = "\"id\": null,\n"
            + "  \"organizationId\": 1331,\n"
            + "  \"dot\": null,\n"
            + "  \"requestId\": null,\n"
            + "  \"language\": \"EN\",\n"
            + "  \"client\": \"load\",\n"
            + "  \"driverId\": null,\n"
            + "  \"driverGroupId\": null,\n"
            + "  \"invocationTime\": 1629285508000,\n"
            + "  \"runOptions\": {\n"
            + "    \"disableDistanceMatrix\": true,\n"
            + "    \"disablePoiLoading\": true,\n"
            + "    \"maxRunTime\": 3.0\n"
            + "  },\n"
            + "  \"loads\": [\n"
            + "    {\n"
            + "      \"loadId\": \"611cec83c61ba85b82004598\",\n"
            + "      \"type\": \"LOAD\",\n"
            + "      \"operationType\": \"SOLO\",\n"
            + "      \"markers\": null,\n"
            + "      \"status\": \"FUTURE\",\n"
            + "      \"appointments\": [\n"
            + "        {\n"
            + "          \"stopId\": 1,\n"
            + "          \"name\": null,\n"
            + "          \"lat\": 32.76667022705078,\n"
            + "          \"lon\": -96.59889221191406,\n"
            + "          \"start\": \"2021-08-18T15:00:00Z[UTC]\",\n"
            + "          \"end\": \"2021-08-19T06:59:00Z[UTC]\",\n"
            + "          \"minimumHandlingTime\": 120.0,\n"
            + "          \"assistRequired\": false,\n"
            + "          \"type\": null,\n"
            + "          \"markers\": null,\n"
            + "          \"status\": \"FUTURE\",\n"
            + "          \"actualArrival\": null\n"
            + "        },\n"
            + "        {\n"
            + "          \"stopId\": 2,\n"
            + "          \"name\": null,\n"
            + "          \"lat\": 42.0372200012207,\n"
            + "          \"lon\": -88.28111267089844,\n"
            + "          \"start\": \"2021-08-18T15:00:00Z[UTC]\",\n"
            + "          \"end\": \"2021-08-23T15:00:00Z[UTC]\",\n"
            + "          \"minimumHandlingTime\": 120.0,\n"
            + "          \"assistRequired\": false,\n"
            + "          \"type\": null,\n"
            + "          \"markers\": null,\n"
            + "          \"status\": \"FUTURE\",\n"
            + "          \"actualArrival\": null\n"
            + "        }\n"
            + "      ]\n"
            + "    }\n"
            + "  ],\n"
            + "  \"requestActuals\": {\n"
            + "    \"requestTime\": \"2021-08-18T11:18:28.007137809Z\",\n"
            + "    \"currentLat\": null,\n"
            + "    \"currentLon\": null\n"
            + "  },\n"
            + "  \"preloadedData\": null\n"
            + "}";

}

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

    String json ="{\n" +
"  \"_id\" : \"1560285697562\",\n" +
"  \"token\" : \"401c422300aa446894f9319b35e6612c\",\n" +
"  \"request\" : {\n" +
"    \"_id\" : ObjectId(\"5d00106633ed730001d49cc0\"),\n" +
"    \"organizationId\" : NumberLong(1),\n" +
"    \"requestId\" : \"401c422300aa446894f9319b35e6612c\",\n" +
"    \"driverId\" : NumberLong(5),\n" +
"    \"invocationTime\" : NumberLong(\"1560285241187\"),\n" +
"    \"runOptions\" : {\n" +
"      \"disableDistanceMatrix\" : false,\n" +
"      \"disablePoiLoading\" : false,\n" +
"      \"maxRunTime\" : 3.0\n" +
"    },\n" +
"    \"loads\" : [{\n" +
"        \"loadId\" : \"5cc1c9b32f716300014db404\",\n" +
"        \"status\" : \"COMPLETED\",\n" +
"        \"appointments\" : [{\n" +
"            \"stopId\" : NumberLong(1),\n" +
"            \"name\" : \"Porter Ranch Road, Nederland, Colorado 80466, United States\",\n" +
"            \"lat\" : 39.9881017,\n" +
"            \"lon\" : -105.4027848,\n" +
"            \"start\" : ISODate(\"2019-04-25T14:52:00.000Z\"),\n" +
"            \"end\" : ISODate(\"2019-04-26T14:52:00.000Z\"),\n" +
"            \"minimumHandlingTime\" : 120.0,\n" +
"            \"assistRequired\" : false,\n" +
"            \"status\" : \"COMPLETED\"\n" +
"          }, {\n" +
"            \"stopId\" : NumberLong(2),\n" +
"            \"name\" : \"Massapequa Avenue, Massapequa Park, New York 11762, United States\",\n" +
"            \"lat\" : 40.6710434,\n" +
"            \"lon\" : -73.4585065,\n" +
"            \"start\" : ISODate(\"2019-04-26T14:52:00.000Z\"),\n" +
"            \"end\" : ISODate(\"2019-04-28T14:52:00.000Z\"),\n" +
"            \"minimumHandlingTime\" : 120.0,\n" +
"            \"assistRequired\" : false,\n" +
"            \"status\" : \"COMPLETED\"\n" +
"          }, {\n" +
"            \"stopId\" : NumberLong(3),\n" +
"            \"name\" : \"Aaron Drive, East Meadow, New York 11554, United States\",\n" +
"            \"lat\" : 40.7272402,\n" +
"            \"lon\" : -73.541714,\n" +
"            \"start\" : ISODate(\"2019-05-13T11:20:55.000Z\"),\n" +
"            \"end\" : ISODate(\"2019-05-13T11:20:55.000Z\"),\n" +
"            \"minimumHandlingTime\" : 120.0,\n" +
"            \"assistRequired\" : false,\n" +
"            \"status\" : \"FUTURE\"\n" +
"          }]\n" +
"      }, {\n" +
"        \"loadId\" : \"5cc2f832eb5fc70001bc9454\",\n" +
"        \"type\" : \"TIMEOFF\",\n" +
"        \"status\" : \"FUTURE\",\n" +
"        \"appointments\" : [{\n" +
"            \"stopId\" : NumberLong(1),\n" +
"            \"name\" : \"Manhattan Bridge, Manhattan, New York, New York 10038, United States\",\n" +
"            \"lat\" : 40.7095855598283,\n" +
"            \"lon\" : -73.9920632428109,\n" +
"            \"start\" : ISODate(\"2019-04-29T20:00:00.000Z\"),\n" +
"            \"end\" : ISODate(\"2019-05-07T20:00:00.000Z\"),\n" +
"            \"minimumHandlingTime\" : 360.0,\n" +
"            \"assistRequired\" : false,\n" +
"            \"type\" : \"HOME\",\n" +
"            \"status\" : \"FUTURE\"\n" +
"          }]\n" +
"      }, {\n" +
"        \"loadId\" : \"5cc16fc077490a000178e641\",\n" +
"        \"status\" : \"FUTURE\",\n" +
"        \"appointments\" : [{\n" +
"            \"stopId\" : NumberLong(1),\n" +
"            \"name\" : \"Aaron Drive, East Meadow, New York 11554, United States\",\n" +
"            \"lat\" : 40.7272402,\n" +
"            \"lon\" : -73.541714,\n" +
"            \"start\" : ISODate(\"2019-05-07T04:00:00.000Z\"),\n" +
"            \"end\" : ISODate(\"2019-05-09T04:00:00.000Z\"),\n" +
"            \"minimumHandlingTime\" : 120.0,\n" +
"            \"assistRequired\" : false,\n" +
"            \"status\" : \"FUTURE\"\n" +
"          }, {\n" +
"            \"stopId\" : NumberLong(2),\n" +
"            \"name\" : \"Babb Meadow Lane, Greenville, New Hampshire 03048, United States\",\n" +
"            \"lat\" : 42.7402434,\n" +
"            \"lon\" : -71.7080868,\n" +
"            \"start\" : ISODate(\"2019-05-08T04:00:00.000Z\"),\n" +
"            \"end\" : ISODate(\"2019-05-10T04:00:00.000Z\"),\n" +
"            \"minimumHandlingTime\" : 120.0,\n" +
"            \"assistRequired\" : false,\n" +
"            \"status\" : \"FUTURE\"\n" +
"          }]\n" +
"      }, {\n" +
"        \"loadId\" : \"5cc2f8d3eb5fc70001bc9456\",\n" +
"        \"status\" : \"FUTURE\",\n" +
"        \"appointments\" : [{\n" +
"            \"stopId\" : NumberLong(1),\n" +
"            \"name\" : \"Lodge Lane, Miller Place, New York 11764, United States\",\n" +
"            \"lat\" : 40.9574186,\n" +
"            \"lon\" : -72.9974394,\n" +
"            \"start\" : ISODate(\"2019-04-27T16:00:00.000Z\"),\n" +
"            \"end\" : ISODate(\"2019-04-28T12:25:00.000Z\"),\n" +
"            \"minimumHandlingTime\" : 120.0,\n" +
"            \"assistRequired\" : false,\n" +
"            \"status\" : \"FUTURE\"\n" +
"          }, {\n" +
"            \"stopId\" : NumberLong(2),\n" +
"            \"name\" : \"265 Federal St, Greenfield, Massachusetts 01301, United States\",\n" +
"            \"lat\" : 42.598769,\n" +
"            \"lon\" : -72.595484,\n" +
"            \"start\" : ISODate(\"2019-04-29T12:25:00.000Z\"),\n" +
"            \"end\" : ISODate(\"2019-05-02T12:25:00.000Z\"),\n" +
"            \"minimumHandlingTime\" : 120.0,\n" +
"            \"assistRequired\" : false,\n" +
"            \"status\" : \"FUTURE\"\n" +
"          }]\n" +
"      }],\n" +
"    \"requestActuals\" : {\n" +
"      \"requestTime\" : ISODate(\"2019-06-11T20:34:01.217Z\"),\n" +
"      \"currentLat\" : 39.9881017,\n" +
"      \"currentLon\" : -105.4027848\n" +
"    }\n" +
"  },\n" +
"  \"output\" : {\n" +
"    \"tripplans\" : [{\n" +
"        \"_id\" : NumberLong(1125),\n" +
"        \"initialHos\" : {\n" +
"          \"remainingDuty\" : 840.0,\n" +
"          \"remainingDrive\" : 660.0,\n" +
"          \"remainingWeekly\" : 4200.0,\n" +
"          \"remainingBCP\" : 480.0,\n" +
"          \"cumulativeRest\" : 4080.0\n" +
"        },\n" +
"        \"kpis\" : {\n" +
"          \"objectiveValue\" : -33948.00056666667,\n" +
"          \"violations\" : 5,\n" +
"          \"milage\" : 878.0562759525062,\n" +
"          \"driveMinutes\" : 957.6166666666668,\n" +
"          \"dutyMinutes\" : 420.0,\n" +
"          \"hos\" : {\n" +
"            \"remainingDuty\" : 840.0,\n" +
"            \"remainingDrive\" : 660.0,\n" +
"            \"remainingWeekly\" : 2822.383333333333,\n" +
"            \"remainingBCP\" : 480.0,\n" +
"            \"cumulativeRest\" : 600.0\n" +
"          },\n" +
"          \"buffer\" : {\n" +
"            \"initialBuffer\" : 0.0\n" +
"          }\n" +
"        },\n" +
"        \"details\" : {\n" +
"          \"start\" : ISODate(\"2019-06-11T20:34:01.217Z\"),\n" +
"          \"end\" : ISODate(\"2019-06-14T09:31:38.217Z\")\n" +
"        },\n" +
"        \"tripHos\" : [{\n" +
"            \"start\" : ISODate(\"2019-06-11T20:34:01.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-11T21:04:01.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-11T21:04:01.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-11T21:38:56.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-11T21:38:56.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T03:38:56.217Z\"),\n" +
"            \"eventType\" : \"OFF_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T03:38:56.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T04:14:12.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T04:14:12.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T12:14:12.217Z\"),\n" +
"            \"eventType\" : \"SLEEPER_BED\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T12:14:12.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T14:14:12.217Z\"),\n" +
"            \"eventType\" : \"OFF_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T14:14:12.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T14:44:12.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T14:44:12.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T15:31:15.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T15:31:15.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T15:46:15.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T15:46:15.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T16:57:46.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T16:57:46.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T17:12:46.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T17:12:46.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T18:10:30.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T18:10:30.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T18:25:30.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T18:25:30.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T18:34:30.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T18:34:30.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T18:49:30.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T18:49:30.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T18:51:24.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T18:51:24.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T18:53:34.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T18:53:34.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T19:08:34.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T19:08:34.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T19:28:56.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T19:28:56.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T19:43:56.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T19:43:56.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T20:19:02.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T20:19:02.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T20:34:02.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T20:34:02.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T20:35:37.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T20:35:37.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T20:50:37.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T20:50:37.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T21:11:36.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T21:11:36.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T23:11:36.217Z\"),\n" +
"            \"eventType\" : \"OFF_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T23:11:36.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T23:34:21.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T23:34:21.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T23:49:21.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T23:49:21.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-12T23:50:56.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-12T23:50:56.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T00:05:56.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T00:05:56.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T00:57:58.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T00:57:58.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T01:12:58.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T01:12:58.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T01:33:20.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T01:33:20.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T01:48:20.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T01:48:20.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T02:19:32.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T02:19:32.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T02:34:32.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T02:34:32.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T02:43:32.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T02:43:32.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T02:58:32.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T02:58:32.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T03:15:29.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T03:15:29.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T11:15:29.217Z\"),\n" +
"            \"eventType\" : \"SLEEPER_BED\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T11:15:29.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T11:45:29.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T11:45:29.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T12:32:22.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T12:32:22.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T12:47:22.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T12:47:22.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T14:04:34.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T14:04:34.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T14:19:34.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T14:19:34.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T15:07:54.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T15:07:54.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T15:22:54.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T15:22:54.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T15:57:02.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T15:57:02.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T17:57:02.217Z\"),\n" +
"            \"eventType\" : \"OFF_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T17:57:02.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T18:09:49.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T18:09:49.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T18:24:49.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T18:24:49.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T18:27:20.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T18:27:20.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T18:42:20.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T18:42:20.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T19:15:12.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T19:15:12.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T19:30:12.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T19:30:12.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T20:18:13.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T20:18:13.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T20:33:13.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T20:33:13.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T21:15:05.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T21:15:05.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T21:46:55.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T21:46:55.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T22:01:55.217Z\"),\n" +
"            \"eventType\" : \"ON_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T22:01:55.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-13T23:31:38.217Z\"),\n" +
"            \"eventType\" : \"DRIVING\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-13T23:31:38.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-14T07:31:38.217Z\"),\n" +
"            \"eventType\" : \"SLEEPER_BED\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }, {\n" +
"            \"start\" : ISODate(\"2019-06-14T07:31:38.217Z\"),\n" +
"            \"end\" : ISODate(\"2019-06-14T09:31:38.217Z\"),\n" +
"            \"eventType\" : \"OFF_DUTY\",\n" +
"            \"source\" : \"PREDICTION\"\n" +
"          }],\n" +
"        \"loads\" : [{\n" +
"            \"loadId\" : \"5cc2f832eb5fc70001bc9454\",\n" +
"            \"details\" : {\n" +
"              \"start\" : ISODate(\"2019-06-11T20:34:01.217Z\"),\n" +
"              \"end\" : ISODate(\"2019-06-12T03:38:56.217Z\")\n" +
"            },\n" +
"            \"kpis\" : {\n" +
"              \"violations\" : 1,\n" +
"              \"milage\" : 32.0093155949908,\n" +
"              \"driveMinutes\" : 34.916666666666664,\n" +
"              \"dutyMinutes\" : 30.0,\n" +
"              \"tripMilage\" : 32.0093155949908,\n" +
"              \"hos\" : {\n" +
"                \"remainingDuty\" : 775.0833333333334,\n" +
"                \"remainingDrive\" : 625.0833333333334,\n" +
"                \"remainingWeekly\" : 4135.083333333333,\n" +
"                \"remainingBCP\" : 480.0,\n" +
"                \"cumulativeRest\" : 360.0\n" +
"              },\n" +
"              \"buffer\" : {\n" +
"                \"initialBuffer\" : 0.0\n" +
"              },\n" +
"              \"deadhead\" : {\n" +
"                \"estDutyMinutes\" : 64.91666666666667,\n" +
"                \"estDriveMinutes\" : 34.916666666666664,\n" +
"                \"start\" : ISODate(\"2019-06-11T20:34:01.217Z\"),\n" +
"                \"end\" : ISODate(\"2019-06-11T21:38:56.217Z\")\n" +
"              }\n" +
"            },\n" +
"            \"type\" : \"TIMEOFF\",\n" +
"            \"stops\" : [{\n" +
"                \"stopId\" : NumberLong(1),\n" +
"                \"details\" : {\n" +
"                  \"start\" : ISODate(\"2019-06-11T20:34:01.217Z\"),\n" +
"                  \"end\" : ISODate(\"2019-06-12T03:38:56.217Z\"),\n" +
"                  \"routeId\" : \"DEFAULT\",\n" +
"                  \"eta\" : ISODate(\"2019-06-11T21:38:56.217Z\")\n" +
"                },\n" +
"                \"kpis\" : {\n" +
"                  \"volutionMinutes\" : 50498.933333333334,\n" +
"                  \"earlyVolutionMinutes\" : 0.0,\n" +
"                  \"milage\" : 32.0093155949908,\n" +
"                  \"driveMinutes\" : 34.916666666666664,\n" +
"                  \"dutyMinutes\" : 30.0,\n" +
"                  \"loadMilage\" : 32.0093155949908,\n" +
"                  \"tripMilage\" : 32.0093155949908,\n" +
"                  \"hos\" : {\n" +
"                    \"remainingDuty\" : 775.0833333333334,\n" +
"                    \"remainingDrive\" : 625.0833333333334,\n" +
"                    \"remainingWeekly\" : 4135.083333333333,\n" +
"                    \"remainingBCP\" : 480.0,\n" +
"                    \"cumulativeRest\" : 360.0\n" +
"                  },\n" +
"                  \"buffer\" : {\n" +
"                    \"initialBufferMinutes\" : 0.0,\n" +
"                    \"lastBufferMinutes\" : 0.0\n" +
"                  },\n" +
"                  \"possibleAppoinmentWindows\" : [{\n" +
"                      \"start\" : ISODate(\"2019-06-11T21:38:56.217Z\")\n" +
"                    }]\n" +
"                },\n" +
"                \"type\" : \"HOME\",\n" +
"                \"timeline\" : [{\n" +
"                    \"actionName\" : \"NONE\",\n" +
"                    \"locationName\" : \"N/A\",\n" +
"                    \"nextLocationName\" : \"N/A\",\n" +
"                    \"start\" : ISODate(\"2019-06-11T20:34:01.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-11T20:34:01.217Z\"),\n" +
"                    \"duration\" : 0.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"LOCATE\",\n" +
"                    \"locationName\" : \"N/A\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 39.9881017,\n" +
"                      \"lon\" : -105.4027848\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Current Location\",\n" +
"                    \"start\" : ISODate(\"2019-06-11T20:34:01.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-11T20:34:01.217Z\"),\n" +
"                    \"duration\" : 0.0,\n" +
"                    \"hosEventType\" : \"NONE\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"OFFDUTY\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 39.9881017,\n" +
"                      \"lon\" : -105.4027848\n" +
"                    },\n" +
"                    \"locationName\" : \"Current Location\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 39.9881017,\n" +
"                      \"lon\" : -105.4027848\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Current Location\",\n" +
"                    \"start\" : ISODate(\"2019-06-11T20:34:01.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-11T20:34:01.217Z\"),\n" +
"                    \"duration\" : 0.0,\n" +
"                    \"hosEventType\" : \"OFF_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DVIR\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 39.9881017,\n" +
"                      \"lon\" : -105.4027848\n" +
"                    },\n" +
"                    \"locationName\" : \"Current Location\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 39.9881017,\n" +
"                      \"lon\" : -105.4027848\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Current Location\",\n" +
"                    \"start\" : ISODate(\"2019-06-11T20:34:01.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-11T21:04:01.217Z\"),\n" +
"                    \"duration\" : 30.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 39.9881017,\n" +
"                      \"lon\" : -105.4027848\n" +
"                    },\n" +
"                    \"locationName\" : \"Current Location\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.7095855598283,\n" +
"                      \"lon\" : -73.9920632428109\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Manhattan Bridge, Manhattan, New York, New York 10038, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-11T21:04:01.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-11T21:38:56.217Z\"),\n" +
"                    \"duration\" : 34.916666666666664,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"OFFDUTY\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.7095855598283,\n" +
"                      \"lon\" : -73.9920632428109\n" +
"                    },\n" +
"                    \"locationName\" : \"Manhattan Bridge, Manhattan, New York, New York 10038, United States\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.7095855598283,\n" +
"                      \"lon\" : -73.9920632428109\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Manhattan Bridge, Manhattan, New York, New York 10038, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-11T21:38:56.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-11T21:38:56.217Z\"),\n" +
"                    \"duration\" : 0.0,\n" +
"                    \"hosEventType\" : \"OFF_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"APPOINTMENTWORK\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.7095855598283,\n" +
"                      \"lon\" : -73.9920632428109\n" +
"                    },\n" +
"                    \"locationName\" : \"Manhattan Bridge, Manhattan, New York, New York 10038, United States\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.7095855598283,\n" +
"                      \"lon\" : -73.9920632428109\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Manhattan Bridge, Manhattan, New York, New York 10038, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-11T21:38:56.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T03:38:56.217Z\"),\n" +
"                    \"duration\" : 360.0,\n" +
"                    \"hosEventType\" : \"OFF_DUTY\"\n" +
"                  }]\n" +
"              }]\n" +
"          }, {\n" +
"            \"loadId\" : \"5cc16fc077490a000178e641\",\n" +
"            \"details\" : {\n" +
"              \"start\" : ISODate(\"2019-06-12T03:38:56.217Z\"),\n" +
"              \"end\" : ISODate(\"2019-06-12T23:11:36.217Z\")\n" +
"            },\n" +
"            \"kpis\" : {\n" +
"              \"violations\" : 2,\n" +
"              \"milage\" : 277.52674373772044,\n" +
"              \"driveMinutes\" : 302.6666666666667,\n" +
"              \"dutyMinutes\" : 150.0,\n" +
"              \"tripMilage\" : 309.53605933271126,\n" +
"              \"hos\" : {\n" +
"                \"remainingDuty\" : 422.6,\n" +
"                \"remainingDrive\" : 392.6,\n" +
"                \"remainingWeekly\" : 3682.4166666666665,\n" +
"                \"remainingBCP\" : 480.0,\n" +
"                \"cumulativeRest\" : 120.0\n" +
"              },\n" +
"              \"buffer\" : {\n" +
"                \"initialBuffer\" : 0.0\n" +
"              },\n" +
"              \"deadhead\" : {\n" +
"                \"estDutyMinutes\" : 35.266666666666666,\n" +
"                \"estDriveMinutes\" : 35.266666666666666,\n" +
"                \"start\" : ISODate(\"2019-06-12T03:38:56.217Z\"),\n" +
"                \"end\" : ISODate(\"2019-06-12T12:14:12.217Z\")\n" +
"              }\n" +
"            },\n" +
"            \"type\" : \"LOAD\",\n" +
"            \"stops\" : [{\n" +
"                \"stopId\" : NumberLong(1),\n" +
"                \"details\" : {\n" +
"                  \"start\" : ISODate(\"2019-06-12T03:38:56.217Z\"),\n" +
"                  \"end\" : ISODate(\"2019-06-12T14:14:12.217Z\"),\n" +
"                  \"routeId\" : \"DEFAULT\",\n" +
"                  \"eta\" : ISODate(\"2019-06-12T12:14:12.217Z\")\n" +
"                },\n" +
"                \"kpis\" : {\n" +
"                  \"volutionMinutes\" : 49454.2,\n" +
"                  \"earlyVolutionMinutes\" : 0.0,\n" +
"                  \"milage\" : 32.3311858725504,\n" +
"                  \"driveMinutes\" : 35.266666666666666,\n" +
"                  \"dutyMinutes\" : 0.0,\n" +
"                  \"loadMilage\" : 32.3311858725504,\n" +
"                  \"tripMilage\" : 64.3405014675412,\n" +
"                  \"hos\" : {\n" +
"                    \"remainingDuty\" : 840.0,\n" +
"                    \"remainingDrive\" : 660.0,\n" +
"                    \"remainingWeekly\" : 4099.816666666667,\n" +
"                    \"remainingBCP\" : 480.0,\n" +
"                    \"cumulativeRest\" : 600.0\n" +
"                  },\n" +
"                  \"buffer\" : {\n" +
"                    \"initialBufferMinutes\" : 0.0,\n" +
"                    \"lastBufferMinutes\" : 0.0\n" +
"                  },\n" +
"                  \"possibleAppoinmentWindows\" : [{\n" +
"                      \"start\" : ISODate(\"2019-06-12T04:14:12.217Z\"),\n" +
"                      \"end\" : ISODate(\"2019-06-12T11:04:01.217Z\")\n" +
"                    }, {\n" +
"                      \"start\" : ISODate(\"2019-06-12T12:14:12.217Z\")\n" +
"                    }]\n" +
"                },\n" +
"                \"type\" : \"STOP\",\n" +
"                \"timeline\" : [{\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.7095855598283,\n" +
"                      \"lon\" : -73.9920632428109\n" +
"                    },\n" +
"                    \"locationName\" : \"Manhattan Bridge, Manhattan, New York, New York 10038, United States\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.7272402,\n" +
"                      \"lon\" : -73.541714\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Aaron Drive, East Meadow, New York 11554, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T03:38:56.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T04:14:12.217Z\"),\n" +
"                    \"duration\" : 35.266666666666666,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"SLEEPER\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.7272402,\n" +
"                      \"lon\" : -73.541714\n" +
"                    },\n" +
"                    \"locationName\" : \"Aaron Drive, East Meadow, New York 11554, United States\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.7272402,\n" +
"                      \"lon\" : -73.541714\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Aaron Drive, East Meadow, New York 11554, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T04:14:12.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T12:14:12.217Z\"),\n" +
"                    \"duration\" : 480.0,\n" +
"                    \"hosEventType\" : \"SLEEPER_BED\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"APPOINTMENTWORK\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.7272402,\n" +
"                      \"lon\" : -73.541714\n" +
"                    },\n" +
"                    \"locationName\" : \"Aaron Drive, East Meadow, New York 11554, United States\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.7272402,\n" +
"                      \"lon\" : -73.541714\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Aaron Drive, East Meadow, New York 11554, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T12:14:12.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T14:14:12.217Z\"),\n" +
"                    \"duration\" : 120.0,\n" +
"                    \"hosEventType\" : \"OFF_DUTY\"\n" +
"                  }]\n" +
"              }, {\n" +
"                \"stopId\" : NumberLong(2),\n" +
"                \"details\" : {\n" +
"                  \"start\" : ISODate(\"2019-06-12T14:14:12.217Z\"),\n" +
"                  \"end\" : ISODate(\"2019-06-12T23:11:36.217Z\"),\n" +
"                  \"routeId\" : \"DEFAULT\",\n" +
"                  \"eta\" : ISODate(\"2019-06-12T21:11:36.217Z\")\n" +
"                },\n" +
"                \"kpis\" : {\n" +
"                  \"volutionMinutes\" : 48551.6,\n" +
"                  \"earlyVolutionMinutes\" : 0.0,\n" +
"                  \"milage\" : 245.19555786517006,\n" +
"                  \"driveMinutes\" : 267.40000000000003,\n" +
"                  \"dutyMinutes\" : 150.0,\n" +
"                  \"loadMilage\" : 277.52674373772044,\n" +
"                  \"tripMilage\" : 309.53605933271126,\n" +
"                  \"hos\" : {\n" +
"                    \"remainingDuty\" : 422.6,\n" +
"                    \"remainingDrive\" : 392.6,\n" +
"                    \"remainingWeekly\" : 3682.4166666666665,\n" +
"                    \"remainingBCP\" : 480.0,\n" +
"                    \"cumulativeRest\" : 120.0\n" +
"                  },\n" +
"                  \"buffer\" : {\n" +
"                    \"initialBufferMinutes\" : 0.0,\n" +
"                    \"lastBufferMinutes\" : 0.0\n" +
"                  },\n" +
"                  \"possibleAppoinmentWindows\" : [{\n" +
"                      \"start\" : ISODate(\"2019-06-12T21:11:05.217Z\")\n" +
"                    }]\n" +
"                },\n" +
"                \"type\" : \"STOP\",\n" +
"                \"timeline\" : [{\n" +
"                    \"actionName\" : \"DVIR\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.7272402,\n" +
"                      \"lon\" : -73.541714\n" +
"                    },\n" +
"                    \"locationName\" : \"Aaron Drive, East Meadow, New York 11554, United States\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.7272402,\n" +
"                      \"lon\" : -73.541714\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Aaron Drive, East Meadow, New York 11554, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T14:14:12.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T14:44:12.217Z\"),\n" +
"                    \"duration\" : 30.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.7272402,\n" +
"                      \"lon\" : -73.541714\n" +
"                    },\n" +
"                    \"locationName\" : \"Aaron Drive, East Meadow, New York 11554, United States\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.015234,\n" +
"                      \"lon\" : -73.637032\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T14:44:12.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T15:31:15.217Z\"),\n" +
"                    \"duration\" : 47.05,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.015234,\n" +
"                      \"lon\" : -73.637032\n" +
"                    },\n" +
"                    \"locationName\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p33\",\n" +
"                      \"street\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                      \"zip\" : \"6830\",\n" +
"                      \"city\" : \"Greenwich\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.015234,\n" +
"                      \"lon\" : -73.637032\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T15:31:15.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T15:46:15.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.015234,\n" +
"                      \"lon\" : -73.637032\n" +
"                    },\n" +
"                    \"locationName\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p33\",\n" +
"                      \"street\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                      \"zip\" : \"6830\",\n" +
"                      \"city\" : \"Greenwich\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.554322,\n" +
"                      \"lon\" : -72.742901\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"CT DOT Weigh Station\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T15:46:15.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T16:57:46.217Z\"),\n" +
"                    \"duration\" : 71.51666666666667,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.554322,\n" +
"                      \"lon\" : -72.742901\n" +
"                    },\n" +
"                    \"locationName\" : \"CT DOT Weigh Station\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p32\",\n" +
"                      \"street\" : \"CT DOT Weigh Station\",\n" +
"                      \"zip\" : \"6457\",\n" +
"                      \"city\" : \"Middletown\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.554322,\n" +
"                      \"lon\" : -72.742901\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"CT DOT Weigh Station\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T16:57:46.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T17:12:46.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.554322,\n" +
"                      \"lon\" : -72.742901\n" +
"                    },\n" +
"                    \"locationName\" : \"CT DOT Weigh Station\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p32\",\n" +
"                      \"street\" : \"CT DOT Weigh Station\",\n" +
"                      \"zip\" : \"6457\",\n" +
"                      \"city\" : \"Middletown\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.988403,\n" +
"                      \"lon\" : -72.174576\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Weight Station Willington CT I-84\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T17:12:46.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T18:10:30.217Z\"),\n" +
"                    \"duration\" : 57.733333333333334,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.988403,\n" +
"                      \"lon\" : -72.174576\n" +
"                    },\n" +
"                    \"locationName\" : \"Weight Station Willington CT I-84\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p31\",\n" +
"                      \"street\" : \"Weight Station Willington CT I-84\",\n" +
"                      \"zip\" : \"6279\",\n" +
"                      \"city\" : \"Willington\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.988403,\n" +
"                      \"lon\" : -72.174576\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Weight Station Willington CT I-84\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T18:10:30.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T18:25:30.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.988403,\n" +
"                      \"lon\" : -72.174576\n" +
"                    },\n" +
"                    \"locationName\" : \"Weight Station Willington CT I-84\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p31\",\n" +
"                      \"street\" : \"Weight Station Willington CT I-84\",\n" +
"                      \"zip\" : \"6279\",\n" +
"                      \"city\" : \"Willington\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.062162,\n" +
"                      \"lon\" : -72.107494\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"I-84\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T18:25:30.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T18:34:30.217Z\"),\n" +
"                    \"duration\" : 9.0,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.062162,\n" +
"                      \"lon\" : -72.107494\n" +
"                    },\n" +
"                    \"locationName\" : \"I-84\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p115\",\n" +
"                      \"street\" : \"I-84\",\n" +
"                      \"zip\" : \"1566\",\n" +
"                      \"city\" : \"Sturbridge\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.062162,\n" +
"                      \"lon\" : -72.107494\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"I-84\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T18:34:30.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T18:49:30.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.062162,\n" +
"                      \"lon\" : -72.107494\n" +
"                    },\n" +
"                    \"locationName\" : \"I-84\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p115\",\n" +
"                      \"street\" : \"I-84\",\n" +
"                      \"zip\" : \"1566\",\n" +
"                      \"city\" : \"Sturbridge\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.065268,\n" +
"                      \"lon\" : -72.108756\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"400 Haynes Street\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T18:49:30.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T18:51:24.217Z\"),\n" +
"                    \"duration\" : 1.9,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"SLEEPER\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.065268,\n" +
"                      \"lon\" : -72.108756\n" +
"                    },\n" +
"                    \"locationName\" : \"400 Haynes Street\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s4p151\",\n" +
"                      \"street\" : \"400 Haynes Street\",\n" +
"                      \"zip\" : \"1566\",\n" +
"                      \"city\" : \"Sturbridge\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.065268,\n" +
"                      \"lon\" : -72.108756\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"400 Haynes Street\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T18:51:24.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T18:51:24.217Z\"),\n" +
"                    \"duration\" : 0.0,\n" +
"                    \"hosEventType\" : \"SLEEPER_BED\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.065268,\n" +
"                      \"lon\" : -72.108756\n" +
"                    },\n" +
"                    \"locationName\" : \"400 Haynes Street\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s4p151\",\n" +
"                      \"street\" : \"400 Haynes Street\",\n" +
"                      \"zip\" : \"1566\",\n" +
"                      \"city\" : \"Sturbridge\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.051083,\n" +
"                      \"lon\" : -72.121196\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"I-84\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T18:51:24.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T18:53:34.217Z\"),\n" +
"                    \"duration\" : 2.1666666666666665,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.051083,\n" +
"                      \"lon\" : -72.121196\n" +
"                    },\n" +
"                    \"locationName\" : \"I-84\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p116\",\n" +
"                      \"street\" : \"I-84\",\n" +
"                      \"zip\" : \"1566\",\n" +
"                      \"city\" : \"Sturbridge\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.051083,\n" +
"                      \"lon\" : -72.121196\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"I-84\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T18:53:34.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T19:08:34.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.051083,\n" +
"                      \"lon\" : -72.121196\n" +
"                    },\n" +
"                    \"locationName\" : \"I-84\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p116\",\n" +
"                      \"street\" : \"I-84\",\n" +
"                      \"zip\" : \"1566\",\n" +
"                      \"city\" : \"Sturbridge\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.174237,\n" +
"                      \"lon\" : -71.9217\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"I-90\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T19:08:34.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T19:28:56.217Z\"),\n" +
"                    \"duration\" : 20.366666666666667,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.174237,\n" +
"                      \"lon\" : -71.9217\n" +
"                    },\n" +
"                    \"locationName\" : \"I-90\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p117\",\n" +
"                      \"street\" : \"I-90\",\n" +
"                      \"zip\" : \"1507\",\n" +
"                      \"city\" : \"Charlton\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.174237,\n" +
"                      \"lon\" : -71.9217\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"I-90\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T19:28:56.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T19:43:56.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.174237,\n" +
"                      \"lon\" : -71.9217\n" +
"                    },\n" +
"                    \"locationName\" : \"I-90\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p117\",\n" +
"                      \"street\" : \"I-90\",\n" +
"                      \"zip\" : \"1507\",\n" +
"                      \"city\" : \"Charlton\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.520564,\n" +
"                      \"lon\" : -71.700754\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"MA-2\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T19:43:56.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T20:19:02.217Z\"),\n" +
"                    \"duration\" : 35.1,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.520564,\n" +
"                      \"lon\" : -71.700754\n" +
"                    },\n" +
"                    \"locationName\" : \"MA-2\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p112\",\n" +
"                      \"street\" : \"MA-2\",\n" +
"                      \"zip\" : \"1523\",\n" +
"                      \"city\" : \"Lancaster\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.520564,\n" +
"                      \"lon\" : -71.700754\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"MA-2\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T20:19:02.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T20:34:02.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.520564,\n" +
"                      \"lon\" : -71.700754\n" +
"                    },\n" +
"                    \"locationName\" : \"MA-2\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p112\",\n" +
"                      \"street\" : \"MA-2\",\n" +
"                      \"zip\" : \"1523\",\n" +
"                      \"city\" : \"Lancaster\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.521342,\n" +
"                      \"lon\" : -71.702535\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"MA-2\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T20:34:02.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T20:35:37.217Z\"),\n" +
"                    \"duration\" : 1.5833333333333333,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.521342,\n" +
"                      \"lon\" : -71.702535\n" +
"                    },\n" +
"                    \"locationName\" : \"MA-2\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p113\",\n" +
"                      \"street\" : \"MA-2\",\n" +
"                      \"zip\" : \"1523\",\n" +
"                      \"city\" : \"Lancaster\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.521342,\n" +
"                      \"lon\" : -71.702535\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"MA-2\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T20:35:37.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T20:50:37.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.521342,\n" +
"                      \"lon\" : -71.702535\n" +
"                    },\n" +
"                    \"locationName\" : \"MA-2\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p113\",\n" +
"                      \"street\" : \"MA-2\",\n" +
"                      \"zip\" : \"1523\",\n" +
"                      \"city\" : \"Lancaster\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.7402434,\n" +
"                      \"lon\" : -71.7080868\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Babb Meadow Lane, Greenville, New Hampshire 03048, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T20:50:37.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T21:11:36.217Z\"),\n" +
"                    \"duration\" : 20.983333333333334,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"APPOINTMENTWORK\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.7402434,\n" +
"                      \"lon\" : -71.7080868\n" +
"                    },\n" +
"                    \"locationName\" : \"Babb Meadow Lane, Greenville, New Hampshire 03048, United States\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.7402434,\n" +
"                      \"lon\" : -71.7080868\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Babb Meadow Lane, Greenville, New Hampshire 03048, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T21:11:36.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T23:11:36.217Z\"),\n" +
"                    \"duration\" : 120.0,\n" +
"                    \"hosEventType\" : \"OFF_DUTY\"\n" +
"                  }]\n" +
"              }]\n" +
"          }, {\n" +
"            \"loadId\" : \"5cc2f8d3eb5fc70001bc9456\",\n" +
"            \"details\" : {\n" +
"              \"start\" : ISODate(\"2019-06-12T23:11:36.217Z\"),\n" +
"              \"end\" : ISODate(\"2019-06-14T09:31:38.217Z\")\n" +
"            },\n" +
"            \"kpis\" : {\n" +
"              \"violations\" : 2,\n" +
"              \"milage\" : 568.5202166197951,\n" +
"              \"driveMinutes\" : 620.0333333333333,\n" +
"              \"dutyMinutes\" : 240.0,\n" +
"              \"tripMilage\" : 878.0562759525062,\n" +
"              \"hos\" : {\n" +
"                \"remainingDuty\" : 840.0,\n" +
"                \"remainingDrive\" : 660.0,\n" +
"                \"remainingWeekly\" : 2822.383333333333,\n" +
"                \"remainingBCP\" : 480.0,\n" +
"                \"cumulativeRest\" : 600.0\n" +
"              },\n" +
"              \"buffer\" : {\n" +
"                \"initialBuffer\" : 0.0\n" +
"              },\n" +
"              \"deadhead\" : {\n" +
"                \"estDutyMinutes\" : 525.4333333333333,\n" +
"                \"estDriveMinutes\" : 435.43333333333334,\n" +
"                \"start\" : ISODate(\"2019-06-12T23:11:36.217Z\"),\n" +
"                \"end\" : ISODate(\"2019-06-13T15:57:02.217Z\")\n" +
"              }\n" +
"            },\n" +
"            \"type\" : \"LOAD\",\n" +
"            \"stops\" : [{\n" +
"                \"stopId\" : NumberLong(1),\n" +
"                \"details\" : {\n" +
"                  \"start\" : ISODate(\"2019-06-12T23:11:36.217Z\"),\n" +
"                  \"end\" : ISODate(\"2019-06-13T17:57:02.217Z\"),\n" +
"                  \"routeId\" : \"DEFAULT\",\n" +
"                  \"eta\" : ISODate(\"2019-06-13T15:57:02.217Z\")\n" +
"                },\n" +
"                \"kpis\" : {\n" +
"                  \"volutionMinutes\" : 66452.03333333334,\n" +
"                  \"earlyVolutionMinutes\" : 0.0,\n" +
"                  \"milage\" : 330.47191872876505,\n" +
"                  \"driveMinutes\" : 360.4333333333333,\n" +
"                  \"dutyMinutes\" : 165.0,\n" +
"                  \"loadMilage\" : 330.47191872876505,\n" +
"                  \"tripMilage\" : 640.0079780614763,\n" +
"                  \"hos\" : {\n" +
"                    \"remainingDuty\" : 558.45,\n" +
"                    \"remainingDrive\" : 453.45,\n" +
"                    \"remainingWeekly\" : 3156.983333333333,\n" +
"                    \"remainingBCP\" : 480.0,\n" +
"                    \"cumulativeRest\" : 120.0\n" +
"                  },\n" +
"                  \"buffer\" : {\n" +
"                    \"initialBufferMinutes\" : 0.0,\n" +
"                    \"lastBufferMinutes\" : 0.0\n" +
"                  },\n" +
"                  \"possibleAppoinmentWindows\" : [{\n" +
"                      \"start\" : ISODate(\"2019-06-13T15:57:02.217Z\")\n" +
"                    }]\n" +
"                },\n" +
"                \"type\" : \"STOP\",\n" +
"                \"timeline\" : [{\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.7402434,\n" +
"                      \"lon\" : -71.7080868\n" +
"                    },\n" +
"                    \"locationName\" : \"Babb Meadow Lane, Greenville, New Hampshire 03048, United States\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.520564,\n" +
"                      \"lon\" : -71.700754\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"MA-2\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T23:11:36.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T23:34:21.217Z\"),\n" +
"                    \"duration\" : 22.75,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.520564,\n" +
"                      \"lon\" : -71.700754\n" +
"                    },\n" +
"                    \"locationName\" : \"MA-2\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p112\",\n" +
"                      \"street\" : \"MA-2\",\n" +
"                      \"zip\" : \"1523\",\n" +
"                      \"city\" : \"Lancaster\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.520564,\n" +
"                      \"lon\" : -71.700754\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"MA-2\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T23:34:21.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T23:49:21.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.520564,\n" +
"                      \"lon\" : -71.700754\n" +
"                    },\n" +
"                    \"locationName\" : \"MA-2\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p112\",\n" +
"                      \"street\" : \"MA-2\",\n" +
"                      \"zip\" : \"1523\",\n" +
"                      \"city\" : \"Lancaster\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.521342,\n" +
"                      \"lon\" : -71.702535\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"MA-2\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T23:49:21.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-12T23:50:56.217Z\"),\n" +
"                    \"duration\" : 1.5833333333333333,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.521342,\n" +
"                      \"lon\" : -71.702535\n" +
"                    },\n" +
"                    \"locationName\" : \"MA-2\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p113\",\n" +
"                      \"street\" : \"MA-2\",\n" +
"                      \"zip\" : \"1523\",\n" +
"                      \"city\" : \"Lancaster\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.521342,\n" +
"                      \"lon\" : -71.702535\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"MA-2\",\n" +
"                    \"start\" : ISODate(\"2019-06-12T23:50:56.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T00:05:56.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.521342,\n" +
"                      \"lon\" : -71.702535\n" +
"                    },\n" +
"                    \"locationName\" : \"MA-2\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p113\",\n" +
"                      \"street\" : \"MA-2\",\n" +
"                      \"zip\" : \"1523\",\n" +
"                      \"city\" : \"Lancaster\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.051083,\n" +
"                      \"lon\" : -72.121196\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"I-84\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T00:05:56.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T00:57:58.217Z\"),\n" +
"                    \"duration\" : 52.03333333333333,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.051083,\n" +
"                      \"lon\" : -72.121196\n" +
"                    },\n" +
"                    \"locationName\" : \"I-84\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p116\",\n" +
"                      \"street\" : \"I-84\",\n" +
"                      \"zip\" : \"1566\",\n" +
"                      \"city\" : \"Sturbridge\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.051083,\n" +
"                      \"lon\" : -72.121196\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"I-84\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T00:57:58.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T01:12:58.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.051083,\n" +
"                      \"lon\" : -72.121196\n" +
"                    },\n" +
"                    \"locationName\" : \"I-84\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p116\",\n" +
"                      \"street\" : \"I-84\",\n" +
"                      \"zip\" : \"1566\",\n" +
"                      \"city\" : \"Sturbridge\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.174237,\n" +
"                      \"lon\" : -71.9217\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"I-90\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T01:12:58.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T01:33:20.217Z\"),\n" +
"                    \"duration\" : 20.366666666666667,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.174237,\n" +
"                      \"lon\" : -71.9217\n" +
"                    },\n" +
"                    \"locationName\" : \"I-90\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p117\",\n" +
"                      \"street\" : \"I-90\",\n" +
"                      \"zip\" : \"1507\",\n" +
"                      \"city\" : \"Charlton\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.174237,\n" +
"                      \"lon\" : -71.9217\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"I-90\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T01:33:20.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T01:48:20.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.174237,\n" +
"                      \"lon\" : -71.9217\n" +
"                    },\n" +
"                    \"locationName\" : \"I-90\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p117\",\n" +
"                      \"street\" : \"I-90\",\n" +
"                      \"zip\" : \"1507\",\n" +
"                      \"city\" : \"Charlton\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.988403,\n" +
"                      \"lon\" : -72.174576\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Weight Station Willington CT I-84\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T01:48:20.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T02:19:32.217Z\"),\n" +
"                    \"duration\" : 31.2,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.988403,\n" +
"                      \"lon\" : -72.174576\n" +
"                    },\n" +
"                    \"locationName\" : \"Weight Station Willington CT I-84\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p31\",\n" +
"                      \"street\" : \"Weight Station Willington CT I-84\",\n" +
"                      \"zip\" : \"6279\",\n" +
"                      \"city\" : \"Willington\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.988403,\n" +
"                      \"lon\" : -72.174576\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Weight Station Willington CT I-84\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T02:19:32.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T02:34:32.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.988403,\n" +
"                      \"lon\" : -72.174576\n" +
"                    },\n" +
"                    \"locationName\" : \"Weight Station Willington CT I-84\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p31\",\n" +
"                      \"street\" : \"Weight Station Willington CT I-84\",\n" +
"                      \"zip\" : \"6279\",\n" +
"                      \"city\" : \"Willington\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.062162,\n" +
"                      \"lon\" : -72.107494\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"I-84\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T02:34:32.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T02:43:32.217Z\"),\n" +
"                    \"duration\" : 9.0,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.062162,\n" +
"                      \"lon\" : -72.107494\n" +
"                    },\n" +
"                    \"locationName\" : \"I-84\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p115\",\n" +
"                      \"street\" : \"I-84\",\n" +
"                      \"zip\" : \"1566\",\n" +
"                      \"city\" : \"Sturbridge\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.062162,\n" +
"                      \"lon\" : -72.107494\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"I-84\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T02:43:32.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T02:58:32.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.062162,\n" +
"                      \"lon\" : -72.107494\n" +
"                    },\n" +
"                    \"locationName\" : \"I-84\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p115\",\n" +
"                      \"street\" : \"I-84\",\n" +
"                      \"zip\" : \"1566\",\n" +
"                      \"city\" : \"Sturbridge\",\n" +
"                      \"state\" : \"MA\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.9177,\n" +
"                      \"lon\" : -72.2615\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"327 Ruby Road\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T02:58:32.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T03:15:29.217Z\"),\n" +
"                    \"duration\" : 16.95,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"SLEEPER\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.9177,\n" +
"                      \"lon\" : -72.2615\n" +
"                    },\n" +
"                    \"locationName\" : \"327 Ruby Road\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s2p17\",\n" +
"                      \"street\" : \"327 Ruby Road\",\n" +
"                      \"zip\" : \"6279\",\n" +
"                      \"city\" : \"Willington\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.9177,\n" +
"                      \"lon\" : -72.2615\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"327 Ruby Road\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T03:15:29.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T11:15:29.217Z\"),\n" +
"                    \"duration\" : 480.0,\n" +
"                    \"hosEventType\" : \"SLEEPER_BED\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DVIR\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.9177,\n" +
"                      \"lon\" : -72.2615\n" +
"                    },\n" +
"                    \"locationName\" : \"327 Ruby Road\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s2p17\",\n" +
"                      \"street\" : \"327 Ruby Road\",\n" +
"                      \"zip\" : \"6279\",\n" +
"                      \"city\" : \"Willington\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.9177,\n" +
"                      \"lon\" : -72.2615\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"327 Ruby Road\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T11:15:29.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T11:45:29.217Z\"),\n" +
"                    \"duration\" : 30.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.9177,\n" +
"                      \"lon\" : -72.2615\n" +
"                    },\n" +
"                    \"locationName\" : \"327 Ruby Road\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s2p17\",\n" +
"                      \"street\" : \"327 Ruby Road\",\n" +
"                      \"zip\" : \"6279\",\n" +
"                      \"city\" : \"Willington\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.554322,\n" +
"                      \"lon\" : -72.742901\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"CT DOT Weigh Station\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T11:45:29.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T12:32:22.217Z\"),\n" +
"                    \"duration\" : 46.88333333333333,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.554322,\n" +
"                      \"lon\" : -72.742901\n" +
"                    },\n" +
"                    \"locationName\" : \"CT DOT Weigh Station\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p32\",\n" +
"                      \"street\" : \"CT DOT Weigh Station\",\n" +
"                      \"zip\" : \"6457\",\n" +
"                      \"city\" : \"Middletown\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.554322,\n" +
"                      \"lon\" : -72.742901\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"CT DOT Weigh Station\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T12:32:22.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T12:47:22.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.554322,\n" +
"                      \"lon\" : -72.742901\n" +
"                    },\n" +
"                    \"locationName\" : \"CT DOT Weigh Station\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p32\",\n" +
"                      \"street\" : \"CT DOT Weigh Station\",\n" +
"                      \"zip\" : \"6457\",\n" +
"                      \"city\" : \"Middletown\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.015234,\n" +
"                      \"lon\" : -73.637032\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T12:47:22.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T14:04:34.217Z\"),\n" +
"                    \"duration\" : 77.2,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.015234,\n" +
"                      \"lon\" : -73.637032\n" +
"                    },\n" +
"                    \"locationName\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p33\",\n" +
"                      \"street\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                      \"zip\" : \"6830\",\n" +
"                      \"city\" : \"Greenwich\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.015234,\n" +
"                      \"lon\" : -73.637032\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T14:04:34.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T14:19:34.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.015234,\n" +
"                      \"lon\" : -73.637032\n" +
"                    },\n" +
"                    \"locationName\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p33\",\n" +
"                      \"street\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                      \"zip\" : \"6830\",\n" +
"                      \"city\" : \"Greenwich\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.78814,\n" +
"                      \"lon\" : -73.45384\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"NYSDOT TRUCK INSPECTION, Long Island Expy\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T14:19:34.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T15:07:54.217Z\"),\n" +
"                    \"duration\" : 48.333333333333336,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.78814,\n" +
"                      \"lon\" : -73.45384\n" +
"                    },\n" +
"                    \"locationName\" : \"NYSDOT TRUCK INSPECTION, Long Island Expy\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p284\",\n" +
"                      \"street\" : \"NYSDOT TRUCK INSPECTION, Long Island Expy\",\n" +
"                      \"zip\" : \"11803\",\n" +
"                      \"city\" : \"Plainview\",\n" +
"                      \"state\" : \"NY\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.78814,\n" +
"                      \"lon\" : -73.45384\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"NYSDOT TRUCK INSPECTION, Long Island Expy\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T15:07:54.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T15:22:54.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.78814,\n" +
"                      \"lon\" : -73.45384\n" +
"                    },\n" +
"                    \"locationName\" : \"NYSDOT TRUCK INSPECTION, Long Island Expy\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p284\",\n" +
"                      \"street\" : \"NYSDOT TRUCK INSPECTION, Long Island Expy\",\n" +
"                      \"zip\" : \"11803\",\n" +
"                      \"city\" : \"Plainview\",\n" +
"                      \"state\" : \"NY\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.9574186,\n" +
"                      \"lon\" : -72.9974394\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Lodge Lane, Miller Place, New York 11764, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T15:22:54.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T15:57:02.217Z\"),\n" +
"                    \"duration\" : 34.13333333333333,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"APPOINTMENTWORK\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.9574186,\n" +
"                      \"lon\" : -72.9974394\n" +
"                    },\n" +
"                    \"locationName\" : \"Lodge Lane, Miller Place, New York 11764, United States\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.9574186,\n" +
"                      \"lon\" : -72.9974394\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Lodge Lane, Miller Place, New York 11764, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T15:57:02.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T17:57:02.217Z\"),\n" +
"                    \"duration\" : 120.0,\n" +
"                    \"hosEventType\" : \"OFF_DUTY\"\n" +
"                  }]\n" +
"              }, {\n" +
"                \"stopId\" : NumberLong(2),\n" +
"                \"details\" : {\n" +
"                  \"start\" : ISODate(\"2019-06-13T17:57:02.217Z\"),\n" +
"                  \"end\" : ISODate(\"2019-06-14T09:31:38.217Z\"),\n" +
"                  \"routeId\" : \"DEFAULT\",\n" +
"                  \"eta\" : ISODate(\"2019-06-14T07:31:38.217Z\")\n" +
"                },\n" +
"                \"kpis\" : {\n" +
"                  \"volutionMinutes\" : 61626.63333333333,\n" +
"                  \"earlyVolutionMinutes\" : 0.0,\n" +
"                  \"milage\" : 238.04829789103002,\n" +
"                  \"driveMinutes\" : 259.6,\n" +
"                  \"dutyMinutes\" : 75.0,\n" +
"                  \"loadMilage\" : 568.5202166197951,\n" +
"                  \"tripMilage\" : 878.0562759525062,\n" +
"                  \"hos\" : {\n" +
"                    \"remainingDuty\" : 840.0,\n" +
"                    \"remainingDrive\" : 660.0,\n" +
"                    \"remainingWeekly\" : 2822.383333333333,\n" +
"                    \"remainingBCP\" : 480.0,\n" +
"                    \"cumulativeRest\" : 600.0\n" +
"                  },\n" +
"                  \"buffer\" : {\n" +
"                    \"initialBufferMinutes\" : 0.0,\n" +
"                    \"lastBufferMinutes\" : 0.0\n" +
"                  },\n" +
"                  \"possibleAppoinmentWindows\" : [{\n" +
"                      \"start\" : ISODate(\"2019-06-13T23:29:27.217Z\"),\n" +
"                      \"end\" : ISODate(\"2019-06-14T01:45:29.217Z\")\n" +
"                    }, {\n" +
"                      \"start\" : ISODate(\"2019-06-14T07:31:38.217Z\")\n" +
"                    }]\n" +
"                },\n" +
"                \"type\" : \"STOP\",\n" +
"                \"timeline\" : [{\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.9574186,\n" +
"                      \"lon\" : -72.9974394\n" +
"                    },\n" +
"                    \"locationName\" : \"Lodge Lane, Miller Place, New York 11764, United States\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.824899,\n" +
"                      \"lon\" : -72.961721\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Long Island Expy\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T17:57:02.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T18:09:49.217Z\"),\n" +
"                    \"duration\" : 12.783333333333333,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.824899,\n" +
"                      \"lon\" : -72.961721\n" +
"                    },\n" +
"                    \"locationName\" : \"Long Island Expy\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p286\",\n" +
"                      \"street\" : \"Long Island Expy\",\n" +
"                      \"zip\" : \"11763\",\n" +
"                      \"city\" : \"Medford\",\n" +
"                      \"state\" : \"NY\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.824899,\n" +
"                      \"lon\" : -72.961721\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Long Island Expy\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T18:09:49.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T18:24:49.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.824899,\n" +
"                      \"lon\" : -72.961721\n" +
"                    },\n" +
"                    \"locationName\" : \"Long Island Expy\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p286\",\n" +
"                      \"street\" : \"Long Island Expy\",\n" +
"                      \"zip\" : \"11763\",\n" +
"                      \"city\" : \"Medford\",\n" +
"                      \"state\" : \"NY\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.826705,\n" +
"                      \"lon\" : -72.949321\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Long Island Expy\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T18:24:49.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T18:27:20.217Z\"),\n" +
"                    \"duration\" : 2.5166666666666666,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.826705,\n" +
"                      \"lon\" : -72.949321\n" +
"                    },\n" +
"                    \"locationName\" : \"Long Island Expy\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p285\",\n" +
"                      \"street\" : \"Long Island Expy\",\n" +
"                      \"zip\" : \"11980\",\n" +
"                      \"city\" : \"Yaphank\",\n" +
"                      \"state\" : \"NY\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.826705,\n" +
"                      \"lon\" : -72.949321\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Long Island Expy\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T18:27:20.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T18:42:20.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.826705,\n" +
"                      \"lon\" : -72.949321\n" +
"                    },\n" +
"                    \"locationName\" : \"Long Island Expy\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p285\",\n" +
"                      \"street\" : \"Long Island Expy\",\n" +
"                      \"zip\" : \"11980\",\n" +
"                      \"city\" : \"Yaphank\",\n" +
"                      \"state\" : \"NY\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.78814,\n" +
"                      \"lon\" : -73.45384\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"NYSDOT TRUCK INSPECTION, Long Island Expy\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T18:42:20.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T19:15:12.217Z\"),\n" +
"                    \"duration\" : 32.86666666666667,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.78814,\n" +
"                      \"lon\" : -73.45384\n" +
"                    },\n" +
"                    \"locationName\" : \"NYSDOT TRUCK INSPECTION, Long Island Expy\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p284\",\n" +
"                      \"street\" : \"NYSDOT TRUCK INSPECTION, Long Island Expy\",\n" +
"                      \"zip\" : \"11803\",\n" +
"                      \"city\" : \"Plainview\",\n" +
"                      \"state\" : \"NY\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.78814,\n" +
"                      \"lon\" : -73.45384\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"NYSDOT TRUCK INSPECTION, Long Island Expy\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T19:15:12.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T19:30:12.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.78814,\n" +
"                      \"lon\" : -73.45384\n" +
"                    },\n" +
"                    \"locationName\" : \"NYSDOT TRUCK INSPECTION, Long Island Expy\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p284\",\n" +
"                      \"street\" : \"NYSDOT TRUCK INSPECTION, Long Island Expy\",\n" +
"                      \"zip\" : \"11803\",\n" +
"                      \"city\" : \"Plainview\",\n" +
"                      \"state\" : \"NY\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.015234,\n" +
"                      \"lon\" : -73.637032\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T19:30:12.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T20:18:13.217Z\"),\n" +
"                    \"duration\" : 48.016666666666666,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.015234,\n" +
"                      \"lon\" : -73.637032\n" +
"                    },\n" +
"                    \"locationName\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p33\",\n" +
"                      \"street\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                      \"zip\" : \"6830\",\n" +
"                      \"city\" : \"Greenwich\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.015234,\n" +
"                      \"lon\" : -73.637032\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T20:18:13.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T20:33:13.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.015234,\n" +
"                      \"lon\" : -73.637032\n" +
"                    },\n" +
"                    \"locationName\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p33\",\n" +
"                      \"street\" : \"Connecticut Weight Station, 406 Field Point Rd,\",\n" +
"                      \"zip\" : \"6830\",\n" +
"                      \"city\" : \"Greenwich\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.236582,\n" +
"                      \"lon\" : -73.022534\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"433 Old Gate Lane\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T20:33:13.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T21:15:05.217Z\"),\n" +
"                    \"duration\" : 41.86666666666667,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"SLEEPER\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.236582,\n" +
"                      \"lon\" : -73.022534\n" +
"                    },\n" +
"                    \"locationName\" : \"433 Old Gate Lane\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s4p172\",\n" +
"                      \"street\" : \"433 Old Gate Lane\",\n" +
"                      \"zip\" : \"6460\",\n" +
"                      \"city\" : \"Milford \",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.236582,\n" +
"                      \"lon\" : -73.022534\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"433 Old Gate Lane\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T21:15:05.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T21:15:05.217Z\"),\n" +
"                    \"duration\" : 0.0,\n" +
"                    \"hosEventType\" : \"SLEEPER_BED\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.236582,\n" +
"                      \"lon\" : -73.022534\n" +
"                    },\n" +
"                    \"locationName\" : \"433 Old Gate Lane\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s4p172\",\n" +
"                      \"street\" : \"433 Old Gate Lane\",\n" +
"                      \"zip\" : \"6460\",\n" +
"                      \"city\" : \"Milford \",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.554322,\n" +
"                      \"lon\" : -72.742901\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"CT DOT Weigh Station\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T21:15:05.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T21:46:55.217Z\"),\n" +
"                    \"duration\" : 31.833333333333332,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.554322,\n" +
"                      \"lon\" : -72.742901\n" +
"                    },\n" +
"                    \"locationName\" : \"CT DOT Weigh Station\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p32\",\n" +
"                      \"street\" : \"CT DOT Weigh Station\",\n" +
"                      \"zip\" : \"6457\",\n" +
"                      \"city\" : \"Middletown\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.554322,\n" +
"                      \"lon\" : -72.742901\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"CT DOT Weigh Station\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T21:46:55.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T22:01:55.217Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.554322,\n" +
"                      \"lon\" : -72.742901\n" +
"                    },\n" +
"                    \"locationName\" : \"CT DOT Weigh Station\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"s1p32\",\n" +
"                      \"street\" : \"CT DOT Weigh Station\",\n" +
"                      \"zip\" : \"6457\",\n" +
"                      \"city\" : \"Middletown\",\n" +
"                      \"state\" : \"CT\",\n" +
"                      \"country\" : \"US\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.598769,\n" +
"                      \"lon\" : -72.595484\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"265 Federal St, Greenfield, Massachusetts 01301, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T22:01:55.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-13T23:31:38.217Z\"),\n" +
"                    \"duration\" : 89.71666666666667,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"SLEEPER\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.598769,\n" +
"                      \"lon\" : -72.595484\n" +
"                    },\n" +
"                    \"locationName\" : \"265 Federal St, Greenfield, Massachusetts 01301, United States\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.598769,\n" +
"                      \"lon\" : -72.595484\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"265 Federal St, Greenfield, Massachusetts 01301, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-13T23:31:38.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-14T07:31:38.217Z\"),\n" +
"                    \"duration\" : 480.0,\n" +
"                    \"hosEventType\" : \"SLEEPER_BED\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"APPOINTMENTWORK\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.598769,\n" +
"                      \"lon\" : -72.595484\n" +
"                    },\n" +
"                    \"locationName\" : \"265 Federal St, Greenfield, Massachusetts 01301, United States\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.598769,\n" +
"                      \"lon\" : -72.595484\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"265 Federal St, Greenfield, Massachusetts 01301, United States\",\n" +
"                    \"start\" : ISODate(\"2019-06-14T07:31:38.217Z\"),\n" +
"                    \"end\" : ISODate(\"2019-06-14T09:31:38.217Z\"),\n" +
"                    \"duration\" : 120.0,\n" +
"                    \"hosEventType\" : \"OFF_DUTY\"\n" +
"                  }]\n" +
"              }]\n" +
"          }]\n" +
"      }]\n" +
"  },\n" +
"  \"_class\" : \"com.optym.marketplace.request.model.TokenizedResponseMessage\"\n" +
"}";

}
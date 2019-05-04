package io.project.app.kadmin;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "/api/v2/topics")
@RequestMapping(path = "/api/v2/topics", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @CrossOrigin
    public ResponseEntity<?> get() {

        return ResponseEntity.status(HttpStatus.OK).body(topicService.getTopics());

    }
}

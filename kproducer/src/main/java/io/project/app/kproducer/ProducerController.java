package io.project.app.kproducer;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "/api/v2/data")
@RequestMapping(path = "/api/v2/data", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping
    @ResponseBody
    @CrossOrigin
    public ResponseEntity<?> post(@RequestBody String data) {

        return ResponseEntity.status(HttpStatus.OK).body(producerService.sendMessage(data + " - " + System.currentTimeMillis()));

    }
}

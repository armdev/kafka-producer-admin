package io.project.app.kproducer;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {"io.project"})
@EnableAsync
@EnableKafka
@EnableAutoConfiguration
public class KproducerApplication {

    public static void main(String[] args) {
        final SpringApplication application = new SpringApplication(KproducerApplication.class);
        application.setBannerMode(Banner.Mode.CONSOLE);
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

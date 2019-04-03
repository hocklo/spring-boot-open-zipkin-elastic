package poc.zipkin.samples.complex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TraceComplexGenerator {

    public static void main(String[] args) {
        SpringApplication.run(TraceComplexGenerator.class, args);
    }

    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

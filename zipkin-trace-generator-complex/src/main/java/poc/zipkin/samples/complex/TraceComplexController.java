package poc.zipkin.samples.complex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class TraceComplexController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    public String home() throws URISyntaxException {
        RequestEntity<String> requestEntity =
            new RequestEntity<>(HttpMethod.GET, new URI("http://localhost:8080/"));
        ResponseEntity<String> responseEntity = restTemplate.exchange(requestEntity, String.class);
        return responseEntity.getBody();
    }
}

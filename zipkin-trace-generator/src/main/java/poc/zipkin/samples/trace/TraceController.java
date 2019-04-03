package poc.zipkin.samples.trace;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraceController {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }
}

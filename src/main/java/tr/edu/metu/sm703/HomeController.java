package tr.edu.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;


@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Get
    public Map<String, Object> index(@QueryValue Optional<String> val) {
        if(val.equals(Optional.of("error"))){
            logger.error("error occurred");
            return null;
        }
        return Collections.singletonMap("message", "Hello World " + val.orElse(""));
    }
}

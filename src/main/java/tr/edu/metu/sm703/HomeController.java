package tr.edu.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

import java.util.Collections;
import java.util.Map;



@Controller
public class HomeController {

    @Get
    public Map<String, Object> index(@QueryValue String val) {
        // TODO
        return Collections.singletonMap("message", "Hello World new " + val);
    }
}

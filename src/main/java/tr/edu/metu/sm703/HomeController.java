package tr.edu.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.Collections;
import java.util.Map;



@Controller
public class HomeController {

    @Get
    public Map<String, Object> index() {
        String inputString = "s3cr37";
        byte[] key         = inputString.getBytes(); //TODO

        String password = "sm703"; //TODO
        return Collections.singletonMap("message", "Hello World new " + password);
    }
}

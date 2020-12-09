package harbor;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

@Controller("/")
public class AppController {

    @Get(uri="/", produces=MediaType.TEXT_PLAIN)
    public String index() {
        return "Harbor Service";
    }

    @Get(uri="/healthCheck", produces=MediaType.TEXT_PLAIN)
    public String healthCheck() {
        return "health check";
    }
}
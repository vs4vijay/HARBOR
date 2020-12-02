package harbor;

import io.micronaut.http.annotation.*;

@Controller("/")
public class AppController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Harbor Service";
    }

    @Get(uri="/healthCheck", produces="text/plain")
    public String healthCheck() {
        return "health check";
    }
}
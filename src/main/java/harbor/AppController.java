package harbor;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.runtime.server.EmbeddedServer;

import javax.inject.Inject;

@Controller("/")
public class AppController {

    @Inject
    EmbeddedServer server;

    @Get(uri="/", produces=MediaType.TEXT_PLAIN)
    public String index() {
        return "Harbor Service";
    }

    @Get(uri="/healthCheck", produces=MediaType.TEXT_PLAIN)
    public String healthCheck() {
        return "health check";
    }
}
package harbor;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("/spacex")
public class SpaceXController {

    @Inject
    SpaceXClient spaceXClient;

    @Get(uri="/rockets", produces = MediaType.APPLICATION_JSON)
    public io.reactivex.Single<Object> getRockets() {
        return spaceXClient.getRockets();
    }
}

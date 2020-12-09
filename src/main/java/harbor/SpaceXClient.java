package harbor;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.Retryable;
import io.reactivex.Single;

@Retryable
@Client("https://api.spacexdata.com/v3")
public interface SpaceXClient {

    @Get(uri = "/rockets", consumes = MediaType.APPLICATION_JSON)
    Single<Object> getRockets();
}

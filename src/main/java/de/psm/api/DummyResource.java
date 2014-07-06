package de.psm.api;

import com.codahale.metrics.Counter;
import com.codahale.metrics.MetricRegistry;
import com.google.api.server.spi.Constant;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.response.BadRequestException;
import de.psm.api.dto.Greeting;
import de.psm.metrics.MetricsRegistryService;


/**
 * @author Peter Schneider-Manzell
 */
@Api(name = "dummyApi", version = "v1", description = "Provides all resources needed for the Shop form a customer's point of view..",
        scopes = {Constants.EMAIL_SCOPE},
        clientIds = {Constants.WEB_CLIENT, Constant.API_EXPLORER_CLIENT_ID},
        audiences = {Constants.WEB_CLIENT}
)
public class DummyResource {

    //private final Meter sayHelloMeter = MetricsRegistryService.getRegistry().meter(MetricRegistry.name(DummyResource.class, "sayHelloMeter"));
    private final Counter sayHelloCounter = MetricsRegistryService.getRegistry().counter(MetricRegistry.name(DummyResource.class, "sayHelloCounter"));

    @ApiMethod(name = "sayHello", httpMethod = ApiMethod.HttpMethod.POST)
    public Greeting sayHello(@Named("name") String name) throws BadRequestException {

        //sayHelloMeter.mark();

        sayHelloCounter.dec();

        StringBuilder sb = new StringBuilder("Hello ");
        sb.append(name);
        sb.append("!");
        return new Greeting(sb.toString());


    }
}

package de.psm.web;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.servlets.MetricsServlet;
import de.psm.metrics.MetricsRegistryService;

/**
 * @author Peter Schneider-Manzell
 */
public class MetricsListener extends MetricsServlet.ContextListener {

    public static final MetricRegistry METRIC_REGISTRY = MetricsRegistryService.getRegistry();


    @Override
    protected MetricRegistry getMetricRegistry() {
        return METRIC_REGISTRY;
    }
}

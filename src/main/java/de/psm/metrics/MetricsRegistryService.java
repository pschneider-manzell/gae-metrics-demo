package de.psm.metrics;

import com.codahale.metrics.MetricRegistry;

/**
 * @author Peter Schneider-Manzell
 */
public class MetricsRegistryService {

    private static final MetricRegistry REGISTRY = new MetricRegistry();

    public static MetricRegistry getRegistry(){
        return  REGISTRY;
    }
}

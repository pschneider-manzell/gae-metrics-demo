Codahale Metrics on Google App Engine
==============================

This example tries to integrate [Metrics](http://metrics.codahale.com/) into an Google App Engine application
 

**Currently the metrics integration in google app engine is broken due to the usage of classes restricted by GAE**

- Metrics uses `sun.misc.Unsafe` which is not allowed by the google app engine. See [here](https://github.com/dropwizard/metrics/issues/539) for more details 
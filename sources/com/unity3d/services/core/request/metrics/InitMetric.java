package com.unity3d.services.core.request.metrics;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class InitMetric {
    private static final String INIT_METRIC_ENVIRONMENT_NOT_OK = "native_init_environment_not_ok";
    private static final String INIT_METRIC_ENVIRONMENT_OK = "native_init_environment_ok";

    public static Metric newInitEnvironmentNotOk() {
        return new Metric(INIT_METRIC_ENVIRONMENT_NOT_OK, null);
    }

    public static Metric newInitEnvironmentOk() {
        return new Metric(INIT_METRIC_ENVIRONMENT_OK, null);
    }
}

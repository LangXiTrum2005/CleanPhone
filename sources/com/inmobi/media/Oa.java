package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static TelemetryConfig f23044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pc f23045b;

    static {
        Na na = new Na();
        LinkedHashMap linkedHashMap = O2.f23027a;
        Config configA = M2.a("telemetry", Uc.b(), na);
        Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig");
        TelemetryConfig telemetryConfig = (TelemetryConfig) configA;
        f23044a = telemetryConfig;
        f23045b = new Pc(((double) 1) - telemetryConfig.getPingSamplingFactor());
    }

    public static void a(String eventType, Map keyValueMap) {
        Intrinsics.f(eventType, "eventType");
        Intrinsics.f(keyValueMap, "keyValueMap");
        if (eventType.equals("PingDBMaxLimitReached")) {
            Pd pd = Pd.f23077a;
            Pd.b(eventType, keyValueMap, Td.SDK);
        } else if (f23045b.a()) {
            double d = 1;
            keyValueMap.put("samplingRate", Integer.valueOf((int) ((d - f23044a.getSamplingFactor()) * (d - f23044a.getPingSamplingFactor()) * ((double) 100))));
            Pd pd2 = Pd.f23077a;
            Pd.b(eventType, keyValueMap, Td.SDK);
        }
    }
}

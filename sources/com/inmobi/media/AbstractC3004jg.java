package com.inmobi.media;

import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3004jg {
    public static final Gi a;

    static {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        a = new Gi(((double) 1) - ((TelemetryConfig) Y3.a.a(TelemetryConfig.class)).getPingSamplingFactor());
    }

    public static void a(String eventType, Map keyValueMap) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        if (Intrinsics.wireman(eventType, "PingDBMaxLimitReached")) {
            Wj wj = Wj.a;
            Wj.b(eventType, keyValueMap, EnumC2779ak.SDK);
            return;
        }
        if (a.a()) {
            double d = 1;
            C2968i4 c2968i4 = Y3.a;
            Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
            C2968i4 c2968i5 = Y3.a;
            double pingSamplingFactor = d - ((TelemetryConfig) c2968i5.a(TelemetryConfig.class)).getPingSamplingFactor();
            Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
            keyValueMap.put("samplingRate", Integer.valueOf((int) ((d - ((TelemetryConfig) c2968i5.a(TelemetryConfig.class)).getSamplingFactor()) * pingSamplingFactor * ((double) 100))));
            Wj wj2 = Wj.a;
            Wj.b(eventType, keyValueMap, EnumC2779ak.SDK);
        }
    }
}

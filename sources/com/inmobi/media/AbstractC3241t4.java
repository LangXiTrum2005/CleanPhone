package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3241t4 {
    public static final String a(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (Intrinsics.wireman(clazz, RootConfig.class)) {
            return "root";
        }
        if (Intrinsics.wireman(clazz, AdConfig.class)) {
            return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
        }
        if (Intrinsics.wireman(clazz, TelemetryConfig.class)) {
            return "telemetry";
        }
        if (Intrinsics.wireman(clazz, SignalsConfig.class)) {
            return "signals";
        }
        if (Intrinsics.wireman(clazz, CrashConfig.class)) {
            return "crashReporting";
        }
        throw new IllegalArgumentException("Type: " + clazz);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class a(String configType) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    return CrashConfig.class;
                }
                break;
            case 96432:
                if (configType.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    return AdConfig.class;
                }
                break;
            case 3506402:
                if (configType.equals("root")) {
                    return RootConfig.class;
                }
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    return TelemetryConfig.class;
                }
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    return SignalsConfig.class;
                }
                break;
        }
        throw new IllegalArgumentException("Type: " + configType);
    }
}

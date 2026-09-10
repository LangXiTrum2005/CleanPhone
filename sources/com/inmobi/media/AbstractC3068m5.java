package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3068m5 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Config a(String configType) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    return new CrashConfig();
                }
                break;
            case 96432:
                if (configType.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    return new AdConfig();
                }
                break;
            case 3506402:
                if (configType.equals("root")) {
                    return new RootConfig();
                }
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    return new TelemetryConfig();
                }
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    return new SignalsConfig();
                }
                break;
        }
        throw new IllegalArgumentException("Type: " + configType);
    }
}

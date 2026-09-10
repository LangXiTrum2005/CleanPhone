package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class G2 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Config a(String configType, String str) {
        Intrinsics.f(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    return new CrashConfig(str);
                }
                break;
            case 96432:
                if (configType.equals("ads")) {
                    return new AdConfig(str);
                }
                break;
            case 3506402:
                if (configType.equals("root")) {
                    return new RootConfig(str);
                }
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    return new TelemetryConfig(str);
                }
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    return new SignalsConfig(str);
                }
                break;
        }
        return new AdConfig(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x00d0  */
    public static Config a(String configType, JSONObject jsonObject, String str, long j) {
        Config config;
        Intrinsics.f(configType, "configType");
        Intrinsics.f(jsonObject, "jsonObject");
        switch (configType) {
            case "crashReporting":
                CrashConfig.Companion.getClass();
                config = (Config) new C3191q6().a(jsonObject, CrashConfig.class);
                break;
            case "ads":
                AdConfig.Companion.getClass();
                config = (Config) com.inmobi.commons.core.configs.b.a().a(jsonObject, AdConfig.class);
                break;
            case "root":
                RootConfig.Companion.getClass();
                config = (Config) new C3191q6().a(new Ec("components", RootConfig.class), (Dc) new U6(new com.inmobi.commons.core.configs.d(), RootConfig.ComponentConfig.class)).a(new Ec(RootConfig.IP_ADDRESS_TP_SUPPORT_KEY, RootConfig.class), (Dc) new U6(new Bc(), String.class)).a(jsonObject, RootConfig.class);
                break;
            case "telemetry":
                TelemetryConfig.Companion.getClass();
                config = (Config) new C3191q6().a(new Ec("priorityEvents", TelemetryConfig.class), (Dc) new U6(new Qd(), String.class)).a(jsonObject, TelemetryConfig.class);
                break;
            case "signals":
                SignalsConfig.Companion.getClass();
                config = (Config) com.inmobi.commons.core.configs.f.a().a(jsonObject, SignalsConfig.class);
                break;
            default:
                AdConfig.Companion.getClass();
                config = (Config) com.inmobi.commons.core.configs.b.a().a(jsonObject, AdConfig.class);
                break;
        }
        if (config != null) {
            config.setAccountId$media_release(str);
            config.setLastUpdateTimeStamp(j);
        }
        return config;
    }
}

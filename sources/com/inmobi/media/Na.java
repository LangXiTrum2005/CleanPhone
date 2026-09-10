package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.TelemetryConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Na implements N2 {
    @Override // com.inmobi.media.N2
    public final void a(Config config) {
        Intrinsics.f(config, "config");
        if (config instanceof TelemetryConfig) {
            Oa.f23044a = (TelemetryConfig) config;
            Oa.f23045b.f23075a = ((double) 1) - Oa.f23044a.getPingSamplingFactor();
        }
    }
}

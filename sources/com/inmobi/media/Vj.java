package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.TelemetryConfig;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Vj implements InterfaceC3216s4 {
    @Override // com.inmobi.media.InterfaceC3216s4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof TelemetryConfig) {
            TelemetryConfig telemetryConfigB = Wj.b();
            Wj.g = new C3008jk(new Yj(telemetryConfigB.getEnabled(), telemetryConfigB.getAssetReporting().isImageEnabled(), telemetryConfigB.getAssetReporting().isGifEnabled(), telemetryConfigB.getAssetReporting().isVideoEnabled(), telemetryConfigB.getDisableAllGeneralEvents(), telemetryConfigB.getPriorityEventsList(), telemetryConfigB.getSamplingFactor()), CollectionsKt.molet(Wj.c));
            C2908fk c2908fk = Wj.i;
            if (c2908fk != null) {
                TelemetryConfig telemetryConfig = Wj.b();
                Intrinsics.checkNotNullParameter(telemetryConfig, "telemetryConfig");
                c2908fk.a = telemetryConfig;
            }
        }
    }
}

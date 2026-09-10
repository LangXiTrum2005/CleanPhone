package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3033kk {
    public final Yj a;
    public final double b;

    public C3033kk(Yj telemetryConfigMetaData, double d) {
        Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        this.a = telemetryConfigMetaData;
        this.b = d;
    }

    public final int a(String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (this.b >= this.a.g) {
            return 0;
        }
        Wj wj = Wj.a;
        return 2;
    }
}

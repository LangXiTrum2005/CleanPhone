package com.inmobi.media;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3008jk {
    public final Yj a;
    public final Fi b;
    public final C3033kk c;

    public C3008jk(Yj telemetryConfigMetaData, List samplingEvents) {
        Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        Intrinsics.checkNotNullParameter(samplingEvents, "samplingEvents");
        this.a = telemetryConfigMetaData;
        double dRandom = Math.random();
        this.b = new Fi(telemetryConfigMetaData, dRandom, samplingEvents);
        this.c = new C3033kk(telemetryConfigMetaData, dRandom);
    }
}

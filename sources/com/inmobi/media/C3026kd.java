package com.inmobi.media;

import android.content.Context;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3026kd {
    public final Context a;
    public final G b;
    public final boolean c;
    public final Za d;
    public final Dc e;
    public final InterfaceC3064m1 f;
    public final InterfaceC3072m9 g;

    public C3026kd(Context context, G adContext, boolean z, Za telemetryMetaData, Dc adTelemetryHelper, InterfaceC3064m1 adUnitCallback, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        Intrinsics.checkNotNullParameter(telemetryMetaData, "telemetryMetaData");
        Intrinsics.checkNotNullParameter(adTelemetryHelper, "adTelemetryHelper");
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a = context;
        this.b = adContext;
        this.c = z;
        this.d = telemetryMetaData;
        this.e = adTelemetryHelper;
        this.f = adUnitCallback;
        this.g = interfaceC3072m9;
    }
}

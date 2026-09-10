package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3106ni {
    public final D4 a;
    public final Kl b;
    public final Ec c;

    public C3106ni(D4 contextualDataHandler, Kl videoAdEventsInterface, Ec nativeAdUnitComponent) {
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(videoAdEventsInterface, "videoAdEventsInterface");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.a = contextualDataHandler;
        this.b = videoAdEventsInterface;
        this.c = nativeAdUnitComponent;
    }
}

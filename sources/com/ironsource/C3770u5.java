package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3770u5 implements InterfaceC3827xb {
    private final InterstitialAdRequest a;
    private final C3825x9 b;
    private final InterfaceC3732s1 c;
    private final IronSourceError d;

    public C3770u5(InterstitialAdRequest adRequest, C3825x9 adLoadTaskListener, InterfaceC3732s1 analytics, IronSourceError error) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(error, "error");
        this.a = adRequest;
        this.b = adLoadTaskListener;
        this.c = analytics;
        this.d = error;
    }

    public final IronSourceError a() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC3827xb
    public void start() {
        C3703q5 c3703q5 = new C3703q5(this.c, this.a.getAdId$mediationsdk_release(), this.a.getProviderName$mediationsdk_release());
        c3703q5.a();
        c3703q5.a(this.d);
        this.b.b(this.d);
    }
}

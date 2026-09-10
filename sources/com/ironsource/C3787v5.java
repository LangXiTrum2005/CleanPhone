package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3787v5 implements InterfaceC3827xb {
    private final RewardedAdRequest a;
    private final Nd b;
    private final InterfaceC3732s1 c;
    private final IronSourceError d;

    public C3787v5(RewardedAdRequest adRequest, Nd adLoadTaskListener, InterfaceC3732s1 analytics, IronSourceError error) {
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

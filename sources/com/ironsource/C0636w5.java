package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;

/* JADX INFO: renamed from: com.ironsource.w5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0636w5 implements Bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RewardedAdRequest f30919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0251ae f30920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0560s1 f30921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IronSourceError f30922d;

    public C0636w5(RewardedAdRequest adRequest, C0251ae adLoadTaskListener, InterfaceC0560s1 analytics, IronSourceError error) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(error, "error");
        this.f30919a = adRequest;
        this.f30920b = adLoadTaskListener;
        this.f30921c = analytics;
        this.f30922d = error;
    }

    public final IronSourceError a() {
        return this.f30922d;
    }

    @Override // com.ironsource.Bb
    public void start() {
        C0546r5 c0546r5 = new C0546r5(this.f30921c, this.f30919a.getAdId$mediationsdk_release(), this.f30919a.getProviderName$mediationsdk_release());
        c0546r5.a();
        c0546r5.a(this.f30922d);
        this.f30920b.b(this.f30922d);
    }
}

package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class B6 implements C6, InterfaceC0601u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0655x6 f25713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0547r6 f25714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0547r6 f25715c;

    public B6(C0655x6 strategy, C0547r6 currentAdUnit, C0547r6 c0547r6) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        this.f25713a = strategy;
        this.f25714b = currentAdUnit;
        this.f25715c = c0547r6;
        currentAdUnit.a(this);
    }

    @Override // com.ironsource.C6
    public void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f25713a.a("show called while showing");
    }

    @Override // com.ironsource.C6
    public void b(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        if (adUnit == this.f25714b) {
            this.f25713a.a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.C6
    public void c(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        if (adUnit == this.f25714b) {
            this.f25713a.a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.K0
    public void e() {
        this.f25713a.c().e();
    }

    @Override // com.ironsource.C6
    public void loadAd() {
        this.f25713a.a("load called while showing");
    }

    @Override // com.ironsource.InterfaceC0601u6
    public void onClosed() {
        this.f25713a.a(a(this, null, 1, null));
        this.f25713a.c().onClosed();
    }

    @Override // com.ironsource.C6
    public void a(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        if (adUnit.equals(this.f25714b)) {
            this.f25713a.d().a(adInfo);
        } else {
            this.f25713a.a("progressive show success while showing current ad");
        }
    }

    @Override // com.ironsource.C6
    public void b(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        if (adUnit == this.f25715c) {
            this.f25715c = null;
        } else {
            this.f25713a.a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.C6
    public void a(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        if (!adUnit.equals(this.f25714b)) {
            this.f25713a.a("progressive show failed while showing current ad");
            return;
        }
        this.f25713a.a(a(ironSourceError));
        this.f25713a.d().c(ironSourceError);
    }

    @Override // com.ironsource.C6
    public void a(C0547r6 adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        if (adUnit == this.f25715c) {
            this.f25715c = null;
        } else {
            this.f25713a.a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC0601u6
    public void a(LevelPlayReward reward) {
        kotlin.jvm.internal.n.f(reward, "reward");
        this.f25713a.c().a(reward);
    }

    public static /* synthetic */ C6 a(B6 b10, IronSourceError ironSourceError, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ironSourceError = null;
        }
        return b10.a(ironSourceError);
    }

    private final C6 a(IronSourceError ironSourceError) {
        if (C0242a5.f28172a.a(ironSourceError)) {
            return new C0691z6(this.f25713a, this.f25714b, this.f25715c, true);
        }
        C0547r6 c0547r6 = this.f25715c;
        if (c0547r6 == null) {
            return new C0673y6(this.f25713a);
        }
        if (c0547r6.e() != null) {
            return new C0691z6(this.f25713a, c0547r6, null, false, 8, null);
        }
        return new A6(this.f25713a, c0547r6, false);
    }
}

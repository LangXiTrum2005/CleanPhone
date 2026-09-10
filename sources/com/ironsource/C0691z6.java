package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.z6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0691z6 implements C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0655x6 f31345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0547r6 f31346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0547r6 f31347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31348d;

    public C0691z6(C0655x6 strategy, C0547r6 currentAdUnit, C0547r6 c0547r6, boolean z10) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        this.f31345a = strategy;
        this.f31346b = currentAdUnit;
        this.f31347c = c0547r6;
        this.f31348d = z10;
    }

    @Override // com.ironsource.C6
    public void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f31345a.a(new B6(this.f31345a, this.f31346b, this.f31347c));
        this.f31346b.a(activity, this.f31345a);
    }

    @Override // com.ironsource.C6
    public void b(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        if (kotlin.jvm.internal.n.a(this.f31346b, adUnit)) {
            this.f31345a.a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.C6
    public void c(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        if (adUnit.equals(this.f31346b)) {
            this.f31345a.d().onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.C6
    public void loadAd() {
        wj.r rVar;
        if (this.f31348d) {
            this.f31345a.a("load called while current ad is loaded");
            return;
        }
        this.f31348d = true;
        LevelPlayAdInfo levelPlayAdInfoE = this.f31346b.e();
        if (levelPlayAdInfoE != null) {
            this.f31345a.d().b(levelPlayAdInfoE);
            rVar = wj.r.f53297a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            this.f31345a.a("current ad is loaded without ad info");
        } else if (this.f31347c == null) {
            C0547r6 c0547r6A = this.f31345a.b().a(false, this.f31345a.c());
            this.f31347c = c0547r6A;
            c0547r6A.a(this.f31345a);
        }
    }

    @Override // com.ironsource.C6
    public void b(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        if (adUnit.equals(this.f31347c)) {
            this.f31347c = null;
        } else {
            this.f31345a.a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.C6
    public void a(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        if (adUnit.equals(this.f31346b)) {
            this.f31345a.a("show success when loaded");
        } else {
            this.f31345a.a("progressive show success while current ad is loaded");
        }
    }

    public /* synthetic */ C0691z6(C0655x6 c0655x6, C0547r6 c0547r6, C0547r6 c0547r7, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        this(c0655x6, c0547r6, c0547r7, (i10 & 8) != 0 ? false : z10);
    }

    @Override // com.ironsource.C6
    public void a(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        if (adUnit.equals(this.f31346b)) {
            this.f31345a.a("show failed when loaded");
        } else {
            this.f31345a.a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.C6
    public void a(C0547r6 adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        if (adUnit.equals(this.f31347c)) {
            this.f31347c = null;
        } else if (adUnit.equals(this.f31346b)) {
            a();
        }
    }

    private final void a() {
        C6 a8;
        C0547r6 c0547r6 = this.f31347c;
        if (c0547r6 == null) {
            C0655x6 c0655x6 = this.f31345a;
            c0655x6.a(new C0673y6(c0655x6));
        } else {
            if (c0547r6.e() != null) {
                C0655x6 c0655x7 = this.f31345a;
                C0547r6 c0547r7 = this.f31347c;
                kotlin.jvm.internal.n.c(c0547r7);
                a8 = new C0691z6(c0655x7, c0547r7, null, false, 8, null);
            } else {
                C0655x6 c0655x8 = this.f31345a;
                C0547r6 c0547r8 = this.f31347c;
                kotlin.jvm.internal.n.c(c0547r8);
                a8 = new A6(c0655x8, c0547r8, false);
            }
            this.f31345a.a(a8);
        }
        this.f31345a.d().a();
    }
}

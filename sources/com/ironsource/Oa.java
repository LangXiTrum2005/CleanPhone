package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Oa implements InterfaceC0677ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0506p0 f26779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W2 f26780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N2 f26781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0695za f26782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Ta f26783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private L2 f26784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final M0 f26785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0685z0 f26786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final O2 f26787i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements O2 {
        public a() {
        }

        public void a() {
            InterfaceC0695za interfaceC0695zaM = Oa.this.m();
            if (interfaceC0695zaM != null) {
                interfaceC0695zaM.onAdLeftApplication();
            }
        }

        public void b() {
            InterfaceC0695za interfaceC0695zaM = Oa.this.m();
            if (interfaceC0695zaM != null) {
                interfaceC0695zaM.k();
            }
        }

        public void c() {
            InterfaceC0695za interfaceC0695zaM = Oa.this.m();
            if (interfaceC0695zaM != null) {
                interfaceC0695zaM.i();
            }
        }

        @Override // com.ironsource.K0
        public void e() {
            InterfaceC0695za interfaceC0695zaM = Oa.this.m();
            if (interfaceC0695zaM != null) {
                interfaceC0695zaM.onAdClicked();
            }
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ wj.r g() {
            a();
            return wj.r.f53297a;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ wj.r h() {
            c();
            return wj.r.f53297a;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ wj.r j() {
            b();
            return wj.r.f53297a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements M0 {
        public b() {
        }

        @Override // com.ironsource.M0
        public void a(C0595u0 adUnitCallback) {
            kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
            Oa.this.l().a(adUnitCallback);
        }

        @Override // com.ironsource.M0
        public void a(IronSourceError ironSourceError) {
            Oa.this.l().a(ironSourceError);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c implements InterfaceC0685z0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC0685z0
        public void a(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            InterfaceC0695za interfaceC0695zaM = Oa.this.m();
            if (interfaceC0695zaM != null) {
                interfaceC0695zaM.onAdDisplayed(adInfo);
            }
        }

        @Override // com.ironsource.InterfaceC0685z0
        public void c(IronSourceError ironSourceError) {
            InterfaceC0695za interfaceC0695zaM = Oa.this.m();
            if (interfaceC0695zaM != null) {
                interfaceC0695zaM.d(ironSourceError);
            }
        }
    }

    public Oa(C0506p0 adTools, W2 bannerContainer, N2 bannerAdUnitFactory) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.n.f(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.f26779a = adTools;
        this.f26780b = bannerContainer;
        this.f26781c = bannerAdUnitFactory;
        this.f26783e = new Pa(this);
        this.f26785g = new b();
        this.f26786h = new c();
        this.f26787i = new a();
    }

    public final C0506p0 a() {
        return this.f26779a;
    }

    public final void b(InterfaceC0695za interfaceC0695za) {
        this.f26782d = interfaceC0695za;
    }

    @Override // com.ironsource.InterfaceC0677ya
    public void c() {
        this.f26783e.c();
    }

    public final O2 e() {
        return this.f26787i;
    }

    public final M0 g() {
        return this.f26785g;
    }

    public final InterfaceC0685z0 h() {
        return this.f26786h;
    }

    public final N2 i() {
        return this.f26781c;
    }

    public final W2 j() {
        return this.f26780b;
    }

    public final L2 k() {
        return this.f26784f;
    }

    public final Ta l() {
        return this.f26783e;
    }

    public final InterfaceC0695za m() {
        return this.f26782d;
    }

    public final void a(Ta ta2) {
        kotlin.jvm.internal.n.f(ta2, "<set-?>");
        this.f26783e = ta2;
    }

    @Override // com.ironsource.InterfaceC0677ya
    public void b() {
        this.f26783e.b();
    }

    public final void a(L2 l10) {
        this.f26784f = l10;
    }

    public final void a(String message) {
        kotlin.jvm.internal.n.f(message, "message");
        this.f26779a.d().h().f("Banner Single Ad Unit Strategy - ".concat(message));
    }

    public final void a(C0595u0 adUnitCallback, L2 adUnit) {
        InterfaceC0695za interfaceC0695za;
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        adUnit.a(this.f26780b.getViewBinder(), this.f26786h);
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC == null || (interfaceC0695za = this.f26782d) == null) {
            return;
        }
        interfaceC0695za.onAdLoaded(levelPlayAdInfoC);
    }

    public final void a(IronSourceError ironSourceError) {
        InterfaceC0695za interfaceC0695za = this.f26782d;
        if (interfaceC0695za != null) {
            interfaceC0695za.b(ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC0677ya
    public void a(InterfaceC0695za listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f26782d = listener;
    }

    @Override // com.ironsource.InterfaceC0677ya
    public void d() {
    }

    @Override // com.ironsource.InterfaceC0677ya
    public void f() {
    }
}

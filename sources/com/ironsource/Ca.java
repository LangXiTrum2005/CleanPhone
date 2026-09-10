package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ca implements InterfaceC0677ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0506p0 f25866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W2 f25867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f25869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final J2 f25870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC0695za f25871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final N2 f25872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Ff f25873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0510p4 f25874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f25875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private M0 f25876k;
    private InterfaceC0685z0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private O2 f25877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Ma f25878n;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements O2 {
        public a() {
        }

        public void a() {
            Ca.this.n().onAdLeftApplication();
        }

        public void b() {
            Ca.this.n().k();
        }

        public void c() {
            Ca.this.n().i();
        }

        @Override // com.ironsource.K0
        public void e() {
            Ca.this.n().onAdClicked();
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
            Ca.this.m().a(adUnitCallback);
        }

        @Override // com.ironsource.M0
        public void a(IronSourceError ironSourceError) {
            Ca.this.m().a(ironSourceError);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c implements InterfaceC0685z0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC0685z0
        public void a(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            Ca.this.n().onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC0685z0
        public void c(IronSourceError ironSourceError) {
            Ca.this.n().d(ironSourceError);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ L2 f25883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC0330f3 f25884c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L2 l10, AbstractC0330f3 abstractC0330f3) {
            super(0);
            this.f25883b = l10;
            this.f25884c = abstractC0330f3;
        }

        public final void a() {
            Ca.a(Ca.this, this.f25883b, this.f25884c, false, 4, (Object) null);
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return wj.r.f53297a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class e extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ L2 f25886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f25887c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(L2 l10, Long l) {
            super(0);
            this.f25886b = l10;
            this.f25887c = l;
        }

        public final void a() {
            Ca ca2 = Ca.this;
            ca2.a((Ma) new Ga(ca2, this.f25886b, this.f25887c));
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return wj.r.f53297a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ L2 f25889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC0330f3 f25890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f25891d;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class a extends kotlin.jvm.internal.o implements jk.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ca f25892a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ L2 f25893b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC0330f3 f25894c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ca ca2, L2 l10, AbstractC0330f3 abstractC0330f3) {
                super(0);
                this.f25892a = ca2;
                this.f25893b = l10;
                this.f25894c = abstractC0330f3;
            }

            public final void a() {
                Ca.a(this.f25892a, this.f25893b, this.f25894c, false, 4, (Object) null);
            }

            @Override // jk.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return wj.r.f53297a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class b extends kotlin.jvm.internal.o implements jk.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ca f25895a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ L2 f25896b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Long f25897c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Ca ca2, L2 l10, Long l) {
                super(0);
                this.f25895a = ca2;
                this.f25896b = l10;
                this.f25897c = l;
            }

            public final void a() {
                Ca ca2 = this.f25895a;
                ca2.a((Ma) new Ga(ca2, this.f25896b, this.f25897c));
            }

            @Override // jk.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return wj.r.f53297a;
            }
        }

        public f(L2 l10, AbstractC0330f3 abstractC0330f3, Long l) {
            this.f25889b = l10;
            this.f25890c = abstractC0330f3;
            this.f25891d = l;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Ca.this.k().getViewTreeObserver().isAlive()) {
                Ca.this.k().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (Ig.a(Ca.this.k(), new Rect())) {
                Ca.this.a().c(AbstractRunnableC0430ke.f29068a.a(new a(Ca.this, this.f25889b, this.f25890c)));
            } else {
                Ca.this.a().c(AbstractRunnableC0430ke.f29068a.a(new b(Ca.this, this.f25889b, this.f25891d)));
            }
        }
    }

    public Ca(C0506p0 adTools, W2 bannerContainer, long j10, long j11, J2 bannerAdProperties, InterfaceC0695za strategyListener, N2 bannerAdUnitFactory, Ff taskScheduler, InterfaceC0510p4 timeProvider, boolean z10) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.n.f(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.n.f(strategyListener, "strategyListener");
        kotlin.jvm.internal.n.f(bannerAdUnitFactory, "bannerAdUnitFactory");
        kotlin.jvm.internal.n.f(taskScheduler, "taskScheduler");
        kotlin.jvm.internal.n.f(timeProvider, "timeProvider");
        this.f25866a = adTools;
        this.f25867b = bannerContainer;
        this.f25868c = j10;
        this.f25869d = j11;
        this.f25870e = bannerAdProperties;
        this.f25871f = strategyListener;
        this.f25872g = bannerAdUnitFactory;
        this.f25873h = taskScheduler;
        this.f25874i = timeProvider;
        this.f25875j = z10;
        this.f25876k = new b();
        this.l = new c();
        this.f25877m = new a();
        this.f25878n = new Ea(this, false, 2, null);
    }

    public final C0506p0 a() {
        return this.f25866a;
    }

    @Override // com.ironsource.InterfaceC0677ya
    public void c() {
        this.f25878n.c();
    }

    @Override // com.ironsource.InterfaceC0677ya
    public void d() {
        this.f25878n.d();
    }

    public final O2 e() {
        return this.f25877m;
    }

    @Override // com.ironsource.InterfaceC0677ya
    public void f() {
        this.f25878n.f();
    }

    public final M0 g() {
        return this.f25876k;
    }

    public final InterfaceC0685z0 h() {
        return this.l;
    }

    public final J2 i() {
        return this.f25870e;
    }

    public final N2 j() {
        return this.f25872g;
    }

    public final W2 k() {
        return this.f25867b;
    }

    public final long l() {
        return this.f25868c;
    }

    public final Ma m() {
        return this.f25878n;
    }

    public final InterfaceC0695za n() {
        return this.f25871f;
    }

    public final Ff o() {
        return this.f25873h;
    }

    public final InterfaceC0510p4 p() {
        return this.f25874i;
    }

    public final long q() {
        return this.f25869d;
    }

    public final void r() {
        this.f25866a.d().h().h("Banner view is not visible");
    }

    public final void a(M0 m7) {
        kotlin.jvm.internal.n.f(m7, "<set-?>");
        this.f25876k = m7;
    }

    public final void b(InterfaceC0695za interfaceC0695za) {
        kotlin.jvm.internal.n.f(interfaceC0695za, "<set-?>");
        this.f25871f = interfaceC0695za;
    }

    public final void a(InterfaceC0685z0 interfaceC0685z0) {
        kotlin.jvm.internal.n.f(interfaceC0685z0, "<set-?>");
        this.l = interfaceC0685z0;
    }

    @Override // com.ironsource.InterfaceC0677ya
    public void b() {
        this.f25878n.b();
    }

    public final void a(O2 o6) {
        kotlin.jvm.internal.n.f(o6, "<set-?>");
        this.f25877m = o6;
    }

    public final void a(Ma ma2) {
        kotlin.jvm.internal.n.f(ma2, "<set-?>");
        this.f25878n = ma2;
    }

    public final void a(String message) {
        kotlin.jvm.internal.n.f(message, "message");
        this.f25866a.d().h().f("Banner Reload Strategy - ".concat(message));
    }

    public final void a(C0595u0 adUnitCallback, L2 currentAdUnit, L2 l10, AbstractC0330f3 reloadReason, boolean z10, Long l) {
        wj.r rVar;
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.n.f(reloadReason, "reloadReason");
        currentAdUnit.a(this.f25867b.getViewBinder(), this.l);
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.f25871f.onAdLoaded(levelPlayAdInfoC);
            rVar = wj.r.f53297a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            IronLog.INTERNAL.error(C0506p0.a(this.f25866a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (l10 != null) {
            l10.a(false);
        }
        if (z10) {
            this.f25878n = new Ia(this, currentAdUnit);
        } else {
            a(currentAdUnit, reloadReason, l);
        }
    }

    public final void a(IronSourceError ironSourceError, L2 currentAdUnit, AbstractC0330f3 reloadReason, boolean z10, boolean z11, Long l) {
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.n.f(reloadReason, "reloadReason");
        this.f25871f.b(ironSourceError);
        if (z11) {
            this.f25878n = new Ia(this, currentAdUnit);
        } else if (z10) {
            a(currentAdUnit, reloadReason, l);
        } else {
            a(currentAdUnit, reloadReason, this.f25875j);
        }
    }

    public /* synthetic */ Ca(C0506p0 c0506p0, W2 w3, long j10, long j11, J2 j12, InterfaceC0695za interfaceC0695za, N2 n3, Ff ff, InterfaceC0510p4 interfaceC0510p4, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        Ff ef;
        if ((i10 & 128) != 0) {
            ef = new Ef(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        } else {
            ef = ff;
        }
        this(c0506p0, w3, j10, j11, j12, interfaceC0695za, n3, ef, interfaceC0510p4, z10);
    }

    public final void a(L2 currentAdUnit, AbstractC0330f3 reloadReason, Long l) {
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.n.f(reloadReason, "reloadReason");
        C0624vb.a(this.f25866a, new bc.r(this, currentAdUnit, reloadReason, l, 17), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ca this$0, L2 currentAdUnit, AbstractC0330f3 reloadReason, Long l) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(currentAdUnit, "$currentAdUnit");
        kotlin.jvm.internal.n.f(reloadReason, "$reloadReason");
        if (Ig.a(this$0.f25867b, new Rect())) {
            this$0.f25866a.c(AbstractRunnableC0430ke.f29068a.a(this$0.new d(currentAdUnit, reloadReason)));
        } else if (!this$0.f25867b.getViewTreeObserver().isAlive()) {
            this$0.f25866a.c(AbstractRunnableC0430ke.f29068a.a(this$0.new e(currentAdUnit, l)));
        } else {
            this$0.f25867b.getViewTreeObserver().addOnGlobalLayoutListener(this$0.new f(currentAdUnit, reloadReason, l));
        }
    }

    public static /* synthetic */ void a(Ca ca2, L2 l10, AbstractC0330f3 abstractC0330f3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        ca2.a(l10, abstractC0330f3, z10);
    }

    public final void a(L2 currentAdUnit, AbstractC0330f3 reloadReason, boolean z10) {
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.n.f(reloadReason, "reloadReason");
        L2 l2A = this.f25872g.a(false);
        Ja ja2 = new Ja(this, currentAdUnit, l2A, this.f25874i.a(), z10);
        a(reloadReason);
        this.f25878n = ja2;
        l2A.a(this.f25876k);
    }

    private final void a(AbstractC0330f3 abstractC0330f3) {
        this.f25866a.d().h().a(abstractC0330f3.c(), abstractC0330f3.b(), abstractC0330f3.a());
    }

    @Override // com.ironsource.InterfaceC0677ya
    public void a(InterfaceC0695za listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f25871f = listener;
    }
}

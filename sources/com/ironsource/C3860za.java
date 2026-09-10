package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3860za implements InterfaceC3792va {
    private final C3681p0 a;
    private final W2 b;
    private final long c;
    private final long d;
    private final J2 e;
    private InterfaceC3809wa f;
    private final N2 g;
    private final InterfaceC3729rf h;
    private final InterfaceC3667o4 i;
    private final boolean j;
    private M0 k;
    private InterfaceC3850z0 l;
    private O2 m;
    private Ja n;

    /* JADX INFO: renamed from: com.ironsource.za$a */
    public static final class a implements O2 {
        public a() {
        }

        public void a() {
            C3860za.this.n().onAdLeftApplication();
        }

        public void b() {
            C3860za.this.n().k();
        }

        public void c() {
            C3860za.this.n().i();
        }

        @Override // com.ironsource.K0
        public void e() {
            C3860za.this.n().onAdClicked();
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ Unit g() {
            a();
            return Unit.f29295attabal;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ Unit h() {
            c();
            return Unit.f29295attabal;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ Unit j() {
            b();
            return Unit.f29295attabal;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.za$b */
    public static final class b implements M0 {
        public b() {
        }

        @Override // com.ironsource.M0
        public void a(C3765u0 adUnitCallback) {
            Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
            C3860za.this.m().a(adUnitCallback);
        }

        @Override // com.ironsource.M0
        public void a(IronSourceError ironSourceError) {
            C3860za.this.m().a(ironSourceError);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.za$c */
    public static final class c implements InterfaceC3850z0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC3850z0
        public void a(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            C3860za.this.n().onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC3850z0
        public void c(IronSourceError ironSourceError) {
            C3860za.this.n().d(ironSourceError);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.za$d */
    public static final class d extends Lambda implements Function0<Unit> {
        final /* synthetic */ L2 b;
        final /* synthetic */ AbstractC3505f3 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L2 l2, AbstractC3505f3 abstractC3505f3) {
            super(0);
            this.b = l2;
            this.c = abstractC3505f3;
        }

        public final void a() {
            C3860za.a(C3860za.this, this.b, this.c, false, 4, (Object) null);
        }

        @Override // p002kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f29295attabal;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.za$e */
    public static final class e extends Lambda implements Function0<Unit> {
        final /* synthetic */ L2 b;
        final /* synthetic */ Long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(L2 l2, Long l) {
            super(0);
            this.b = l2;
            this.c = l;
        }

        public final void a() {
            C3860za c3860za = C3860za.this;
            c3860za.a((Ja) new Da(c3860za, this.b, this.c));
        }

        @Override // p002kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f29295attabal;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.za$f */
    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ L2 b;
        final /* synthetic */ AbstractC3505f3 c;
        final /* synthetic */ Long d;

        /* JADX INFO: renamed from: com.ironsource.za$f$a */
        public static final class a extends Lambda implements Function0<Unit> {
            final /* synthetic */ C3860za a;
            final /* synthetic */ L2 b;
            final /* synthetic */ AbstractC3505f3 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3860za c3860za, L2 l2, AbstractC3505f3 abstractC3505f3) {
                super(0);
                this.a = c3860za;
                this.b = l2;
                this.c = abstractC3505f3;
            }

            public final void a() {
                C3860za.a(this.a, this.b, this.c, false, 4, (Object) null);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f29295attabal;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.za$f$b */
        public static final class b extends Lambda implements Function0<Unit> {
            final /* synthetic */ C3860za a;
            final /* synthetic */ L2 b;
            final /* synthetic */ Long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3860za c3860za, L2 l2, Long l) {
                super(0);
                this.a = c3860za;
                this.b = l2;
                this.c = l;
            }

            public final void a() {
                C3860za c3860za = this.a;
                c3860za.a((Ja) new Da(c3860za, this.b, this.c));
            }

            @Override // p002kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f29295attabal;
            }
        }

        public f(L2 l2, AbstractC3505f3 abstractC3505f3, Long l) {
            this.b = l2;
            this.c = abstractC3505f3;
            this.d = l;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (C3860za.this.k().getViewTreeObserver().isAlive()) {
                C3860za.this.k().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (pg.a(C3860za.this.k(), new Rect())) {
                C3725rb.a((C3725rb) C3860za.this.a(), Xd.a.a(new a(C3860za.this, this.b, this.c)), 0L, 2, (Object) null);
            } else {
                C3725rb.a((C3725rb) C3860za.this.a(), Xd.a.a(new b(C3860za.this, this.b, this.d)), 0L, 2, (Object) null);
            }
        }
    }

    public C3860za(C3681p0 adTools, W2 bannerContainer, long j, long j2, J2 bannerAdProperties, InterfaceC3809wa strategyListener, N2 bannerAdUnitFactory, InterfaceC3729rf taskScheduler, InterfaceC3667o4 timeProvider, boolean z) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.a = adTools;
        this.b = bannerContainer;
        this.c = j;
        this.d = j2;
        this.e = bannerAdProperties;
        this.f = strategyListener;
        this.g = bannerAdUnitFactory;
        this.h = taskScheduler;
        this.i = timeProvider;
        this.j = z;
        this.k = new b();
        this.l = new c();
        this.m = new a();
        this.n = new Ba(this, false, 2, null);
    }

    public final C3681p0 a() {
        return this.a;
    }

    public final void b(InterfaceC3809wa interfaceC3809wa) {
        Intrinsics.checkNotNullParameter(interfaceC3809wa, "<set-?>");
        this.f = interfaceC3809wa;
    }

    @Override // com.ironsource.InterfaceC3792va
    public void c() {
        this.n.c();
    }

    @Override // com.ironsource.InterfaceC3792va
    public void d() {
        this.n.d();
    }

    public final O2 e() {
        return this.m;
    }

    @Override // com.ironsource.InterfaceC3792va
    public void f() {
        this.n.f();
    }

    public final M0 g() {
        return this.k;
    }

    public final InterfaceC3850z0 h() {
        return this.l;
    }

    public final J2 i() {
        return this.e;
    }

    public final N2 j() {
        return this.g;
    }

    public final W2 k() {
        return this.b;
    }

    public final long l() {
        return this.c;
    }

    public final Ja m() {
        return this.n;
    }

    public final InterfaceC3809wa n() {
        return this.f;
    }

    public final InterfaceC3729rf o() {
        return this.h;
    }

    public final InterfaceC3667o4 p() {
        return this.i;
    }

    public final long q() {
        return this.d;
    }

    public final void r() {
        this.a.e().h().h("Banner view is not visible");
    }

    public final void a(M0 m0) {
        Intrinsics.checkNotNullParameter(m0, "<set-?>");
        this.k = m0;
    }

    @Override // com.ironsource.InterfaceC3792va
    public void b() {
        this.n.b();
    }

    public final void a(InterfaceC3850z0 interfaceC3850z0) {
        Intrinsics.checkNotNullParameter(interfaceC3850z0, "<set-?>");
        this.l = interfaceC3850z0;
    }

    public final void a(O2 o2) {
        Intrinsics.checkNotNullParameter(o2, "<set-?>");
        this.m = o2;
    }

    public final void a(Ja ja) {
        Intrinsics.checkNotNullParameter(ja, "<set-?>");
        this.n = ja;
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.e().h().f("Banner Reload Strategy - " + message);
    }

    public final void a(C3765u0 adUnitCallback, L2 currentAdUnit, L2 l2, AbstractC3505f3 reloadReason, boolean z, Long l) {
        Unit unit;
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        currentAdUnit.a(this.b.getViewBinder(), this.l);
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.f.onAdLoaded(levelPlayAdInfoC);
            unit = Unit.f29295attabal;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error(C3681p0.a(this.a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (l2 != null) {
            l2.a(false);
        }
        if (z) {
            this.n = new Fa(this, currentAdUnit);
        } else {
            a(currentAdUnit, reloadReason, l);
        }
    }

    public final void a(IronSourceError ironSourceError, L2 currentAdUnit, AbstractC3505f3 reloadReason, boolean z, boolean z2, Long l) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        this.f.b(ironSourceError);
        if (z2) {
            this.n = new Fa(this, currentAdUnit);
        } else if (z) {
            a(currentAdUnit, reloadReason, l);
        } else {
            a(currentAdUnit, reloadReason, this.j);
        }
    }

    public /* synthetic */ C3860za(C3681p0 c3681p0, W2 w2, long j, long j2, J2 j3, InterfaceC3809wa interfaceC3809wa, N2 n2, InterfaceC3729rf interfaceC3729rf, InterfaceC3667o4 interfaceC3667o4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3681p0, w2, j, j2, j3, interfaceC3809wa, n2, (i & 128) != 0 ? new R6(S6.a(c3681p0.a())) : interfaceC3729rf, interfaceC3667o4, z);
    }

    public final void a(final L2 currentAdUnit, final AbstractC3505f3 reloadReason, final Long l) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        C3725rb.a(this.a, new Runnable() { // from class: com.ironsource.galluses
            @Override // java.lang.Runnable
            public final void run() {
                C3860za.a(this.f23242kowloon, currentAdUnit, reloadReason, l);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3860za this$0, L2 currentAdUnit, AbstractC3505f3 reloadReason, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentAdUnit, "$currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "$reloadReason");
        if (pg.a(this$0.b, new Rect())) {
            C3725rb.a((C3725rb) this$0.a, Xd.a.a(this$0.new d(currentAdUnit, reloadReason)), 0L, 2, (Object) null);
        } else if (!this$0.b.getViewTreeObserver().isAlive()) {
            C3725rb.a((C3725rb) this$0.a, Xd.a.a(this$0.new e(currentAdUnit, l)), 0L, 2, (Object) null);
        } else {
            this$0.b.getViewTreeObserver().addOnGlobalLayoutListener(this$0.new f(currentAdUnit, reloadReason, l));
        }
    }

    public static /* synthetic */ void a(C3860za c3860za, L2 l2, AbstractC3505f3 abstractC3505f3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        c3860za.a(l2, abstractC3505f3, z);
    }

    public final void a(L2 currentAdUnit, AbstractC3505f3 reloadReason, boolean z) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        L2 l2A = this.g.a(false);
        Ga ga = new Ga(this, currentAdUnit, l2A, this.i.a(), z);
        a(reloadReason);
        this.n = ga;
        l2A.a(this.k);
    }

    private final void a(AbstractC3505f3 abstractC3505f3) {
        this.a.e().h().a(abstractC3505f3.c(), abstractC3505f3.b(), abstractC3505f3.a());
    }

    @Override // com.ironsource.InterfaceC3792va
    public void a(InterfaceC3809wa listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f = listener;
    }
}

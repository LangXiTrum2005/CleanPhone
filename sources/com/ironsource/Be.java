package com.ironsource;

import android.content.Context;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Be {
    public static final b l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final wj.d f25737m = r9.b.u(a.f25749a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ge f25738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Re f25739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final He f25740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Ze f25741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wj.d f25742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f25743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<InterfaceC0591te> f25744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C0484ne f25745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C0520pe f25746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f25748k;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25749a = new a();

        public a() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Be invoke() {
            return new Be(null, null, null, 7, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Be a() {
            return (Be) Be.f25737m.getValue();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f25750a = new c();

        public c() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0441l7 invoke() {
            return Kb.f26413u.d().k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d implements InterfaceC0591te {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f25752b;

        public d(Context context) {
            this.f25752b = context;
        }

        @Override // com.ironsource.InterfaceC0591te
        public void a(C0484ne sdkConfig) {
            kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
            Be.this.f25738a.c(new ph(Be.this, this.f25752b, sdkConfig, 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Be this$0, Context applicationContext, C0484ne sdkConfig) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            kotlin.jvm.internal.n.f(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.n.e(applicationContext, "applicationContext");
            this$0.a(applicationContext, sdkConfig);
        }

        @Override // com.ironsource.InterfaceC0591te
        public void a(C0520pe error, C0300d9 c0300d9) {
            kotlin.jvm.internal.n.f(error, "error");
            Be.this.f25738a.c(new ph(Be.this, error, c0300d9, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Be this$0, C0520pe error, C0300d9 c0300d9) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            kotlin.jvm.internal.n.f(error, "$error");
            this$0.a(error, c0300d9);
        }
    }

    public Be() {
        this(null, null, null, 7, null);
    }

    public Be(Ge tools, Re serverInit, He sdkServicesInitializer) {
        kotlin.jvm.internal.n.f(tools, "tools");
        kotlin.jvm.internal.n.f(serverInit, "serverInit");
        kotlin.jvm.internal.n.f(sdkServicesInitializer, "sdkServicesInitializer");
        this.f25738a = tools;
        this.f25739b = serverInit;
        this.f25740c = sdkServicesInitializer;
        this.f25742e = r9.b.u(c.f25750a);
        this.f25743f = "Be";
        this.f25744g = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Be this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.a(true);
    }

    private final InterfaceC0441l7 c() {
        return (InterfaceC0441l7) this.f25742e.getValue();
    }

    public final void d() {
        this.f25738a.c(new androidx.fragment.app.n(this, 18));
    }

    private final void b(C0484ne c0484ne) {
        this.f25745h = c0484ne;
        a(false);
    }

    private final void a(Context context, U9 u10, Ve ve) {
        u10.i(ve.g().h());
        u10.c(ve.g().d());
        C1 c1B = ve.c().b();
        kotlin.jvm.internal.n.c(c1B);
        u10.a(c1B.a());
        u10.d(c1B.c().b());
        u10.b(c1B.k().b());
        u10.a(Boolean.valueOf(IronSourceUtils.c(context)));
        C1 c1B2 = ve.c().b();
        kotlin.jvm.internal.n.c(c1B2);
        u10.b(c1B2.f().b());
    }

    private final De b() {
        if (this.f25745h != null) {
            return De.INITIATED;
        }
        if (this.f25746i != null) {
            return De.INIT_FAILED;
        }
        if (this.f25747j) {
            return De.INIT_IN_PROGRESS;
        }
        return De.NOT_INIT;
    }

    public /* synthetic */ Be(Ge ge2, Re re, He he2, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? new Fe() : ge2, (i10 & 2) != 0 ? new Qe(null, 1, 0 == true ? 1 : 0) : re, (i10 & 4) != 0 ? new He(null, null, null, null, null, 31, null) : he2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC0591te listener, C0484ne sdkConfig) {
        kotlin.jvm.internal.n.f(listener, "$listener");
        kotlin.jvm.internal.n.f(sdkConfig, "$sdkConfig");
        listener.a(sdkConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC0591te listener, C0520pe error) {
        kotlin.jvm.internal.n.f(listener, "$listener");
        kotlin.jvm.internal.n.f(error, "$error");
        InterfaceC0591te.a(listener, error, null, 2, null);
    }

    private final void b(Context context, C0484ne c0484ne) {
        boolean zL;
        String strD;
        boolean z10;
        String strD2;
        boolean z11;
        String strD3;
        Context context2;
        J1 j1B;
        Qb qbE;
        J1 j1G;
        U2 u2C;
        J1 j1G2;
        E9 e9D;
        J1 j1I;
        C0323ee c0323eeF;
        J1 j1M;
        J1 j1B2;
        Ve veD = c0484ne.d();
        C1 c1B = veD.c().b();
        if (c1B == null || (j1B2 = c1B.b()) == null) {
            zL = false;
            strD = null;
        } else {
            zL = j1B2.l();
            strD = j1B2.d();
        }
        N3 n3C = veD.c();
        if (n3C == null || (c0323eeF = n3C.f()) == null || (j1M = c0323eeF.m()) == null) {
            z10 = false;
            strD2 = null;
        } else {
            boolean zL2 = j1M.l();
            strD2 = j1M.d();
            z10 = zL2;
        }
        N3 n3C2 = veD.c();
        if (n3C2 == null || (e9D = n3C2.d()) == null || (j1I = e9D.i()) == null) {
            z11 = false;
            strD3 = null;
        } else {
            boolean zL3 = j1I.l();
            strD3 = j1I.d();
            z11 = zL3;
        }
        N3 n3C3 = veD.c();
        boolean zL4 = (n3C3 == null || (u2C = n3C3.c()) == null || (j1G2 = u2C.g()) == null) ? false : j1G2.l();
        N3 n3C4 = veD.c();
        boolean zL5 = (n3C4 == null || (qbE = n3C4.e()) == null || (j1G = qbE.g()) == null) ? false : j1G.l();
        Kb.b bVar = Kb.f26413u;
        bVar.d().q().b(strD, context);
        if (zL) {
            C1 c1B2 = veD.c().b();
            if (c1B2 != null && (j1B = c1B2.b()) != null) {
                a(this, bVar.d().q(), j1B, context, veD, false, 16, null);
            }
        } else {
            bVar.d().q().a(false);
        }
        C0359ge.i().b(strD2, context);
        if (z10) {
            N3 n3C5 = veD.c();
            C0323ee c0323eeF2 = n3C5 != null ? n3C5.f() : null;
            kotlin.jvm.internal.n.c(c0323eeF2);
            J1 rewardedVideoConfig = c0323eeF2.m();
            C0359ge c0359geI = C0359ge.i();
            kotlin.jvm.internal.n.e(c0359geI, "getInstance()");
            kotlin.jvm.internal.n.e(rewardedVideoConfig, "rewardedVideoConfig");
            a(this, c0359geI, rewardedVideoConfig, context, veD, false, 16, null);
        } else {
            C0359ge.i().a(false);
        }
        G9.i().b(strD3, context);
        if (z11) {
            N3 n3C6 = veD.c();
            E9 e9D2 = n3C6 != null ? n3C6.d() : null;
            kotlin.jvm.internal.n.c(e9D2);
            J1 interstitialConfig = e9D2.i();
            G9 g9I = G9.i();
            kotlin.jvm.internal.n.e(g9I, "getInstance()");
            kotlin.jvm.internal.n.e(interstitialConfig, "interstitialConfig");
            a(this, g9I, interstitialConfig, context, veD, false, 16, null);
            context2 = context;
        } else if (zL4) {
            N3 n3C7 = veD.c();
            U2 u2C2 = n3C7 != null ? n3C7.c() : null;
            kotlin.jvm.internal.n.c(u2C2);
            J1 bannerConfig = u2C2.g();
            G9 g9I2 = G9.i();
            kotlin.jvm.internal.n.e(g9I2, "getInstance()");
            kotlin.jvm.internal.n.e(bannerConfig, "bannerConfig");
            context2 = context;
            a(this, g9I2, bannerConfig, context2, veD, false, 16, null);
        } else if (zL5) {
            N3 n3C8 = veD.c();
            Qb qbE2 = n3C8 != null ? n3C8.e() : null;
            kotlin.jvm.internal.n.c(qbE2);
            J1 j1G3 = qbE2.g();
            G9 g9I3 = G9.i();
            kotlin.jvm.internal.n.e(g9I3, "getInstance()");
            context2 = context;
            a(this, g9I3, j1G3, context2, veD, false, 16, null);
        } else {
            context2 = context;
            G9.i().a(false);
        }
        N3 n3C9 = veD.c();
        C1 c1B3 = n3C9 != null ? n3C9.b() : null;
        kotlin.jvm.internal.n.c(c1B3);
        C0322ed c0322edI = c1B3.i();
        boolean zA = c0322edI.a();
        String strB = c0322edI.b();
        boolean zC = c0322edI.c();
        int iD = c0322edI.d();
        int[] iArrE = c0322edI.e();
        int[] iArrF = c0322edI.f();
        C0304dd c0304dd = C0304dd.P;
        c0304dd.a(zA);
        c0304dd.b(strB, context2);
        if (zA) {
            c0304dd.b(iArrE, context2);
            c0304dd.c(iArrF, context2);
            c0304dd.b(zC);
            c0304dd.c(iD);
        }
    }

    public final void a(Context context, C0627ve initRequest, InterfaceC0591te listener) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(initRequest, "initRequest");
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f25738a.c(new com.applovin.impl.z8(this, listener, context, initRequest, context.getApplicationContext(), 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Be this$0, InterfaceC0591te listener, Context context, C0627ve initRequest, Context context2) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(listener, "$listener");
        kotlin.jvm.internal.n.f(context, "$context");
        kotlin.jvm.internal.n.f(initRequest, "$initRequest");
        C0484ne c0484ne = this$0.f25745h;
        if (c0484ne != null) {
            this$0.a(listener, c0484ne);
            return;
        }
        this$0.f25744g.add(listener);
        if (this$0.f25747j) {
            return;
        }
        this$0.f25746i = null;
        this$0.a(true);
        this$0.f25748k = new Date().getTime();
        this$0.f25739b.a(context, initRequest, this$0.f25738a, this$0.new d(context2));
    }

    public final void a(C0645we serverResponse) {
        kotlin.jvm.internal.n.f(serverResponse, "serverResponse");
        this.f25738a.c(new ki(10, serverResponse, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0645we serverResponse, Be this$0) {
        kotlin.jvm.internal.n.f(serverResponse, "$serverResponse");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        C0484ne c0484ne = new C0484ne(serverResponse, null, null, 6, null);
        this$0.b(c0484ne);
        this$0.a(c0484ne);
    }

    public final void a(C0520pe error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f25738a.c(new ki(8, this, error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Be this$0, C0520pe error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        this$0.a(error, (C0300d9) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C0520pe c0520pe, C0300d9 c0300d9) {
        this.f25746i = c0520pe;
        a(false);
        Iterator<InterfaceC0591te> it = this.f25744g.iterator();
        while (it.hasNext()) {
            a(it.next(), c0520pe);
        }
        this.f25744g.clear();
        if (c0300d9 != null) {
            c0300d9.b();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c0520pe, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, C0484ne c0484ne) {
        Se seI;
        b(c0484ne);
        M1 m1A = c0484ne.a();
        V4 v4 = V4.f27346a;
        v4.c(m1A.g());
        Kb.b bVar = Kb.f26413u;
        bVar.a().o().a(m1A.c());
        if (bVar.d().h().e() && (seI = c0484ne.i()) != null) {
            this.f25740c.a(context, seI);
        }
        C0300d9 c0300d9F = c0484ne.f();
        if (c0300d9F != null) {
            c0300d9F.b();
        }
        v4.a(m1A.f());
        v4.a(m1A.j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(m1A.h());
        c().a(m1A);
        a(context, this.f25738a.g(), c0484ne.d());
        this.f25738a.a(new Date().getTime() - this.f25748k, c0484ne.g());
        Ze ze2 = new Ze();
        this.f25741d = ze2;
        ze2.a(c());
        IronSourceUtils.e(context, c0484ne.d().toString());
        bVar.d().q().c(true);
        G9.i().c(true);
        C0359ge.i().c(true);
        C0304dd c0304dd = C0304dd.P;
        c0304dd.c(true);
        b(context, c0484ne);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(c0484ne.e().b());
        F1 f1B = c0484ne.b();
        if (f1B.f()) {
            this.f25738a.a(f1B);
        }
        a(c0484ne);
        c0304dd.i();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("parameters for init url: " + Xe.a());
        ironLog.verbose("parameters for init POST data: " + Xe.b());
    }

    private final void a(C0484ne c0484ne) {
        Iterator<InterfaceC0591te> it = this.f25744g.iterator();
        while (it.hasNext()) {
            a(it.next(), c0484ne);
        }
        this.f25744g.clear();
    }

    private final void a(boolean z10) {
        this.f25747j = z10;
        this.f25738a.a(b());
    }

    private final void a(InterfaceC0591te interfaceC0591te, C0484ne c0484ne) {
        this.f25738a.a(new qh(interfaceC0591te, c0484ne, 0));
    }

    private final void a(InterfaceC0591te interfaceC0591te, C0520pe c0520pe) {
        this.f25738a.a(new ki(9, interfaceC0591te, c0520pe));
    }

    public static /* synthetic */ void a(Be be2, AbstractC0437l3 abstractC0437l3, J1 j10, Context context, Ve ve, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        be2.a(abstractC0437l3, j10, context, ve, z10);
    }

    private final void a(AbstractC0437l3 abstractC0437l3, J1 j10, Context context, Ve ve, boolean z10) {
        abstractC0437l3.a(z10);
        abstractC0437l3.a(j10.c(), context);
        abstractC0437l3.b(j10.d(), context);
        abstractC0437l3.a(j10.f());
        abstractC0437l3.d(j10.e());
        abstractC0437l3.b(j10.a());
        abstractC0437l3.b(j10.i(), context);
        abstractC0437l3.c(j10.h(), context);
        abstractC0437l3.a(j10.j(), context);
        abstractC0437l3.d(j10.g(), context);
        C1 c1B = ve.c().b();
        kotlin.jvm.internal.n.c(c1B);
        abstractC0437l3.a(c1B.j());
        abstractC0437l3.b(j10.k());
        abstractC0437l3.c(j10.b());
    }
}

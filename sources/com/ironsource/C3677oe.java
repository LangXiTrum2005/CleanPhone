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
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3677oe {
    public static final b l = new b(null);
    private static final patroclinal.taiyuan<C3677oe> m = p002kotlin.saneness.saneness(a.a);
    private final InterfaceC3762te a;
    private final Ee b;
    private final C3779ue c;
    private Me d;
    private final patroclinal.taiyuan e;
    private final String f;
    private final List<InterfaceC3534ge> g;
    private C3426ae h;
    private C3462ce i;
    private boolean j;
    private long k;

    /* JADX INFO: renamed from: com.ironsource.oe$a */
    public static final class a extends Lambda implements Function0<C3677oe> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3677oe invoke() {
            return new C3677oe(null, null, null, 7, null);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.oe$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3677oe a() {
            return (C3677oe) C3677oe.m.getValue();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.oe$c */
    public static final class c extends Lambda implements Function0<InterfaceC3580j7> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3580j7 invoke() {
            return Gb.s.d().k();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.oe$d */
    public static final class d implements InterfaceC3534ge {
        final /* synthetic */ Context b;

        public d(Context context) {
            this.b = context;
        }

        @Override // com.ironsource.InterfaceC3534ge
        public void a(final C3426ae sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            InterfaceC3762te interfaceC3762te = C3677oe.this.a;
            final C3677oe c3677oe = C3677oe.this;
            final Context context = this.b;
            interfaceC3762te.c(new Runnable() { // from class: com.ironsource.libya
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C3677oe.d.a(c3677oe, context, sdkConfig);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3677oe this$0, Context applicationContext, C3426ae sdkConfig) throws JSONException {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            this$0.a(applicationContext, sdkConfig);
        }

        @Override // com.ironsource.InterfaceC3534ge
        public void a(final C3462ce error, final C3439b9 c3439b9) {
            Intrinsics.checkNotNullParameter(error, "error");
            InterfaceC3762te interfaceC3762te = C3677oe.this.a;
            final C3677oe c3677oe = C3677oe.this;
            interfaceC3762te.c(new Runnable() { // from class: com.ironsource.decarock
                @Override // java.lang.Runnable
                public final void run() {
                    C3677oe.d.a(c3677oe, error, c3439b9);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3677oe this$0, C3462ce error, C3439b9 c3439b9) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(error, "$error");
            this$0.a(error, c3439b9);
        }
    }

    public C3677oe() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3677oe this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(true);
    }

    private final InterfaceC3580j7 c() {
        return (InterfaceC3580j7) this.e.getValue();
    }

    private final void d() {
        if (Gb.s.d().h().u()) {
            Td.i().a(new C3804w5(EnumC3821x5.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    public final void e() {
        this.a.d(new Runnable() { // from class: com.ironsource.stupefactive
            @Override // java.lang.Runnable
            public final void run() {
                C3677oe.b(this.f23475kowloon);
            }
        });
    }

    public C3677oe(InterfaceC3762te tools, Ee serverInit, C3779ue sdkServicesInitializer) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(serverInit, "serverInit");
        Intrinsics.checkNotNullParameter(sdkServicesInitializer, "sdkServicesInitializer");
        this.a = tools;
        this.b = serverInit;
        this.c = sdkServicesInitializer;
        this.e = p002kotlin.saneness.saneness(c.a);
        this.f = C3677oe.class.getSimpleName();
        this.g = new ArrayList();
    }

    private final void b(C3426ae c3426ae) {
        this.h = c3426ae;
        a(false);
    }

    private final EnumC3712qe b() {
        if (this.h != null) {
            return EnumC3712qe.INITIATED;
        }
        if (this.i != null) {
            return EnumC3712qe.INIT_FAILED;
        }
        if (this.j) {
            return EnumC3712qe.INIT_IN_PROGRESS;
        }
        return EnumC3712qe.NOT_INIT;
    }

    private final void a(Context context, R9 r9, Ie ie) {
        r9.i(ie.g().h());
        r9.c(ie.g().d());
        C1 c1B = ie.c().b();
        Intrinsics.beachfront(c1B);
        r9.a(c1B.a());
        r9.d(c1B.c().b());
        r9.b(c1B.k().b());
        r9.a(Boolean.valueOf(IronSourceUtils.c(context)));
        C1 c1B2 = ie.c().b();
        Intrinsics.beachfront(c1B2);
        r9.b(c1B2.f().b());
    }

    public /* synthetic */ C3677oe(InterfaceC3762te interfaceC3762te, Ee ee, C3779ue c3779ue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C3745se() : interfaceC3762te, (i & 2) != 0 ? new De(null, 1, null) : ee, (i & 4) != 0 ? new C3779ue(null, null, null, null, null, 31, null) : c3779ue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC3534ge listener, C3426ae sdkConfig) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
        listener.a(sdkConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC3534ge listener, C3462ce error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC3534ge.a(listener, error, null, 2, null);
    }

    private final void b(Context context, C3426ae c3426ae) {
        boolean zL;
        String strD;
        boolean z;
        String strD2;
        boolean z2;
        String strD3;
        Context context2;
        J1 j1B;
        Lb lbE;
        J1 j1G;
        U2 u2C;
        J1 j1G2;
        B9 b9D;
        J1 j1I;
        Rd rdF;
        J1 j1M;
        J1 j1B2;
        Ie ieD = c3426ae.d();
        C1 c1B = ieD.c().b();
        if (c1B == null || (j1B2 = c1B.b()) == null) {
            zL = false;
            strD = null;
        } else {
            zL = j1B2.l();
            strD = j1B2.d();
        }
        N3 n3C = ieD.c();
        if (n3C == null || (rdF = n3C.f()) == null || (j1M = rdF.m()) == null) {
            z = false;
            strD2 = null;
        } else {
            boolean zL2 = j1M.l();
            strD2 = j1M.d();
            z = zL2;
        }
        N3 n3C2 = ieD.c();
        if (n3C2 == null || (b9D = n3C2.d()) == null || (j1I = b9D.i()) == null) {
            z2 = false;
            strD3 = null;
        } else {
            boolean zL3 = j1I.l();
            strD3 = j1I.d();
            z2 = zL3;
        }
        N3 n3C3 = ieD.c();
        boolean zL4 = (n3C3 == null || (u2C = n3C3.c()) == null || (j1G2 = u2C.g()) == null) ? false : j1G2.l();
        N3 n3C4 = ieD.c();
        boolean zL5 = (n3C4 == null || (lbE = n3C4.e()) == null || (j1G = lbE.g()) == null) ? false : j1G.l();
        Gb.b bVar = Gb.s;
        bVar.d().q().b(strD, context);
        if (zL) {
            C1 c1B2 = ieD.c().b();
            if (c1B2 != null && (j1B = c1B2.b()) != null) {
                a(this, bVar.d().q(), j1B, context, ieD, false, 16, null);
            }
        } else {
            bVar.d().q().a(false);
        }
        Td.i().b(strD2, context);
        if (z) {
            N3 n3C5 = ieD.c();
            Rd rdF2 = n3C5 != null ? n3C5.f() : null;
            Intrinsics.beachfront(rdF2);
            J1 rewardedVideoConfig = rdF2.m();
            Td tdI = Td.i();
            Intrinsics.checkNotNullExpressionValue(tdI, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(rewardedVideoConfig, "rewardedVideoConfig");
            a(this, tdI, rewardedVideoConfig, context, ieD, false, 16, null);
        } else {
            Td.i().a(false);
        }
        D9.i().b(strD3, context);
        if (z2) {
            N3 n3C6 = ieD.c();
            B9 b9D2 = n3C6 != null ? n3C6.d() : null;
            Intrinsics.beachfront(b9D2);
            J1 interstitialConfig = b9D2.i();
            D9 d9I = D9.i();
            Intrinsics.checkNotNullExpressionValue(d9I, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(interstitialConfig, "interstitialConfig");
            a(this, d9I, interstitialConfig, context, ieD, false, 16, null);
            context2 = context;
        } else if (zL4) {
            N3 n3C7 = ieD.c();
            U2 u2C2 = n3C7 != null ? n3C7.c() : null;
            Intrinsics.beachfront(u2C2);
            J1 bannerConfig = u2C2.g();
            D9 d9I2 = D9.i();
            Intrinsics.checkNotNullExpressionValue(d9I2, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(bannerConfig, "bannerConfig");
            context2 = context;
            a(this, d9I2, bannerConfig, context2, ieD, false, 16, null);
        } else if (zL5) {
            N3 n3C8 = ieD.c();
            Lb lbE2 = n3C8 != null ? n3C8.e() : null;
            Intrinsics.beachfront(lbE2);
            J1 j1G3 = lbE2.g();
            D9 d9I3 = D9.i();
            Intrinsics.checkNotNullExpressionValue(d9I3, "getInstance()");
            context2 = context;
            a(this, d9I3, j1G3, context2, ieD, false, 16, null);
        } else {
            context2 = context;
            D9.i().a(false);
        }
        N3 n3C9 = ieD.c();
        C1 c1B3 = n3C9 != null ? n3C9.b() : null;
        Intrinsics.beachfront(c1B3);
        C3425ad c3425adI = c1B3.i();
        boolean zA = c3425adI.a();
        String strB = c3425adI.b();
        boolean zC = c3425adI.c();
        int iD = c3425adI.d();
        int[] iArrE = c3425adI.e();
        int[] iArrF = c3425adI.f();
        Zc zc = Zc.P;
        zc.a(zA);
        zc.b(strB, context2);
        if (zA) {
            zc.b(iArrE, context2);
            zc.c(iArrF, context2);
            zc.b(zC);
            zc.c(iD);
        }
    }

    public final void a(final Context context, final C3570ie initRequest, final InterfaceC3534ge listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final Context applicationContext = context.getApplicationContext();
        this.a.d(new Runnable() { // from class: com.ironsource.cig
            @Override // java.lang.Runnable
            public final void run() {
                C3677oe.a(this.f23161kowloon, listener, context, initRequest, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3677oe this$0, InterfaceC3534ge listener, Context context, C3570ie initRequest, Context context2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        C3426ae c3426ae = this$0.h;
        if (c3426ae != null) {
            this$0.a(listener, c3426ae);
            return;
        }
        this$0.g.add(listener);
        if (this$0.j) {
            return;
        }
        this$0.i = null;
        this$0.a(true);
        this$0.k = new Date().getTime();
        this$0.b.a(context, initRequest, this$0.a, this$0.new d(context2));
    }

    public final void a(final C3587je serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.a.d(new Runnable() { // from class: com.ironsource.tarboosh
            @Override // java.lang.Runnable
            public final void run() {
                C3677oe.a(serverResponse, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3587je serverResponse, C3677oe this$0) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C3426ae c3426ae = new C3426ae(serverResponse, null, null, 6, null);
        this$0.b(c3426ae);
        this$0.a(c3426ae);
    }

    public final void a(final C3462ce error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.d(new Runnable() { // from class: com.ironsource.linendraper
            @Override // java.lang.Runnable
            public final void run() {
                C3677oe.a(this.f23304kowloon, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3677oe this$0, C3462ce error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.a(error, (C3439b9) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C3462ce c3462ce, C3439b9 c3439b9) {
        this.i = c3462ce;
        a(false);
        Iterator<InterfaceC3534ge> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c3462ce);
        }
        this.g.clear();
        if (c3439b9 != null) {
            c3439b9.b();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c3462ce, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, C3426ae c3426ae) throws JSONException {
        Fe feI;
        b(c3426ae);
        M1 m1A = c3426ae.a();
        U4 u4 = U4.a;
        u4.c(m1A.g());
        Gb.b bVar = Gb.s;
        bVar.a().o().a(m1A.c());
        if (bVar.d().h().e() && (feI = c3426ae.i()) != null) {
            this.c.a(context, feI);
        }
        C3439b9 c3439b9F = c3426ae.f();
        if (c3439b9F != null) {
            c3439b9F.b();
        }
        u4.a(m1A.f());
        u4.a(m1A.j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(m1A.h());
        c().a(m1A);
        a(context, this.a.g(), c3426ae.d());
        this.a.a(new Date().getTime() - this.k, c3426ae.g());
        Me me2 = new Me();
        this.d = me2;
        me2.a(c());
        IronSourceUtils.e(context, c3426ae.d().toString());
        bVar.d().q().c(true);
        D9.i().c(true);
        Td.i().c(true);
        Zc zc = Zc.P;
        zc.c(true);
        b(context, c3426ae);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(c3426ae.e().b());
        F1 f1B = c3426ae.b();
        if (f1B.f()) {
            this.a.a(f1B);
        }
        a(c3426ae);
        zc.i();
        d();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("parameters for init url: " + Ke.a());
        ironLog.verbose("parameters for init POST data: " + Ke.b());
    }

    private final void a(C3426ae c3426ae) {
        Iterator<InterfaceC3534ge> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c3426ae);
        }
        this.g.clear();
    }

    private final void a(boolean z) {
        this.j = z;
        this.a.a(b());
    }

    private final void a(final InterfaceC3534ge interfaceC3534ge, final C3426ae c3426ae) {
        this.a.a(new Runnable() { // from class: com.ironsource.sultanate
            @Override // java.lang.Runnable
            public final void run() {
                C3677oe.b(interfaceC3534ge, c3426ae);
            }
        });
    }

    private final void a(final InterfaceC3534ge interfaceC3534ge, final C3462ce c3462ce) {
        this.a.a(new Runnable() { // from class: com.ironsource.demilitarize
            @Override // java.lang.Runnable
            public final void run() {
                C3677oe.b(interfaceC3534ge, c3462ce);
            }
        });
    }

    public static /* synthetic */ void a(C3677oe c3677oe, AbstractC3612l3 abstractC3612l3, J1 j1, Context context, Ie ie, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        c3677oe.a(abstractC3612l3, j1, context, ie, z);
    }

    private final void a(AbstractC3612l3 abstractC3612l3, J1 j1, Context context, Ie ie, boolean z) {
        abstractC3612l3.a(z);
        abstractC3612l3.a(j1.c(), context);
        abstractC3612l3.b(j1.d(), context);
        abstractC3612l3.a(j1.f());
        abstractC3612l3.d(j1.e());
        abstractC3612l3.b(j1.a());
        abstractC3612l3.b(j1.i(), context);
        abstractC3612l3.c(j1.h(), context);
        abstractC3612l3.a(j1.j(), context);
        abstractC3612l3.d(j1.g(), context);
        C1 c1B = ie.c().b();
        Intrinsics.beachfront(c1B);
        abstractC3612l3.a(c1B.j());
        abstractC3612l3.b(j1.k());
        abstractC3612l3.c(j1.b());
    }
}

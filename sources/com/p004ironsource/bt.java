package com.p004ironsource;

import A.F;
import A.RunnableC0895i;
import android.content.Context;
import com.applovin.impl.Z;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bC\u0010DJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u000f\u001a\u00020\u0012H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J2\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\bH\u0002J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001fJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001c\u0010+\u001a\n )*\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0013038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/ironsource/bt;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/hk;", "globalDataWriter", "Lcom/ironsource/qt;", "serverResponse", "", "a", "Lcom/ironsource/ps;", "error", "applicationContext", "Lcom/ironsource/ns;", "sdkConfig", "b", "", "inProgress", "Lcom/ironsource/dt;", "Lcom/ironsource/ts;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/u7;", "eventManager", "Lcom/ironsource/g4;", com.smartdigimkt.q0.b.i0, qt.f26623n, com.p004ironsource.mediationsdk.metadata.a.j, "d", "Lcom/ironsource/vs;", "initRequest", "e", "Lcom/ironsource/ws;", "Lcom/ironsource/tt;", "Lcom/ironsource/tt;", "sessionCalcManager", "Lcom/ironsource/jf;", "c", "Lkotlin/Lazy;", "()Lcom/ironsource/jf;", "applicationLifecycleService", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Lcom/ironsource/ft;", "Lcom/ironsource/ft;", "tools", "Lcom/ironsource/ot;", f.j, "Lcom/ironsource/ot;", "serverInit", "", g.f40227p, "Ljava/util/List;", "sdkInitListeners", h.f36614b, "Lcom/ironsource/ns;", i.f37957c, "Lcom/ironsource/ps;", "errorReason", "j", "Z", "initInProgress", "", "k", "J", "initStartTime", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class bt {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static tt sessionCalcManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static ns sdkConfig;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static ps errorReason;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static boolean initInProgress;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static long initStartTime;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bt f24457a = new bt();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Lazy applicationLifecycleService = LazyKt.b(a.f24463a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String TAG = "bt";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final ft tools = new ft();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final ot serverInit = new ot();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final List<ts> sdkInitListeners = new ArrayList();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/jf;", "a", "()Lcom/ironsource/jf;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<jf> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24463a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jf invoke() {
            return on.INSTANCE.d().v();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/bt$b", "Lcom/ironsource/ts;", "Lcom/ironsource/ns;", "sdkConfig", "", "a", "Lcom/ironsource/ps;", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements ts {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f24464a;

        public b(Context context) {
            this.f24464a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Context applicationContext, ns sdkConfig) {
            Intrinsics.f(sdkConfig, "$sdkConfig");
            bt btVar = bt.f24457a;
            Intrinsics.e(applicationContext, "applicationContext");
            btVar.a(applicationContext, sdkConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(ps error) {
            Intrinsics.f(error, "$error");
            bt.f24457a.a(error);
        }

        @Override // com.p004ironsource.ts
        public void a(ns sdkConfig) {
            Intrinsics.f(sdkConfig, "sdkConfig");
            bt.tools.a(new G0(3, this.f24464a, sdkConfig));
        }

        @Override // com.p004ironsource.ts
        public void a(ps error) {
            Intrinsics.f(error, "error");
            bt.tools.a(new E(error, 1));
        }
    }

    private bt() {
    }

    private final dt b() {
        if (sdkConfig != null) {
            return dt.INITIATED;
        }
        if (errorReason != null) {
            return dt.INIT_FAILED;
        }
        return initInProgress ? dt.INIT_IN_PROGRESS : dt.NOT_INIT;
    }

    private final jf c() {
        return (jf) applicationLifecycleService.getX();
    }

    private final void d() {
        if (on.INSTANCE.d().d().g()) {
            ds.i().a(new zb(ac.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        f24457a.a(true);
    }

    public final void e() {
        tools.c(new RunnableC0895i(18));
    }

    private final void a(Context context, hk globalDataWriter, qt serverResponse) {
        globalDataWriter.i(serverResponse.f().h());
        globalDataWriter.c(serverResponse.f().d());
        z3 z3VarB = serverResponse.c().getApplicationConfigurations();
        Intrinsics.c(z3VarB);
        globalDataWriter.a(z3VarB.a());
        globalDataWriter.d(z3VarB.c().b());
        globalDataWriter.b(z3VarB.k().b());
        globalDataWriter.a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
        z3 z3VarB2 = serverResponse.c().getApplicationConfigurations();
        Intrinsics.c(z3VarB2);
        globalDataWriter.b(z3VarB2.f().getCmpId());
    }

    /* JADX WARN: Code duplicated, block: B:79:0x015d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    private final void b(Context context, ns sdkConfig2) {
        Context context2;
        g4 g4VarG;
        wj wjVarI;
        String str;
        boolean zA;
        String strB;
        boolean zC;
        int iD;
        int[] iArrE;
        int[] iArrF;
        kq kqVar;
        g4 g4VarB;
        tn tnVarE;
        g4 g4VarG2;
        u6 u6VarC;
        g4 g4VarG3;
        uj ujVarD;
        g4 g4VarI;
        bs bsVarF;
        g4 g4VarM;
        g4 g4VarB2;
        qt qtVarD = sdkConfig2.d();
        z3 z3VarB = qtVarD.c().getApplicationConfigurations();
        boolean zL = (z3VarB == null || (g4VarB2 = z3VarB.b()) == null) ? false : g4VarB2.l();
        u8 u8VarC = qtVarD.c();
        boolean zL2 = (u8VarC == null || (bsVarF = u8VarC.getRewardedVideoConfigurations()) == null || (g4VarM = bsVarF.m()) == null) ? false : g4VarM.l();
        u8 u8VarC2 = qtVarD.c();
        boolean zL3 = (u8VarC2 == null || (ujVarD = u8VarC2.getInterstitialConfigurations()) == null || (g4VarI = ujVarD.i()) == null) ? false : g4VarI.l();
        u8 u8VarC3 = qtVarD.c();
        boolean zL4 = (u8VarC3 == null || (u6VarC = u8VarC3.getBannerConfigurations()) == null || (g4VarG3 = u6VarC.g()) == null) ? false : g4VarG3.l();
        u8 u8VarC4 = qtVarD.c();
        boolean zL5 = (u8VarC4 == null || (tnVarE = u8VarC4.getNativeAdConfigurations()) == null || (g4VarG2 = tnVarE.getEventsConfigurations()) == null) ? false : g4VarG2.l();
        if (zL) {
            z3 z3VarB2 = qtVarD.c().getApplicationConfigurations();
            if (z3VarB2 == null || (g4VarB = z3VarB2.b()) == null) {
                context2 = context;
            } else {
                context2 = context;
                a(f24457a, on.INSTANCE.d().z(), g4VarB, context2, qtVarD, false, 16, null);
            }
        } else {
            context2 = context;
            on.INSTANCE.d().z().b(false);
        }
        if (zL2) {
            u8 u8VarC5 = qtVarD.c();
            bs bsVarF2 = u8VarC5 != null ? u8VarC5.getRewardedVideoConfigurations() : null;
            Intrinsics.c(bsVarF2);
            g4 rewardedVideoConfig = bsVarF2.m();
            ds dsVarI = ds.i();
            Intrinsics.e(dsVarI, "getInstance()");
            Intrinsics.e(rewardedVideoConfig, "rewardedVideoConfig");
            a(this, dsVarI, rewardedVideoConfig, context2, qtVarD, false, 16, null);
        } else {
            ds.i().b(false);
        }
        if (!zL3) {
            if (zL4) {
                u8 u8VarC6 = qtVarD.c();
                u6 u6VarC2 = u8VarC6 != null ? u8VarC6.getBannerConfigurations() : null;
                Intrinsics.c(u6VarC2);
                g4VarG = u6VarC2.g();
                wjVarI = wj.i();
                Intrinsics.e(wjVarI, "getInstance()");
                str = "bannerConfig";
            } else if (zL5) {
                u8 u8VarC7 = qtVarD.c();
                tn tnVarE2 = u8VarC7 != null ? u8VarC7.getNativeAdConfigurations() : null;
                Intrinsics.c(tnVarE2);
                g4VarG = tnVarE2.getEventsConfigurations();
                wjVarI = wj.i();
                Intrinsics.e(wjVarI, "getInstance()");
                a(this, wjVarI, g4VarG, context2, qtVarD, false, 16, null);
            } else {
                wj.i().b(false);
            }
            u8 u8VarC8 = qtVarD.c();
            z3 z3VarB3 = u8VarC8 != null ? u8VarC8.getApplicationConfigurations() : null;
            Intrinsics.c(z3VarB3);
            lq lqVarI = z3VarB3.i();
            zA = lqVarI.getPixelEventsEnabled();
            strB = lqVarI.getPixelEventsUrl();
            zC = lqVarI.getPixelEventsCompression();
            iD = lqVarI.getPixelEventsCompressionLevel();
            iArrE = lqVarI.getPixelOptOut();
            iArrF = lqVarI.getPixelOptIn();
            kqVar = kq.f25536P;
            kqVar.b(zA);
            if (zA) {
                kqVar.b(strB, context2);
                kqVar.c(iArrE, context2);
                kqVar.a(iArrF, context2);
                kqVar.a(zC);
                kqVar.d(iD);
            }
        }
        u8 u8VarC9 = qtVarD.c();
        uj ujVarD2 = u8VarC9 != null ? u8VarC9.getInterstitialConfigurations() : null;
        Intrinsics.c(ujVarD2);
        g4VarG = ujVarD2.i();
        wjVarI = wj.i();
        Intrinsics.e(wjVarI, "getInstance()");
        str = "interstitialConfig";
        Intrinsics.e(g4VarG, str);
        a(this, wjVarI, g4VarG, context2, qtVarD, false, 16, null);
        u8 u8VarC10 = qtVarD.c();
        if (u8VarC10 != null) {
        }
        Intrinsics.c(z3VarB3);
        lq lqVarI2 = z3VarB3.i();
        zA = lqVarI2.getPixelEventsEnabled();
        strB = lqVarI2.getPixelEventsUrl();
        zC = lqVarI2.getPixelEventsCompression();
        iD = lqVarI2.getPixelEventsCompressionLevel();
        iArrE = lqVarI2.getPixelOptOut();
        iArrF = lqVarI2.getPixelOptIn();
        kqVar = kq.f25536P;
        kqVar.b(zA);
        if (zA) {
            kqVar.b(strB, context2);
            kqVar.c(iArrE, context2);
            kqVar.a(iArrF, context2);
            kqVar.a(zC);
            kqVar.d(iD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ps error) {
        Intrinsics.f(error, "$error");
        f24457a.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context applicationContext, ns sdkConfig2) {
        b(sdkConfig2);
        j4 j4VarA = sdkConfig2.a();
        xa xaVar = xa.f27681a;
        xaVar.c(j4VarA.getShouldUseAppSet());
        on.Companion bVar = on.INSTANCE;
        bVar.a().x().a(j4VarA.getCom.ironsource.d9.a.c java.lang.String());
        xaVar.a(j4VarA.getShouldReuseAdvId());
        xaVar.a(j4VarA.getUserAgentExpirationThresholdInHours());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(j4VarA.getShouldUseSharedThreadPool());
        c().a(j4VarA);
        ft ftVar = tools;
        a(applicationContext, ftVar.getGlobalDataWriter(), sdkConfig2.d());
        ftVar.a(Z.f() - initStartTime, sdkConfig2.f());
        tt ttVar = new tt();
        sessionCalcManager = ttVar;
        ttVar.a(c());
        IronSourceUtils.saveLastResponse(applicationContext, sdkConfig2.d().toString());
        bVar.d().z().c(true);
        wj.i().c(true);
        ds.i().c(true);
        kq.f25536P.c(true);
        b(applicationContext, sdkConfig2);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(sdkConfig2.e().getCom.ironsource.jn.b java.lang.String());
        c4 c4VarB = sdkConfig2.b();
        if (c4VarB.getIsCrashReporterEnabled()) {
            ftVar.a(c4VarB);
        }
        a(sdkConfig2);
        new kq.a().a();
        d();
    }

    private final void b(ns sdkConfig2) {
        sdkConfig = sdkConfig2;
        a(false);
    }

    public final void b(ps error) {
        Intrinsics.f(error, "error");
        tools.c(new E(error, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ts listener, ns sdkConfig2) {
        Intrinsics.f(listener, "$listener");
        Intrinsics.f(sdkConfig2, "$sdkConfig");
        listener.a(sdkConfig2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ts listener, ps error) {
        Intrinsics.f(listener, "$listener");
        Intrinsics.f(error, "$error");
        listener.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ws serverResponse) {
        Intrinsics.f(serverResponse, "$serverResponse");
        ns nsVar = new ns(serverResponse);
        bt btVar = f24457a;
        btVar.b(nsVar);
        btVar.a(nsVar);
    }

    public final void a(Context context, vs initRequest, ts listener) {
        Intrinsics.f(context, "context");
        Intrinsics.f(initRequest, "initRequest");
        Intrinsics.f(listener, "listener");
        tools.c(new F(listener, context, initRequest, context.getApplicationContext(), 21));
    }

    public static /* synthetic */ void a(bt btVar, u7 u7Var, g4 g4Var, Context context, qt qtVar, boolean z2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z2 = true;
        }
        btVar.a(u7Var, g4Var, context, qtVar, z2);
    }

    private final void a(ns sdkConfig2) {
        Iterator<ts> it = sdkInitListeners.iterator();
        while (it.hasNext()) {
            a(it.next(), sdkConfig2);
        }
        sdkInitListeners.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ps error) {
        errorReason = error;
        a(false);
        Iterator<ts> it = sdkInitListeners.iterator();
        while (it.hasNext()) {
            a(it.next(), error);
        }
        sdkInitListeners.clear();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + error, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ts listener, Context context, vs initRequest, Context context2) {
        Intrinsics.f(listener, "$listener");
        Intrinsics.f(context, "$context");
        Intrinsics.f(initRequest, "$initRequest");
        ns nsVar = sdkConfig;
        if (nsVar != null) {
            f24457a.a(listener, nsVar);
            return;
        }
        sdkInitListeners.add(listener);
        if (initInProgress) {
            return;
        }
        errorReason = null;
        f24457a.a(true);
        initStartTime = Z.f();
        serverInit.a(context, initRequest, tools, new b(context2));
    }

    private final void a(ts listener, ns sdkConfig2) {
        tools.e(new B(listener, sdkConfig2, 0));
    }

    private final void a(ts listener, ps error) {
        tools.e(new C(listener, error, 0));
    }

    private final void a(u7 eventManager, g4 config, Context context, qt response, boolean enable) {
        eventManager.b(enable);
        eventManager.a(config.c(), context);
        eventManager.b(config.d(), context);
        eventManager.b(config.f());
        eventManager.a(config.e());
        eventManager.c(config.a());
        eventManager.c(config.i(), context);
        eventManager.a(config.h(), context);
        eventManager.b(config.j(), context);
        eventManager.d(config.g(), context);
        z3 z3VarB = response.c().getApplicationConfigurations();
        Intrinsics.c(z3VarB);
        eventManager.a(z3VarB.j());
        eventManager.a(config.k());
        eventManager.d(config.b());
    }

    public final void a(ws serverResponse) {
        Intrinsics.f(serverResponse, "serverResponse");
        tools.c(new D(serverResponse, 0));
    }

    private final void a(boolean inProgress) {
        initInProgress = inProgress;
        tools.a(b());
    }
}

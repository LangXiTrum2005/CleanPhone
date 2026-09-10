package com.p004ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.p004ironsource.ac;
import com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.p004ironsource.ah;
import com.p004ironsource.aj;
import com.p004ironsource.an;
import com.p004ironsource.b9;
import com.p004ironsource.bs;
import com.p004ironsource.co;
import com.p004ironsource.ds;
import com.p004ironsource.dt;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.eo;
import com.p004ironsource.et;
import com.p004ironsource.ev;
import com.p004ironsource.f8;
import com.p004ironsource.fi;
import com.p004ironsource.fr;
import com.p004ironsource.fv;
import com.p004ironsource.g1;
import com.p004ironsource.g4;
import com.p004ironsource.g6;
import com.p004ironsource.gp;
import com.p004ironsource.h7;
import com.p004ironsource.hk;
import com.p004ironsource.i1;
import com.p004ironsource.iw;
import com.p004ironsource.j4;
import com.p004ironsource.jf;
import com.p004ironsource.jg;
import com.p004ironsource.jv;
import com.p004ironsource.jw;
import com.p004ironsource.kq;
import com.p004ironsource.lb;
import com.p004ironsource.le;
import com.p004ironsource.lg;
import com.p004ironsource.lq;
import com.p004ironsource.mb;
import com.p004ironsource.mediationsdk.adquality.AdQualityBridge;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.p004ironsource.mediationsdk.demandOnly.f;
import com.p004ironsource.mediationsdk.demandOnly.h;
import com.p004ironsource.mediationsdk.demandOnly.k;
import com.p004ironsource.mediationsdk.events.ISErrorListener;
import com.p004ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.logger.LogListener;
import com.p004ironsource.mediationsdk.metadata.MetaData;
import com.p004ironsource.mediationsdk.metadata.MetaDataUtils;
import com.p004ironsource.mediationsdk.model.InterstitialPlacement;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.sdk.InitializationListener;
import com.p004ironsource.mediationsdk.sdk.IronSourceInterface;
import com.p004ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.p004ironsource.mediationsdk.sdk.SegmentListener;
import com.p004ironsource.mediationsdk.server.HttpFunctions;
import com.p004ironsource.mediationsdk.server.ServerURL;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.mediationsdk.utils.IronSourceAES;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.mk;
import com.p004ironsource.ng;
import com.p004ironsource.on;
import com.p004ironsource.op;
import com.p004ironsource.pc;
import com.p004ironsource.pj;
import com.p004ironsource.pn;
import com.p004ironsource.q9;
import com.p004ironsource.qq;
import com.p004ironsource.qt;
import com.p004ironsource.sa;
import com.p004ironsource.sdk.controller.FeaturesManager;
import com.p004ironsource.se;
import com.p004ironsource.t8;
import com.p004ironsource.ta;
import com.p004ironsource.tn;
import com.p004ironsource.u6;
import com.p004ironsource.u7;
import com.p004ironsource.u8;
import com.p004ironsource.ug;
import com.p004ironsource.uj;
import com.p004ironsource.us;
import com.p004ironsource.vf;
import com.p004ironsource.wj;
import com.p004ironsource.wu;
import com.p004ironsource.xa;
import com.p004ironsource.xk;
import com.p004ironsource.yi;
import com.p004ironsource.yr;
import com.p004ironsource.zb;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class p implements IronSourceInterface, op, sa, sa.b, sa.c, sa.a {
    private static boolean s0 = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Set<IronSource.AD_UNIT> f25986A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f25987B;
    private IronSourceSegment C;
    private final String D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f25988E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f25989F;
    private boolean G;
    private boolean H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f25990I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f25991J;
    private boolean K;
    private boolean L;
    private Boolean M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private IronSourceBannerLayout f25992N;
    private String O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Boolean f25993P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private lg f25994Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private w f25995R;
    private pj S;
    private yr T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private g6 f25996U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private InitializationListener f25997V;
    private gp W;
    private AtomicBoolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f25998Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25999a;
    private boolean a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26000b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f26001b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vf f26002c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f26003c0;
    private final vf.a d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f26004d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jg f26005e;
    private final ConcurrentHashMap<String, h.d> e0;
    private final jf f;
    private final ConcurrentHashMap<String, h.b> f0;
    private final fi.a g;
    private final ConcurrentHashMap<String, h.d> g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IronSourceLoggerManager f26006h;
    private f h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private an f26007i;
    private k i0;
    private com.p004ironsource.mediationsdk.logger.b j;
    private com.p004ironsource.mediationsdk.demandOnly.c j0;
    private AtomicBoolean k;
    private pc k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f26008l;
    private hk l0;
    private qt m;
    private se m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f26009n;
    private boolean n0;
    private String o;
    private AdQualityBridge o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f26010p;
    ISErrorListener p0;
    private String q;
    ug<ISDemandOnlyInterstitialListener> q0;
    private Map<String, String> r;
    ug<ISDemandOnlyRewardedVideoListener> r0;
    private String s;
    private AtomicBoolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f26011u;
    private List<IronSource.AD_UNIT> v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f26012w;
    private Context x;
    private Boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Set<IronSource.AD_UNIT> f26013z;

    public class a implements ISErrorListener {
        public a() {
        }

        @Override // com.p004ironsource.mediationsdk.events.ISErrorListener
        public void onError(Throwable th) {
            IronLog.INTERNAL.error(th.getMessage());
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f26017c;

        static {
            int[] iArr = new int[qq.b.values().length];
            f26017c = iArr;
            try {
                iArr[qq.b.CAPPED_PER_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26017c[qq.b.CAPPED_PER_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26017c[qq.b.CAPPED_PER_PACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26017c[qq.b.NOT_CAPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[s.d.values().length];
            f26016b = iArr2;
            try {
                iArr2[s.d.INIT_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26016b[s.d.INIT_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[IronSource.AD_UNIT.values().length];
            f26015a = iArr3;
            try {
                iArr3[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26015a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26015a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26015a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface c {
        void a(String str);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static volatile p f26018a = new p(null);

        private d() {
        }
    }

    private p() {
        this(on.U().f(), on.O().b(), on.U().C(), on.U().v(), on.O().q());
    }

    private synchronized boolean A() {
        return this.f26011u;
    }

    private boolean B() {
        qt qtVar = this.m;
        return (qtVar == null || qtVar.c() == null || this.m.c().getInterstitialConfigurations() == null) ? false : true;
    }

    private boolean C() {
        return B() && E();
    }

    private boolean E() {
        qt qtVar = this.m;
        return (qtVar == null || qtVar.j() == null || this.m.j().b() == null || this.m.j().b().size() <= 0) ? false : true;
    }

    private boolean F() {
        qt qtVar = this.m;
        return (qtVar == null || qtVar.c() == null || this.m.c().getNativeAdConfigurations() == null) ? false : true;
    }

    private boolean G() {
        return F() && H();
    }

    private boolean H() {
        qt qtVar = this.m;
        return (qtVar == null || qtVar.j() == null || this.m.j().c() == null || this.m.j().c().isEmpty()) ? false : true;
    }

    private boolean J() {
        qt qtVar = this.m;
        return (qtVar == null || qtVar.c() == null || this.m.c().getRewardedVideoConfigurations() == null) ? false : true;
    }

    private boolean K() {
        return J() && L();
    }

    private boolean L() {
        qt qtVar = this.m;
        return (qtVar == null || qtVar.j() == null || this.m.j().d() == null || this.m.j().d().size() <= 0) ? false : true;
    }

    private void R() {
        if (this.f25997V == null || !this.X.compareAndSet(false, true)) {
            return;
        }
        IronLog.CALLBACK.verbose("onInitializationCompleted()");
        on.U().z().a(new zb(ac.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
        this.f25997V.onInitializationComplete();
    }

    private void T() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = xk.b().c();
        if (concurrentHashMapC.containsKey(com.p004ironsource.mediationsdk.metadata.a.f25960c)) {
            String str = concurrentHashMapC.get(com.p004ironsource.mediationsdk.metadata.a.f25960c).get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            xa.f27681a.b(!MetaDataUtils.getMetaDataBooleanValue(str));
        }
    }

    private void U() {
        if (this.H) {
            W();
            return;
        }
        boolean zH = this.m.c().getBannerConfigurations().d().h();
        this.f26003c0 = zH;
        if (zH) {
            V();
        } else {
            c0();
        }
    }

    private void V() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.m.j().a());
        if (listA.size() > 0) {
            this.f25996U = new g6(listA, this.m.c().getBannerConfigurations(), IronSourceUtils.getUserIdForNetworks(), xk.b(), this.C);
            s();
        } else {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            a(ac.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.BANNER, false);
        }
    }

    private void W() {
        this.f26006h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.m.j().a().size(); i2++) {
            String str = this.m.j().a().get(i2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            a(ac.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.BANNER, false);
            return;
        }
        synchronized (this.f0) {
            try {
                u6 u6VarC = this.m.c().getBannerConfigurations();
                ta.a aVar = new ta.a("Mediation");
                if (u6VarC.k()) {
                    aVar.a("isOneFlow", 1);
                }
                this.j0 = new com.p004ironsource.mediationsdk.demandOnly.c(arrayList, u6VarC, k(), l(), new ta.b(wj.i(), aVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        for (h.b bVar : this.f0.values()) {
            this.j0.a(bVar.getBanner(), bVar.getInstanceId());
        }
        this.f0.clear();
    }

    private void X() {
        this.f26006h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.m.j().b().size(); i2++) {
            String str = this.m.j().b().get(i2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            a(ac.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        synchronized (this.e0) {
            this.h0 = a((List<NetworkSettings>) arrayList);
        }
        Iterator<h.d> it = this.e0.values().iterator();
        while (it.hasNext()) {
            this.h0.a(it.next());
        }
        this.e0.clear();
    }

    private void Y() {
        this.f26006h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.m.j().d().size(); i2++) {
            String str = this.m.j().d().get(i2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.g0) {
            this.i0 = b(arrayList);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        Iterator<h.d> it = this.g0.values().iterator();
        while (it.hasNext()) {
            this.i0.a(it.next());
        }
        this.g0.clear();
    }

    private void Z() {
        if (this.G) {
            X();
        } else {
            a0();
        }
    }

    private int a(bs bsVar) {
        return (this.a0 || this.f25998Y || !bsVar.k().e()) ? 1 : 2;
    }

    private void a0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.m.j().b());
        if (listA.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            a(ac.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        pj pjVar = new pj(listA, this.m.c().getInterstitialConfigurations(), IronSourceUtils.getUserIdForNetworks(), xk.b(), this.C);
        this.S = pjVar;
        Boolean bool = this.y;
        if (bool != null) {
            pjVar.a(this.x, bool.booleanValue());
        }
        if (this.f26001b0) {
            this.f26001b0 = false;
            this.S.A();
        }
    }

    private void b0() {
        this.f26006h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
        List<NetworkSettings> listA = a(this.m.j().d());
        if (listA.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.f26004d0);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            b(ac.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        q qVar = new q(listA, this.m.c().getRewardedVideoConfigurations(), k(), IronSourceUtils.getUserIdForNetworks(), xk.b().a(), this.C);
        this.f25994Q = qVar;
        Boolean bool = this.y;
        if (bool != null) {
            qVar.shouldTrackNetworkState(this.x, bool.booleanValue());
        }
    }

    private void c0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.m.j().a());
        if (listA.size() > 0) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
            this.f25995R = new w(listA, new k(k(), IronSourceUtils.getUserIdForNetworks(), this.m.c().getBannerConfigurations()), xk.b().a(), this.C);
            s();
        } else {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            a(ac.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.BANNER, false);
        }
    }

    private void d0() {
        if (this.f25989F) {
            Y();
            return;
        }
        bs bsVarF = this.m.c().getRewardedVideoConfigurations();
        this.a0 = bsVarF.k().h();
        this.f26004d0 = a(bsVarF);
        if (this.f25998Y || this.a0) {
            e0();
        } else {
            b0();
        }
    }

    private void e0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.m.j().d());
        if (listA.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.f26004d0);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            b(ac.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        yr yrVar = new yr(listA, this.m.c().getRewardedVideoConfigurations(), IronSourceUtils.getUserIdForNetworks(), this.f25998Y, xk.b(), this.C);
        this.T = yrVar;
        Boolean bool = this.y;
        if (bool != null) {
            yrVar.a(this.x, bool.booleanValue());
        }
        if (this.Z && this.f25998Y) {
            this.Z = false;
            this.T.A();
        }
    }

    private InterstitialPlacement f() {
        uj ujVarD = this.m.c().getInterstitialConfigurations();
        if (ujVarD != null) {
            return ujVarD.a();
        }
        return null;
    }

    private h7 g(String str) {
        h7 h7VarA;
        u6 u6VarC = this.m.c().getBannerConfigurations();
        if (u6VarC == null) {
            return new lb();
        }
        return (TextUtils.isEmpty(str) || (h7VarA = u6VarC.a(str)) == null) ? u6VarC.i() : h7VarA;
    }

    private qq.b h(String str) {
        InterstitialPlacement interstitialPlacementI;
        qt qtVar = this.m;
        if (qtVar == null || qtVar.c() == null || this.m.c().getInterstitialConfigurations() == null) {
            return qq.b.NOT_CAPPED;
        }
        try {
            interstitialPlacementI = i(str);
            if (interstitialPlacementI == null) {
                try {
                    interstitialPlacementI = f();
                    if (interstitialPlacementI == null) {
                        this.f26006h.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
                    }
                } catch (Exception e2) {
                    e = e2;
                    q9.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        } catch (Exception e3) {
            e = e3;
            interstitialPlacementI = null;
        }
        return interstitialPlacementI == null ? qq.b.NOT_CAPPED : a(interstitialPlacementI);
    }

    private InterstitialPlacement i(String str) {
        uj ujVarD = this.m.c().getInterstitialConfigurations();
        if (ujVarD != null) {
            return ujVarD.a(str);
        }
        return null;
    }

    private qq.b k(String str) {
        Placement placementL;
        qt qtVar = this.m;
        if (qtVar == null || qtVar.c() == null || this.m.c().getRewardedVideoConfigurations() == null) {
            return qq.b.NOT_CAPPED;
        }
        try {
            placementL = l(str);
            if (placementL == null) {
                try {
                    placementL = g();
                    if (placementL == null) {
                        this.f26006h.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
                    }
                } catch (Exception e2) {
                    e = e2;
                    q9.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        } catch (Exception e3) {
            e = e3;
            placementL = null;
        }
        return placementL == null ? qq.b.NOT_CAPPED : a(placementL);
    }

    private Placement l(String str) {
        bs bsVarF = this.m.c().getRewardedVideoConfigurations();
        if (bsVarF != null) {
            return bsVarF.a(str);
        }
        return null;
    }

    private synchronized gp o() {
        return this.W;
    }

    private t8 r(String str) {
        IronSourceError ironSourceError;
        String str2;
        t8 t8Var = new t8();
        if (str != null) {
            if (a(str, 5, 10)) {
                str2 = q(str) ? "length should be between 5-10 characters" : "should contain only english characters and numbers";
                return t8Var;
            }
            ironSourceError = ErrorBuilder.buildInvalidCredentialsError("appKey", str, str2);
        } else {
            ironSourceError = new IronSourceError(506, "Init Fail - appKey is missing");
        }
        t8Var.a(ironSourceError);
        return t8Var;
    }

    private void s() {
        if (this.M.booleanValue()) {
            IronLog.INTERNAL.verbose("load banner after init");
            this.M = Boolean.FALSE;
            a(this.f25992N, this.O);
            this.f25992N = null;
            this.O = null;
        }
    }

    private void t() {
        this.f26006h = IronSourceLoggerManager.getLogger(0);
        com.p004ironsource.mediationsdk.logger.b bVar = new com.p004ironsource.mediationsdk.logger.b(null, 1);
        this.j = bVar;
        this.f26006h.addLogger(bVar);
        this.f26007i = new an();
    }

    private boolean u() {
        try {
            IronLog.INTERNAL.verbose("AdQuality SDK exist: ".concat(IronSourceAdQuality.class.getName()));
            return true;
        } catch (Throwable th) {
            q9.d().a(th);
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    private boolean v() {
        qt qtVar = this.m;
        return (qtVar == null || qtVar.c() == null || this.m.c().getApplicationConfigurations() == null || this.m.c().getApplicationConfigurations().b() == null) ? false : true;
    }

    private boolean w() {
        qt qtVar = this.m;
        return (qtVar == null || qtVar.c() == null || this.m.c().getBannerConfigurations() == null) ? false : true;
    }

    private boolean x() {
        return w() && y();
    }

    private boolean y() {
        qt qtVar = this.m;
        return (qtVar == null || qtVar.j() == null || this.m.j().a() == null || this.m.j().a().size() <= 0) ? false : true;
    }

    public boolean D() {
        boolean z2;
        try {
            if (this.G) {
                this.f26006h.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead", 3);
                return false;
            }
            pj pjVar = this.S;
            boolean z3 = pjVar != null && pjVar.u();
            try {
                wj.i().a(new zb(z3 ? ac.IS_CHECK_READY_TRUE : ac.IS_CHECK_READY_FALSE, IronSourceUtils.getMediationAdditionalData(false, true, 1)));
                this.f26006h.log(IronSourceLogger.IronSourceTag.API, "isInterstitialReady():" + z3, 1);
                return z3;
            } catch (Throwable th) {
                z2 = z3;
                th = th;
                q9.d().a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.f26006h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isInterstitialReady():" + z2, 1);
                this.f26006h.logException(ironSourceTag, "isInterstitialReady()", th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0037  */
    public boolean I() {
        boolean z2;
        boolean z3;
        try {
            if (this.f25989F) {
                this.f26006h.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead", 3);
                return false;
            }
            if (this.f25998Y || this.a0) {
                yr yrVar = this.T;
                if (yrVar == null || !yrVar.u()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                lg lgVar = this.f25994Q;
                if (lgVar == null || !lgVar.d()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            try {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f26004d0)}});
                ds.i().a(new zb(z3 ? ac.RV_API_HAS_AVAILABILITY_TRUE : ac.RV_API_HAS_AVAILABILITY_FALSE, mediationAdditionalData));
                this.f26006h.log(IronSourceLogger.IronSourceTag.API, "isRewardedVideoAvailable():" + z3, 1);
                return z3;
            } catch (Throwable th) {
                z2 = z3;
                th = th;
                q9.d().a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.f26006h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isRewardedVideoAvailable():" + z2, 1);
                this.f26006h.logException(ironSourceTag, "isRewardedVideoAvailable()", th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = false;
        }
    }

    public boolean M() {
        return A();
    }

    public void N() {
        n nVarA;
        IronSource.AD_UNIT ad_unit;
        IronSourceError ironSourceErrorBuildInitFailedError;
        n nVarA2;
        IronSource.AD_UNIT ad_unit2;
        IronSourceError ironSourceErrorBuildInitFailedError2;
        IronSourceLoggerManager ironSourceLoggerManager = this.f26006h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (this.G) {
                this.f26006h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                nVarA2 = n.a();
                ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
                ironSourceErrorBuildInitFailedError2 = ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial");
            } else {
                if (this.f25991J) {
                    s.d dVarA = s.c().a();
                    if (dVarA == s.d.INIT_FAILED) {
                        this.f26006h.log(ironSourceTag, "init() had failed", 3);
                        nVarA = n.a();
                        ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                        ironSourceErrorBuildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial");
                    } else {
                        if (dVarA == s.d.INIT_IN_PROGRESS) {
                            if (s.c().d()) {
                                this.f26006h.log(ironSourceTag, "init() had failed", 3);
                                nVarA = n.a();
                                ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                                ironSourceErrorBuildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial");
                            }
                            this.f26001b0 = true;
                            return;
                        }
                        if (C()) {
                            pj pjVar = this.S;
                            if (pjVar == null) {
                                this.f26001b0 = true;
                                return;
                            } else {
                                pjVar.A();
                                return;
                            }
                        }
                        this.f26006h.log(ironSourceTag, "No interstitial configurations found", 3);
                        nVarA = n.a();
                        ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                        ironSourceErrorBuildInitFailedError = ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial");
                    }
                    nVarA.b(ad_unit, ironSourceErrorBuildInitFailedError);
                    return;
                }
                this.f26006h.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                nVarA2 = n.a();
                ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
                ironSourceErrorBuildInitFailedError2 = ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial");
            }
            nVarA2.b(ad_unit2, ironSourceErrorBuildInitFailedError2);
        } catch (Throwable th) {
            q9.d().a(th);
            this.f26006h.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            n.a().b(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(510, th.getMessage()));
        }
    }

    public void O() {
        n nVarA;
        IronSource.AD_UNIT ad_unit;
        IronSourceError ironSourceErrorBuildInitFailedError;
        n nVarA2;
        IronSource.AD_UNIT ad_unit2;
        IronSourceError ironSourceErrorBuildInitFailedError2;
        IronSourceLoggerManager ironSourceLoggerManager = this.f26006h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (this.f25989F) {
                this.f26006h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                nVarA2 = n.a();
                ad_unit2 = IronSource.AD_UNIT.REWARDED_VIDEO;
                ironSourceErrorBuildInitFailedError2 = ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            } else {
                if (!this.f25998Y && !this.n0) {
                    this.f26006h.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
                    return;
                }
                if (this.f25990I) {
                    s.d dVarA = s.c().a();
                    if (dVarA == s.d.INIT_FAILED) {
                        this.f26006h.log(ironSourceTag, "init() had failed", 3);
                        nVarA = n.a();
                        ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                        ironSourceErrorBuildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                    } else {
                        if (dVarA == s.d.INIT_IN_PROGRESS) {
                            if (s.c().d()) {
                                this.f26006h.log(ironSourceTag, "init() had failed", 3);
                                nVarA = n.a();
                                ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                                ironSourceErrorBuildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                            }
                            this.Z = true;
                            return;
                        }
                        if (K()) {
                            yr yrVar = this.T;
                            if (yrVar == null) {
                                this.Z = true;
                                return;
                            } else {
                                yrVar.A();
                                return;
                            }
                        }
                        this.f26006h.log(ironSourceTag, "No rewarded video configurations found", 3);
                        nVarA = n.a();
                        ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                        ironSourceErrorBuildInitFailedError = ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                    }
                    nVarA.b(ad_unit, ironSourceErrorBuildInitFailedError);
                    return;
                }
                this.f26006h.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                nVarA2 = n.a();
                ad_unit2 = IronSource.AD_UNIT.REWARDED_VIDEO;
                ironSourceErrorBuildInitFailedError2 = ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            }
            nVarA2.b(ad_unit2, ironSourceErrorBuildInitFailedError2);
        } catch (Throwable th) {
            q9.d().a(th);
            this.f26006h.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, new IronSourceError(510, th.getMessage()));
        }
    }

    public void P() {
        pj pjVar = this.S;
        if (pjVar != null) {
            pjVar.a((jv) null);
        }
        yr yrVar = this.T;
        if (yrVar != null) {
            yrVar.a((jv) null);
        }
        g6 g6Var = this.f25996U;
        if (g6Var != null) {
            g6Var.a((jv) null);
        }
        this.n0 = false;
    }

    public void Q() {
        IronLog.API.info("removing all impression data listeners");
        xk.b().d();
        lg lgVar = this.f25994Q;
        if (lgVar != null) {
            lgVar.c();
        }
        w wVar = this.f25995R;
        if (wVar != null) {
            wVar.c();
        }
    }

    public void S() {
        if (s0) {
            return;
        }
        s0 = true;
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", "false");
            mediationAdditionalData.put("errorCode", 1);
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        on.U().z().a(new zb(ac.FIRST_INSTANCE_RESULT, mediationAdditionalData));
    }

    public IronSourceBannerLayout b(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26006h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.f26006h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    public co c() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.m.j().c());
        if (listA.size() > 0) {
            return new co(listA, this.m.c().getNativeAdConfigurations(), IronSourceUtils.getUserIdForNetworks(), xk.b(), this.C);
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
        a(ac.TROUBLESHOOTING_NT_INIT_FAILED, mediationAdditionalData);
        return null;
    }

    @Override // com.p004ironsource.mediationsdk.sdk.IronSourceInterface
    public void clearRewardedVideoServerParameters() {
        this.r = null;
    }

    public Boolean d() {
        return this.f25993P;
    }

    public qt e() {
        return this.m;
    }

    @Override // com.p004ironsource.mediationsdk.sdk.IronSourceInterface
    public String getAdvertiserId(Context context) {
        String strP = this.f26002c.p(context);
        on.U().z().a(new zb(ac.GET_ADVERTISING_ID, IronSourceUtils.getMediationAdditionalData(false)));
        return !TextUtils.isEmpty(strP) ? strP : "";
    }

    @Override // com.p004ironsource.mediationsdk.sdk.IronSourceInterface
    public InterstitialPlacement getInterstitialPlacementInfo(String str) {
        InterstitialPlacement interstitialPlacementI;
        try {
            interstitialPlacementI = i(str);
            if (interstitialPlacementI == null) {
                try {
                    this.f26006h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    interstitialPlacementI = f();
                } catch (Exception e2) {
                    e = e2;
                    q9.d().a(e);
                    return interstitialPlacementI;
                }
            }
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + interstitialPlacementI, 1);
            return interstitialPlacementI;
        } catch (Exception e3) {
            e = e3;
            interstitialPlacementI = null;
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.IronSourceInterface
    public Placement getRewardedVideoPlacementInfo(String str) {
        Placement placementL;
        try {
            placementL = l(str);
            if (placementL == null) {
                try {
                    this.f26006h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    placementL = g();
                } catch (Exception e2) {
                    e = e2;
                    q9.d().a(e);
                    return placementL;
                }
            }
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + placementL, 1);
            return placementL;
        } catch (Exception e3) {
            e = e3;
            placementL = null;
        }
    }

    public eo j(String str) {
        eo eoVarA;
        tn tnVarE = this.m.c().getNativeAdConfigurations();
        if (tnVarE == null) {
            return null;
        }
        return (TextUtils.isEmpty(str) || (eoVarA = tnVarE.a(str)) == null) ? tnVarE.e() : eoVarA;
    }

    public List<IronSource.AD_UNIT> m() {
        ArrayList arrayList = new ArrayList();
        Set<IronSource.AD_UNIT> set = this.f26013z;
        if (set != null) {
            arrayList.addAll(set);
        }
        return arrayList;
    }

    public String n() {
        return this.s;
    }

    public Map<String, String> p() {
        return this.r;
    }

    public IronSourceSegment q() {
        return this.C;
    }

    @Override // com.p004ironsource.mediationsdk.sdk.IronSourceInterface
    public void removeInterstitialListener() {
        this.f26006h.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        ah.a().a((LevelPlayInterstitialListener) null);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.IronSourceInterface
    public void removeRewardedVideoListener() {
        this.f26006h.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        fr.a().a((LevelPlayRewardedVideoBaseListener) null);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.IronSourceInterface
    public void setAdaptersDebug(boolean z2) {
        com.p004ironsource.mediationsdk.c.b().a(z2);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.IronSourceInterface
    public boolean setDynamicUserId(String str) {
        try {
            t8 t8Var = new t8();
            a(str, t8Var);
            if (!t8Var.b()) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, t8Var.a().toString(), 2);
                return false;
            }
            this.q = str;
            on.U().z().a(new zb(ac.SET_USER_ID, IronSourceUtils.getJsonForUserId(true)));
            return true;
        } catch (Exception e2) {
            q9.d().a(e2);
            this.f26006h.logException(IronSourceLogger.IronSourceTag.API, androidx.media3.extractor.text.ttml.a.q(new StringBuilder(), this.f25999a, ":setDynamicUserId(dynamicUserId:", str, ")"), e2);
            return false;
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.IronSourceInterface
    public void setMediationType(String str) {
        try {
            String str2 = this.f25999a + ":setMediationType(mediationType:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.f26006h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (!a(str, 1, 64) || !q(str)) {
                this.f26006h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.s = str;
                this.l0.f(str);
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            this.f26006h.logException(IronSourceLogger.IronSourceTag.API, androidx.media3.extractor.text.ttml.a.q(new StringBuilder(), this.f25999a, ":setMediationType(mediationType:", str, ")"), e2);
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.IronSourceInterface
    public void setRewardedVideoServerParameters(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return;
                }
                this.f26006h.log(IronSourceLogger.IronSourceTag.API, this.f25999a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                this.r = new HashMap(map);
                zb zbVar = new zb(ac.SET_RV_SERVER_PARAMS, IronSourceUtils.getMediationAdditionalData(false));
                zbVar.a(IronSourceConstants.EVENTS_EXT1, map.toString());
                ds.i().a(zbVar);
            } catch (Exception e2) {
                q9.d().a(e2);
                this.f26006h.logException(IronSourceLogger.IronSourceTag.API, this.f25999a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e2);
            }
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.IronSourceInterface
    public void shouldTrackNetworkState(Context context, boolean z2) {
        this.x = context;
        this.y = Boolean.valueOf(z2);
        pj pjVar = this.S;
        if (pjVar != null) {
            pjVar.a(context, z2);
        }
        if (this.a0) {
            yr yrVar = this.T;
            if (yrVar != null) {
                yrVar.a(context, z2);
            }
        } else {
            lg lgVar = this.f25994Q;
            if (lgVar != null) {
                lgVar.shouldTrackNetworkState(context, z2);
            }
        }
        on.U().z().a(new zb(ac.SHOULD_TRACK_NETWORK_STATE, IronSourceUtils.getMediationAdditionalData(false)));
    }

    public boolean z() {
        return this.f25989F || this.G || this.H;
    }

    public /* synthetic */ p(a aVar) {
        this();
    }

    private k b(List<NetworkSettings> list) {
        bs bsVarF = this.m.c().getRewardedVideoConfigurations();
        ta.a aVar = new ta.a("Mediation");
        if (bsVarF.d()) {
            aVar.a("isOneFlow", 1);
        }
        return new k(list, bsVarF, com.p004ironsource.mediationsdk.c.b(), this.r0, k(), l(), new ta.b(ds.i(), aVar));
    }

    private void e(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }

    private Placement g() {
        bs bsVarF = this.m.c().getRewardedVideoConfigurations();
        if (bsVarF != null) {
            return bsVarF.a();
        }
        return null;
    }

    private ta h() {
        return new ta.b(ds.i(), new ta.a("IronSource"));
    }

    public static p j() {
        return d.f26018a;
    }

    private boolean q(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    @Override // com.ironsource.sa.a
    public ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26006h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.f26006h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public void c(Activity activity) {
        ah ahVarA;
        IronSourceError ironSourceError;
        IronSourceLoggerManager ironSourceLoggerManager = this.f26006h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (this.G) {
                this.f26006h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                ah.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
                return;
            }
            if (B()) {
                InterstitialPlacement interstitialPlacementF = f();
                if (interstitialPlacementF != null) {
                    c(activity, interstitialPlacementF.getPlacementName());
                    return;
                } else {
                    ahVarA = ah.a();
                    ironSourceError = new IronSourceError(1020, "showInterstitial error: empty default placement in response");
                }
            } else {
                ahVarA = ah.a();
                ironSourceError = ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial");
            }
            ahVarA.a(ironSourceError, (AdInfo) null);
        } catch (Exception e2) {
            q9.d().a(e2);
            this.f26006h.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e2);
            ah.a().a(new IronSourceError(510, e2.getMessage()), (AdInfo) null);
        }
    }

    public void d(Activity activity) {
        if (!J()) {
            fr.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            this.f26006h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement placementG = g();
        if (placementG != null) {
            f(activity, placementG.getPlacementName());
            return;
        }
        this.f26006h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
        fr.a().a(new IronSourceError(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
    }

    public void f(Activity activity, String str) {
        String strN = android.support.v4.media.a.n("showRewardedVideo(", str, ")");
        IronSourceLoggerManager ironSourceLoggerManager = this.f26006h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, strN, 1);
        try {
            if (this.f25989F) {
                this.f26006h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                fr.a().a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (J()) {
                e(activity, str);
            } else {
                fr.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            this.f26006h.logException(IronSourceLogger.IronSourceTag.API, strN, e2);
            fr.a().a(new IronSourceError(510, e2.getMessage()), (AdInfo) null);
        }
    }

    public String i() {
        return this.q;
    }

    public String k() {
        return this.f26009n;
    }

    public String l() {
        return this.o;
    }

    public boolean m(String str) {
        if (!w()) {
            return false;
        }
        h7 h7VarA = null;
        try {
            h7VarA = this.m.c().getBannerConfigurations().a(str);
            if (h7VarA == null && (h7VarA = this.m.c().getBannerConfigurations().i()) == null) {
                this.f26006h.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        if (h7VarA == null) {
            return false;
        }
        return a(h7VarA);
    }

    public boolean n(String str) {
        if (this.G) {
            return false;
        }
        boolean z2 = h(str) != qq.b.NOT_CAPPED;
        if (z2) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.G, true, 1);
            try {
                mediationAdditionalData.put("placement", str);
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            } catch (Exception e2) {
                q9.d().a(e2);
            }
            wj.i().a(new zb(ac.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    public boolean o(String str) {
        boolean z2;
        qq.b bVarK = k(str);
        if (bVarK != null) {
            int i2 = b.f26017c[bVarK.ordinal()];
            z2 = true;
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        a(z2, str);
        return z2;
    }

    public void p(String str) {
        IronLog.API.verbose("userId = " + str);
        this.o = str;
        on.U().z().a(new zb(ac.SET_USER_ID, IronSourceUtils.getJsonForUserId(false)));
        AdQualityBridge adQualityBridge = this.o0;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    public String r() {
        return this.f26012w;
    }

    public p(vf vfVar, vf.a aVar, jg jgVar, jf jfVar, fi.a aVar2) {
        this.f25999a = getClass().getName();
        this.f26000b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b8.10.0";
        this.f26008l = new Object();
        this.m = null;
        this.f26009n = null;
        this.o = "";
        this.f26010p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.f26011u = false;
        this.y = null;
        this.f25987B = true;
        this.D = "sessionDepth";
        this.f25993P = null;
        this.n0 = false;
        this.f26002c = vfVar;
        this.d = aVar;
        this.f26005e = jgVar;
        this.f = jfVar;
        this.g = aVar2;
        t();
        this.k = new AtomicBoolean();
        this.f26013z = new HashSet();
        this.f25986A = new HashSet();
        this.G = false;
        this.f25989F = false;
        this.H = false;
        this.t = new AtomicBoolean(true);
        this.X = new AtomicBoolean(false);
        this.f25988E = 0;
        this.f25990I = false;
        this.f25991J = false;
        this.K = false;
        this.L = false;
        this.f26012w = IronSourceUtils.getSessionId();
        this.M = Boolean.FALSE;
        this.f26001b0 = false;
        this.O = null;
        this.f25994Q = null;
        this.f25997V = null;
        this.W = null;
        this.f25995R = null;
        this.f25998Y = false;
        this.e0 = new ConcurrentHashMap<>();
        this.g0 = new ConcurrentHashMap<>();
        this.f0 = new ConcurrentHashMap<>();
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.f26004d0 = 1;
        this.k0 = new pc();
        hk hkVar = new hk();
        this.l0 = hkVar;
        this.m0 = new se(hkVar);
        this.p0 = new a();
        this.o0 = null;
        this.q0 = new ug.a();
        this.r0 = new ug.b();
    }

    private f a(List<NetworkSettings> list) {
        uj ujVarD = this.m.c().getInterstitialConfigurations();
        ta.a aVar = new ta.a("Mediation");
        if (ujVarD.j()) {
            aVar.a("isOneFlow", 1);
        }
        return new f(list, ujVarD, com.p004ironsource.mediationsdk.c.b(), this.q0, k(), l(), new ta.b(wj.i(), aVar));
    }

    private void d(Activity activity, String str) {
        try {
            InterstitialPlacement interstitialPlacementI = i(str);
            if (interstitialPlacementI == null) {
                interstitialPlacementI = f();
            }
            if (interstitialPlacementI == null) {
                this.f26006h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticInterstitial error: empty default placement in response", 3);
                ah.a().a(new IronSourceError(1020, "showProgrammaticInterstitial error: empty default placement in response"), (AdInfo) null);
                return;
            }
            if (activity != null) {
                e(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                this.f26006h.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showInterstitial when initializing SDK with context", 3);
                ah.a().a(new IronSourceError(510, "Activity must be provided in showInterstitial when initializing SDK with context"), (AdInfo) null);
                return;
            }
            this.S.a(activity, new Placement(interstitialPlacementI));
        } catch (Exception e2) {
            q9.d().a(e2);
            this.f26006h.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticInterstitial()", e2);
        }
    }

    private void e(Activity activity, String str) {
        Placement placementL;
        try {
            placementL = l(str);
            if (placementL == null) {
                try {
                    placementL = g();
                } catch (Exception e2) {
                    e = e2;
                    q9.d().a(e);
                    this.f26006h.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo()", e);
                }
            }
            if (placementL == null) {
                this.f26006h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticRewardedVideo error: empty default placement in response", 3);
                fr.a().a(new IronSourceError(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, "showProgrammaticRewardedVideo error: empty default placement in response"), (AdInfo) null);
                return;
            }
        } catch (Exception e3) {
            e = e3;
            placementL = null;
        }
        if (activity != null) {
            e(activity);
        } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showRewardedVideo when initializing SDK with context", 3);
            fr.a().a(ErrorBuilder.buildInitFailedError("Activity must be provided in showRewardedVideo when initializing SDK with context", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            return;
        }
        yr yrVar = this.T;
        if (yrVar != null && (this.f25998Y || this.a0)) {
            yrVar.a(activity, placementL);
            return;
        }
        lg lgVar = this.f25994Q;
        if (lgVar != null) {
            lgVar.a(activity, placementL);
            return;
        }
        this.f26006h.log(IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet", 3);
        fr.a().a(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"), (AdInfo) null);
    }

    public qt b(Context context, String str, c cVar) {
        synchronized (this.f26008l) {
            try {
                qt qtVar = this.m;
                if (qtVar != null) {
                    return new qt(qtVar);
                }
                qt qtVarA = a(context, str, cVar);
                if (qtVarA == null || !qtVarA.p()) {
                    IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                    IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                    logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                    qtVarA = a(context, k());
                    if (qtVarA != null) {
                        IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(k(), str);
                        this.f26006h.log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError.toString() + ": " + qtVarA.toString(), 1);
                        on.U().z().a(new zb(ac.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.getMediationAdditionalData(false)));
                    }
                }
                if (qtVarA != null) {
                    this.m = qtVarA;
                    IronSourceUtils.saveLastResponse(context, qtVarA.toString());
                    b(this.m, context);
                    wj.i().c(true);
                    ds.i().c(true);
                    kq.f25536P.c(true);
                    on.U().z().c(true);
                }
                return qtVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Activity activity, String str) {
        String strN = android.support.v4.media.a.n("showInterstitial(", str, ")");
        IronSourceLoggerManager ironSourceLoggerManager = this.f26006h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, strN, 1);
        try {
            if (this.G) {
                this.f26006h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                ah.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (B()) {
                d(activity, str);
            } else {
                ah.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            this.f26006h.logException(IronSourceLogger.IronSourceTag.API, strN, e2);
            ah.a().a(new IronSourceError(510, e2.getMessage()), (AdInfo) null);
        }
    }

    public synchronized IronSourceError a(Context context, String str, boolean z2, InitializationListener initializationListener, gp gpVar, IronSource.AD_UNIT... ad_unitArr) {
        Throwable th;
        try {
            try {
                IronLog.INTERNAL.verbose("GitHash: 7a75ab7");
                try {
                    if (!mk.a((Object) context, "Init Failed - provided context is null")) {
                        d("Provided context is null");
                        return new IronSourceError(2000, "Provided context is null");
                    }
                    this.g.a(context);
                    boolean z3 = context instanceof Activity;
                    if (z3) {
                        e((Activity) context);
                    }
                    if (initializationListener != null) {
                        this.f25997V = initializationListener;
                    }
                    AtomicBoolean atomicBoolean = this.t;
                    if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                        if (ad_unitArr != null) {
                            a(z3, z2, gpVar != null, ad_unitArr);
                            if (A() && !z2) {
                                R();
                            }
                        } else {
                            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
                        }
                        dt dtVarB = et.f24941a.b();
                        if (A()) {
                            a(this.m);
                            return new IronSourceError(IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
                        }
                        if (dtVarB == dt.INIT_FAILED) {
                            return new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
                        }
                        if (dtVarB == dt.NOT_INIT) {
                            return new IronSourceError(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, "Already called new init");
                        }
                        if (gpVar != null) {
                            a(gpVar);
                        }
                        return new IronSourceError(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
                    }
                    et.f24941a.a(gpVar == null);
                    if ((ad_unitArr == null || ad_unitArr.length == 0) && gpVar == null) {
                        for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                            this.f26013z.add(ad_unit);
                        }
                        this.f25990I = true;
                        this.f25991J = true;
                        this.K = true;
                        this.L = true;
                    } else {
                        for (IronSource.AD_UNIT ad_unit2 : ad_unitArr) {
                            this.f26013z.add(ad_unit2);
                            this.f25986A.add(ad_unit2);
                            if (ad_unit2.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                                this.f25991J = true;
                            }
                            if (ad_unit2.equals(IronSource.AD_UNIT.BANNER)) {
                                this.K = true;
                            }
                            if (ad_unit2.equals(IronSource.AD_UNIT.NATIVE_AD)) {
                                this.L = true;
                            }
                            if (ad_unit2.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                                this.f25990I = true;
                            }
                        }
                    }
                    IronLog.API.info("init(appKey:" + str + ")");
                    t8 t8VarR = r(str);
                    if (t8VarR.b()) {
                        this.f26009n = str;
                    }
                    qt qtVarA = a(context, this.f26009n);
                    if (qtVarA != null) {
                        IronLog.INTERNAL.verbose("init cache exists");
                        a(qtVarA.c().getApplicationConfigurations().f());
                    } else {
                        IronLog.INTERNAL.verbose("init cache does not exist");
                    }
                    ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
                    this.d.a(context.getApplicationContext(), TimeUnit.HOURS.toMillis(xa.f27681a.d()));
                    this.l0.g(LevelPlay.getSdkVersion());
                    this.l0.a(ng.a());
                    this.l0.b(IronSourceUtils.isGooglePlayInstalled(context));
                    this.l0.a(i1.a());
                    T();
                    c(context);
                    if (this.f26009n == null) {
                        s.c().f();
                        if (this.f26013z.contains(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                            fr.a().a(false, (AdInfo) null);
                        }
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, t8VarR.a().toString(), 1);
                        return new IronSourceError(2010, "App key is null");
                    }
                    this.l0.a(context);
                    this.l0.c(this.f26009n);
                    this.l0.h(this.f26012w);
                    if (this.f25987B) {
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z2);
                        if (ad_unitArr != null) {
                            for (IronSource.AD_UNIT ad_unit3 : ad_unitArr) {
                                try {
                                    mediationAdditionalData.put(ad_unit3.toString(), true);
                                } catch (Exception e2) {
                                    q9.d().a(e2);
                                }
                            }
                        }
                        int i2 = this.f25988E + 1;
                        this.f25988E = i2;
                        try {
                            a(z3, z2, i2, mediationAdditionalData, gpVar != null);
                            this.f25987B = false;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            throw th;
                        }
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    public String b() {
        String str;
        if (this.L) {
            s sVarC = s.c();
            int i2 = b.f26016b[sVarC.a().ordinal()];
            if (i2 == 1) {
                str = "init() had failed";
            } else if (i2 != 2) {
                str = "";
            } else if (sVarC.d()) {
                str = "init() had failed";
            } else {
                str = "init() not finished yet";
            }
        } else {
            str = "init() must be called first";
        }
        return (G() || !str.isEmpty()) ? str : "No Native Ad configurations found";
    }

    @Override // com.p004ironsource.op
    public void d(String str) {
        try {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.f26007i != null) {
                Iterator<IronSource.AD_UNIT> it = this.f26013z.iterator();
                while (it.hasNext()) {
                    a(it.next(), true);
                }
            }
            gp gpVarO = o();
            if (gpVarO != null) {
                gpVarO.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.sa.b
    public synchronized boolean e(String str) {
        f fVar;
        fVar = this.h0;
        return fVar != null && fVar.b(str);
    }

    private IronSourceError a(s.d dVar) {
        if (!this.K) {
            return new IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.H) {
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == s.d.INIT_FAILED) {
            return new IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == s.d.INIT_IN_PROGRESS && s.c().d()) {
            return new IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    private boolean d(qt qtVar) {
        com.p004ironsource.mediationsdk.adquality.a aVarA = qtVar.c().getAdQualityConfigurations();
        return this.o0 == null && aVarA != null && aVarA.b() && AdQualityBridge.adQualityAvailable();
    }

    public void b(Activity activity) {
        IronLog ironLog = IronLog.API;
        ironLog.info("onResume()");
        try {
            if (FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                ironLog.info("onResume() is disabled");
            } else {
                ContextProvider.getInstance().onResume(activity);
            }
        } catch (Throwable th) {
            this.f26006h.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
            q9.d().a(th);
        }
    }

    public qq.b a(InterstitialPlacement interstitialPlacement) {
        return this.f26005e.a(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement, IronSource.AD_UNIT.INTERSTITIAL);
    }

    @Override // com.ironsource.sa.c
    public synchronized void b(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.REWARDED_VIDEO).b(), this.r0.a(str));
    }

    public qq.b a(Placement placement) {
        return this.f26005e.a(ContextProvider.getInstance().getApplicationContext(), placement, IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    @Override // com.ironsource.sa.b
    public synchronized void b(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.INTERSTITIAL).a(true).a(str2).b(), this.q0.a(str));
    }

    public qt a(Context context, String str) {
        if (!aj.a(context)) {
            return null;
        }
        f8 f8VarC = aj.c(context);
        String strD = f8VarC.d();
        String strF = f8VarC.f();
        String strE = f8VarC.e();
        if (!strD.equals(str)) {
            return null;
        }
        qt qtVar = new qt(context, strD, strF, strE);
        qtVar.a(qt.a.CACHE);
        return qtVar;
    }

    public void b(Context context) {
        ev evVar = ev.f24944a;
        evVar.b();
        if (!A()) {
            evVar.a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        if (!c(this.m)) {
            evVar.a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error("TestSuite cannot be launched, Please contact your account manager to enable it");
            return;
        }
        if (!IronSourceUtils.isNetworkConnected(context)) {
            evVar.a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
            return;
        }
        pj pjVar = this.S;
        if (pjVar != null) {
            pjVar.J();
        }
        yr yrVar = this.T;
        if (yrVar != null) {
            yrVar.J();
        }
        g6 g6Var = this.f25996U;
        if (g6Var != null) {
            g6Var.J();
            this.f25996U.T();
        }
        new fv().a(context, k(), this.m.i(), LevelPlay.getSdkVersion(), this.m.c().getTestSuiteSettings().b(), d(), this.f25998Y);
        this.n0 = true;
        evVar.c();
    }

    private qt a(Context context, String str, c cVar) {
        Exception exc;
        qt qtVar = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String advertiserId = getAdvertiserId(context);
            if (TextUtils.isEmpty(advertiserId)) {
                advertiserId = this.f26002c.M(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = advertiserId;
            IronSourceSegment ironSourceSegment = this.C;
            String strSendPostRequest = HttpFunctions.sendPostRequest(ServerURL.buildInitURL(context, k(), str, str2, n(), this.f25998Y, ironSourceSegment != null ? ironSourceSegment.getSegmentData() : null, z()), yi.a().toString(), cVar);
            if (strSendPostRequest == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.isEncryptedResponse()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(strSendPostRequest);
                String strOptString = jSONObject.optString(qt.f26623n, null);
                if (TextUtils.isEmpty(strOptString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                strSendPostRequest = a(strOptString, Boolean.valueOf(jSONObject.optBoolean("compression", false)));
                if (TextUtils.isEmpty(strSendPostRequest)) {
                    ironLog.warning("encoded response invalid - return null");
                    S();
                    return null;
                }
            }
            qt qtVar2 = new qt(context, k(), str, strSendPostRequest);
            try {
                qtVar2.a(qt.a.SERVER);
                if (qtVar2.p()) {
                    return qtVar2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e2) {
                exc = e2;
                qtVar = qtVar2;
                q9.d().a(exc);
                IronLog.INTERNAL.warning("exception = " + exc);
                return qtVar;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    private void b(ac acVar, JSONObject jSONObject) {
        ds.i().a(new zb(acVar, jSONObject));
    }

    @Override // com.ironsource.sa.c
    public synchronized boolean f(String str) {
        k kVar;
        kVar = this.i0;
        return kVar != null && kVar.a(str);
    }

    private void b(IronSource.AD_UNIT ad_unit) {
        int i2 = b.f26015a[ad_unit.ordinal()];
        if (i2 == 1) {
            d0();
        } else if (i2 == 2) {
            Z();
        } else {
            if (i2 != 3) {
                return;
            }
            U();
        }
    }

    private void c(Context context) {
        AtomicBoolean atomicBoolean = this.k;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        wu.a().a(new le(context));
        on.U().z().a(context, this.C);
        wj.i().a(context, this.C);
        ds.i().a(context, this.C);
        kq.f25536P.a(context, this.C);
    }

    @Override // com.p004ironsource.sa
    public String a(Context context) {
        String strCompressAndEncrypt;
        jw jwVarK;
        ta taVarH = h();
        dt dtVar = null;
        try {
            dt dtVarA = et.f24941a.a();
            try {
                taVarH.a(ac.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, dtVarA);
                if (context == null) {
                    IronLog.API.error("bidding data cannot be retrieved, context required");
                    taVarH.a(ac.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (dt) null);
                    return null;
                }
                if (dtVarA == dt.NOT_INIT) {
                    IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
                    taVarH.a(ac.TROUBLESHOOTING_DO_GET_BIDDING_DATA_NO_INIT_RETURNED_NULL, (dt) null);
                    return null;
                }
                s.c().g();
                qt qtVar = this.m;
                boolean zE = (qtVar == null || (jwVarK = qtVar.c().getApplicationConfigurations().k()) == null) ? true : jwVarK.e();
                this.l0.b(context);
                JSONObject jSONObjectA = new iw().a(context);
                com.p004ironsource.mediationsdk.d.b().a(jSONObjectA, true);
                strCompressAndEncrypt = zE ? IronSourceAES.compressAndEncrypt(jSONObjectA.toString()) : IronSourceAES.encrypt(jSONObjectA.toString());
                if (TextUtils.isEmpty(strCompressAndEncrypt)) {
                    taVarH.a(ac.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, dtVarA);
                }
                taVarH.a(ac.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, dtVarA);
                return strCompressAndEncrypt;
            } catch (Exception unused) {
                dtVar = dtVarA;
                taVarH.a(ac.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, dtVar);
                dtVarA = dtVar;
                strCompressAndEncrypt = null;
            }
        } catch (Exception unused2) {
        }
    }

    public String a(String str, qq.b bVar) {
        if (bVar == null) {
            return null;
        }
        int i2 = b.f26017c[bVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return android.support.v4.media.a.n("placement ", str, " is capped");
        }
        return null;
    }

    public void b(IronSourceBannerLayout ironSourceBannerLayout) {
        a(ironSourceBannerLayout, "");
    }

    @Override // com.ironsource.sa.a
    public void c(String str) {
        this.f26006h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.p004ironsource.mediationsdk.demandOnly.c cVar = this.j0;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (Throwable th) {
            q9.d().a(th);
            this.f26006h.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    private void c(boolean z2) {
        hk hkVar;
        us usVar;
        if (z2) {
            hkVar = this.l0;
            usVar = us.EXTERNAL_MEDIATION_INIT;
        } else {
            hkVar = this.l0;
            usVar = us.LEVEL_PLAY_INIT;
        }
        hkVar.a(usVar);
    }

    @Override // com.p004ironsource.ri
    public void b(ImpressionDataListener impressionDataListener) {
        if (mk.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            xk.b().a(impressionDataListener);
            lg lgVar = this.f25994Q;
            if (lgVar != null) {
                lgVar.b(impressionDataListener);
            }
            w wVar = this.f25995R;
            if (wVar != null) {
                wVar.b(impressionDataListener);
            }
            IronLog.API.info("add impression data listener to ".concat(impressionDataListener.getClass().getSimpleName()));
        }
    }

    private void b(qt qtVar) {
        this.j.setDebugLevel(qtVar.c().getApplicationConfigurations().h().b());
        this.f26006h.setLoggerDebugLevel("console", qtVar.c().getApplicationConfigurations().h().a());
    }

    private boolean c(qt qtVar) {
        return qtVar != null && qtVar.o();
    }

    public void b(qt qtVar, Context context) {
        b(qtVar);
        a(qtVar, context);
    }

    @Override // com.ironsource.sa.b
    public void b(String str) {
        IronSourceError ironSourceError;
        this.f26006h.log(IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = this.q0.a(str);
        try {
            if (this.G) {
                f fVar = this.h0;
                if (fVar != null) {
                    fVar.a(str);
                    return;
                } else {
                    IronLog.API.error("Interstitial was not initiated");
                    ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was not initiated");
                }
            } else {
                IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was initialized in mediation mode. Use showInterstitial instead");
            }
            iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, ironSourceError);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.API.error(e2.getMessage());
            if (iSDemandOnlyInterstitialListenerA != null) {
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    public void b(String str, JSONObject jSONObject) {
        com.p004ironsource.mediationsdk.c.b().b(new v(str, jSONObject));
    }

    private String a(String str, Boolean bool) {
        return bool.booleanValue() ? IronSourceAES.decryptAndDecompress(mb.b().c(), str) : IronSourceAES.decode(mb.b().c(), str);
    }

    private synchronized void b(boolean z2) {
        this.f26011u = z2;
    }

    private boolean b(h.b bVar) {
        synchronized (this.f0) {
            try {
                if (this.j0 != null) {
                    return false;
                }
                this.f0.put(bVar.getInstanceId(), bVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public HashSet<String> a(String str, String str2) {
        qt qtVar = this.m;
        return qtVar == null ? new HashSet<>() : qtVar.k().a(str, str2);
    }

    private boolean b(List<IronSource.AD_UNIT> list, boolean z2, u8 u8Var) {
        IronLog.INTERNAL.verbose();
        try {
            this.j.a(u8Var.getApplicationConfigurations().h().d());
            this.v = list;
            b(true);
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z2) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e2) {
                    q9.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
                on.U().z().a(new zb(ac.FIRST_INSTANCE_RESULT, mediationAdditionalData));
            }
            int cmpId = u8Var.getApplicationConfigurations().f().getCmpId();
            if (cmpId >= 0) {
                b9 b9Var = new b9();
                b9Var.a(cmpId);
                b9Var.a(cmpId, this.m.k().d());
            }
            wj.i().h();
            ds.i().h();
            on.U().z().h();
            com.p004ironsource.mediationsdk.c.b().b(k(), l());
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.f26013z.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        b(ad_unit);
                    } else {
                        a(ad_unit, false);
                    }
                }
            }
            R();
            gp gpVarO = o();
            if (gpVarO != null) {
                gpVarO.a(this.m);
            }
            return true;
        } catch (Exception e3) {
            q9.d().a(e3);
            IronLog.INTERNAL.error(e3.toString());
            gp gpVarO2 = o();
            if (gpVarO2 != null) {
                gpVarO2.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004a A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0054 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x005c A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0064 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0073 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x007f A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x008a A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x008e A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0092 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x009a A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x009d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0046, please report this as an issue */
    public synchronized List<IronSource.AD_UNIT> a(Context context, String str, boolean z2, IronSource.AD_UNIT... ad_unitArr) {
        ArrayList arrayList;
        int i2;
        try {
            arrayList = new ArrayList();
            if (ad_unitArr != null && ad_unitArr.length != 0) {
                for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
                    if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                        if (this.f25991J) {
                            a(ad_unit);
                        } else {
                            this.G = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                    if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                        if (this.f25990I) {
                            a(ad_unit);
                        } else {
                            this.f25989F = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                    if (!ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                        if (this.K) {
                            a(ad_unit);
                        } else {
                            this.H = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                }
            } else if (z2) {
                if (this.f25990I) {
                    a(IronSource.AD_UNIT.REWARDED_VIDEO);
                } else {
                    this.f25989F = true;
                    arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
                }
                if (this.f25991J) {
                    a(IronSource.AD_UNIT.INTERSTITIAL);
                } else {
                    this.G = true;
                    arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
                }
                if (this.K) {
                    a(IronSource.AD_UNIT.BANNER);
                } else {
                    this.H = true;
                    arrayList.add(IronSource.AD_UNIT.BANNER);
                }
            } else {
                while (i2 < r7) {
                    if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                        if (this.f25991J) {
                            a(ad_unit);
                        } else {
                            this.G = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                    if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                        if (this.f25990I) {
                            a(ad_unit);
                        } else {
                            this.f25989F = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                    if (!ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                        if (this.K) {
                            a(ad_unit);
                        } else {
                            this.H = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                }
            }
            if (context != null) {
                if (context instanceof Activity) {
                    e((Activity) context);
                }
                ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private List<NetworkSettings> a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str = arrayList.get(i2);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.m.k().b(str));
            }
        }
        return arrayList2;
    }

    @Override // com.p004ironsource.op
    public void a() {
        if (this.M.booleanValue()) {
            this.M = Boolean.FALSE;
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION, "init() had failed"));
            this.f25992N = null;
            this.O = null;
        }
        if (this.f26001b0) {
            this.f26001b0 = false;
            n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.Z) {
            this.Z = false;
            n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.e0) {
            try {
                Iterator<h.d> it = this.e0.values().iterator();
                while (it.hasNext()) {
                    String instanceId = it.next().getInstanceId();
                    this.q0.a(instanceId).onInterstitialAdLoadFailed(instanceId, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                }
                this.e0.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.g0) {
            try {
                Iterator<h.d> it2 = this.g0.values().iterator();
                while (it2.hasNext()) {
                    String instanceId2 = it2.next().getInstanceId();
                    this.r0.a(instanceId2).onRewardedVideoAdLoadFailed(instanceId2, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.g0.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f0) {
            try {
                for (h.b bVar : this.f0.values()) {
                    ISDemandOnlyBannerLayout banner = bVar.getBanner();
                    if (banner != null) {
                        banner.getListener().a(bVar.getInstanceId(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                    }
                }
                this.f0.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void a(long j, qt.a aVar) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z());
        try {
            mediationAdditionalData.put("duration", j);
            mediationAdditionalData.put("sessionDepth", this.f25988E);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, aVar.a());
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        on.U().z().a(new zb(ac.INIT_COMPLETE, mediationAdditionalData));
    }

    public void a(Activity activity) {
        try {
            if (FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                return;
            }
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            q9.d().a(th);
            this.f26006h.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    @Override // com.ironsource.sa.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        h.b bVarA = new h.c().b(str).a(activity).a(iSDemandOnlyBannerLayout).a(IronSource.AD_UNIT.BANNER).a();
        IronSourceError ironSourceErrorA = bVarA.a();
        if (ironSourceErrorA != null) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA);
            }
            return;
        }
        IronSourceError ironSourceErrorA2 = a(s.c().a());
        if (ironSourceErrorA2 != null) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA2.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA2);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(bVarA)) {
            return;
        }
        if (!x()) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(bVarA)) {
                return;
            }
            this.j0.a(iSDemandOnlyBannerLayout, str);
        }
    }

    @Override // com.ironsource.sa.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        h.b bVarA = new h.c().b(str).a(activity).a(true).a(str2).a(iSDemandOnlyBannerLayout).a(IronSource.AD_UNIT.BANNER).a();
        IronSourceError ironSourceErrorA = bVarA.a();
        if (ironSourceErrorA != null) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA);
            }
            return;
        }
        IronSourceError ironSourceErrorA2 = a(s.c().a());
        if (ironSourceErrorA2 != null) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA2.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA2);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(bVarA)) {
            return;
        }
        if (!x()) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(bVarA)) {
                return;
            }
            this.j0.a(iSDemandOnlyBannerLayout, str, str2);
        }
    }

    @Override // com.ironsource.sa.b
    public synchronized void a(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.INTERSTITIAL).b(), this.q0.a(str));
    }

    @Override // com.ironsource.sa.c
    public synchronized void a(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(str2).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(true).a(IronSource.AD_UNIT.REWARDED_VIDEO).b(), this.r0.a(str));
    }

    public synchronized void a(Context context, String str, boolean z2, InitializationListener initializationListener, IronSource.AD_UNIT... ad_unitArr) {
        try {
            try {
                c(z2);
                if (a(context, str, z2, initializationListener, null, ad_unitArr) == null) {
                    s.c().a(this);
                    s.c().a(this.k0);
                    s.c().a(context, str, this.o, ad_unitArr);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.p004ironsource.sa
    public synchronized void a(Context context, String str, IronSource.AD_UNIT... ad_unitArr) {
        try {
            try {
                List<IronSource.AD_UNIT> listA = a(context, str, true, ad_unitArr);
                if (!listA.isEmpty()) {
                    a(context, str, true, (InitializationListener) null, (IronSource.AD_UNIT[]) listA.toArray(new IronSource.AD_UNIT[listA.size()]));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private void a(ac acVar, JSONObject jSONObject) {
        wj.i().a(new zb(acVar, jSONObject));
    }

    private synchronized void a(gp gpVar) {
        this.W = gpVar;
    }

    private void a(j4 j4Var) {
        xa xaVar = xa.f27681a;
        xaVar.c(j4Var.getShouldUseAppSet());
        xaVar.a(j4Var.getShouldReuseAdvId());
        xaVar.a(j4Var.getUserAgentExpirationThresholdInHours());
        this.f.a(j4Var);
    }

    private void a(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f26006h.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    public void a(IronSource.AD_UNIT ad_unit, jv jvVar) {
        g6 g6Var;
        yr yrVar;
        pj pjVar;
        if (this.n0) {
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL && (pjVar = this.S) != null) {
                pjVar.a(jvVar);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO && (yrVar = this.T) != null) {
                yrVar.a(jvVar);
            }
            if (ad_unit != IronSource.AD_UNIT.BANNER || (g6Var = this.f25996U) == null) {
                return;
            }
            g6Var.a(jvVar);
        }
    }

    public void a(IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) {
        if (ad_unit == null) {
            IronLog.API.error("AdUnit should not be null.");
            return;
        }
        IronLog.API.info(androidx.datastore.preferences.protobuf.a.n("(", ad_unit.name(), ", ", waterfallConfiguration == null ? "NULL" : waterfallConfiguration.toString(), ")"));
        zb zbVar = new zb(ac.SET_WATERFALL_CONFIGURATION, IronSourceUtils.getMediationAdditionalData(false));
        zbVar.a(IronSourceConstants.EVENTS_EXT1, waterfallConfiguration == null ? "" : waterfallConfiguration.toJsonString());
        on.U().z().a(zbVar, ad_unit);
        this.l0.a(ad_unit, waterfallConfiguration);
    }

    private void a(IronSource.AD_UNIT ad_unit, boolean z2) {
        int i2 = b.f26015a[ad_unit.ordinal()];
        if (i2 == 1) {
            if (this.f25989F) {
                Iterator<h.d> it = this.g0.values().iterator();
                while (it.hasNext()) {
                    String instanceId = it.next().getInstanceId();
                    this.r0.a(instanceId).onRewardedVideoAdLoadFailed(instanceId, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.g0.clear();
                return;
            }
            if (this.f25998Y) {
                if (this.Z) {
                    this.Z = false;
                    n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                return;
            }
            if (z2 || J() || this.f25986A.contains(ad_unit)) {
                fr.a().a(false, (AdInfo) null);
                return;
            }
            return;
        }
        if (i2 == 2) {
            if (!this.G) {
                if (this.f26001b0) {
                    this.f26001b0 = false;
                    n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
                return;
            }
            Iterator<h.d> it2 = this.e0.values().iterator();
            while (it2.hasNext()) {
                String instanceId2 = it2.next().getInstanceId();
                this.q0.a(instanceId2).onInterstitialAdLoadFailed(instanceId2, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
            }
            this.e0.clear();
            return;
        }
        if (i2 != 3) {
            return;
        }
        if (!this.H) {
            if (this.M.booleanValue()) {
                this.M = Boolean.FALSE;
                n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD, "init() had failed"));
                this.f25992N = null;
                this.O = null;
                return;
            }
            return;
        }
        for (h.b bVar : this.f0.values()) {
            ISDemandOnlyBannerLayout banner = bVar.getBanner();
            if (banner != null) {
                banner.getListener().a(bVar.getInstanceId(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
            }
        }
        this.f0.clear();
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        g6 g6Var;
        this.f26006h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (this.f26003c0 && (g6Var = this.f25996U) != null) {
                g6Var.a(ironSourceBannerLayout);
                return;
            }
            w wVar = this.f25995R;
            if (wVar != null) {
                wVar.a(ironSourceBannerLayout);
            }
        } catch (Throwable th) {
            q9.d().a(th);
            this.f26006h.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        IronLog.INTERNAL.verbose("placementName = " + str);
        if (this.H) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildInitFailedError("Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", "Banner"));
            return;
        }
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            String strConcat = "loadBanner can't be called - ".concat(ironSourceBannerLayout == null ? "banner layout is null " : "banner layout is destroyed");
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, strConcat, 3);
            n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError(strConcat));
            return;
        }
        if (!this.K) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"));
            return;
        }
        if (ironSourceBannerLayout.getSize().getDescription().equals(l.f) && (ironSourceBannerLayout.getSize().getWidth() <= 0 || ironSourceBannerLayout.getSize().getHeight() <= 0)) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.unsupportedBannerSize(""));
            return;
        }
        s.d dVarA = s.c().a();
        if (dVarA == s.d.INIT_FAILED) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(600, "Init() had failed"));
            return;
        }
        if (dVarA == s.d.INIT_IN_PROGRESS) {
            if (s.c().d()) {
                this.f26006h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, "Init() had failed"));
                return;
            } else {
                this.f25992N = ironSourceBannerLayout;
                this.M = Boolean.TRUE;
                this.O = str;
                return;
            }
        }
        if (!x()) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "the server response does not contain banner data"));
            return;
        }
        w wVar = this.f25995R;
        if (wVar == null && this.f25996U == null) {
            this.f25992N = ironSourceBannerLayout;
            this.M = Boolean.TRUE;
            this.O = str;
        } else if (this.f26003c0) {
            this.f25996U.a(ironSourceBannerLayout, new Placement(g(str)));
        } else {
            wVar.a(ironSourceBannerLayout, g(str));
        }
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.C = ironSourceSegment;
        yr yrVar = this.T;
        if (yrVar != null) {
            yrVar.a(ironSourceSegment);
        }
        lg lgVar = this.f25994Q;
        if (lgVar != null) {
            lgVar.a(ironSourceSegment);
        }
        pj pjVar = this.S;
        if (pjVar != null) {
            pjVar.a(ironSourceSegment);
        }
        w wVar = this.f25995R;
        if (wVar != null) {
            wVar.a(ironSourceSegment);
        }
        g6 g6Var = this.f25996U;
        if (g6Var != null) {
            g6Var.a(ironSourceSegment);
        }
        AdQualityBridge adQualityBridge = this.o0;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(ironSourceSegment);
        }
        wj.i().a(this.C);
        ds.i().a(this.C);
        kq.f25536P.a(this.C);
        on.U().z().a(this.C);
    }

    @Override // com.ironsource.sa.b
    public void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.q0.a(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.sa.c
    public void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.r0.a(iSDemandOnlyRewardedVideoListener);
    }

    private synchronized void a(h.d dVar, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        String instanceId = dVar.getInstanceId();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + instanceId);
        try {
            if (!this.f25991J) {
                ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(instanceId, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
                return;
            }
            if (!this.G) {
                ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(instanceId, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
                return;
            }
            s.d dVarA = s.c().a();
            if (dVarA == s.d.INIT_FAILED) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(instanceId, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            IronSourceError ironSourceErrorA = dVar.a();
            if (ironSourceErrorA != null) {
                if (ironSourceErrorA.getErrorCode() == 1060) {
                    b(ac.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.getAdMarkup()), 1));
                }
                ironLog.error(ironSourceErrorA.toString());
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(instanceId, ironSourceErrorA);
                return;
            }
            e(dVar.getActivity());
            if (dVarA == s.d.INIT_IN_PROGRESS) {
                if (s.c().d()) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(instanceId, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else {
                    synchronized (this.e0) {
                        this.e0.put(dVar.getInstanceId(), dVar);
                    }
                    if (!TextUtils.isEmpty(dVar.getInstanceId())) {
                        a(ac.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.getAdMarkup()), 1));
                    }
                }
                return;
            }
            if (!C()) {
                ironLog.error("No interstitial configurations found");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(instanceId, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            synchronized (this.e0) {
                try {
                    f fVar = this.h0;
                    if (fVar == null) {
                        this.e0.put(dVar.getInstanceId(), dVar);
                        if (!TextUtils.isEmpty(dVar.getAdMarkup())) {
                            a(ac.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.getAdMarkup()), 1));
                        }
                        return;
                    }
                    fVar.a(dVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw th;
        } catch (Throwable th2) {
            q9.d().a(th2);
            IronLog.API.error(th2.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(instanceId, new IronSourceError(510, th2.getMessage()));
        }
    }

    public void a(h.d dVar, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        String instanceId = dVar.getInstanceId();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + instanceId);
        try {
            if (!this.f25990I) {
                ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(instanceId, new IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
                return;
            }
            if (!this.f25989F) {
                ironLog.error("Rewarded video was initialized in mediation mode");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(instanceId, new IronSourceError(510, "Rewarded video was initialized in mediation mode"));
                return;
            }
            s.d dVarA = s.c().a();
            if (dVarA == s.d.INIT_FAILED) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(instanceId, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            IronSourceError ironSourceErrorA = dVar.a();
            if (ironSourceErrorA != null) {
                if (ironSourceErrorA.getErrorCode() == 1060) {
                    b(ac.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.getAdMarkup()), 1));
                }
                ironLog.error(ironSourceErrorA.toString());
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(instanceId, ironSourceErrorA);
                return;
            }
            e(dVar.getActivity());
            if (dVarA == s.d.INIT_IN_PROGRESS) {
                if (s.c().d()) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(instanceId, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                synchronized (this.g0) {
                    this.g0.put(instanceId, dVar);
                }
                if (TextUtils.isEmpty(dVar.getAdMarkup())) {
                    return;
                }
                b(ac.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.getAdMarkup()), 1));
                return;
            }
            if (!K()) {
                ironLog.error("No rewarded video configurations found");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(instanceId, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.g0) {
                try {
                    k kVar = this.i0;
                    if (kVar != null) {
                        kVar.a(dVar);
                        return;
                    }
                    this.g0.put(instanceId, dVar);
                    if (!TextUtils.isEmpty(dVar.getAdMarkup())) {
                        b(ac.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.getAdMarkup()), 1));
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            q9.d().a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(instanceId, new IronSourceError(510, th.getMessage()));
        } catch (Throwable th2) {
            q9.d().a(th2);
            IronLog.API.error(th2.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(instanceId, new IronSourceError(510, th2.getMessage()));
        }
    }

    @Override // com.p004ironsource.ri
    public void a(ImpressionDataListener impressionDataListener) {
        if (mk.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            xk.b().b(impressionDataListener);
            lg lgVar = this.f25994Q;
            if (lgVar != null) {
                lgVar.a(impressionDataListener);
            }
            w wVar = this.f25995R;
            if (wVar != null) {
                wVar.a(impressionDataListener);
            }
        }
    }

    @Override // com.p004ironsource.kn
    public void a(LogListener logListener) {
        if (logListener == null) {
            this.f26006h.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        this.j.a(logListener);
        this.f26006h.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
        on.U().z().a(new zb(ac.SET_LOG_LISTENER, IronSourceUtils.getMediationAdditionalData(false)));
    }

    public void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        IronLog.API.info();
        ah.a().a(levelPlayInterstitialListener);
    }

    public void a(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        IronLog.API.info();
        fr.a().a(levelPlayRewardedVideoListener);
    }

    public synchronized void a(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        String str;
        try {
            IronLog ironLog = IronLog.API;
            ironLog.info();
            if (!this.f25990I) {
                if (levelPlayRewardedVideoManualListener == null) {
                    this.f25998Y = false;
                    str = "Disabling rewarded video manual mode";
                } else {
                    this.f25998Y = true;
                    str = "Enabling rewarded video manual mode";
                }
                ironLog.info(str);
            }
            fr.a().a(levelPlayRewardedVideoManualListener);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(SegmentListener segmentListener) {
        an anVar = this.f26007i;
        if (anVar != null) {
            anVar.a(segmentListener);
            s.c().a(this.f26007i);
        }
    }

    private void a(qt qtVar) {
        if (u() && d(qtVar)) {
            AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), k(), l(), new g1(), qtVar.c().getApplicationConfigurations().h().a());
            this.o0 = adQualityBridge;
            IronSourceSegment ironSourceSegment = this.C;
            if (ironSourceSegment != null) {
                adQualityBridge.setSegment(ironSourceSegment);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0111  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    private void a(qt qtVar, Context context) {
        g4 g4VarG;
        kq kqVar;
        boolean zL = v() ? qtVar.c().getApplicationConfigurations().b().l() : false;
        boolean zL2 = J() ? qtVar.c().getRewardedVideoConfigurations().m().l() : false;
        boolean zL3 = B() ? qtVar.c().getInterstitialConfigurations().i().l() : false;
        boolean zL4 = w() ? qtVar.c().getBannerConfigurations().g().l() : false;
        boolean zL5 = F() ? qtVar.c().getNativeAdConfigurations().getEventsConfigurations().l() : false;
        lq lqVarI = qtVar.c().getApplicationConfigurations().i();
        boolean zI = lqVarI.i();
        if (zL) {
            a((u7) on.U().z(), qtVar.c().getApplicationConfigurations().b(), context, qtVar, true);
        }
        if (zL2) {
            a((u7) ds.i(), qtVar.c().getRewardedVideoConfigurations().m(), context, qtVar, true);
        } else {
            ds.i().b(false);
        }
        if (zL3) {
            g4VarG = qtVar.c().getInterstitialConfigurations().i();
        } else {
            if (!zL4) {
                if (zL5) {
                    g4VarG = qtVar.c().getNativeAdConfigurations().getEventsConfigurations();
                } else {
                    wj.i().b(false);
                }
                kqVar = kq.f25536P;
                kqVar.b(zI);
                if (zI) {
                    kqVar.b(lqVarI.j(), context);
                    kqVar.c(lqVarI.l(), context);
                    kqVar.a(lqVarI.k(), context);
                    kqVar.a(lqVarI.g());
                    kqVar.d(lqVarI.h());
                }
            }
            g4VarG = qtVar.c().getBannerConfigurations().g();
        }
        a((u7) wj.i(), g4VarG, context, qtVar, true);
        kqVar = kq.f25536P;
        kqVar.b(zI);
        if (zI) {
            kqVar.b(lqVarI.j(), context);
            kqVar.c(lqVarI.l(), context);
            kqVar.a(lqVarI.k(), context);
            kqVar.a(lqVarI.g());
            kqVar.d(lqVarI.h());
        }
    }

    private void a(u7 u7Var, g4 g4Var, Context context, qt qtVar, boolean z2) {
        u7Var.b(z2);
        u7Var.a(g4Var.c(), context);
        u7Var.b(g4Var.d(), context);
        u7Var.b(g4Var.f());
        u7Var.a(g4Var.e());
        u7Var.c(g4Var.a());
        u7Var.c(g4Var.i(), context);
        u7Var.a(g4Var.h(), context);
        u7Var.b(g4Var.j(), context);
        u7Var.d(g4Var.g(), context);
        u7Var.a(qtVar.c().getApplicationConfigurations().j());
        u7Var.a(g4Var.k());
        u7Var.d(g4Var.b());
    }

    @Override // com.ironsource.sa.c
    public synchronized void a(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + str);
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = this.r0.a(str);
        try {
            if (!this.f25989F) {
                ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
                return;
            }
            k kVar = this.i0;
            if (kVar != null) {
                kVar.b(str);
            } else {
                ironLog.error("Rewarded video was not initiated");
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.API.error(e2.getMessage());
            if (iSDemandOnlyRewardedVideoListenerA != null) {
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(510, e2.getMessage()));
            }
        }
    }

    private void a(String str, t8 t8Var) {
        if (a(str, 1, 128)) {
            return;
        }
        t8Var.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    public void a(String str, List<String> list) {
        String strCheckMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String strCheckMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (strCheckMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataKeyValidity);
            return;
        }
        if (strCheckMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataValueValidity);
            return;
        }
        MetaData metaData = MetaDataUtils.formatMetaData(str, list);
        String metaDataKey = metaData.getMetaDataKey();
        List<String> metaDataValue = metaData.getMetaDataValue();
        if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            com.p004ironsource.mediationsdk.c.b().c(metaDataKey, metaDataValue);
        } else if (A() && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
            IronLog.API.error("setMetaData with key = " + metaDataKey + " must to be called before init");
        } else {
            xk.b().a(metaDataKey, metaDataValue);
        }
        try {
            ConcurrentHashMap<String, List<String>> concurrentHashMapD = com.p004ironsource.mediationsdk.c.b().d();
            concurrentHashMapD.putAll(xk.b().c());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : concurrentHashMapD.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.m0.a(jSONObject);
            this.l0.a(jSONObject);
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("got the following error " + e2.getMessage());
        }
        on.U().z().a(new zb(A() ? ac.SET_META_DATA_AFTER_INIT : ac.SET_META_DATA, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
    }

    public void a(String str, JSONObject jSONObject) {
        if (mk.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && mk.a((Object) str, "setAdRevenueData - dataSource is null")) {
            this.k0.a(str, jSONObject);
        }
    }

    @Override // com.p004ironsource.op
    public void a(List<IronSource.AD_UNIT> list, boolean z2, u8 u8Var) {
        a(this.m);
        b(list, z2, u8Var);
    }

    private void a(JSONObject jSONObject, Object[][] objArr) {
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e2), 3);
            }
        }
    }

    public void a(boolean z2) {
        this.f25993P = Boolean.valueOf(z2);
        com.p004ironsource.mediationsdk.c.b().b(z2);
        this.l0.a(z2);
        on.U().z().a(new zb(z2 ? ac.CONSENT_TRUE_CODE : ac.CONSENT_FALSE_CODE, IronSourceUtils.getMediationAdditionalData(false)));
    }

    private void a(boolean z2, String str) {
        if (z2) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.f25989F, true, this.f26004d0);
            if (str != null) {
                a(mediationAdditionalData, new Object[][]{new Object[]{"placement", str}});
            }
            b(ac.RV_API_IS_CAPPED_TRUE, mediationAdditionalData);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    private void a(boolean z2, boolean z3, int i2, JSONObject jSONObject, boolean z4) {
        String str;
        String str2;
        try {
            StringBuilder sb = new StringBuilder();
            if (!z3) {
                if (z2) {
                    sb.append(",cachedUserAgent=" + this.f26002c.r());
                    jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
                    jSONObject.put("sessionDepth", i2);
                    if (z4) {
                        if (z3) {
                            str2 = "isMultipleAdObjects";
                        } else {
                            str2 = "isMultipleAdUnits";
                        }
                        jSONObject.put(str2, 1);
                    }
                } else {
                    sb.append(",");
                    str = IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW;
                }
                on.U().z().a(new zb(ac.FIRST_INSTANCE, jSONObject));
            }
            str = ",Activity=" + (ContextProvider.getInstance().getCurrentActiveActivity() != null);
            sb.append(str);
            sb.append(",cachedUserAgent=" + this.f26002c.r());
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
            jSONObject.put("sessionDepth", i2);
            if (z4) {
                if (z3) {
                    str2 = "isMultipleAdObjects";
                } else {
                    str2 = "isMultipleAdUnits";
                }
                jSONObject.put(str2, 1);
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        on.U().z().a(new zb(ac.FIRST_INSTANCE, jSONObject));
    }

    private synchronized void a(boolean z2, boolean z3, boolean z4, IronSource.AD_UNIT... ad_unitArr) throws Throwable {
        Throwable th;
        JSONObject mediationAdditionalData;
        try {
            try {
                int i2 = 0;
                for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
                    try {
                        if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                            this.f25991J = true;
                        } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                            this.K = true;
                        } else if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                            this.f25990I = true;
                        } else if (ad_unit.equals(IronSource.AD_UNIT.NATIVE_AD)) {
                            this.L = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (s.c().a() == s.d.INIT_FAILED) {
                    try {
                        if (this.f26007i != null) {
                            int length = ad_unitArr.length;
                            while (i2 < length) {
                                IronSource.AD_UNIT ad_unit2 = ad_unitArr[i2];
                                if (!this.f26013z.contains(ad_unit2)) {
                                    a(ad_unit2, true);
                                }
                                i2++;
                            }
                        }
                    } catch (Exception e2) {
                        q9.d().a(e2);
                        IronLog.INTERNAL.error(e2.toString());
                    }
                } else {
                    if (A()) {
                        if (this.v == null) {
                            return;
                        }
                        try {
                            new pn().a(this.m.c().getApplicationConfigurations().e().b(), z());
                        } catch (Exception e3) {
                            q9.d().a(e3);
                            IronLog.INTERNAL.error(e3.toString());
                        }
                        mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z3);
                        for (IronSource.AD_UNIT ad_unit3 : ad_unitArr) {
                            if (this.f26013z.contains(ad_unit3)) {
                                a(ad_unit3);
                            } else {
                                this.f26013z.add(ad_unit3);
                                this.f25986A.add(ad_unit3);
                                try {
                                    mediationAdditionalData.put(ad_unit3.toString(), true);
                                } catch (Exception e4) {
                                    q9.d().a(e4);
                                    IronLog.INTERNAL.error(e4.toString());
                                }
                                List<IronSource.AD_UNIT> list = this.v;
                                if (list == null || !list.contains(ad_unit3)) {
                                    a(ad_unit3, false);
                                } else {
                                    b(ad_unit3);
                                }
                            }
                        }
                        throw th;
                    }
                    mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z3);
                    int length2 = ad_unitArr.length;
                    while (i2 < length2) {
                        IronSource.AD_UNIT ad_unit4 = ad_unitArr[i2];
                        if (this.f26013z.contains(ad_unit4)) {
                            this.f26006h.log(IronSourceLogger.IronSourceTag.API, ad_unit4 + " ad unit has started initializing.", 3);
                        } else {
                            this.f26013z.add(ad_unit4);
                            this.f25986A.add(ad_unit4);
                            try {
                                mediationAdditionalData.put(ad_unit4.toString(), true);
                            } catch (Exception e5) {
                                q9.d().a(e5);
                                IronLog.INTERNAL.error(e5.toString());
                            }
                        }
                        i2++;
                    }
                    JSONObject jSONObject = mediationAdditionalData;
                    int i3 = this.f25988E + 1;
                    this.f25988E = i3;
                    a(z2, z3, i3, jSONObject, z4);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
    }

    public boolean a(h7 h7Var) {
        return this.f26005e.b(ContextProvider.getInstance().getApplicationContext(), h7Var, IronSource.AD_UNIT.BANNER);
    }

    private boolean a(h.b bVar) {
        if (s.c().a() != s.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.f0) {
            this.f0.put(bVar.getInstanceId(), bVar);
        }
        return true;
    }

    private boolean a(String str, int i2, int i3) {
        return str != null && str.length() >= i2 && str.length() <= i3;
    }

    public boolean a(boolean z2, qt qtVar) {
        a(qtVar);
        if (A()) {
            return true;
        }
        synchronized (this.f26008l) {
            this.m = qtVar;
        }
        return b(qtVar.g(), z2, qtVar.c());
    }
}

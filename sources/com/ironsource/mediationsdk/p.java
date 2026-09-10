package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.AbstractC0437l3;
import com.ironsource.C0265ba;
import com.ironsource.C0267bc;
import com.ironsource.C0304dd;
import com.ironsource.C0312e3;
import com.ironsource.C0322ed;
import com.ironsource.C0323ee;
import com.ironsource.C0334f7;
import com.ironsource.C0336f9;
import com.ironsource.C0358gd;
import com.ironsource.C0359ge;
import com.ironsource.C0372h9;
import com.ironsource.C0398j0;
import com.ironsource.C0421k5;
import com.ironsource.C0429kd;
import com.ironsource.C0434l0;
import com.ironsource.C0462ma;
import com.ironsource.C0474n4;
import com.ironsource.C0504og;
import com.ironsource.C0522pg;
import com.ironsource.C0652x3;
import com.ironsource.C0654x5;
import com.ironsource.C0678yb;
import com.ironsource.Dc;
import com.ironsource.De;
import com.ironsource.Df;
import com.ironsource.E9;
import com.ironsource.Ee;
import com.ironsource.EnumC0672y5;
import com.ironsource.G9;
import com.ironsource.InterfaceC0441l7;
import com.ironsource.InterfaceC0674y7;
import com.ironsource.J1;
import com.ironsource.J8;
import com.ironsource.J9;
import com.ironsource.Kb;
import com.ironsource.Lb;
import com.ironsource.Lc;
import com.ironsource.M1;
import com.ironsource.M3;
import com.ironsource.M6;
import com.ironsource.M7;
import com.ironsource.Md;
import com.ironsource.N3;
import com.ironsource.Nf;
import com.ironsource.O4;
import com.ironsource.Of;
import com.ironsource.P4;
import com.ironsource.P5;
import com.ironsource.P7;
import com.ironsource.Qb;
import com.ironsource.T6;
import com.ironsource.T9;
import com.ironsource.U2;
import com.ironsource.U9;
import com.ironsource.V3;
import com.ironsource.V4;
import com.ironsource.Ve;
import com.ironsource.X7;
import com.ironsource.Xe;
import com.ironsource.Z9;
import com.ironsource.Zb;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class p implements T9, Lc, O4, O4.b, O4.c, O4.a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static boolean f29640a0 = false;
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private Boolean H;
    private Boolean I;
    private Dc J;
    private boolean K;
    private boolean L;
    private boolean M;
    private final ConcurrentHashMap<String, com.ironsource.mediationsdk.demandOnly.h.d> N;
    private final ConcurrentHashMap<String, com.ironsource.mediationsdk.demandOnly.h.b> O;
    private final ConcurrentHashMap<String, com.ironsource.mediationsdk.demandOnly.h.d> P;
    private com.ironsource.mediationsdk.demandOnly.f Q;
    private com.ironsource.mediationsdk.demandOnly.k R;
    private com.ironsource.mediationsdk.demandOnly.c S;
    private P5 T;
    private U9 U;
    private T6 V;
    private boolean W;
    private AdQualityBridge X;
    X7<ISDemandOnlyInterstitialListener> Y;
    X7<ISDemandOnlyRewardedVideoListener> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0674y7 f29643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0674y7.a f29644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M7 f29645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0441l7 f29646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final J8.a f29647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IronSourceLoggerManager f29648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C0678yb f29649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicBoolean f29650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f29651k;
    private Ve l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f29652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f29653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f29654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map<String, String> f29655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f29656q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AtomicBoolean f29657r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f29658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<IronSource.a> f29659t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f29660u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Set<IronSource.a> f29661v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Set<IronSource.a> f29662w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f29663x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private C0265ba f29664y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f29665z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f29667b;

        static {
            int[] iArr = new int[q.d.values().length];
            f29667b = iArr;
            try {
                iArr[q.d.NOT_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29667b[q.d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29667b[q.d.INIT_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29667b[q.d.INITIATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.a.values().length];
            f29666a = iArr2;
            try {
                iArr2[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29666a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29666a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29666a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static volatile p f29668a = new p(0);

        private c() {
        }
    }

    public /* synthetic */ p(int i10) {
        this();
    }

    private boolean A() {
        Ve ve = this.l;
        return (ve == null || ve.c() == null || this.l.c().e() == null) ? false : true;
    }

    private boolean B() {
        return A() && C();
    }

    private boolean C() {
        Ve ve = this.l;
        return (ve == null || ve.k() == null || this.l.k().c() == null || this.l.k().c().isEmpty()) ? false : true;
    }

    private boolean D() {
        Ve ve = this.l;
        return (ve == null || ve.c() == null || this.l.c().f() == null) ? false : true;
    }

    private boolean E() {
        return D() && F();
    }

    private boolean F() {
        Ve ve = this.l;
        return (ve == null || ve.k() == null || this.l.k().d() == null || this.l.k().d().size() <= 0) ? false : true;
    }

    private void J() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C0462ma.b().c();
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f29606c)) {
            String str = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f29606c).get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            V4.f27346a.b(!MetaDataUtils.getMetaDataBooleanValue(str));
        }
    }

    private void K() {
        if (this.D) {
            L();
        }
    }

    private void L() {
        this.f29648h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.l.k().a().size(); i10++) {
            String str = this.l.k().a().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, false, 1);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(EnumC0672y5.TROUBLESHOOTING_BN_INIT_FAILED, jSONObjectA);
            a(IronSource.a.BANNER, false);
            return;
        }
        synchronized (this.O) {
            try {
                U2 u2C = this.l.c().c();
                P4.a aVar = new P4.a("Mediation");
                if (u2C.k()) {
                    aVar.a("isOneFlow", 1);
                }
                this.S = new com.ironsource.mediationsdk.demandOnly.c(arrayList, u2C, i(), j(), new P4.b(G9.i(), aVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (com.ironsource.mediationsdk.demandOnly.h.b bVar : this.O.values()) {
            this.S.a(bVar.g(), bVar.e());
        }
        this.O.clear();
    }

    private void M() {
        this.f29648h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.l.k().b().size(); i10++) {
            String str = this.l.k().b().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, false, 1);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(EnumC0672y5.TROUBLESHOOTING_IS_INIT_FAILED, jSONObjectA);
            a(IronSource.a.INTERSTITIAL, false);
            return;
        }
        synchronized (this.N) {
            this.Q = a((List<NetworkSettings>) arrayList);
        }
        Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.N.values().iterator();
        while (it.hasNext()) {
            this.Q.a(it.next());
        }
        this.N.clear();
    }

    private void N() {
        this.f29648h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.l.k().d().size(); i10++) {
            String str = this.l.k().d().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.P) {
            this.R = b(arrayList);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.P.values().iterator();
        while (it.hasNext()) {
            this.R.a(it.next());
        }
        this.P.clear();
    }

    private void O() {
        if (this.C) {
            M();
        }
    }

    private void P() {
        if (this.B) {
            N();
        }
    }

    private boolean b(List<IronSource.a> list, boolean z10, N3 n3) {
        IronLog.INTERNAL.verbose();
        try {
            this.f29659t = list;
            c(true);
            this.f29648h.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.i("init success");
            if (z10) {
                JSONObject jSONObjectB = IronSourceUtils.b(false);
                try {
                    jSONObjectB.put("revived", true);
                } catch (JSONException e10) {
                    C0474n4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
                Kb.Y().q().a(new C0654x5(EnumC0672y5.FIRST_INSTANCE_RESULT, jSONObjectB));
            }
            int iB = n3.b().f().b();
            if (iB >= 0) {
                V3 v4 = new V3();
                v4.a(iB);
                v4.a(iB, this.l.l().d());
            }
            G9.i().h();
            C0359ge.i().h();
            Kb.Y().q().h();
            com.ironsource.mediationsdk.c.b().b(i(), j());
            for (IronSource.a aVar : IronSource.a.values()) {
                if (this.f29661v.contains(aVar)) {
                    if (list.contains(aVar)) {
                        b(aVar);
                    } else {
                        a(aVar, false);
                    }
                }
            }
            Dc dcL = l();
            if (dcL != null) {
                dcL.a(this.l);
            }
            return true;
        } catch (Exception e11) {
            C0474n4.d().a(e11);
            IronLog.INTERNAL.error(e11.toString());
            Dc dcL2 = l();
            if (dcL2 != null) {
                dcL2.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    private synchronized void c(boolean z10) {
        this.f29658s = z10;
    }

    private void d(Context context) {
        AtomicBoolean atomicBoolean = this.f29650j;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        Df.a().a(new M6(context));
        Kb.Y().q().a(context, this.f29664y);
        G9.i().a(context, this.f29664y);
        C0359ge.i().a(context, this.f29664y);
        C0304dd.P.a(context, this.f29664y);
    }

    public static p h() {
        return c.f29668a;
    }

    private synchronized Dc l() {
        return this.J;
    }

    private void p() {
        this.f29648h = IronSourceLoggerManager.getLogger(0);
        this.f29649i = new C0678yb();
    }

    private boolean q() {
        try {
            IronLog.INTERNAL.verbose("AdQuality SDK exist: ".concat(IronSourceAdQuality.class.getName()));
            return true;
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    private boolean r() {
        Ve ve = this.l;
        return (ve == null || ve.c() == null || this.l.c().b() == null || this.l.c().b().b() == null) ? false : true;
    }

    private boolean s() {
        Ve ve = this.l;
        return (ve == null || ve.c() == null || this.l.c().c() == null) ? false : true;
    }

    private boolean t() {
        return s() && u();
    }

    private boolean u() {
        Ve ve = this.l;
        return (ve == null || ve.k() == null || this.l.k().a() == null || this.l.k().a().size() <= 0) ? false : true;
    }

    private synchronized boolean w() {
        return this.f29658s;
    }

    private boolean x() {
        Ve ve = this.l;
        return (ve == null || ve.c() == null || this.l.c().d() == null) ? false : true;
    }

    private boolean y() {
        return x() && z();
    }

    private boolean z() {
        Ve ve = this.l;
        return (ve == null || ve.k() == null || this.l.k().b() == null || this.l.k().b().size() <= 0) ? false : true;
    }

    public boolean G() {
        return w();
    }

    public void H() {
        this.W = false;
    }

    public void I() {
        if (f29640a0) {
            return;
        }
        f29640a0 = true;
        JSONObject jSONObjectB = IronSourceUtils.b(false);
        try {
            jSONObjectB.put("status", "false");
            jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Kb.Y().q().a(new C0654x5(EnumC0672y5.FIRST_INSTANCE_RESULT, jSONObjectB));
    }

    public void a(long j10, Ve.a aVar) {
        JSONObject jSONObjectB = IronSourceUtils.b(v());
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_DURATION, j10);
            jSONObjectB.put("sessionDepth", this.A);
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, aVar.b());
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Kb.Y().q().a(new C0654x5(EnumC0672y5.INIT_COMPLETE, jSONObjectB));
    }

    @Override // com.ironsource.O4.a
    public void e(String str) {
        this.f29648h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.ironsource.mediationsdk.demandOnly.c cVar = this.S;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            this.f29648h.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th2);
        }
    }

    @Override // com.ironsource.T9
    public void f(String str) {
        try {
            String str2 = this.f29641a + ":setMediationType(mediationType:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.f29648h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (!a(str, 1, 64) || !k(str)) {
                this.f29648h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.f29656q = str;
                this.U.f(str);
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            this.f29648h.logException(IronSourceLogger.IronSourceTag.API, d5.u.h(new StringBuilder(), this.f29641a, ":setMediationType(mediationType:", str, ")"), e10);
        }
    }

    @Override // com.ironsource.Lc
    public void g(String str) {
        try {
            this.f29648h.log(IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.i("Mediation init failed");
            if (this.f29649i != null) {
                Iterator<IronSource.a> it = this.f29661v.iterator();
                while (it.hasNext()) {
                    a(it.next(), true);
                }
            }
            Dc dcL = l();
            if (dcL != null) {
                dcL.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public String i() {
        return this.f29652m;
    }

    public void j(String str) {
        IronLog.API.verbose("userId = " + str);
        this.f29653n = str;
        Kb.Y().q().a(new C0654x5(EnumC0672y5.SET_USER_ID, IronSourceUtils.a(false)));
        AdQualityBridge adQualityBridge = this.X;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    public String k() {
        return this.f29656q;
    }

    public Map<String, String> m() {
        return this.f29655p;
    }

    public C0265ba n() {
        return this.f29664y;
    }

    public String o() {
        return this.f29660u;
    }

    public boolean v() {
        return this.B || this.C || this.D;
    }

    private p() {
        this(Kb.Y().a(), Kb.Q().c(), Kb.Y().w(), Kb.Y().k(), Kb.Q().D());
    }

    private boolean k(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private M3 l(String str) {
        M3 m7 = new M3();
        if (str == null) {
            m7.a(new IronSourceError(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, "Init Fail - appKey is missing"));
            return m7;
        }
        if (!a(str, 5, 10)) {
            m7.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "length should be between 5-10 characters"));
            return m7;
        }
        if (!k(str)) {
            m7.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "should contain only english characters and numbers"));
        }
        return m7;
    }

    public Zb c() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.l.k().c());
        if (listA.size() > 0) {
            return new Zb(listA, this.l.c().e(), IronSourceUtils.f(), C0462ma.b(), this.f29664y);
        }
        JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
        a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        a(EnumC0672y5.TROUBLESHOOTING_NT_INIT_FAILED, jSONObjectA);
        return null;
    }

    @Override // com.ironsource.O4.c
    public synchronized boolean h(String str) {
        com.ironsource.mediationsdk.demandOnly.k kVar;
        kVar = this.R;
        return kVar != null && kVar.a(str);
    }

    public C0267bc i(String str) {
        Qb qbE = this.l.c().e();
        if (qbE == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return qbE.e();
        }
        C0267bc c0267bcA = qbE.a(str);
        return c0267bcA != null ? c0267bcA : qbE.e();
    }

    public Ve e() {
        return this.l;
    }

    @Override // com.ironsource.O4.b
    public synchronized boolean d(String str) {
        com.ironsource.mediationsdk.demandOnly.f fVar;
        fVar = this.Q;
        return fVar != null && fVar.b(str);
    }

    public p(InterfaceC0674y7 interfaceC0674y7, InterfaceC0674y7.a aVar, M7 m7, InterfaceC0441l7 interfaceC0441l7, J8.a aVar2) {
        this.f29641a = getClass().getName();
        this.f29642b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b9.4.3";
        this.f29651k = new Object();
        this.l = null;
        this.f29652m = null;
        this.f29653n = "";
        this.f29654o = null;
        this.f29655p = null;
        this.f29656q = null;
        this.f29658s = false;
        this.f29663x = true;
        this.f29665z = "sessionDepth";
        this.I = null;
        this.W = false;
        this.f29643c = interfaceC0674y7;
        this.f29644d = aVar;
        this.f29645e = m7;
        this.f29646f = interfaceC0441l7;
        this.f29647g = aVar2;
        p();
        this.f29650j = new AtomicBoolean();
        this.f29661v = new HashSet();
        this.f29662w = new HashSet();
        this.C = false;
        this.B = false;
        this.D = false;
        this.f29657r = new AtomicBoolean(true);
        this.A = 0;
        this.E = false;
        this.F = false;
        this.G = false;
        this.f29660u = IronSourceUtils.d();
        this.H = Boolean.FALSE;
        this.M = false;
        this.J = null;
        this.K = true;
        this.N = new ConcurrentHashMap<>();
        this.P = new ConcurrentHashMap<>();
        this.O = new ConcurrentHashMap<>();
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = new P5();
        U9 u10 = new U9();
        this.U = u10;
        this.V = new T6(u10);
        this.X = null;
        this.Y = new X7.a();
        this.Z = new X7.b();
    }

    public Boolean d() {
        return this.I;
    }

    public String j() {
        return this.f29653n;
    }

    private boolean d(Ve ve) {
        com.ironsource.mediationsdk.adquality.a aVarA = ve.c().a();
        return this.X == null && aVarA != null && aVarA.b() && AdQualityBridge.adQualityAvailable();
    }

    public synchronized IronSourceError a(Context context, String str, boolean z10, Dc dc2, IronSource.a... aVarArr) {
        IronLog.INTERNAL.verbose("GitHash: 8efe19c");
        if (!Z9.a((Object) context, "Init Failed - provided context is null")) {
            g("Provided context is null");
            return new IronSourceError(2000, "Provided context is null");
        }
        this.f29647g.a(context);
        boolean z11 = context instanceof Activity;
        if (z11) {
            a((Activity) context);
        }
        AtomicBoolean atomicBoolean = this.f29657r;
        if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
            Ee.f26017a.a(dc2 == null);
            if ((aVarArr == null || aVarArr.length == 0) && dc2 == null) {
                for (IronSource.a aVar : IronSource.a.values()) {
                    this.f29661v.add(aVar);
                }
                this.E = true;
                this.F = true;
                this.G = true;
            } else {
                for (IronSource.a aVar2 : aVarArr) {
                    this.f29661v.add(aVar2);
                    this.f29662w.add(aVar2);
                    if (aVar2.equals(IronSource.a.INTERSTITIAL)) {
                        this.F = true;
                    }
                    if (aVar2.equals(IronSource.a.BANNER)) {
                        this.G = true;
                    }
                    if (aVar2.equals(IronSource.a.REWARDED_VIDEO)) {
                        this.E = true;
                    }
                }
            }
            IronLog.API.info("init(appKey:" + str + ")");
            M3 m3L = l(str);
            if (m3L.b()) {
                this.f29652m = str;
            }
            Ve veA = a(context, this.f29652m);
            if (veA != null) {
                IronLog.INTERNAL.verbose("init cache exists");
                a(veA.c().b().f());
            } else {
                IronLog.INTERNAL.verbose("init cache does not exist");
            }
            ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
            this.f29644d.a(context.getApplicationContext(), TimeUnit.HOURS.toMillis(V4.f27346a.d()));
            this.U.g(LevelPlay.getSdkVersion());
            this.U.a(P7.a());
            this.U.a(C0434l0.a());
            J();
            d(context);
            if (this.f29652m == null) {
                q.c().e();
                if (this.f29661v.contains(IronSource.a.REWARDED_VIDEO)) {
                    Md.a().a(false, (AdInfo) null);
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, m3L.a().toString(), 1);
                return new IronSourceError(IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, "App key is null");
            }
            this.U.a(context);
            this.U.c(this.f29652m);
            this.U.h(this.f29660u);
            if (this.f29663x) {
                JSONObject jSONObjectB = IronSourceUtils.b(z10);
                if (aVarArr != null) {
                    for (IronSource.a aVar3 : aVarArr) {
                        try {
                            jSONObjectB.put(aVar3.toString(), true);
                        } catch (Exception e10) {
                            C0474n4.d().a(e10);
                        }
                    }
                }
                int i10 = this.A + 1;
                this.A = i10;
                a(z11, z10, i10, jSONObjectB, dc2 != null);
                this.f29663x = false;
            }
            return null;
        }
        if (aVarArr != null) {
            a(z11, z10, dc2 != null, aVarArr);
        } else {
            this.f29648h.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
        }
        De deB = Ee.f26017a.b();
        if (w()) {
            a(this.l);
            return new IronSourceError(IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
        }
        if (deB == De.INIT_FAILED) {
            return new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
        }
        if (deB != De.NOT_INIT) {
            if (dc2 != null) {
                a(dc2);
            }
            return new IronSourceError(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
        }
        return new IronSourceError(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, "Already called new init");
    }

    public String g() {
        return this.f29654o;
    }

    @Override // com.ironsource.O4.b
    public void c(String str) {
        this.f29648h.log(IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = this.Y.a(str);
        try {
            if (!this.C) {
                IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was initialized in mediation mode. Use showInterstitial instead"));
                return;
            }
            com.ironsource.mediationsdk.demandOnly.f fVar = this.Q;
            if (fVar == null) {
                IronLog.API.error("Interstitial was not initiated");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was not initiated"));
            } else {
                fVar.a(str);
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.API.error(e10.getMessage());
            if (iSDemandOnlyInterstitialListenerA != null) {
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    private P4 f() {
        return new P4.b(Kb.Y().q(), new P4.a("IronSource"));
    }

    public void c(Context context) {
        Nf nf2 = Nf.f26664a;
        nf2.b();
        if (!w()) {
            nf2.a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        if (!c(this.l)) {
            nf2.a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error(IronSourceConstants.errorMessage_TEST_SUITE_DISABLED);
        } else if (!IronSourceUtils.f(context)) {
            nf2.a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
        } else {
            new Of().a(context, i(), this.l.j(), LevelPlay.getSdkVersion(), this.l.c().g().b(), d(), this.K);
            this.W = true;
            nf2.c();
        }
    }

    private void b(IronSource.a aVar) {
        int i10 = a.f29666a[aVar.ordinal()];
        if (i10 == 1) {
            P();
        } else if (i10 == 2) {
            O();
        } else {
            if (i10 != 3) {
                return;
            }
            K();
        }
    }

    private com.ironsource.mediationsdk.demandOnly.k b(List<NetworkSettings> list) {
        C0323ee c0323eeF = this.l.c().f();
        P4.a aVar = new P4.a("Mediation");
        if (c0323eeF.d()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.k(list, c0323eeF, com.ironsource.mediationsdk.c.b(), this.Z, i(), j(), new P4.b(C0359ge.i(), aVar));
    }

    private boolean c(Ve ve) {
        return ve != null && ve.p();
    }

    @Override // com.ironsource.T9
    public boolean b(String str) {
        try {
            M3 m7 = new M3();
            a(str, m7);
            if (m7.b()) {
                this.f29654o = str;
                Kb.Y().q().a(new C0654x5(EnumC0672y5.SET_USER_ID, IronSourceUtils.a(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, m7.a().toString(), 2);
            return false;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            this.f29648h.logException(IronSourceLogger.IronSourceTag.API, d5.u.h(new StringBuilder(), this.f29641a, ":setDynamicUserId(dynamicUserId:", str, ")"), e10);
            return false;
        }
    }

    @Override // com.ironsource.O4.c
    public synchronized void b(Activity activity, String str) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.REWARDED_VIDEO).b(), this.Z.a(str));
    }

    @Override // com.ironsource.O4.b
    public synchronized void b(Activity activity, String str, String str2) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.INTERSTITIAL).a(true).a(str2).b(), this.Y.a(str));
    }

    private void a(M1 m7) {
        V4 v4 = V4.f27346a;
        v4.c(m7.g());
        v4.a(m7.f());
        v4.a(m7.j());
        this.f29646f.a(m7);
    }

    public o b(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f29648h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.f29648h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new o(activity, iSBannerSize);
    }

    private boolean b(com.ironsource.mediationsdk.demandOnly.h.b bVar) {
        synchronized (this.O) {
            try {
                if (this.S != null) {
                    return false;
                }
                this.O.put(bVar.e(), bVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
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
    public synchronized List<IronSource.a> a(Context context, String str, boolean z10, IronSource.a... aVarArr) {
        ArrayList arrayList;
        int i10;
        try {
            arrayList = new ArrayList();
            if (aVarArr != null && aVarArr.length != 0) {
                for (IronSource.a aVar : aVarArr) {
                    if (aVar.equals(IronSource.a.INTERSTITIAL)) {
                        if (this.F) {
                            a(aVar);
                        } else {
                            this.C = true;
                            if (!arrayList.contains(aVar)) {
                                arrayList.add(aVar);
                            }
                        }
                    }
                    if (aVar.equals(IronSource.a.REWARDED_VIDEO)) {
                        if (this.E) {
                            a(aVar);
                        } else {
                            this.B = true;
                            if (!arrayList.contains(aVar)) {
                                arrayList.add(aVar);
                            }
                        }
                    }
                    if (!aVar.equals(IronSource.a.BANNER)) {
                        if (this.G) {
                            a(aVar);
                        } else {
                            this.D = true;
                            if (!arrayList.contains(aVar)) {
                                arrayList.add(aVar);
                            }
                        }
                    }
                }
            } else if (z10) {
                if (this.E) {
                    a(IronSource.a.REWARDED_VIDEO);
                } else {
                    this.B = true;
                    arrayList.add(IronSource.a.REWARDED_VIDEO);
                }
                if (this.F) {
                    a(IronSource.a.INTERSTITIAL);
                } else {
                    this.C = true;
                    arrayList.add(IronSource.a.INTERSTITIAL);
                }
                if (this.G) {
                    a(IronSource.a.BANNER);
                } else {
                    this.D = true;
                    arrayList.add(IronSource.a.BANNER);
                }
            } else {
                while (i10 < r7) {
                    if (aVar.equals(IronSource.a.INTERSTITIAL)) {
                        if (this.F) {
                            a(aVar);
                        } else {
                            this.C = true;
                            if (!arrayList.contains(aVar)) {
                                arrayList.add(aVar);
                            }
                        }
                    }
                    if (aVar.equals(IronSource.a.REWARDED_VIDEO)) {
                        if (this.E) {
                            a(aVar);
                        } else {
                            this.B = true;
                            if (!arrayList.contains(aVar)) {
                                arrayList.add(aVar);
                            }
                        }
                    }
                    if (!aVar.equals(IronSource.a.BANNER)) {
                        if (this.G) {
                            a(aVar);
                        } else {
                            this.D = true;
                            if (!arrayList.contains(aVar)) {
                                arrayList.add(aVar);
                            }
                        }
                    }
                }
            }
            if (context != null) {
                if (context instanceof Activity) {
                    a((Activity) context);
                }
                ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public String b() {
        q qVarC = q.c();
        int i10 = a.f29667b[qVarC.a().ordinal()];
        if (i10 == 1) {
            return "init() must be called first";
        }
        if (i10 == 2) {
            return "init() had failed";
        }
        if (i10 != 3) {
            return (i10 == 4 && !B()) ? "No Native Ad configurations found" : "";
        }
        return qVarC.d() ? "init() had failed" : "init() not finished yet";
    }

    public Ve b(Context context, String str, b bVar) {
        synchronized (this.f29651k) {
            try {
                Ve ve = this.l;
                if (ve != null) {
                    return new Ve(ve);
                }
                Ve veA = a(context, str, bVar);
                if (veA == null || !veA.q()) {
                    IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                    IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                    logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                    veA = a(context, i());
                    if (veA != null) {
                        IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(i(), str);
                        this.f29648h.log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError.toString() + ": " + veA.toString(), 1);
                        Kb.Y().q().a(new C0654x5(EnumC0672y5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
                    }
                }
                if (veA != null) {
                    this.l = veA;
                    IronSourceUtils.e(context, veA.toString());
                    b(this.l, context);
                    G9.i().c(true);
                    C0359ge.i().c(true);
                    C0304dd.P.c(true);
                    Kb.Y().q().c(true);
                }
                return veA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Ve ve, Context context) {
        b(ve);
        a(ve, context);
    }

    private void a(IronSource.a aVar) {
        String str = aVar + " ad unit has already been initialized";
        this.f29648h.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.i(str);
    }

    private void b(Ve ve) {
        this.f29648h.setLoggerDebugLevel("console", ve.c().b().h().a());
    }

    private synchronized void a(boolean z10, boolean z11, boolean z12, IronSource.a... aVarArr) throws Throwable {
        p pVar;
        Throwable th2;
        p pVar2;
        try {
            try {
                int i10 = 0;
                for (IronSource.a aVar : aVarArr) {
                    try {
                        if (aVar.equals(IronSource.a.INTERSTITIAL)) {
                            this.F = true;
                        } else if (aVar.equals(IronSource.a.BANNER)) {
                            this.G = true;
                        } else if (aVar.equals(IronSource.a.REWARDED_VIDEO)) {
                            this.E = true;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        pVar = this;
                    }
                }
                if (q.c().a() == q.d.INIT_FAILED) {
                    try {
                        if (this.f29649i != null) {
                            int length = aVarArr.length;
                            while (i10 < length) {
                                IronSource.a aVar2 = aVarArr[i10];
                                if (!this.f29661v.contains(aVar2)) {
                                    a(aVar2, true);
                                }
                                i10++;
                            }
                        }
                    } catch (Exception e10) {
                        C0474n4.d().a(e10);
                        IronLog.INTERNAL.error(e10.toString());
                    }
                    pVar2 = this;
                } else if (!w()) {
                    JSONObject jSONObjectB = IronSourceUtils.b(z11);
                    int length2 = aVarArr.length;
                    while (i10 < length2) {
                        IronSource.a aVar3 = aVarArr[i10];
                        if (!this.f29661v.contains(aVar3)) {
                            this.f29661v.add(aVar3);
                            this.f29662w.add(aVar3);
                            try {
                                jSONObjectB.put(aVar3.toString(), true);
                            } catch (Exception e11) {
                                C0474n4.d().a(e11);
                                IronLog.INTERNAL.error(e11.toString());
                            }
                        } else {
                            this.f29648h.log(IronSourceLogger.IronSourceTag.API, aVar3 + " ad unit has started initializing.", 3);
                        }
                        i10++;
                    }
                    int i11 = this.A + 1;
                    this.A = i11;
                    pVar2 = this;
                    pVar2.a(z10, z11, i11, jSONObjectB, z12);
                } else {
                    pVar = this;
                    if (pVar.f29659t == null) {
                        return;
                    }
                    try {
                        new Lb().a(pVar.l.c().b().e().b(), pVar.v());
                    } catch (Exception e12) {
                        C0474n4.d().a(e12);
                        IronLog.INTERNAL.error(e12.toString());
                    }
                    JSONObject jSONObjectB2 = IronSourceUtils.b(z11);
                    for (IronSource.a aVar4 : aVarArr) {
                        if (!pVar.f29661v.contains(aVar4)) {
                            pVar.f29661v.add(aVar4);
                            pVar.f29662w.add(aVar4);
                            try {
                                jSONObjectB2.put(aVar4.toString(), true);
                            } catch (Exception e13) {
                                C0474n4.d().a(e13);
                                IronLog.INTERNAL.error(e13.toString());
                            }
                            List<IronSource.a> list = pVar.f29659t;
                            if (list != null && list.contains(aVar4)) {
                                pVar.b(aVar4);
                            } else {
                                pVar.a(aVar4, false);
                            }
                        } else {
                            pVar.a(aVar4);
                        }
                    }
                    int i12 = pVar.A + 1;
                    pVar.A = i12;
                    try {
                        pVar.a(z10, z11, i12, jSONObjectB2, z12);
                        pVar2 = pVar;
                    } catch (Throwable th4) {
                        th = th4;
                        pVar = pVar;
                    }
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                pVar = this;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // com.ironsource.T9
    public String b(Context context) {
        String strI = this.f29643c.I(context);
        Kb.Y().q().a(new C0654x5(EnumC0672y5.GET_ADVERTISING_ID, IronSourceUtils.b(false)));
        return !TextUtils.isEmpty(strI) ? strI : "";
    }

    private void b(EnumC0672y5 enumC0672y5, JSONObject jSONObject) {
        C0359ge.i().a(new C0654x5(enumC0672y5, jSONObject));
    }

    public void b(boolean z10) {
        this.I = Boolean.valueOf(z10);
        com.ironsource.mediationsdk.c.b().b(z10);
        this.U.a(z10);
        Kb.Y().q().a(new C0654x5(z10 ? EnumC0672y5.CONSENT_TRUE_CODE : EnumC0672y5.CONSENT_FALSE_CODE, IronSourceUtils.b(false)));
    }

    public void b(String str, JSONObject jSONObject) {
        com.ironsource.mediationsdk.c.b().b(new t(str, jSONObject));
    }

    @Override // com.ironsource.V8
    public void b(ImpressionDataListener impressionDataListener) {
        if (Z9.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            C0462ma.b().a(impressionDataListener);
            IronLog.API.info("add impression data listener to ".concat(impressionDataListener.getClass().getSimpleName()));
        }
    }

    private void a(boolean z10, boolean z11, int i10, JSONObject jSONObject, boolean z12) {
        try {
            StringBuilder sb2 = new StringBuilder();
            if (z11) {
                sb2.append(",Activity=" + (ContextProvider.getInstance().getCurrentActiveActivity() != null));
            } else if (!z10) {
                sb2.append(",init_context_flow");
            }
            sb2.append(",cachedUserAgent=" + this.f29643c.n());
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb2.toString());
            jSONObject.put("sessionDepth", i10);
            if (z12) {
                if (z11) {
                    jSONObject.put("isMultipleAdObjects", 1);
                } else {
                    jSONObject.put("isMultipleAdUnits", 1);
                }
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Kb.Y().q().a(new C0654x5(EnumC0672y5.FIRST_INSTANCE, jSONObject));
    }

    private synchronized void a(Dc dc2) {
        this.J = dc2;
    }

    public boolean a(boolean z10, Ve ve) {
        a(ve);
        if (w()) {
            return true;
        }
        synchronized (this.f29651k) {
            this.l = ve;
        }
        return b(ve.h(), z10, ve.c());
    }

    @Override // com.ironsource.Lc
    public void a(List<IronSource.a> list, boolean z10, N3 n3) {
        a(this.l);
        b(list, z10, n3);
    }

    private void a(Ve ve) {
        if (q() && d(ve)) {
            AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), i(), j(), new C0398j0(), ve.c().b().h().a());
            this.X = adQualityBridge;
            C0265ba c0265ba = this.f29664y;
            if (c0265ba != null) {
                adQualityBridge.setSegment(c0265ba);
            }
        }
    }

    private com.ironsource.mediationsdk.demandOnly.f a(List<NetworkSettings> list) {
        E9 e9D = this.l.c().d();
        P4.a aVar = new P4.a("Mediation");
        if (e9D.j()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.f(list, e9D, com.ironsource.mediationsdk.c.b(), this.Y, i(), j(), new P4.b(G9.i(), aVar));
    }

    private List<NetworkSettings> a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str = arrayList.get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.l.l().b(str));
            }
        }
        return arrayList2;
    }

    @Override // com.ironsource.Lc
    public void a() {
        if (this.H.booleanValue()) {
            this.H = Boolean.FALSE;
            l.a().b(IronSource.a.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION, "init() had failed"));
        }
        if (this.M) {
            this.M = false;
            l.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.L) {
            this.L = false;
            l.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.N) {
            try {
                Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.N.values().iterator();
                while (it.hasNext()) {
                    String strE = it.next().e();
                    this.Y.a(strE).onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                }
                this.N.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.P) {
            try {
                Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it2 = this.P.values().iterator();
                while (it2.hasNext()) {
                    String strE2 = it2.next().e();
                    this.Z.a(strE2).onRewardedVideoAdLoadFailed(strE2, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.P.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this.O) {
            try {
                for (com.ironsource.mediationsdk.demandOnly.h.b bVar : this.O.values()) {
                    ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.g();
                    if (iSDemandOnlyBannerLayoutG != null) {
                        iSDemandOnlyBannerLayoutG.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                    }
                }
                this.O.clear();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void a(IronSource.a aVar, boolean z10) {
        int i10 = a.f29666a[aVar.ordinal()];
        if (i10 == 1) {
            if (this.B) {
                Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.P.values().iterator();
                while (it.hasNext()) {
                    String strE = it.next().e();
                    this.Z.a(strE).onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.P.clear();
                return;
            }
            return;
        }
        if (i10 != 2) {
            if (i10 == 3 && this.D) {
                for (com.ironsource.mediationsdk.demandOnly.h.b bVar : this.O.values()) {
                    ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.g();
                    if (iSDemandOnlyBannerLayoutG != null) {
                        iSDemandOnlyBannerLayoutG.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
                    }
                }
                this.O.clear();
                return;
            }
            return;
        }
        if (this.C) {
            Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it2 = this.N.values().iterator();
            while (it2.hasNext()) {
                String strE2 = it2.next().e();
                this.Y.a(strE2).onInterstitialAdLoadFailed(strE2, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
            }
            this.N.clear();
        }
    }

    public void a(C0265ba c0265ba) {
        this.f29664y = c0265ba;
        AdQualityBridge adQualityBridge = this.X;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(c0265ba);
        }
        G9.i().a(this.f29664y);
        C0359ge.i().a(this.f29664y);
        C0304dd.P.a(this.f29664y);
        Kb.Y().q().a(this.f29664y);
    }

    @Override // com.ironsource.T9
    public void a(boolean z10) {
        com.ironsource.mediationsdk.c.b().a(z10);
    }

    @Override // com.ironsource.O4.c
    public synchronized void a(Activity activity, String str, String str2) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(str2).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(true).a(IronSource.a.REWARDED_VIDEO).b(), this.Z.a(str));
    }

    public void a(com.ironsource.mediationsdk.demandOnly.h.d dVar, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        String strE = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strE);
        try {
            if (!this.E) {
                ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
                return;
            }
            if (!this.B) {
                ironLog.error("Rewarded video was initialized in mediation mode");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, "Rewarded video was initialized in mediation mode"));
                return;
            }
            q.d dVarA = q.c().a();
            if (dVarA == q.d.INIT_FAILED) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            IronSourceError ironSourceErrorA = dVar.a();
            if (ironSourceErrorA != null) {
                if (ironSourceErrorA.getErrorCode() == 1060) {
                    b(EnumC0672y5.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
                ironLog.error(ironSourceErrorA.toString());
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ironSourceErrorA);
                return;
            }
            a(dVar.d());
            if (dVarA == q.d.INIT_IN_PROGRESS) {
                if (q.c().d()) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                synchronized (this.P) {
                    this.P.put(strE, dVar);
                }
                if (TextUtils.isEmpty(dVar.b())) {
                    return;
                }
                b(EnumC0672y5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                return;
            }
            if (!E()) {
                ironLog.error("No rewarded video configurations found");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.P) {
                try {
                    com.ironsource.mediationsdk.demandOnly.k kVar = this.R;
                    if (kVar == null) {
                        this.P.put(strE, dVar);
                        if (!TextUtils.isEmpty(dVar.b())) {
                            b(EnumC0672y5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                        }
                        return;
                    }
                    kVar.a(dVar);
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C0474n4.d().a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, th.getMessage()));
        } catch (Throwable th3) {
            C0474n4.d().a(th3);
            IronLog.API.error(th3.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, th3.getMessage()));
        }
    }

    @Override // com.ironsource.O4.c
    public synchronized void a(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + str);
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = this.Z.a(str);
        try {
            if (!this.B) {
                ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
                return;
            }
            com.ironsource.mediationsdk.demandOnly.k kVar = this.R;
            if (kVar == null) {
                ironLog.error("Rewarded video was not initiated");
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
            } else {
                kVar.b(str);
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.API.error(e10.getMessage());
            if (iSDemandOnlyRewardedVideoListenerA != null) {
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(510, e10.getMessage()));
            }
        }
    }

    @Override // com.ironsource.O4.c
    public void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.Z.a(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.O4.b
    public synchronized void a(Activity activity, String str) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.INTERSTITIAL).b(), this.Y.a(str));
    }

    private synchronized void a(com.ironsource.mediationsdk.demandOnly.h.d dVar, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        String strE = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strE);
        try {
            if (!this.F) {
                ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
                return;
            }
            if (!this.C) {
                ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
                return;
            }
            q.d dVarA = q.c().a();
            if (dVarA == q.d.INIT_FAILED) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            IronSourceError ironSourceErrorA = dVar.a();
            if (ironSourceErrorA != null) {
                if (ironSourceErrorA.getErrorCode() == 1060) {
                    b(EnumC0672y5.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
                ironLog.error(ironSourceErrorA.toString());
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ironSourceErrorA);
                return;
            }
            a(dVar.d());
            if (dVarA == q.d.INIT_IN_PROGRESS) {
                if (q.c().d()) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else {
                    synchronized (this.N) {
                        this.N.put(dVar.e(), dVar);
                    }
                    if (!TextUtils.isEmpty(dVar.e())) {
                        a(EnumC0672y5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                }
                return;
            }
            if (!y()) {
                ironLog.error("No interstitial configurations found");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            synchronized (this.N) {
                try {
                    com.ironsource.mediationsdk.demandOnly.f fVar = this.Q;
                    if (fVar == null) {
                        this.N.put(dVar.e(), dVar);
                        if (!TextUtils.isEmpty(dVar.b())) {
                            a(EnumC0672y5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                        }
                        return;
                    }
                    fVar.a(dVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            throw th;
        } catch (Throwable th3) {
            C0474n4.d().a(th3);
            IronLog.API.error(th3.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, th3.getMessage()));
        }
    }

    @Override // com.ironsource.O4.b
    public void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.Y.a(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.O4.a
    public ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f29648h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.f29648h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    @Override // com.ironsource.O4.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        com.ironsource.mediationsdk.demandOnly.h.b bVarA = new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity).a(iSDemandOnlyBannerLayout).a(IronSource.a.BANNER).a();
        IronSourceError ironSourceErrorA = bVarA.a();
        if (ironSourceErrorA != null) {
            this.f29648h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA);
            }
            return;
        }
        IronSourceError ironSourceErrorA2 = a(q.c().a());
        if (ironSourceErrorA2 != null) {
            this.f29648h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA2.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA2);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(bVarA)) {
            return;
        }
        if (!t()) {
            this.f29648h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(bVarA)) {
                return;
            }
            this.S.a(iSDemandOnlyBannerLayout, str);
        }
    }

    private boolean a(com.ironsource.mediationsdk.demandOnly.h.b bVar) {
        if (q.c().a() != q.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.O) {
            this.O.put(bVar.e(), bVar);
        }
        return true;
    }

    private IronSourceError a(q.d dVar) {
        if (!this.G) {
            return new IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.D) {
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == q.d.INIT_FAILED) {
            return new IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == q.d.INIT_IN_PROGRESS && q.c().d()) {
            return new IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    public Ve a(Context context, String str) {
        if (!C0372h9.a(context)) {
            return null;
        }
        C0652x3 c0652x3C = C0372h9.c(context);
        String strD = c0652x3C.d();
        String strF = c0652x3C.f();
        String strE = c0652x3C.e();
        if (!strD.equals(str)) {
            return null;
        }
        Ve ve = new Ve(context, strD, strF, strE);
        ve.a(Ve.a.CACHE);
        return ve;
    }

    private Ve a(Context context, String str, b bVar) {
        Exception exc;
        Ve ve = null;
        if (!IronSourceUtils.f(context)) {
            return null;
        }
        try {
            String strB = b(context);
            if (TextUtils.isEmpty(strB)) {
                strB = this.f29643c.a(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = strB;
            C0265ba c0265ba = this.f29664y;
            String strA = C0334f7.a(Xe.a(context, i(), str, str2, k(), this.K, c0265ba != null ? c0265ba.f() : null, v()), C0336f9.a().toString(), bVar);
            if (strA == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.g()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(strA);
                String strOptString = jSONObject.optString(Ve.f27442n, null);
                if (TextUtils.isEmpty(strOptString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                strA = a(strOptString, Boolean.valueOf(jSONObject.optBoolean("compression", false)));
                if (TextUtils.isEmpty(strA)) {
                    ironLog.warning("encoded response invalid - return null");
                    I();
                    return null;
                }
            }
            Ve ve2 = new Ve(context, i(), str, strA);
            try {
                ve2.a(Ve.a.SERVER);
                if (ve2.q()) {
                    return ve2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e10) {
                exc = e10;
                ve = ve2;
                C0474n4.d().a(exc);
                IronLog.INTERNAL.warning("exception = " + exc);
                return ve;
            }
        } catch (Exception e11) {
            exc = e11;
        }
    }

    private String a(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return J9.d(C0421k5.b().c(), str);
        }
        return J9.b(C0421k5.b().c(), str);
    }

    private void a(Ve ve, Context context) {
        boolean zL = r() ? ve.c().b().b().l() : false;
        boolean zL2 = D() ? ve.c().f().m().l() : false;
        boolean zL3 = x() ? ve.c().d().i().l() : false;
        boolean zL4 = s() ? ve.c().c().g().l() : false;
        boolean zL5 = A() ? ve.c().e().g().l() : false;
        C0322ed c0322edI = ve.c().b().i();
        boolean zI = c0322edI.i();
        if (zL) {
            a((AbstractC0437l3) Kb.Y().q(), ve.c().b().b(), context, ve, true);
        }
        if (zL2) {
            a((AbstractC0437l3) C0359ge.i(), ve.c().f().m(), context, ve, true);
        } else {
            C0359ge.i().a(false);
        }
        if (zL3) {
            a((AbstractC0437l3) G9.i(), ve.c().d().i(), context, ve, true);
        } else if (zL4) {
            a((AbstractC0437l3) G9.i(), ve.c().c().g(), context, ve, true);
        } else if (zL5) {
            a((AbstractC0437l3) G9.i(), ve.c().e().g(), context, ve, true);
        } else {
            G9.i().a(false);
        }
        C0304dd c0304dd = C0304dd.P;
        c0304dd.a(zI);
        if (zI) {
            c0304dd.b(c0322edI.j(), context);
            c0304dd.b(c0322edI.l(), context);
            c0304dd.c(c0322edI.k(), context);
            c0304dd.b(c0322edI.g());
            c0304dd.c(c0322edI.h());
        }
    }

    private void a(AbstractC0437l3 abstractC0437l3, J1 j10, Context context, Ve ve, boolean z10) {
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
        abstractC0437l3.a(ve.c().b().j());
        abstractC0437l3.b(j10.k());
        abstractC0437l3.c(j10.b());
    }

    private void a(String str, M3 m7) {
        if (a(str, 1, 128)) {
            return;
        }
        m7.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    private boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }

    public boolean a(C0312e3 c0312e3) {
        return this.f29645e.c(ContextProvider.getInstance().getApplicationContext(), c0312e3, IronSource.a.BANNER);
    }

    public C0429kd.b a(C0358gd c0358gd) {
        return this.f29645e.a(ContextProvider.getInstance().getApplicationContext(), c0358gd, IronSource.a.REWARDED_VIDEO);
    }

    private void a(EnumC0672y5 enumC0672y5, JSONObject jSONObject) {
        G9.i().a(new C0654x5(enumC0672y5, jSONObject));
    }

    private void a(JSONObject jSONObject, Object[][] objArr) {
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e10), 3);
            }
        }
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
        if (MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            if (w() && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                IronLog.API.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            } else {
                C0462ma.b().a(metaDataKey, metaDataValue);
            }
        } else {
            com.ironsource.mediationsdk.c.b().c(metaDataKey, metaDataValue);
        }
        try {
            ConcurrentHashMap<String, List<String>> concurrentHashMapD = com.ironsource.mediationsdk.c.b().d();
            concurrentHashMapD.putAll(C0462ma.b().c());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : concurrentHashMapD.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.V.a(jSONObject);
            this.U.a(jSONObject);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("got the following error " + e10.getMessage());
        }
        Kb.Y().q().a(new C0654x5(w() ? EnumC0672y5.SET_META_DATA_AFTER_INIT : EnumC0672y5.SET_META_DATA, IronSourceUtils.a(str, list, metaDataValue)));
    }

    @Override // com.ironsource.O4
    public String a(Context context) {
        String str;
        String strC;
        C0522pg c0522pgK;
        P4 p4F = f();
        De de2 = null;
        try {
            De deA = Ee.f26017a.a();
            try {
                p4F.a(EnumC0672y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, deA);
                if (context == null) {
                    IronLog.API.error("bidding data cannot be retrieved, context required");
                    p4F.a(EnumC0672y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (De) null);
                    return null;
                }
                if (deA == De.NOT_INIT) {
                    IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
                    p4F.a(EnumC0672y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_NO_INIT_RETURNED_NULL, (De) null);
                    return null;
                }
                q.c().f();
                Ve ve = this.l;
                boolean zE = (ve == null || (c0522pgK = ve.c().b().k()) == null) ? true : c0522pgK.e();
                this.U.b(context);
                JSONObject jSONObjectA = new C0504og().a(context);
                d.b().a(jSONObjectA, true);
                if (zE) {
                    strC = J9.a(jSONObjectA.toString());
                } else {
                    strC = J9.c(jSONObjectA.toString());
                }
                str = strC;
                if (deA == De.INITIATED) {
                    IronLog.INTERNAL.verbose("external token parameters: " + jSONObjectA);
                }
                if (TextUtils.isEmpty(str)) {
                    p4F.a(EnumC0672y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, deA);
                }
                p4F.a(EnumC0672y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, deA);
                return str;
            } catch (Exception unused) {
                de2 = deA;
                p4F.a(EnumC0672y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, de2);
                deA = de2;
                str = null;
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.ironsource.V8
    public void a(ImpressionDataListener impressionDataListener) {
        if (Z9.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            C0462ma.b().b(impressionDataListener);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (Z9.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && Z9.a((Object) str, "setAdRevenueData - dataSource is null")) {
            this.T.a(str, jSONObject);
        }
    }

    private void a(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }
}

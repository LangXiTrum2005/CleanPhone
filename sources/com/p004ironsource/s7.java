package com.p004ironsource;

import android.text.TextUtils;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.p2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class s7<Listener extends p2> implements NetworkInitializationListener, uu.a, b2, AdapterAdListener, hi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected k1 f26759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Listener f26760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected BaseAdAdapter<?, AdapterAdListener> f26761c;
    protected c2 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected h f26762e;
    protected Placement g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected a3 f26763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected JSONObject f26764i;
    protected String j;
    protected AdData k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Long f26765l;
    protected ib m;
    private final m5 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final vq f26767p;
    private AtomicBoolean f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private uu f26766n = new uu(TimeUnit.SECONDS.toMillis(s()));
    protected final Object q = new Object();

    public class a extends ks {
        public a() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            s7.this.L();
        }
    }

    public class b extends ks {
        public b() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            s7.this.K();
        }
    }

    public class c extends ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f26770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26771b;

        public c(int i2, String str) {
            this.f26770a = i2;
            this.f26771b = str;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            s7.this.a(this.f26770a, this.f26771b);
        }
    }

    public class d extends ks {
        public d() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            s7.this.I();
        }
    }

    public class e extends ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdapterErrorType f26774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26776c;

        public e(AdapterErrorType adapterErrorType, int i2, String str) {
            this.f26774a = adapterErrorType;
            this.f26775b = i2;
            this.f26776c = str;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            s7.this.a(this.f26774a, this.f26775b, this.f26776c);
        }
    }

    public class f extends ks {
        public f() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            s7.this.J();
        }
    }

    public class g extends ks {
        public g() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            s7.this.H();
        }
    }

    public enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s7(vq vqVar, k1 k1Var, BaseAdAdapter<?, ?> baseAdAdapter, a3 a3Var, m5 m5Var, Listener listener) {
        this.f26759a = k1Var;
        this.f26760b = listener;
        this.d = new c2(k1Var.a(), c2.b.PROVIDER, this);
        this.f26763h = a3Var;
        this.f26764i = a3Var.c();
        this.f26761c = baseAdAdapter;
        this.o = m5Var;
        this.f26767p = vqVar;
        a(h.NONE);
    }

    private boolean D() {
        return this.f26762e == h.INIT_IN_PROGRESS;
    }

    private void F() {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.f26766n.a((uu.a) this);
            G();
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("unexpected error while calling adapter.loadAd() - ", th);
            sbP.append(th.getMessage());
            sbP.append(" - state = ");
            sbP.append(this.f26762e);
            String string = sbP.toString();
            IronLog.INTERNAL.error(a(string));
            c2 c2Var = this.d;
            if (c2Var != null) {
                c2Var.j.g(string);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.f24488i.a(j());
        }
        this.f26760b.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean zO;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        uu uuVar = this.f26766n;
        if (uuVar != null) {
            uuVar.e();
        }
        synchronized (this.q) {
            try {
                h hVar = this.f26762e;
                zO = false;
                if (hVar == h.LOADING) {
                    long jA = ib.a(this.m);
                    ironLog.verbose(a("Load duration = " + jA));
                    if (this.d != null) {
                        if (v()) {
                            this.d.f.a(jA);
                        } else {
                            this.d.f.a(jA, false);
                        }
                    }
                    a(h.LOADED);
                    zO = O();
                } else if (hVar != h.FAILED) {
                    ironLog.error(a("unexpected load success for " + k() + ", state - " + this.f26762e));
                    h hVar2 = this.f26762e;
                    StringBuilder sb = new StringBuilder("unexpected load success, state - ");
                    sb.append(hVar2);
                    String string = sb.toString();
                    if (this.d != null) {
                        if (v()) {
                            this.d.j.s(string);
                        } else {
                            this.d.j.p(string);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zO) {
            this.f26760b.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.f24488i.g(j());
        }
        this.f26760b.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            uu uuVar = this.f26766n;
            if (uuVar != null) {
                uuVar.e();
            }
            a(h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.f26762e == h.FAILED) {
            return;
        }
        ironLog.error(a("unexpected init success for " + k() + ", state - " + this.f26762e));
        if (this.d != null) {
            this.d.j.n("unexpected init success, state - " + this.f26762e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long jA = ib.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sbV = android.support.v4.media.a.v(jA, "Load duration = ", ", state = ");
        sbV.append(this.f26762e);
        sbV.append(", isBidder = ");
        sbV.append(w());
        ironLog.verbose(a(sbV.toString()));
        synchronized (this.q) {
            try {
                if (z()) {
                    a(h.FAILED);
                    c2 c2Var = this.d;
                    if (c2Var != null) {
                        c2Var.f.a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false);
                        this.d.f.a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false);
                    }
                    this.f26760b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
                    return;
                }
                ironLog.error(a("unexpected timeout for " + k() + ", state - " + this.f26762e + ", error - 1025"));
                if (this.d != null) {
                    this.d.j.u("unexpected timeout, state - " + this.f26762e + ", error - 1025");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int o() {
        return 1;
    }

    private int s() {
        m5 m5Var = this.o;
        if (m5Var == null) {
            return this.f26759a.f();
        }
        Integer numF = m5Var.f();
        int iF = (numF == null || numF.intValue() <= 0) ? this.f26759a.f() : numF.intValue();
        IronLog.INTERNAL.verbose(a("Load timeout for " + this.o.c() + " - " + iF + " seconds"));
        return iF;
    }

    public AtomicBoolean A() {
        return this.f;
    }

    public boolean B() {
        return y();
    }

    public boolean C() {
        return this.f26762e == h.SHOWING;
    }

    public void E() {
        String str;
        int iC;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        m5 m5VarI = i();
        String strK = m5VarI.k();
        Map<String, Object> mapA = tk.a(m5VarI.a());
        mapA.put("adUnit", this.f26759a.a());
        b(strK);
        try {
            boolean z2 = false;
            if (v()) {
                this.d.f.a();
            } else {
                this.d.f.a(false);
            }
            this.f26765l = null;
            this.m = new ib();
            this.k = a(strK, mapA);
            synchronized (this.q) {
                if (this.f26762e != h.NONE) {
                    z2 = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z2) {
                str = "loadAd - incorrect state while loading, state = " + this.f26762e;
                ironLog.error(a(str));
                this.d.j.g(str);
                iC = y1.c(this.f26759a.a());
            } else {
                this.f26766n.a((uu.a) this);
                AdapterBaseInterface networkAdapter = this.f26761c.getNetworkAdapter();
                if (networkAdapter != null) {
                    networkAdapter.init(this.k, ContextProvider.getInstance().getApplicationContext(), this);
                    return;
                }
                str = "loadAd - network adapter not available " + k();
                ironLog.error(a(str));
                iC = y1.c(this.f26759a.a());
            }
            onInitFailed(iC, str);
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("loadAd - exception = ", th);
            sbP.append(th.getLocalizedMessage());
            String string = sbP.toString();
            IronLog.INTERNAL.error(a(string));
            c2 c2Var = this.d;
            if (c2Var != null) {
                c2Var.j.g(string);
            }
            onInitFailed(y1.c(this.f26759a.a()), string);
        }
    }

    public void G() {
        Object obj = this.f26761c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[Catch: all -> 0x000e, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0008, B:15:0x0052, B:17:0x0056, B:18:0x005b, B:20:0x005f, B:21:0x0064, B:12:0x0011, B:14:0x004d), top: B:27:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[Catch: all -> 0x000e, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0008, B:15:0x0052, B:17:0x0056, B:18:0x005b, B:20:0x005f, B:21:0x0064, B:12:0x0011, B:14:0x004d), top: B:27:0x0003, inners: #0 }] */
    public void M() {
        c2 c2Var;
        uu uuVar;
        synchronized (this) {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f26761c;
            if (baseAdAdapter != null) {
                try {
                    baseAdAdapter.releaseMemory();
                    this.f26761c = null;
                } catch (Exception e2) {
                    q9.d().a(e2);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.f26763h.f() + " - " + e2.getMessage() + " - state = " + this.f26762e;
                    IronLog.INTERNAL.error(a(str));
                    c2 c2Var2 = this.d;
                    if (c2Var2 != null) {
                        c2Var2.j.g(str);
                    }
                }
                c2Var = this.d;
                if (c2Var != null) {
                    c2Var.f();
                    this.d = null;
                }
                uuVar = this.f26766n;
                if (uuVar != null) {
                    uuVar.d();
                    this.f26766n = null;
                }
            } else {
                c2Var = this.d;
                if (c2Var != null) {
                    c2Var.f();
                    this.d = null;
                }
                uuVar = this.f26766n;
                if (uuVar != null) {
                    uuVar.d();
                    this.f26766n = null;
                }
            }
            throw th;
        }
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.f24488i.a();
        }
    }

    public boolean O() {
        return true;
    }

    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.ironsource.hi.b
    public int b() {
        return this.f26763h.e();
    }

    @Override // com.ironsource.hi.b
    public String c() {
        return this.f26763h.f();
    }

    public String d() {
        return a((String) null);
    }

    public Long e() {
        return this.f26765l;
    }

    public AdInfo f() {
        return new AdInfo(this.o.a(j()), this.o.d());
    }

    public IronSource.AD_UNIT g() {
        return this.f26759a.a();
    }

    public String h() {
        return this.f26759a.c();
    }

    public m5 i() {
        return this.o;
    }

    public String j() {
        Placement placement = this.g;
        return placement == null ? "" : placement.getPlacementName();
    }

    public String k() {
        return androidx.datastore.preferences.protobuf.a.m(c(), " ", hashCode());
    }

    public int l() {
        return this.f26763h.d();
    }

    public String m() {
        return this.f26763h.h().isMultipleInstances() ? this.f26763h.h().getProviderTypeForReflection() : this.f26763h.f();
    }

    public String n() {
        return this.f26763h.g();
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.f26767p.c()) {
            this.f26767p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i2, String str) {
        if (this.f26767p.c()) {
            this.f26767p.a(new e(adapterErrorType, i2, str));
        } else {
            a(adapterErrorType, i2, str);
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.f26767p.c()) {
            this.f26767p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.f26767p.c()) {
            this.f26767p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i2, String str) {
        if (this.f26767p.c()) {
            this.f26767p.a(new c(i2, str));
        } else {
            a(i2, str);
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.f26767p.c()) {
            this.f26767p.a(new b());
        } else {
            K();
        }
    }

    public NetworkSettings p() {
        return this.f26759a.g();
    }

    public Map<String, Object> q() {
        HashMap map = new HashMap();
        map.putAll(tk.a(this.f26764i));
        return map;
    }

    public Integer r() {
        k1 k1Var = this.f26759a;
        if (k1Var != null) {
            return Integer.valueOf(k1Var.h());
        }
        return null;
    }

    public h t() {
        return this.f26762e;
    }

    public vq u() {
        return this.f26767p;
    }

    public boolean v() {
        return false;
    }

    public boolean w() {
        return this.f26763h.j();
    }

    public boolean x() {
        return this.f26762e == h.FAILED;
    }

    public boolean y() {
        return this.f26762e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.f26762e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    public String a(String str) {
        String str2 = this.f26759a.a().name() + " - " + k() + " - state = " + this.f26762e;
        return TextUtils.isEmpty(str) ? str2 : android.support.v4.media.a.D(str2, " - ", str);
    }

    public void b(String str) {
        this.j = com.p004ironsource.mediationsdk.d.b().c(str);
    }

    private boolean b(z1 z1Var) {
        return new ArrayList(Arrays.asList(z1.LOAD_AD, z1.LOAD_AD_SUCCESS, z1.LOAD_AD_FAILED, z1.LOAD_AD_FAILED_WITH_REASON, z1.LOAD_AD_NO_FILL, z1.RELOAD_AD, z1.RELOAD_AD_SUCCESS, z1.RELOAD_AD_FAILED_WITH_REASON, z1.RELOAD_AD_NO_FILL, z1.DESTROY_AD, z1.AD_PRESENT_SCREEN, z1.AD_DISMISS_SCREEN, z1.AD_LEFT_APPLICATION, z1.AD_OPENED, z1.AD_CLOSED, z1.SHOW_AD, z1.SHOW_AD_FAILED, z1.AD_CLICKED, z1.AD_REWARDED)).contains(z1Var);
    }

    public Map<String, Object> a(z1 z1Var) {
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f26761c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.f26761c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e2) {
            StringBuilder sbO = com.google.firebase.crashlytics.internal.model.a.o(e2, "could not get adapter version for event data");
            sbO.append(k());
            IronLog.INTERNAL.error(a(sbO.toString()));
        }
        map.put("spId", this.f26763h.i());
        map.put(IronSourceConstants.EVENTS_PROVIDER, this.f26763h.a());
        map.put("instanceType", Integer.valueOf(l()));
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.j)) {
            map.put("dynamicDemandSource", this.j);
        }
        map.put("sessionDepth", r());
        if (this.f26759a.e() != null && this.f26759a.e().length() > 0) {
            map.put("genericParams", this.f26759a.e());
        }
        if (!TextUtils.isEmpty(this.f26759a.c())) {
            map.put("auctionId", this.f26759a.c());
        }
        if (b(z1Var)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f26759a.d()));
            if (!TextUtils.isEmpty(this.f26759a.b())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f26759a.b());
            }
        }
        if (!TextUtils.isEmpty(this.f26759a.g().getCustomNetwork())) {
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f26759a.g().getCustomNetwork());
        }
        return map;
    }

    public Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.f26759a.i());
        return map;
    }

    @Override // com.ironsource.uu.a
    public void a() {
        if (this.f26767p.c()) {
            this.f26767p.a(new a());
        } else {
            L();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i2 + ", " + str));
        if (D()) {
            uu uuVar = this.f26766n;
            if (uuVar != null) {
                uuVar.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i2, str, ib.a(this.m));
            this.f26760b.a(new IronSourceError(i2, str), this);
            return;
        }
        if (this.f26762e == h.FAILED) {
            return;
        }
        ironLog.error(a("unexpected init failed for " + k() + ", state - " + this.f26762e + ", error - " + i2 + ", " + str));
        if (this.d != null) {
            this.d.j.m("unexpected init failed, state - " + this.f26762e + ", error - " + i2 + ", " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdapterErrorType adapterErrorType, int i2, String str) {
        long jA = ib.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", error = " + i2 + ", " + str));
        uu uuVar = this.f26766n;
        if (uuVar != null) {
            uuVar.e();
        }
        synchronized (this.q) {
            h hVar = this.f26762e;
            if (hVar == h.LOADING) {
                a(adapterErrorType, i2, str, jA);
                a(h.FAILED);
                this.f26760b.a(new IronSourceError(i2, str), this);
                return;
            }
            if (hVar == h.FAILED) {
                a(adapterErrorType, i2, str, jA);
            } else if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.f26765l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(a("ad expired for " + this.f26763h.f() + ", state = " + this.f26762e));
                c2 c2Var = this.d;
                if (c2Var != null) {
                    c2Var.j.a("ad expired, state = " + this.f26762e);
                }
            } else {
                ironLog.error(a("unexpected load failed for " + k() + ", state - " + this.f26762e + ", error - " + i2 + ", " + str));
                h hVar2 = this.f26762e;
                StringBuilder sb = new StringBuilder("unexpected load failed, state - ");
                sb.append(hVar2);
                sb.append(", error - ");
                sb.append(i2);
                sb.append(", ");
                sb.append(str);
                String string = sb.toString();
                if (this.d != null) {
                    if (v()) {
                        this.d.j.r(string);
                    } else if (this.f26759a.a() != IronSource.AD_UNIT.REWARDED_VIDEO || this.f26762e != h.SHOWING) {
                        this.d.j.o(string);
                    }
                }
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i2, String str, long j) {
        if (this.d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.d.f.b(j, i2);
                    return;
                } else {
                    this.d.f.a(j, i2);
                    return;
                }
            }
            if (TextUtils.isEmpty(str)) {
                this.d.f.a(j, i2, false);
            } else if (v()) {
                this.d.f.a(j, i2, str);
            } else {
                this.d.f.a(j, i2, str, false);
            }
        }
    }

    public void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.f26762e = hVar;
    }

    public void a(boolean z2) {
        this.f.set(z2);
    }
}

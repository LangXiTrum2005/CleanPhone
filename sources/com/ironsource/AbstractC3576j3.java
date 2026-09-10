package com.ironsource;

import android.text.TextUtils;
import com.ironsource.R0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3576j3<Listener extends R0> implements NetworkInitializationListener, C3660nf.a, E0, AdapterAdListener, J8.b {
    protected C3645n0 a;
    protected Listener b;
    protected BaseAdAdapter<?, AdapterAdListener> c;
    protected F0 d;
    protected h e;
    protected C3461cd g;
    protected C3485e1 h;
    protected JSONObject i;
    protected String j;
    protected AdData k;
    protected Long l;
    protected C3507f5 m;
    private final C3700q2 o;
    private final InterfaceC3640md p;
    private AtomicBoolean f = new AtomicBoolean(false);
    private C3660nf n = new C3660nf(TimeUnit.SECONDS.toMillis(s()));
    protected final Object q = new Object();

    /* JADX INFO: renamed from: com.ironsource.j3$a */
    public class a extends Xd {
        public a() {
        }

        @Override // com.ironsource.Xd
        public void a() {
            AbstractC3576j3.this.L();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$b */
    public class b extends Xd {
        public b() {
        }

        @Override // com.ironsource.Xd
        public void a() throws Throwable {
            AbstractC3576j3.this.K();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$c */
    public class c extends Xd {
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        public c(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // com.ironsource.Xd
        public void a() {
            AbstractC3576j3.this.a(this.b, this.c);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$d */
    public class d extends Xd {
        public d() {
        }

        @Override // com.ironsource.Xd
        public void a() {
            AbstractC3576j3.this.I();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$e */
    public class e extends Xd {
        final /* synthetic */ AdapterErrorType b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;

        public e(AdapterErrorType adapterErrorType, int i, String str) {
            this.b = adapterErrorType;
            this.c = i;
            this.d = str;
        }

        @Override // com.ironsource.Xd
        public void a() throws Throwable {
            AbstractC3576j3.this.a(this.b, this.c, this.d);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$f */
    public class f extends Xd {
        public f() {
        }

        @Override // com.ironsource.Xd
        public void a() {
            AbstractC3576j3.this.J();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$g */
    public class g extends Xd {
        public g() {
        }

        @Override // com.ironsource.Xd
        public void a() {
            AbstractC3576j3.this.H();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$h */
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
    public AbstractC3576j3(InterfaceC3640md interfaceC3640md, C3645n0 c3645n0, BaseAdAdapter<?, ?> baseAdAdapter, C3485e1 c3485e1, C3700q2 c3700q2, Listener listener) {
        this.a = c3645n0;
        this.b = listener;
        this.d = new F0(c3645n0.a(), F0.b.PROVIDER, this);
        this.h = c3485e1;
        this.i = c3485e1.c();
        this.c = baseAdAdapter;
        this.o = c3700q2;
        this.p = interfaceC3640md;
        a(h.NONE);
    }

    private boolean D() {
        return this.e == h.INIT_IN_PROGRESS;
    }

    private void F() throws Throwable {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.n.a((C3660nf.a) this);
            G();
        } catch (Throwable th) {
            C3631m4.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            F0 f0 = this.d;
            if (f0 != null) {
                f0.j.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        F0 f0 = this.d;
        if (f0 != null) {
            f0.i.a(j());
        }
        this.b.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean zO;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C3660nf c3660nf = this.n;
        if (c3660nf != null) {
            c3660nf.e();
        }
        synchronized (this.q) {
            try {
                h hVar = this.e;
                zO = false;
                if (hVar == h.LOADING) {
                    long jA = C3507f5.a(this.m);
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
                    ironLog.error(a(String.format("unexpected load success for %s, state - %s", k(), this.e)));
                    String str = String.format("unexpected load success, state - %s", this.e);
                    if (this.d != null) {
                        if (v()) {
                            this.d.j.s(str);
                        } else {
                            this.d.j.p(str);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zO) {
            this.b.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        F0 f0 = this.d;
        if (f0 != null) {
            f0.i.g(j());
        }
        this.b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() throws Throwable {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            C3660nf c3660nf = this.n;
            if (c3660nf != null) {
                c3660nf.e();
            }
            a(h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init success for %s, state - %s", k(), this.e)));
        if (this.d != null) {
            this.d.j.n(String.format("unexpected init success, state - %s", this.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        Integer numValueOf = Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT);
        long jA = C3507f5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", state = " + this.e + ", isBidder = " + w()));
        synchronized (this.q) {
            try {
                if (!z()) {
                    ironLog.error(a(String.format("unexpected timeout for %s, state - %s, error - %s", k(), this.e, numValueOf)));
                    if (this.d != null) {
                        this.d.j.u(String.format("unexpected timeout, state - %s, error - %s", this.e, numValueOf));
                    }
                    return;
                }
                a(h.FAILED);
                F0 f0 = this.d;
                if (f0 != null) {
                    f0.f.a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false);
                    this.d.f.a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false);
                }
                this.b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int o() {
        return 1;
    }

    private int s() {
        C3700q2 c3700q2 = this.o;
        if (c3700q2 == null) {
            return this.a.f();
        }
        Integer numF = c3700q2.f();
        int iF = (numF == null || numF.intValue() <= 0) ? this.a.f() : numF.intValue();
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
        return this.e == h.SHOWING;
    }

    public void E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C3700q2 c3700q2I = i();
        String strK = c3700q2I.k();
        Map<String, Object> mapA = C3512fa.a(c3700q2I.a());
        mapA.put("adUnit", this.a.a());
        b(strK);
        try {
            boolean z = false;
            if (v()) {
                this.d.f.a();
            } else {
                this.d.f.a(false);
            }
            this.l = null;
            this.m = new C3507f5();
            this.k = a(strK, mapA);
            synchronized (this.q) {
                if (this.e != h.NONE) {
                    z = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                String str = "loadAd - incorrect state while loading, state = " + this.e;
                ironLog.error(a(str));
                this.d.j.g(str);
                onInitFailed(B0.c(this.a.a()), str);
                return;
            }
            this.n.a((C3660nf.a) this);
            AdapterBaseInterface networkAdapter = this.c.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(B0.c(this.a.a()), str2);
        } catch (Throwable th) {
            C3631m4.d().a(th);
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            F0 f0 = this.d;
            if (f0 != null) {
                f0.j.g(str3);
            }
            onInitFailed(B0.c(this.a.a()), str3);
        }
    }

    public void G() {
        Object obj = this.c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[Catch: all -> 0x0009, TryCatch #1 {, blocks: (B:3:0x0001, B:6:0x0006, B:14:0x0054, B:16:0x0058, B:17:0x005d, B:19:0x0061, B:20:0x0066, B:11:0x000c, B:13:0x004d), top: B:26:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[Catch: all -> 0x0009, TryCatch #1 {, blocks: (B:3:0x0001, B:6:0x0006, B:14:0x0054, B:16:0x0058, B:17:0x005d, B:19:0x0061, B:20:0x0066, B:11:0x000c, B:13:0x004d), top: B:26:0x0001, inners: #0 }] */
    public void M() {
        F0 f0;
        C3660nf c3660nf;
        synchronized (this) {
            if (this.c != null) {
                try {
                    this.c = null;
                } catch (Exception e2) {
                    C3631m4.d().a(e2);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.h.f() + " - " + e2.getMessage() + " - state = " + this.e;
                    IronLog.INTERNAL.error(a(str));
                    if (this.d != null) {
                        this.d.j.g(str);
                    }
                }
                f0 = this.d;
                if (f0 != null) {
                    f0.f();
                    this.d = null;
                }
                c3660nf = this.n;
                if (c3660nf != null) {
                    c3660nf.d();
                    this.n = null;
                }
            } else {
                f0 = this.d;
                if (f0 != null) {
                    f0.f();
                    this.d = null;
                }
                c3660nf = this.n;
                if (c3660nf != null) {
                    c3660nf.d();
                    this.n = null;
                }
            }
            throw th;
        }
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        F0 f0 = this.d;
        if (f0 != null) {
            f0.i.a();
        }
    }

    public boolean O() {
        return true;
    }

    public Map<String, Object> a(C0 c0) {
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e2) {
            C3631m4.d().a(e2);
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        map.put("spId", this.h.i());
        map.put(IronSourceConstants.EVENTS_PROVIDER, this.h.a());
        map.put("instanceType", Integer.valueOf(l()));
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.j)) {
            map.put("dynamicDemandSource", this.j);
        }
        map.put("sessionDepth", r());
        if (this.a.e() != null && this.a.e().length() > 0) {
            map.put("genericParams", this.a.e());
        }
        if (!TextUtils.isEmpty(this.a.c())) {
            map.put("auctionId", this.a.c());
        }
        if (b(c0)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.a.d()));
            if (!TextUtils.isEmpty(this.a.b())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.a.b());
            }
        }
        if (!TextUtils.isEmpty(this.a.g().getCustomNetwork())) {
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.a.g().getCustomNetwork());
        }
        return map;
    }

    public void b(String str) {
        this.j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.J8.b
    public String c() {
        return this.h.f();
    }

    public String d() {
        return a((String) null);
    }

    public Long e() {
        return this.l;
    }

    public AdInfo f() {
        return new AdInfo(this.o.a(j()), this.o.d());
    }

    public IronSource.a g() {
        return this.a.a();
    }

    public String h() {
        return this.a.c();
    }

    public C3700q2 i() {
        return this.o;
    }

    public String j() {
        C3461cd c3461cd = this.g;
        return c3461cd == null ? "" : c3461cd.c();
    }

    public String k() {
        return String.format("%s %s", c(), Integer.valueOf(hashCode()));
    }

    public int l() {
        return this.h.d();
    }

    public String m() {
        return this.h.h().isMultipleInstances() ? this.h.h().getProviderTypeForReflection() : this.h.f();
    }

    public String n() {
        return this.h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.p.c()) {
            this.p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str) throws Throwable {
        if (this.p.c()) {
            this.p.a(new e(adapterErrorType, i, str));
        } else {
            a(adapterErrorType, i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.p.c()) {
            this.p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.p.c()) {
            this.p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, String str) {
        if (this.p.c()) {
            this.p.a(new c(i, str));
        } else {
            a(i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() throws Throwable {
        if (this.p.c()) {
            this.p.a(new b());
        } else {
            K();
        }
    }

    public NetworkSettings p() {
        return this.a.g();
    }

    public Map<String, Object> q() {
        HashMap map = new HashMap();
        map.putAll(C3512fa.a(this.i));
        return map;
    }

    public Integer r() {
        C3645n0 c3645n0 = this.a;
        if (c3645n0 != null) {
            return Integer.valueOf(c3645n0.h());
        }
        return null;
    }

    public h t() {
        return this.e;
    }

    public InterfaceC3640md u() {
        return this.p;
    }

    public boolean v() {
        return false;
    }

    public boolean w() {
        return this.h.j();
    }

    public boolean x() {
        return this.e == h.FAILED;
    }

    public boolean y() {
        return this.e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    @Override // com.ironsource.J8.b
    public int b() {
        return this.h.e();
    }

    private boolean b(C0 c0) {
        return new ArrayList(Arrays.asList(C0.LOAD_AD, C0.LOAD_AD_SUCCESS, C0.LOAD_AD_FAILED, C0.LOAD_AD_FAILED_WITH_REASON, C0.LOAD_AD_NO_FILL, C0.RELOAD_AD, C0.RELOAD_AD_SUCCESS, C0.RELOAD_AD_FAILED_WITH_REASON, C0.RELOAD_AD_NO_FILL, C0.DESTROY_AD, C0.AD_PRESENT_SCREEN, C0.AD_DISMISS_SCREEN, C0.AD_LEFT_APPLICATION, C0.AD_OPENED, C0.AD_CLOSED, C0.SHOW_AD, C0.SHOW_AD_FAILED, C0.AD_CLICKED, C0.AD_REWARDED)).contains(c0);
    }

    public void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.e = hVar;
    }

    public void a(boolean z) {
        this.f.set(z);
    }

    public Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.a.i());
        return map;
    }

    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    public String a(String str) {
        String str2 = this.a.a().name() + " - " + k() + " - state = " + this.e;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    @Override // com.ironsource.C3660nf.a
    public void a() {
        if (!this.p.c()) {
            L();
        } else {
            this.p.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i + ", " + str));
        if (D()) {
            C3660nf c3660nf = this.n;
            if (c3660nf != null) {
                c3660nf.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C3507f5.a(this.m));
            this.b.a(new IronSourceError(i, str), this);
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init failed for %s, state - %s, error - %s, %s", k(), this.e, Integer.valueOf(i), str)));
        if (this.d != null) {
            this.d.j.m(String.format("unexpected init failed, state - %s, error - %s, %s", this.e, Integer.valueOf(i), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdapterErrorType adapterErrorType, int i, String str) throws Throwable {
        long jA = C3507f5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", error = " + i + ", " + str));
        C3660nf c3660nf = this.n;
        if (c3660nf != null) {
            c3660nf.e();
        }
        synchronized (this.q) {
            try {
                try {
                    h hVar = this.e;
                    if (hVar == h.LOADING) {
                        a(adapterErrorType, i, str, jA);
                        a(h.FAILED);
                        this.b.a(new IronSourceError(i, str), this);
                        return;
                    }
                    if (hVar == h.FAILED) {
                        a(adapterErrorType, i, str, jA);
                        return;
                    }
                    if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                        this.l = Long.valueOf(System.currentTimeMillis());
                        ironLog.error(a(String.format("ad expired for %s, state = %s", this.h.f(), this.e)));
                        F0 f0 = this.d;
                        if (f0 != null) {
                            f0.j.a(String.format("ad expired, state = %s", this.e));
                        }
                        return;
                    }
                    ironLog.error(a(String.format("unexpected load failed for %s, state - %s, error - %s, %s", k(), this.e, Integer.valueOf(i), str)));
                    String str2 = String.format("unexpected load failed, state - %s, error - %s, %s", this.e, Integer.valueOf(i), str);
                    if (this.d != null) {
                        if (v()) {
                            this.d.j.r(str2);
                        } else if (this.a.a() != IronSource.a.REWARDED_VIDEO || this.e != h.SHOWING) {
                            this.d.j.o(str2);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (this.d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.d.f.b(j, i);
                    return;
                } else {
                    this.d.f.a(j, i);
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (v()) {
                    this.d.f.a(j, i, str);
                    return;
                } else {
                    this.d.f.a(j, i, str, false);
                    return;
                }
            }
            this.d.f.a(j, i, false);
        }
    }
}

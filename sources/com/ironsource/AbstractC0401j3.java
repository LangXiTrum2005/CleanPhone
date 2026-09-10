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
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0401j3<Listener extends R0> implements NetworkInitializationListener, Af.a, E0, AdapterAdListener, L8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected C0470n0 f28928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Listener f28929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected BaseAdAdapter<?, AdapterAdListener> f28930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected F0 f28931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected h f28932e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected C0358gd f28934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected C0310e1 f28935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected JSONObject f28936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f28937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected AdData f28938k;
    protected Long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected C0350g5 f28939m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C0526q2 f28941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC0537qd f28942p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f28933f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Af f28940n = new Af(TimeUnit.SECONDS.toMillis(s()));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final Object f28943q = new Object();

    /* JADX INFO: renamed from: com.ironsource.j3$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends AbstractRunnableC0430ke {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            AbstractC0401j3.this.L();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends AbstractRunnableC0430ke {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            AbstractC0401j3.this.K();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends AbstractRunnableC0430ke {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28947c;

        public c(int i10, String str) {
            this.f28946b = i10;
            this.f28947c = str;
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            AbstractC0401j3.this.a(this.f28946b, this.f28947c);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends AbstractRunnableC0430ke {
        public d() {
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            AbstractC0401j3.this.I();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$e */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e extends AbstractRunnableC0430ke {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdapterErrorType f28950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28952d;

        public e(AdapterErrorType adapterErrorType, int i10, String str) {
            this.f28950b = adapterErrorType;
            this.f28951c = i10;
            this.f28952d = str;
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            AbstractC0401j3.this.a(this.f28950b, this.f28951c, this.f28952d);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$f */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f extends AbstractRunnableC0430ke {
        public f() {
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            AbstractC0401j3.this.J();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$g */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g extends AbstractRunnableC0430ke {
        public g() {
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            AbstractC0401j3.this.H();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$h */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
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
    public AbstractC0401j3(InterfaceC0537qd interfaceC0537qd, C0470n0 c0470n0, BaseAdAdapter<?, ?> baseAdAdapter, C0310e1 c0310e1, C0526q2 c0526q2, Listener listener) {
        this.f28928a = c0470n0;
        this.f28929b = listener;
        this.f28931d = new F0(c0470n0.a(), F0.b.PROVIDER, this);
        this.f28935h = c0310e1;
        this.f28936i = c0310e1.c();
        this.f28930c = baseAdAdapter;
        this.f28941o = c0526q2;
        this.f28942p = interfaceC0537qd;
        a(h.NONE);
    }

    private boolean D() {
        return this.f28932e == h.INIT_IN_PROGRESS;
    }

    private void F() {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.f28940n.a((Af.a) this);
            G();
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String str = "unexpected error while calling adapter.loadAd() - " + th2.getMessage() + " - state = " + this.f28932e;
            IronLog.INTERNAL.error(a(str));
            F0 f10 = this.f28931d;
            if (f10 != null) {
                f10.f26035j.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        F0 f10 = this.f28931d;
        if (f10 != null) {
            f10.f26034i.a(j());
        }
        this.f28929b.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean zO;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        Af af2 = this.f28940n;
        if (af2 != null) {
            af2.e();
        }
        synchronized (this.f28943q) {
            try {
                h hVar = this.f28932e;
                zO = false;
                if (hVar == h.LOADING) {
                    long jA = C0350g5.a(this.f28939m);
                    ironLog.verbose(a("Load duration = " + jA));
                    if (this.f28931d != null) {
                        if (v()) {
                            this.f28931d.f26031f.a(jA);
                        } else {
                            this.f28931d.f26031f.a(jA, false);
                        }
                    }
                    a(h.LOADED);
                    zO = O();
                } else if (hVar != h.FAILED) {
                    ironLog.error(a("unexpected load success for " + k() + ", state - " + this.f28932e));
                    h hVar2 = this.f28932e;
                    StringBuilder sb2 = new StringBuilder("unexpected load success, state - ");
                    sb2.append(hVar2);
                    String string = sb2.toString();
                    if (this.f28931d != null) {
                        if (v()) {
                            this.f28931d.f26035j.s(string);
                        } else {
                            this.f28931d.f26035j.p(string);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zO) {
            this.f28929b.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        F0 f10 = this.f28931d;
        if (f10 != null) {
            f10.f26034i.g(j());
        }
        this.f28929b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            Af af2 = this.f28940n;
            if (af2 != null) {
                af2.e();
            }
            a(h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.f28932e == h.FAILED) {
            return;
        }
        ironLog.error(a("unexpected init success for " + k() + ", state - " + this.f28932e));
        if (this.f28931d != null) {
            this.f28931d.f26035j.n("unexpected init success, state - " + this.f28932e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long jA = C0350g5.a(this.f28939m);
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sbL = wi.d.l(jA, "Load duration = ", ", state = ");
        sbL.append(this.f28932e);
        sbL.append(", isBidder = ");
        sbL.append(w());
        ironLog.verbose(a(sbL.toString()));
        synchronized (this.f28943q) {
            try {
                if (z()) {
                    a(h.FAILED);
                    F0 f10 = this.f28931d;
                    if (f10 != null) {
                        f10.f26031f.a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false);
                        this.f28931d.f26031f.a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false);
                    }
                    this.f28929b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
                    return;
                }
                ironLog.error(a("unexpected timeout for " + k() + ", state - " + this.f28932e + ", error - 1025"));
                if (this.f28931d != null) {
                    this.f28931d.f26035j.u("unexpected timeout, state - " + this.f28932e + ", error - 1025");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private int o() {
        return 1;
    }

    private int s() {
        C0526q2 c0526q2 = this.f28941o;
        if (c0526q2 == null) {
            return this.f28928a.f();
        }
        Integer numF = c0526q2.f();
        int iF = (numF == null || numF.intValue() <= 0) ? this.f28928a.f() : numF.intValue();
        IronLog.INTERNAL.verbose(a("Load timeout for " + this.f28941o.c() + " - " + iF + " seconds"));
        return iF;
    }

    public AtomicBoolean A() {
        return this.f28933f;
    }

    public boolean B() {
        return y();
    }

    public boolean C() {
        return this.f28932e == h.SHOWING;
    }

    public void E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C0526q2 c0526q2I = i();
        String strK = c0526q2I.k();
        Map<String, Object> mapA = C0391ia.a(c0526q2I.a());
        mapA.put("adUnit", this.f28928a.a());
        b(strK);
        try {
            boolean z10 = false;
            if (v()) {
                this.f28931d.f26031f.d();
            } else {
                this.f28931d.f26031f.a(false);
            }
            this.l = null;
            this.f28939m = new C0350g5();
            this.f28938k = a(strK, mapA);
            synchronized (this.f28943q) {
                if (this.f28932e != h.NONE) {
                    z10 = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z10) {
                String str = "loadAd - incorrect state while loading, state = " + this.f28932e;
                ironLog.error(a(str));
                this.f28931d.f26035j.g(str);
                onInitFailed(B0.c(this.f28928a.a()), str);
                return;
            }
            this.f28940n.a((Af.a) this);
            AdapterBaseInterface networkAdapter = this.f28930c.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f28938k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(B0.c(this.f28928a.a()), str2);
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String str3 = "loadAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            F0 f10 = this.f28931d;
            if (f10 != null) {
                f10.f26035j.g(str3);
            }
            onInitFailed(B0.c(this.f28928a.a()), str3);
        }
    }

    public void G() {
        Object obj = this.f28930c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.f28938k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[Catch: all -> 0x000b, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0008, B:15:0x0051, B:17:0x0055, B:18:0x005a, B:20:0x005e, B:21:0x0063, B:12:0x000e, B:14:0x004a), top: B:27:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x005e A[Catch: all -> 0x000b, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0008, B:15:0x0051, B:17:0x0055, B:18:0x005a, B:20:0x005e, B:21:0x0063, B:12:0x000e, B:14:0x004a), top: B:27:0x0003, inners: #0 }] */
    public void M() {
        F0 f10;
        Af af2;
        synchronized (this) {
            if (this.f28930c != null) {
                try {
                    this.f28930c = null;
                } catch (Exception e10) {
                    C0474n4.d().a(e10);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.f28935h.f() + " - " + e10.getMessage() + " - state = " + this.f28932e;
                    IronLog.INTERNAL.error(a(str));
                    if (this.f28931d != null) {
                        this.f28931d.f26035j.g(str);
                    }
                }
                f10 = this.f28931d;
                if (f10 != null) {
                    f10.f();
                    this.f28931d = null;
                }
                af2 = this.f28940n;
                if (af2 != null) {
                    af2.d();
                    this.f28940n = null;
                }
            } else {
                f10 = this.f28931d;
                if (f10 != null) {
                    f10.f();
                    this.f28931d = null;
                }
                af2 = this.f28940n;
                if (af2 != null) {
                    af2.d();
                    this.f28940n = null;
                }
            }
            throw th;
        }
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        F0 f10 = this.f28931d;
        if (f10 != null) {
            f10.f26034i.a();
        }
    }

    public boolean O() {
        return true;
    }

    public String h() {
        return this.f28928a.c();
    }

    public C0526q2 i() {
        return this.f28941o;
    }

    public String j() {
        C0358gd c0358gd = this.f28934g;
        return c0358gd == null ? "" : c0358gd.c();
    }

    public String k() {
        return c() + " " + hashCode();
    }

    public int l() {
        return this.f28935h.d();
    }

    public String m() {
        return this.f28935h.h().isMultipleInstances() ? this.f28935h.h().getProviderTypeForReflection() : this.f28935h.f();
    }

    public String n() {
        return this.f28935h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.f28942p.c()) {
            this.f28942p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str) {
        if (this.f28942p.c()) {
            this.f28942p.a(new e(adapterErrorType, i10, str));
        } else {
            a(adapterErrorType, i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.f28942p.c()) {
            this.f28942p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.f28942p.c()) {
            this.f28942p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i10, String str) {
        if (this.f28942p.c()) {
            this.f28942p.a(new c(i10, str));
        } else {
            a(i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.f28942p.c()) {
            this.f28942p.a(new b());
        } else {
            K();
        }
    }

    public NetworkSettings p() {
        return this.f28928a.g();
    }

    public Map<String, Object> q() {
        HashMap map = new HashMap();
        map.putAll(C0391ia.a(this.f28936i));
        return map;
    }

    public Integer r() {
        C0470n0 c0470n0 = this.f28928a;
        if (c0470n0 != null) {
            return Integer.valueOf(c0470n0.h());
        }
        return null;
    }

    public h t() {
        return this.f28932e;
    }

    public InterfaceC0537qd u() {
        return this.f28942p;
    }

    public boolean v() {
        return false;
    }

    public boolean w() {
        return this.f28935h.j();
    }

    public boolean x() {
        return this.f28932e == h.FAILED;
    }

    public boolean y() {
        return this.f28932e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.f28932e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    public Map<String, Object> a(C0 c4) {
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f28930c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.f28930c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        map.put("spId", this.f28935h.i());
        map.put(IronSourceConstants.EVENTS_PROVIDER, this.f28935h.a());
        map.put("instanceType", Integer.valueOf(l()));
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.f28937j)) {
            map.put("dynamicDemandSource", this.f28937j);
        }
        map.put("sessionDepth", r());
        if (this.f28928a.e() != null && this.f28928a.e().length() > 0) {
            map.put("genericParams", this.f28928a.e());
        }
        if (!TextUtils.isEmpty(this.f28928a.c())) {
            map.put("auctionId", this.f28928a.c());
        }
        if (b(c4)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f28928a.d()));
            if (!TextUtils.isEmpty(this.f28928a.b())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f28928a.b());
            }
        }
        if (!TextUtils.isEmpty(this.f28928a.g().getCustomNetwork())) {
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f28928a.g().getCustomNetwork());
        }
        return map;
    }

    public void b(String str) {
        this.f28937j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.L8.b
    public String c() {
        return this.f28935h.f();
    }

    public String d() {
        return a((String) null);
    }

    public Long e() {
        return this.l;
    }

    public AdInfo f() {
        return new AdInfo(this.f28941o.a(j()), this.f28941o.d());
    }

    public IronSource.a g() {
        return this.f28928a.a();
    }

    @Override // com.ironsource.L8.b
    public int b() {
        return this.f28935h.e();
    }

    private boolean b(C0 c4) {
        return new ArrayList(Arrays.asList(C0.LOAD_AD, C0.LOAD_AD_SUCCESS, C0.LOAD_AD_FAILED, C0.LOAD_AD_FAILED_WITH_REASON, C0.LOAD_AD_NO_FILL, C0.RELOAD_AD, C0.RELOAD_AD_SUCCESS, C0.RELOAD_AD_FAILED_WITH_REASON, C0.RELOAD_AD_NO_FILL, C0.DESTROY_AD, C0.AD_PRESENT_SCREEN, C0.AD_DISMISS_SCREEN, C0.AD_LEFT_APPLICATION, C0.AD_OPENED, C0.AD_CLOSED, C0.SHOW_AD, C0.SHOW_AD_FAILED, C0.AD_CLICKED, C0.AD_REWARDED)).contains(c4);
    }

    public void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.f28932e = hVar;
    }

    public void a(boolean z10) {
        this.f28933f.set(z10);
    }

    public Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.f28928a.i());
        return map;
    }

    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    public String a(String str) {
        String str2 = this.f28928a.a().name() + " - " + k() + " - state = " + this.f28932e;
        return TextUtils.isEmpty(str) ? str2 : wi.d.i(str2, " - ", str);
    }

    @Override // com.ironsource.Af.a
    public void a() {
        if (!this.f28942p.c()) {
            L();
        } else {
            this.f28942p.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        if (D()) {
            Af af2 = this.f28940n;
            if (af2 != null) {
                af2.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i10, str, C0350g5.a(this.f28939m));
            this.f28929b.a(new IronSourceError(i10, str), this);
            return;
        }
        if (this.f28932e == h.FAILED) {
            return;
        }
        ironLog.error(a("unexpected init failed for " + k() + ", state - " + this.f28932e + ", error - " + i10 + ", " + str));
        if (this.f28931d != null) {
            this.f28931d.f26035j.m("unexpected init failed, state - " + this.f28932e + ", error - " + i10 + ", " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdapterErrorType adapterErrorType, int i10, String str) {
        long jA = C0350g5.a(this.f28939m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", error = " + i10 + ", " + str));
        Af af2 = this.f28940n;
        if (af2 != null) {
            af2.e();
        }
        synchronized (this.f28943q) {
            h hVar = this.f28932e;
            if (hVar == h.LOADING) {
                a(adapterErrorType, i10, str, jA);
                a(h.FAILED);
                this.f28929b.a(new IronSourceError(i10, str), this);
                return;
            }
            if (hVar == h.FAILED) {
                a(adapterErrorType, i10, str, jA);
                return;
            }
            if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(a("ad expired for " + this.f28935h.f() + ", state = " + this.f28932e));
                F0 f10 = this.f28931d;
                if (f10 != null) {
                    f10.f26035j.a("ad expired, state = " + this.f28932e);
                }
                return;
            }
            ironLog.error(a("unexpected load failed for " + k() + ", state - " + this.f28932e + ", error - " + i10 + ", " + str));
            h hVar2 = this.f28932e;
            StringBuilder sb2 = new StringBuilder("unexpected load failed, state - ");
            sb2.append(hVar2);
            sb2.append(", error - ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(str);
            String string = sb2.toString();
            if (this.f28931d != null) {
                if (v()) {
                    this.f28931d.f26035j.r(string);
                } else if (this.f28928a.a() != IronSource.a.REWARDED_VIDEO || this.f28932e != h.SHOWING) {
                    this.f28931d.f26035j.o(string);
                }
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        if (this.f28931d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.f28931d.f26031f.a(j10, i10);
                    return;
                } else {
                    this.f28931d.f26031f.b(j10, i10, false);
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (v()) {
                    this.f28931d.f26031f.a(j10, i10, str);
                    return;
                } else {
                    this.f28931d.f26031f.a(j10, i10, str, false);
                    return;
                }
            }
            this.f28931d.f26031f.a(j10, i10, false);
        }
    }
}

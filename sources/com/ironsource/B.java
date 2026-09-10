package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class B implements AdapterAdListener, NetworkInitializationListener {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final /* synthetic */ qk.w[] f25656y = {kotlin.jvm.internal.d0.f44761a.e(new kotlin.jvm.internal.r(B.class, "listener", "getListener()Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/AdInstanceListener;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V0 f25657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f25658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I f25659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ff f25660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mk.b f25661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private G f25662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final BaseAdAdapter<?, ?> f25663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C0350g5 f25664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Ff.a f25665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, Object> f25666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25667k;
    private boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f25668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AdData f25670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C0526q2 f25671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f25672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f25673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f25674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f25675t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final IronSource.a f25676u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f25677v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final J f25678w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f25679x;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends AbstractRunnableC0430ke {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            long jA = C0350g5.a(B.this.f25664h);
            IronLog ironLog = IronLog.INTERNAL;
            B b10 = B.this;
            ironLog.verbose(b10.a("Load duration = " + jA + ", isBidder = " + b10.v()));
            B.this.f25669n = true;
            B.this.f().d().e().a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false, B.this.A());
            B.this.f().d().e().a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false, B.this.A());
            B b11 = B.this;
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            kotlin.jvm.internal.n.e(ironSourceErrorBuildLoadFailedError, "buildLoadFailedError(errorMessage)");
            b11.a(ironSourceErrorBuildLoadFailedError);
        }
    }

    public B(V0 adTools, C instanceData, I adInstancePayload, Ff taskScheduler, F f10) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.n.f(taskScheduler, "taskScheduler");
        this.f25657a = adTools;
        this.f25658b = instanceData;
        this.f25659c = adInstancePayload;
        this.f25660d = taskScheduler;
        this.f25661e = C0298d7.a(f10);
        this.f25666j = new LinkedHashMap();
        this.f25670o = instanceData.h();
        this.f25671p = instanceData.q();
        this.f25672q = instanceData.k().j();
        this.f25673r = instanceData.s();
        this.f25674s = instanceData.t();
        this.f25675t = instanceData.x();
        this.f25676u = instanceData.i();
        this.f25677v = instanceData.w();
        this.f25678w = instanceData.u();
        this.f25679x = instanceData.y();
        BaseAdAdapter<?, ?> baseAdAdapterA = a(instanceData);
        this.f25663g = baseAdAdapterA;
        adTools.d().a(new D(adTools, instanceData, baseAdAdapterA));
        adTools.d().a(new W1(instanceData.l()));
    }

    private final void D() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        try {
            I();
            C();
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String strN = defpackage.e.n("unexpected error while calling adapter.loadAd() - ", th2.getMessage());
            IronLog.INTERNAL.error(a(strN));
            this.f25657a.d().h().g(strN);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, strN);
        }
    }

    private final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.f25657a.d().a().a(k());
        F fS = s();
        if (fS != null) {
            fS.a(this);
        }
    }

    private final void F() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        J();
        this.f25667k = false;
        if (this.f25669n) {
            c();
            this.f25657a.d().h().f("instance load success after it was already failed");
            return;
        }
        if (this.l) {
            this.f25657a.d().h().f("instance load success after it was already loaded");
            return;
        }
        this.l = true;
        long jA = C0350g5.a(this.f25664h);
        ironLog.verbose(a("Load duration = " + jA));
        this.f25657a.d().e().a(jA, false, this.f25679x);
        a(C0541r0.a.LoadedSuccessfully);
        G g10 = this.f25662f;
        if (g10 != null) {
            g10.b(this);
        } else {
            kotlin.jvm.internal.n.l("loadListener");
            throw null;
        }
    }

    private final void G() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.f25668m) {
            this.f25657a.d().h().f("instance opened after it was already opened");
            return;
        }
        this.f25668m = true;
        this.f25657a.d().a().g(k());
        a(C0541r0.a.ShowedSuccessfully);
        F fS = s();
        if (fS != null) {
            fS.b(this);
        }
    }

    private final void H() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        J();
        if (this.f25669n) {
            return;
        }
        D();
    }

    private final void I() {
        J();
        Ff ff = this.f25660d;
        a aVarA = a();
        int i10 = bn.a.f5743d;
        this.f25665i = ff.a(aVarA, d0.c.O(o(), bn.c.SECONDS));
    }

    private final void J() {
        Ff.a aVar = this.f25665i;
        if (aVar != null) {
            aVar.a();
        }
        this.f25665i = null;
    }

    private final int o() {
        Integer numF = h().f();
        return (numF == null || numF.intValue() <= 0) ? this.f25658b.j().h() : numF.intValue();
    }

    public final boolean A() {
        return this.f25679x;
    }

    public boolean B() {
        return this.l;
    }

    public abstract void C();

    public abstract void a(K k8);

    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        J();
        this.f25657a.d().e().a(this.f25677v);
    }

    public final C0358gd j() {
        return this.f25658b.j().b().f();
    }

    public final String k() {
        return this.f25658b.j().l();
    }

    public final Map<String, Object> l() {
        return this.f25666j;
    }

    public final C0526q2 m() {
        return this.f25671p;
    }

    public final C n() {
        return this.f25658b;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new lh(this, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String errorMessage) {
        kotlin.jvm.internal.n.f(adapterErrorType, "adapterErrorType");
        kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
        a(new com.applovin.impl.sdk.c0(this, adapterErrorType, i10, errorMessage));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        onAdLoadSuccess(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String errorMessage) {
        kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
        a(new nh(this, i10, errorMessage, 1));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i10, String str) {
        a(new nh(this, i10, str, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        a(new lh(this, 1));
    }

    public final String p() {
        return this.f25673r;
    }

    public final String q() {
        return this.f25675t;
    }

    public final int r() {
        return this.f25674s;
    }

    public final F s() {
        return (F) this.f25661e.getValue(this, f25656y[0]);
    }

    public final J t() {
        return this.f25678w;
    }

    public final int u() {
        return this.f25677v;
    }

    public final boolean v() {
        return this.f25672q;
    }

    public final boolean w() {
        return this.f25669n;
    }

    public final boolean x() {
        return this.l;
    }

    public final boolean y() {
        return this.f25667k;
    }

    public final boolean z() {
        return this.f25668m;
    }

    public void c() {
    }

    public final IronSource.a d() {
        return this.f25676u;
    }

    public LevelPlayAdInfo e() {
        String string = this.f25658b.j().b().b().toString();
        kotlin.jvm.internal.n.e(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = this.f25658b.j().b().c();
        String string2 = this.f25658b.i().toString();
        kotlin.jvm.internal.n.e(string2, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, h(), null, this.f25658b.j().l(), xj.b0.X(this.f25666j));
    }

    public final V0 f() {
        return this.f25657a;
    }

    public final BaseAdAdapter<?, ?> g() {
        return this.f25663g;
    }

    public final C0526q2 h() {
        return this.f25658b.o();
    }

    public final AdData i() {
        return this.f25670o;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess(Map<String, Object> extraData) {
        kotlin.jvm.internal.n.f(extraData, "extraData");
        a(new mh(this, extraData, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(Map<String, Object> extraData) {
        kotlin.jvm.internal.n.f(extraData, "extraData");
        a(new mh(this, extraData, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.H();
    }

    private final void b(int i10, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i10 + ", " + str));
        J();
        this.f25669n = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i10, str, C0350g5.a(this.f25664h));
        a(new IronSourceError(i10, str));
    }

    public final void a(F f10) {
        this.f25661e.setValue(this, f25656y[0], f10);
    }

    public final void a(C0526q2 value) {
        kotlin.jvm.internal.n.f(value, "value");
        this.f25658b.a(value);
    }

    public final void a(C0541r0.a performance) {
        kotlin.jvm.internal.n.f(performance, "performance");
        this.f25658b.a(performance);
    }

    public final void a(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        this.f25657a.c(callback);
    }

    public final void a(boolean z10) {
        this.f25657a.d().a().a(z10);
    }

    private final BaseAdAdapter<?, ?> a(C c4) {
        if (c4.j().e().q()) {
            return this.f25659c.b();
        }
        return this.f25657a.a(c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0, Map extraData) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(extraData, "$extraData");
        this$0.f25666j.putAll(extraData);
        this$0.G();
    }

    public final void a(G listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        this.f25662f = listener;
        this.f25667k = true;
        try {
            this.f25657a.d().e().a(false, this.f25679x);
            this.f25664h = new C0350g5();
            I();
            BaseAdAdapter<?, ?> baseAdAdapter = this.f25663g;
            kotlin.jvm.internal.n.c(baseAdAdapter);
            AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f25658b.h(), ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str = "loadAd - network adapter not available " + this.f25675t;
            ironLog.error(a(str));
            b(B0.c(this.f25658b.i()), str);
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String strN = defpackage.e.n("loadAd - exception = ", th2.getLocalizedMessage());
            IronLog.INTERNAL.error(a(strN));
            this.f25657a.d().h().g(strN);
            b(B0.c(this.f25658b.i()), strN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0, int i10, String str) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.b(i10, str);
    }

    public /* synthetic */ B(V0 v4, C c4, I i10, Ff ff, F f10, int i11, kotlin.jvm.internal.g gVar) {
        this(v4, c4, i10, (i11 & 8) != 0 ? new Ef(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : ff, (i11 & 16) != 0 ? null : f10);
    }

    public static /* synthetic */ String a(B b10, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return b10.a(str);
    }

    public final String a(String str) {
        return this.f25657a.a(str, this.f25675t);
    }

    private final a a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(IronSourceError ironSourceError) {
        a(C0541r0.a.FailedToLoad);
        G g10 = this.f25662f;
        if (g10 != null) {
            g10.a(ironSourceError, this);
        } else {
            kotlin.jvm.internal.n.l("loadListener");
            throw null;
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int i10, String str) {
        long jA = C0350g5.a(this.f25664h);
        IronLog.INTERNAL.verbose(a("Load duration = " + jA + ", error = " + i10 + ", " + str));
        J();
        this.f25667k = false;
        if (this.f25669n) {
            c();
            a(adapterErrorType, i10, str, jA);
        } else {
            if (this.l) {
                a(adapterErrorType);
                return;
            }
            this.f25669n = true;
            c();
            a(adapterErrorType, i10, str, jA);
            a(new IronSourceError(i10, str));
        }
    }

    public final void a(int i10, String errorMessage) {
        kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
        IronLog.INTERNAL.verbose(a("Show error = " + i10 + ", " + errorMessage));
        this.f25669n = true;
        this.f25657a.d().a().a(k(), i10, errorMessage, null);
        a(C0541r0.a.FailedToShow);
        F fS = s();
        if (fS != null) {
            fS.a(this, new IronSourceError(i10, errorMessage));
        }
        c();
    }

    private final void a(AdapterErrorType adapterErrorType) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
            this.f25657a.d().h().a("");
        } else {
            this.f25657a.d().h().f("instance load failed after it was already loaded");
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.f25657a.d().e().b(j10, i10, this.f25679x);
        } else if (str != null && str.length() != 0) {
            this.f25657a.d().e().a(j10, i10, str, false, this.f25679x);
        } else {
            this.f25657a.d().e().a(j10, i10, false, this.f25679x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B this$0, Map extraData) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(extraData, "$extraData");
        this$0.f25666j.putAll(extraData);
        this$0.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B this$0, AdapterErrorType adapterErrorType, int i10, String errorMessage) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adapterErrorType, "$adapterErrorType");
        kotlin.jvm.internal.n.f(errorMessage, "$errorMessage");
        this$0.a(adapterErrorType, i10, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B this$0, int i10, String errorMessage) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(errorMessage, "$errorMessage");
        this$0.a(i10, errorMessage);
    }
}

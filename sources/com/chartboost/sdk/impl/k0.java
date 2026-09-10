package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.k0;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements n0, u9, h9, t9, l0, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f14301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f14302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a8 f14303c;
    public final dj d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f9 f14304e;
    public final o0 f;
    public final gd g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z9 f14305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ye f14306i;
    public final qc j;
    public final mg k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Mediation f14307l;
    public final CoroutineScope m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z6 f14308n;
    public final EndpointRepository o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m0 f14309p;
    public r2 q;
    public final Map r;
    public final c s;

    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f14311c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewGroup viewGroup, Continuation continuation) {
            super(2, continuation);
            this.f14311c = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f14311c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14310b;
            if (i2 == 0) {
                ResultKt.b(obj);
                this.f14310b = 1;
                if (DelayKt.a(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            this.f14311c.removeAllViews();
            this.f14311c.invalidate();
            return Unit.f43263a;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r2 f14313c;
        public final /* synthetic */ k0 d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l1 f14314e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r2 r2Var, k0 k0Var, l1 l1Var, Continuation continuation) {
            super(2, continuation);
            this.f14313c = r2Var;
            this.d = k0Var;
            this.f14314e = l1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f14313c, this.d, this.f14314e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f14312b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            r2 r2Var = this.f14313c;
            Unit unit2 = Unit.f43263a;
            if (r2Var != null) {
                r2Var.J();
                unit = unit2;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.d.d(this.f14314e, CBError.Impression.PENDING_IMPRESSION_ERROR);
            }
            return unit2;
        }
    }

    public static final class c implements dk {
        public c() {
        }

        @Override // com.chartboost.sdk.impl.dk
        public void a() {
            r2 r2Var = k0.this.q;
            if (r2Var != null) {
                r2Var.b(CBError.Impression.WEB_VIEW_PAGE_LOAD_TIMEOUT);
            }
        }
    }

    public k0(y adType, a3 reachability, a8 fileCache, dj videoRepository, f9 impressionBuilder, o0 adUnitRendererShowRequest, gd openMeasurementController, z9 viewProtocolBuilder, ye rendererActivityBridge, qc nativeBridgeCommand, mg templateLoader, Mediation mediation, CoroutineScope uiScope, z6 eventTracker, EndpointRepository endpointRepository) {
        Intrinsics.f(adType, "adType");
        Intrinsics.f(reachability, "reachability");
        Intrinsics.f(fileCache, "fileCache");
        Intrinsics.f(videoRepository, "videoRepository");
        Intrinsics.f(impressionBuilder, "impressionBuilder");
        Intrinsics.f(adUnitRendererShowRequest, "adUnitRendererShowRequest");
        Intrinsics.f(openMeasurementController, "openMeasurementController");
        Intrinsics.f(viewProtocolBuilder, "viewProtocolBuilder");
        Intrinsics.f(rendererActivityBridge, "rendererActivityBridge");
        Intrinsics.f(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.f(templateLoader, "templateLoader");
        Intrinsics.f(uiScope, "uiScope");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(endpointRepository, "endpointRepository");
        this.f14301a = adType;
        this.f14302b = reachability;
        this.f14303c = fileCache;
        this.d = videoRepository;
        this.f14304e = impressionBuilder;
        this.f = adUnitRendererShowRequest;
        this.g = openMeasurementController;
        this.f14305h = viewProtocolBuilder;
        this.f14306i = rendererActivityBridge;
        this.j = nativeBridgeCommand;
        this.k = templateLoader;
        this.f14307l = mediation;
        this.m = uiScope;
        this.f14308n = eventTracker;
        this.o = endpointRepository;
        this.r = new LinkedHashMap();
        this.s = new c();
    }

    @Override // com.chartboost.sdk.impl.t9
    public void A() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.z();
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public String B() {
        String strW;
        r2 r2Var = this.q;
        return (r2Var == null || (strW = r2Var.w()) == null) ? "" : strW;
    }

    @Override // com.chartboost.sdk.impl.t9
    public String C() {
        String strV;
        r2 r2Var = this.q;
        return (r2Var == null || (strV = r2Var.v()) == null) ? "" : strV;
    }

    @Override // com.chartboost.sdk.impl.h9
    public void D() {
        r2 r2Var = this.q;
        if ((r2Var != null ? r2Var.q() : null) != w9.DISPLAYED || Intrinsics.a(this.f14301a, y.a.g)) {
            return;
        }
        this.f14306i.finishActivity();
    }

    public final void E() {
        try {
            r2 r2Var = this.q;
            if (r2Var != null) {
                this.g.f();
                ViewGroup viewGroupI = r2Var.i();
                if (viewGroupI != null) {
                    BuildersKt.c(this.m, null, null, new a(viewGroupI, null), 3);
                }
                r2Var.P();
                this.q = null;
                this.f14309p = null;
            }
        } catch (Exception e2) {
            za.b("detachBannerImpression error", e2);
        }
    }

    public final Mediation F() {
        return this.f14307l;
    }

    public final int G() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            return r2Var.x();
        }
        return -1;
    }

    public boolean H() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            return r2Var.e();
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.n0
    public void b(String impressionId) {
        Intrinsics.f(impressionId, "impressionId");
        a(fh.b.SUCCESS, "");
        m0 m0Var = this.f14309p;
        if (m0Var != null) {
            m0Var.b(impressionId);
        }
    }

    @Override // com.chartboost.sdk.impl.u9
    public void c() {
        za.a("DISMISS_MISSING event was successfully removed upon dismiss callback", (Throwable) null, 2, (Object) null);
        clearFromStorage((ch) new u6(fh.i.DISMISS_MISSING, "", "", "", null, 16, null));
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.c();
        }
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f14308n.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14308n.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.h9
    public void d() {
        Unit unit;
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.E();
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("Missing impression on impression click success callback ", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.l0
    public void e() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.O();
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void f() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.D();
        }
    }

    @Override // com.chartboost.sdk.impl.u9
    public void g() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.m();
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public String h() {
        String strU;
        r2 r2Var = this.q;
        return (r2Var == null || (strU = r2Var.u()) == null) ? "" : strU;
    }

    @Override // com.chartboost.sdk.impl.t9
    public void i() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.A();
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public String j() {
        String strP;
        r2 r2Var = this.q;
        return (r2Var == null || (strP = r2Var.p()) == null) ? "" : strP;
    }

    @Override // com.chartboost.sdk.impl.t9
    public void k() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.H();
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void l() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.M();
        }
    }

    @Override // com.chartboost.sdk.impl.n0
    public void m() {
        this.f14306i.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.u9
    public void n() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.P();
        }
        this.q = null;
        this.f14309p = null;
    }

    @Override // com.chartboost.sdk.impl.n0
    public void o() {
        Unit unit;
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.b(w9.LOADED);
            if (r2Var.L()) {
                r2Var.a(r2Var.i());
            } else {
                this.f14306i.a(this);
            }
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.b("Cannot display missing impression onImpressionReadyToBeDisplayed", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.l0
    public void p() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.onStart();
        }
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14308n.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.t9
    public void q() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.F();
        }
    }

    @Override // com.chartboost.sdk.impl.l0
    public void r() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.onResume();
        }
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f14308n.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.t9
    public String s() {
        String strS;
        r2 r2Var = this.q;
        return (r2Var == null || (strS = r2Var.s()) == null) ? "" : strS;
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f14308n.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.t9
    public void t() {
        this.f14306i.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14308n.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.t9
    public void u() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.G();
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void v() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.I();
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public String w() {
        String strT;
        r2 r2Var = this.q;
        return (r2Var == null || (strT = r2Var.t()) == null) ? "" : strT;
    }

    @Override // com.chartboost.sdk.impl.l0
    public void x() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.k();
        }
        this.j.a((j8) null);
        this.j.a();
    }

    @Override // com.chartboost.sdk.impl.l0
    public void y() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.b();
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void z() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.n();
        }
    }

    private final void e(l1 l1Var) {
        l1Var.b(false);
        l1Var.a((z) null);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f14308n.mo185clearFromStorage(event);
    }

    public final void f(String str) {
        if (Intrinsics.a(this.f14301a, y.a.g)) {
            return;
        }
        persist((ch) new da(fh.i.DISMISS_MISSING, "dismiss_missing due to ad not finished", this.f14301a.b(), str, this.f14307l, null, 32, null));
    }

    public final void g(String str) {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.a(true);
        }
        m0 m0Var = this.f14309p;
        if (m0Var != null) {
            m0Var.c(str);
        }
        this.g.i();
        l1 l1Var = (l1) TypeIntrinsics.b(this.r).remove(str);
        if (l1Var != null) {
            m0 m0Var2 = this.f14309p;
            if (m0Var2 != null) {
                m0Var2.e(str);
            }
            d(l1Var);
        }
    }

    public final void h(l1 l1Var) {
        if (l1Var.e()) {
            return;
        }
        l1Var.b(true);
        track((ch) new da(fh.i.START, "", this.f14301a.b(), l1Var.d(), null, null, 48, null));
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f14308n.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f14308n.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f14308n.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f14308n.mo189track(event);
    }

    @Override // com.chartboost.sdk.impl.n0
    public void a(int i2, boolean z2) {
        this.f14306i.a(i2, z2);
    }

    public final void d(l1 l1Var) {
        o0 o0Var = this.f;
        URL endPointUrl = this.o.getEndPointUrl(this.f14301a.d());
        z zVarA = l1Var.a();
        o0Var.a(endPointUrl, new yf(zVarA != null ? zVarA.a() : null, l1Var.d(), G(), this.f14301a.b(), this.f14307l));
    }

    @Override // com.chartboost.sdk.impl.h9
    public void a(String str, CBError.Click error) {
        Unit unit;
        Intrinsics.f(error, "error");
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.a(str, error);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("Missing impression on impression click failure callback ", (Throwable) null, 2, (Object) null);
        }
    }

    public final void b(l1 l1Var, CBError.Impression impression) {
        d(l1Var, impression);
        if (impression != CBError.Impression.IMPRESSION_ALREADY_VISIBLE) {
            e(l1Var);
        }
        this.g.g();
    }

    @Override // com.chartboost.sdk.impl.t9
    public void e(String event) {
        Intrinsics.f(event, "event");
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.a(event);
        }
    }

    private final String c(l1 l1Var) {
        z zVarA;
        if (l1Var == null || (zVarA = l1Var.a()) == null) {
            return null;
        }
        return zVarA.m();
    }

    @Override // com.chartboost.sdk.impl.l0
    public void a(CBError.Impression error) {
        Intrinsics.f(error, "error");
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.a(error);
        }
    }

    @Override // com.chartboost.sdk.impl.n0
    public void b(l1 appRequest) {
        Unit unit;
        Intrinsics.f(appRequest, "appRequest");
        c(true);
        String strC = c(appRequest);
        if (strC != null) {
            this.r.put(strC, appRequest);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.b("Unable to store app request because impression ID is missing. Impression tracking will not work.", (Throwable) null, 2, (Object) null);
        }
        f(appRequest.d());
        if (H()) {
            g(strC);
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void c(f3 url) {
        Intrinsics.f(url, "url");
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.b(url);
        }
    }

    public final void g(final l1 l1Var) {
        String strC;
        String strB;
        z zVarA = l1Var.a();
        if (zVarA != null && zVarA.D()) {
            dj djVar = this.d;
            z zVarA2 = l1Var.a();
            String str = "";
            if (zVarA2 == null || (strC = zVarA2.C()) == null) {
                strC = "";
            }
            z zVarA3 = l1Var.a();
            if (zVarA3 != null && (strB = zVarA3.B()) != null) {
                str = strB;
            }
            djVar.a(strC, str, true, new p0() { // from class: p.g
                @Override // com.chartboost.sdk.impl.p0
                public final void a(String str2) {
                    k0.a(this.f45284a, l1Var, str2);
                }
            });
            return;
        }
        f(l1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // com.chartboost.sdk.impl.l0
    public void a(CBImpressionActivity activity) {
        Unit unit;
        Intrinsics.f(activity, "activity");
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.a(r2Var.q(), activity);
            ij ijVarY = r2Var.y();
            if (ijVarY != null) {
                this.f14306i.a(ijVarY);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            za.b("Cannot display missing impression onActivityIsReadyToDisplay", (Throwable) null, 2, (Object) null);
        }
    }

    public final void f(l1 l1Var) {
        if (this.q != null && l1Var.b() == null) {
            za.b("Fullscreen impression is currently loading.", (Throwable) null, 2, (Object) null);
            return;
        }
        if (!this.f14302b.e()) {
            c(l1Var, CBError.Impression.INTERNET_UNAVAILABLE_AT_SHOW);
            return;
        }
        m0 m0Var = this.f14309p;
        if (m0Var != null) {
            m0Var.d(c(l1Var));
        }
        f9 f9Var = this.f14304e;
        a0 a0VarB = l1Var.b();
        s9 s9VarA = f9Var.a(l1Var, this, a0VarB != null ? a0VarB.b() : null, this, this, this.f14305h, this, this.s, this.j, this.k);
        this.q = s9VarA.b();
        a(l1Var, s9VarA.b(), s9VarA.a());
    }

    private final void c(l1 l1Var, CBError.Impression impression) {
        Unit unit;
        m0 m0Var = this.f14309p;
        if (m0Var != null) {
            m0Var.a(c(l1Var), impression);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("Missing AdUnitRendererAdCallback while sending onShowFailure with error: " + impression, (Throwable) null, 2, (Object) null);
        }
    }

    public void c(boolean z2) {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.b(z2);
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void d(f3 url) {
        Intrinsics.f(url, "url");
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.c(url);
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void c(String msg) {
        Intrinsics.f(msg, "msg");
        za.b("WebView warning occurred closing the webview ".concat(msg), (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.t9
    public CBError.Impression d(String str) {
        return t9.a.a(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(l1 l1Var, CBError.Impression impression) {
        c(l1Var, impression);
        if (impression == CBError.Impression.NO_AD_FOUND) {
            return;
        }
        String strB = this.f14301a.b();
        z zVarA = l1Var.a();
        String strA = zVarA != null ? zVarA.a() : null;
        String strD = l1Var.d();
        StringBuilder sb = new StringBuilder("reportError: adTypeTraits: ");
        sb.append(strB);
        sb.append(" reason: cache  format: web error: ");
        sb.append(impression);
        sb.append(" adId: ");
        za.b(android.support.v4.media.a.s(sb, strA, " appRequest.location: ", strD), (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.n0
    public void a(String impressionId, String str, CBError.Click error) {
        Intrinsics.f(impressionId, "impressionId");
        Intrinsics.f(error, "error");
        a(fh.b.FAILURE, error.name());
        m0 m0Var = this.f14309p;
        if (m0Var != null) {
            m0Var.a(impressionId, str, error);
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void b(f3 cbUrl) {
        Intrinsics.f(cbUrl, "cbUrl");
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.d(cbUrl);
        }
    }

    @Override // com.chartboost.sdk.impl.n0
    public void a(l1 appRequest) {
        Intrinsics.f(appRequest, "appRequest");
        e(appRequest);
        this.g.g();
    }

    @Override // com.chartboost.sdk.impl.h9
    public void b(boolean z2) {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.f(z2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k0(y yVar, a3 a3Var, a8 a8Var, dj djVar, f9 f9Var, o0 o0Var, gd gdVar, z9 z9Var, ye yeVar, qc qcVar, mg mgVar, Mediation mediation, CoroutineScope coroutineScope, z6 z6Var, EndpointRepository endpointRepository, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        CoroutineScope coroutineScopeA;
        if ((i2 & 4096) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineScopeA = CoroutineScopeKt.a(MainDispatcherLoader.f45042a);
        } else {
            coroutineScopeA = coroutineScope;
        }
        this(yVar, a3Var, a8Var, djVar, f9Var, o0Var, gdVar, z9Var, yeVar, qcVar, mgVar, mediation, coroutineScopeA, z6Var, endpointRepository);
    }

    @Override // com.chartboost.sdk.impl.t9
    public void b(float f) {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.a(f);
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void b() {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.N();
        }
    }

    @Override // com.chartboost.sdk.impl.n0
    public void a(String str) {
        m0 m0Var = this.f14309p;
        if (m0Var != null) {
            m0Var.a(str);
        }
        this.g.g();
    }

    @Override // com.chartboost.sdk.impl.n0
    public void a(l1 appRequest, CBError.Impression error) {
        Intrinsics.f(appRequest, "appRequest");
        Intrinsics.f(error, "error");
        b(appRequest, error);
        track((ch) new h5(fh.i.UNEXPECTED_DISMISS_ERROR, "", this.f14301a.b(), appRequest.d(), this.f14307l, null, 32, null));
        this.f14306i.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.n0
    public void a(String str, int i2) {
        m0 m0Var = this.f14309p;
        if (m0Var != null) {
            m0Var.a(str, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    @Override // com.chartboost.sdk.impl.n0
    public void a(Context context) {
        Unit unit;
        Intrinsics.f(context, "context");
        r2 r2Var = this.q;
        if (r2Var == null) {
            unit = null;
        } else if (!this.g.h()) {
            r2Var.c(true);
            za.a("Cannot create visibility tracker due to the OM SDK being disabled!", (Throwable) null, 2, (Object) null);
            return;
        } else {
            if (r2Var.C()) {
                za.b("Cannot create VisibilityTracker due to missing view!", (Throwable) null, 2, (Object) null);
                return;
            }
            ij ijVarY = r2Var.y();
            if (ijVarY != null) {
                gd gdVar = this.g;
                View rootView = ijVarY.getRootView();
                Intrinsics.e(rootView, "getRootView(...)");
                gdVar.a(context, ijVarY, rootView, new p008p.b(1, this, r2Var));
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
        }
        if (unit == null) {
            za.b("Missing impression onImpressionViewCreated", (Throwable) null, 2, (Object) null);
        }
    }

    public static final void a(k0 this$0, r2 it) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(it, "$it");
        this$0.a(it);
    }

    @Override // com.chartboost.sdk.impl.t9
    public void a(f3 url) {
        Intrinsics.f(url, "url");
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.a(url);
        }
    }

    public final void a(r2 r2Var) {
        za.b("Visibility check success!", (Throwable) null, 2, (Object) null);
        r2Var.c(true);
        if (!r2Var.h() || r2Var.f()) {
            return;
        }
        g(r2Var.o());
    }

    @Override // com.chartboost.sdk.impl.t9
    public void a(List verificationScriptResourceList, Integer num) {
        Intrinsics.f(verificationScriptResourceList, "verificationScriptResourceList");
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.a(verificationScriptResourceList, num);
        }
    }

    public final void a(l1 appRequest, m0 callback) {
        Intrinsics.f(appRequest, "appRequest");
        Intrinsics.f(callback, "callback");
        this.f14309p = callback;
        if (!this.f14302b.e()) {
            c(appRequest, CBError.Impression.INTERNET_UNAVAILABLE_AT_SHOW);
            return;
        }
        z zVarA = appRequest.a();
        if (zVarA == null) {
            d(appRequest, CBError.Impression.NO_AD_FOUND);
        } else if (!this.f14303c.a(zVarA).booleanValue()) {
            d(appRequest, CBError.Impression.ASSET_MISSING);
        } else {
            h(appRequest);
            g(appRequest);
        }
    }

    @Override // com.chartboost.sdk.impl.n0
    public void a() {
        this.f14306i.a();
    }

    @Override // com.chartboost.sdk.impl.t9
    public void a(float f, float f2) {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.a(f, f2);
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void a(mi vastVideoEvent) {
        Intrinsics.f(vastVideoEvent, "vastVideoEvent");
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.a(vastVideoEvent);
        }
    }

    @Override // com.chartboost.sdk.impl.h9
    public void a(boolean z2) {
        r2 r2Var = this.q;
        if (r2Var == null) {
            return;
        }
        r2Var.e(z2);
    }

    @Override // com.chartboost.sdk.impl.u9
    public void a(w9 state) {
        Intrinsics.f(state, "state");
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.b(state);
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void a(boolean z2, String forceOrientation) {
        Intrinsics.f(forceOrientation, "forceOrientation");
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.a(z2, forceOrientation);
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void a(float f) {
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.b(f);
        }
    }

    public final void a(l1 l1Var, r2 r2Var, CBError.Impression impression) {
        if (impression != null) {
            d(l1Var, impression);
            e(l1Var);
        } else {
            BuildersKt.c(this.m, null, null, new b(r2Var, this, l1Var, null), 3);
        }
    }

    public static final void a(k0 this$0, l1 appRequest, String it) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(appRequest, "$appRequest");
        Intrinsics.f(it, "it");
        this$0.f(appRequest);
    }

    public final void a(fh fhVar, String str) {
        String strR;
        String strB = this.f14301a.b();
        r2 r2Var = this.q;
        if (r2Var == null || (strR = r2Var.r()) == null) {
            strR = "No location";
        }
        track((ch) new da(fhVar, str, strB, strR, this.f14307l, null, 32, null));
    }

    @Override // com.chartboost.sdk.impl.t9
    public void a(xd playerState) {
        Intrinsics.f(playerState, "playerState");
        r2 r2Var = this.q;
        if (r2Var != null) {
            r2Var.a(playerState);
        }
    }
}

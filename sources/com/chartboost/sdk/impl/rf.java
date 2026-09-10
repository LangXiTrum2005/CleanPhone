package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.events.StartError;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class rf implements w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f15051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lh f15052c;
    public final be d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f15053e;
    public final zd f;
    public final k6 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uf f15054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final si f15055i;
    public final Lazy j;
    public final ia k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ha f15056l;
    public final a3 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final je f15057n;
    public final p2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final id f15058p;
    public final jg q;
    public boolean r;
    public boolean s;
    public final ConcurrentLinkedQueue t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15059u;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StartCallback f15060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ StartError f15061c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StartCallback startCallback, StartError startError) {
            super(0);
            this.f15060b = startCallback;
            this.f15061c = startError;
        }

        public final void a() {
            this.f15060b.onStartCompleted(this.f15061c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public rf(Context context, SharedPreferences sharedPreferences, lh uiPoster, be privacyApi, AtomicReference sdkConfig, zd prefetcher, k6 downloader, uf session, si videoCachePolicy, Lazy videoRepository, ia initInstallRequest, ha initConfigRequest, a3 reachability, je providerInstallerHelper, p2 identity, id openMeasurementManager, jg telemetryManager) {
        Intrinsics.f(context, "context");
        Intrinsics.f(sharedPreferences, "sharedPreferences");
        Intrinsics.f(uiPoster, "uiPoster");
        Intrinsics.f(privacyApi, "privacyApi");
        Intrinsics.f(sdkConfig, "sdkConfig");
        Intrinsics.f(prefetcher, "prefetcher");
        Intrinsics.f(downloader, "downloader");
        Intrinsics.f(session, "session");
        Intrinsics.f(videoCachePolicy, "videoCachePolicy");
        Intrinsics.f(videoRepository, "videoRepository");
        Intrinsics.f(initInstallRequest, "initInstallRequest");
        Intrinsics.f(initConfigRequest, "initConfigRequest");
        Intrinsics.f(reachability, "reachability");
        Intrinsics.f(providerInstallerHelper, "providerInstallerHelper");
        Intrinsics.f(identity, "identity");
        Intrinsics.f(openMeasurementManager, "openMeasurementManager");
        Intrinsics.f(telemetryManager, "telemetryManager");
        this.f15050a = context;
        this.f15051b = sharedPreferences;
        this.f15052c = uiPoster;
        this.d = privacyApi;
        this.f15053e = sdkConfig;
        this.f = prefetcher;
        this.g = downloader;
        this.f15054h = session;
        this.f15055i = videoCachePolicy;
        this.j = videoRepository;
        this.k = initInstallRequest;
        this.f15056l = initConfigRequest;
        this.m = reachability;
        this.f15057n = providerInstallerHelper;
        this.o = identity;
        this.f15058p = openMeasurementManager;
        this.q = telemetryManager;
        this.s = true;
        this.t = new ConcurrentLinkedQueue();
    }

    public final void a(StartError startError) {
        a();
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.t.poll();
            StartCallback startCallback = atomicReference != null ? (StartCallback) atomicReference.get() : null;
            if (startCallback == null) {
                this.f15059u = false;
                return;
            }
            this.f15052c.a(new a(startCallback, startError));
        }
    }

    public final void b() {
        if (this.d.a("coppa") != null || this.r) {
            return;
        }
        za.e("COPPA is not set. If this app is child directed, please use ´addDataUseConsent(android.content.Context, com.chartboost.sdk.Privacy.model.COPPA)´ to set the correct value.", null, 2, null);
    }

    public final void c() {
        this.f15058p.e();
        yh.f15659a.a(w3.f15454b.a().g());
        n();
        o();
        j();
        m();
        this.s = false;
    }

    public final boolean d() {
        String strH = h();
        return strH != null && strH.length() > 0;
    }

    public final boolean e() {
        return this.r;
    }

    public final void f() {
        if (this.f15053e.get() == null || ((qf) this.f15053e.get()).f() == null) {
            return;
        }
        String strF = ((qf) this.f15053e.get()).f();
        Intrinsics.e(strF, "getPublisherWarning(...)");
        za.e(strF, null, 2, null);
    }

    public final void g() {
        a((StartError) null);
        this.r = true;
        i();
    }

    public final String h() {
        return this.f15051b.getString(com.smartdigimkt.q0.b.i0, "");
    }

    public final void i() {
        this.f15056l.a(this);
    }

    public final void j() {
        f();
        qf qfVar = (qf) this.f15053e.get();
        if (qfVar != null) {
            this.d.a(qfVar.C);
        }
        this.k.a();
        l();
    }

    public final void k() {
        if (nf.f14544a.d()) {
            String strH = h();
            String str = JsonUtils.EMPTY_JSON;
            if (strH == null) {
                strH = JsonUtils.EMPTY_JSON;
            }
            if (strH.length() != 0) {
                str = strH;
            }
            b(new JSONObject(str));
        }
    }

    public final void l() {
        this.f.b();
    }

    public final void m() {
        if (this.r) {
            return;
        }
        a((StartError) null);
        this.r = true;
    }

    public final void n() {
        ah ahVarG = ((qf) this.f15053e.get()).g();
        if (ahVarG != null) {
            vh.f15428b.refresh(ahVarG);
        }
    }

    public final void o() {
        xi xiVarC = ((qf) this.f15053e.get()).c();
        if (xiVarC != null) {
            this.f15055i.c(xiVarC.b());
            this.f15055i.b(xiVarC.c());
            this.f15055i.c(xiVarC.d());
            this.f15055i.d(xiVarC.e());
            this.f15055i.e(xiVarC.d());
            this.f15055i.f(xiVarC.g());
            this.f15055i.a(xiVarC.a());
        }
        ((dj) this.j.getX()).a(this.f15050a);
    }

    public final StartError b(ChartboostError chartboostError) {
        StartError.Code code;
        if (chartboostError instanceof ChartboostError.Initialization.InvalidCredentials) {
            code = StartError.Code.INVALID_CREDENTIALS;
        } else if ((chartboostError instanceof ChartboostError.Connectivity.NoInternet) || (chartboostError instanceof ChartboostError.Connectivity.NetworkError)) {
            code = StartError.Code.NETWORK_FAILURE;
        } else if (chartboostError instanceof ChartboostError.Connectivity.ServerError) {
            code = StartError.Code.SERVER_ERROR;
        } else if (chartboostError instanceof ChartboostError.Initialization.Disabled) {
            code = StartError.Code.DISABLED;
        } else if (chartboostError instanceof ChartboostError.Initialization.NoContext) {
            code = StartError.Code.NO_CONTEXT;
        } else if (chartboostError instanceof ChartboostError.Initialization.InvalidConfiguration) {
            code = StartError.Code.INVALID_CONFIGURATION;
        } else if (chartboostError instanceof ChartboostError.Initialization.OsVersionNotSupported) {
            code = StartError.Code.OS_VERSION_NOT_SUPPORTED;
        } else {
            code = chartboostError instanceof ChartboostError.Initialization.PermissionsNotSet ? StartError.Code.PERMISSIONS_NOT_SET : StartError.Code.INTERNAL;
        }
        return new StartError(code, chartboostError);
    }

    public final void a(ChartboostError chartboostError) {
        c(chartboostError);
        a(b(chartboostError));
    }

    public final synchronized void a(String appId, String appSignature, StartCallback onStarted, ChartboostError chartboostError) {
        Intrinsics.f(appId, "appId");
        Intrinsics.f(appSignature, "appSignature");
        Intrinsics.f(onStarted, "onStarted");
        try {
            b7.f13489b.a();
            this.t.add(new AtomicReference(onStarted));
            if (this.f15059u) {
                za.b("Initialization already in progress", (Throwable) null, 2, (Object) null);
                return;
            }
            if (chartboostError != null) {
                a(chartboostError);
                return;
            }
            za.a("Current session count: " + this.f15054h.b(), (Throwable) null, 2, (Object) null);
            if (this.f15054h.b() > 1) {
                this.s = false;
            }
            this.f15059u = true;
            if (this.r) {
                g();
            } else {
                a(appId, appSignature);
            }
            b();
        } catch (Exception e2) {
            za.b("Cannot initialize Chartboost sdk due to internal error", e2);
            a(new ChartboostError.Initialization.Internal("Internal SDK error: " + e2.getMessage(), e2));
        }
    }

    public final void c(JSONObject jSONObject) {
        if (jSONObject == null || !j2.a(this.f15053e, jSONObject)) {
            return;
        }
        this.f15051b.edit().putString(com.smartdigimkt.q0.b.i0, jSONObject.toString()).apply();
    }

    public final void c(ChartboostError chartboostError) {
        this.q.a(new cg(null, chartboostError.getMessage(), chartboostError.getCode(), chartboostError.getConstant(), chartboostError.getCauseDescription(), null, 1, null), EmptyList.X);
    }

    public final void b(JSONObject jSONObject) {
        if (nf.f14544a.d()) {
            nf.a("Video player: " + new qf(jSONObject).c().h());
        }
    }

    @Override // com.chartboost.sdk.impl.w4
    public void a(String errorMsg) {
        ChartboostError serverError;
        Intrinsics.f(errorMsg, "errorMsg");
        if (this.m.e()) {
            serverError = new ChartboostError.Connectivity.ServerError(errorMsg, null);
        } else {
            serverError = ChartboostError.Connectivity.NoInternet.INSTANCE;
        }
        if (this.s) {
            a(serverError);
        } else {
            c();
        }
        k();
    }

    @Override // com.chartboost.sdk.impl.w4
    public void a(JSONObject configJson) {
        Intrinsics.f(configJson, "configJson");
        c(configJson);
        c();
        b(configJson);
    }

    public final void a(String str, String str2) {
        if (!j2.a(this.f15050a)) {
            a(new ChartboostError.Initialization.PermissionsNotSet("INTERNET and/or ACCESS_NETWORK_STATE permissions are not set.", null));
            return;
        }
        if (str.length() != 0 && str2.length() != 0 && str.length() == 24 && str2.length() == 40 && sf.f15138a.b(str) && sf.f15138a.b(str2)) {
            this.f15057n.a();
            this.g.b();
            if (d()) {
                g();
                return;
            } else {
                i();
                return;
            }
        }
        a(ChartboostError.Initialization.InvalidCredentials.INSTANCE);
    }

    public final void a() {
        if (nf.f14544a.d()) {
            y8 y8VarH = this.o.h();
            nf.a("SetId: " + y8VarH.d() + " scope:" + y8VarH.e() + " Tracking state: " + y8VarH.f() + " Identifiers: " + y8VarH.b());
        }
    }
}

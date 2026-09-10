package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.a4;
import com.applovin.impl.a5;
import com.applovin.impl.b3;
import com.applovin.impl.b5;
import com.applovin.impl.c5;
import com.applovin.impl.c7;
import com.applovin.impl.e4;
import com.applovin.impl.e6;
import com.applovin.impl.f1;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.g1;
import com.applovin.impl.i7;
import com.applovin.impl.j8;
import com.applovin.impl.k1;
import com.applovin.impl.k5;
import com.applovin.impl.l4;
import com.applovin.impl.m2;
import com.applovin.impl.m3;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.n3;
import com.applovin.impl.n8;
import com.applovin.impl.o7;
import com.applovin.impl.p7;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.q2;
import com.applovin.impl.q7;
import com.applovin.impl.r0;
import com.applovin.impl.r3;
import com.applovin.impl.s0;
import com.applovin.impl.s1;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u6;
import com.applovin.impl.v0;
import com.applovin.impl.v1;
import com.applovin.impl.v2;
import com.applovin.impl.v5;
import com.applovin.impl.w3;
import com.applovin.impl.x3;
import com.applovin.impl.y3;
import com.applovin.impl.y4;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class l {
    public static l E0;
    protected static Context F0;
    private static boolean G0;
    private static final boolean I0;
    private static volatile com.applovin.impl.c J0;
    private AppLovinSdk.SdkInitializationListener A0;
    private AppLovinSdk.SdkInitializationListener B0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f9478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f9480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f9482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f9486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9487h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinSdkSettings f9491j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private com.applovin.impl.mediation.e f9492j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxSegmentCollection f9493k;
    private String l;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private List f9497m0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile AppLovinSdk f9504q;
    private boolean r0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private String f9515w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private AppLovinSdkInitializationConfiguration f9517x0;
    private static final Object K0 = new Object();
    private static final long H0 = System.currentTimeMillis();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f9489i = new AtomicBoolean();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicReference f9496m = new AtomicReference();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReference f9498n = new AtomicReference();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicReference f9500o = new AtomicReference();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicReference f9502p = new AtomicReference();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p f9506r = new p(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.applovin.impl.f f9507s = new com.applovin.impl.f(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b3 f9509t = new b3(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final s1 f9510u = new s1(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final o7 f9512v = new o7(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicReference f9514w = new AtomicReference();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicReference f9516x = new AtomicReference();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicReference f9518y = new AtomicReference();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AtomicReference f9520z = new AtomicReference();
    private final AtomicReference A = new AtomicReference();
    private final AtomicReference B = new AtomicReference();
    private final AtomicReference C = new AtomicReference();
    private final AtomicReference D = new AtomicReference();
    private final AtomicReference E = new AtomicReference();
    private final AtomicReference F = new AtomicReference();
    private final AtomicReference G = new AtomicReference();
    private final AtomicReference H = new AtomicReference();
    private final AtomicReference I = new AtomicReference();
    private final AtomicReference J = new AtomicReference();
    private final AtomicReference K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();
    private final AtomicReference M = new AtomicReference();
    private final AtomicReference N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();
    private final AtomicReference P = new AtomicReference();
    private final AtomicReference Q = new AtomicReference();
    private final AtomicReference R = new AtomicReference();
    private final AtomicReference S = new AtomicReference();
    private final AtomicReference T = new AtomicReference();
    private final AtomicReference U = new AtomicReference();
    private final AtomicReference V = new AtomicReference();
    private final AtomicReference W = new AtomicReference();
    private final AtomicReference X = new AtomicReference();
    private final AtomicReference Y = new AtomicReference();
    private final AtomicReference Z = new AtomicReference();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final AtomicReference f9475a0 = new AtomicReference();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final AtomicReference f9477b0 = new AtomicReference();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final AtomicReference f9479c0 = new AtomicReference();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final AtomicReference f9481d0 = new AtomicReference();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final AtomicReference f9483e0 = new AtomicReference();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final AtomicReference f9485f0 = new AtomicReference();
    private final AtomicReference g0 = new AtomicReference();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final AtomicReference f9488h0 = new AtomicReference();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final AtomicReference f9490i0 = new AtomicReference();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final AtomicReference f9494k0 = new AtomicReference();

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final AtomicReference f9495l0 = new AtomicReference();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final Object f9499n0 = new Object();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final AtomicBoolean f9501o0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final AtomicBoolean f9503p0 = new AtomicBoolean();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final AtomicBoolean f9505q0 = new AtomicBoolean();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f9508s0 = false;
    private boolean t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f9511u0 = false;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f9513v0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final Object f9519y0 = new Object();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private SdkConfigurationImpl f9521z0 = new SdkConfigurationImpl(this);
    private final k5 C0 = new u6(this, true, "scheduleAdLoadIntegrationError", new z(0, this));
    private final k5 D0 = new u6(this, true, "sdkInit", new z(1, this));

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements v5.b {
        public a() {
        }

        @Override // com.applovin.impl.v5.b
        public void a(JSONObject jSONObject) {
            boolean zIsValid = JsonUtils.isValid(jSONObject);
            l.this.c(jSONObject);
            if (((Boolean) l.this.a(t3.f9772j8)).booleanValue()) {
                l lVar = l.this;
                lVar.f9492j0 = new com.applovin.impl.mediation.e(lVar);
            }
            l.this.n().a();
            s0.a(jSONObject, zIsValid, l.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            l.this.W().a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            l.this.E().b();
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "default_browser_package_name", StringUtils.emptyIfNull(m.J()));
            JsonUtils.putBoolean(jSONObject2, "init_success", zIsValid);
            JsonUtils.putInt(jSONObject2, "default_preferences_key_count", PreferenceManager.getDefaultSharedPreferences(l.F0).getAll().size());
            l.this.x0().d(f2.f7848f, CollectionUtils.map("details", jSONObject2.toString()));
            l lVar2 = l.this;
            lVar2.f9497m0 = lVar2.a(jSONObject);
            if (zIsValid) {
                l.this.f9521z0.setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            l.this.u0().a(jSONObject);
            l.this.b(jSONObject);
            v2.b(((Boolean) l.this.a(z4.A6)).booleanValue());
            v2.a(((Boolean) l.this.a(z4.B6)).booleanValue());
            l.this.R0();
            if (!((Boolean) l.this.a(z4.f10167i3)).booleanValue() || zIsValid || !s0.a(l.p())) {
                l.this.P0();
                return;
            }
            l.this.Q();
            if (p.a()) {
                l.this.Q().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            l.this.U0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements v0.c {
        public b() {
        }

        @Override // com.applovin.impl.v0.c
        public void a(v0.b bVar) {
            l.this.Q();
            if (p.a()) {
                l.this.Q().a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            l.this.f9505q0.set(bVar.b());
            if (!bVar.a()) {
                l.this.c("Initializing SDK in MAX environment...");
                return;
            }
            l.this.Q();
            if (p.a()) {
                l.this.Q().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            l.this.T0();
            l.this.S0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements v5.b {
        public c() {
        }

        @Override // com.applovin.impl.v5.b
        public void a(JSONObject jSONObject) {
            l.this.c(jSONObject);
            l.this.f9489i.set(false);
            l.this.P0();
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new x(0));
            I0 = true;
        } catch (Throwable unused) {
            I0 = false;
        }
    }

    public l(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.r0 = false;
        E0 = this;
        this.f9491j = appLovinSdkSettings;
        this.f9480d = System.currentTimeMillis();
        this.r0 = true;
        if (!H0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://support.axon.ai/en/max/android/overview/integration");
        }
        F0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f9478c = new WeakReference((Activity) context);
        }
    }

    private void C0() {
        Context context = F0;
        p pVarQ = Q();
        c5 c5VarR0 = r0();
        v0 v0VarY = y();
        a(context);
        o0();
        k();
        e0();
        U().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        String str = this.f9474a;
        if (str == null || str.length() != 86) {
            p.h("AppLovinSdk", "SDK key provided is invalid (" + this.f9474a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (StringUtils.isValidString(this.f9476b) && this.f9476b.length() != 36) {
            String strQ = defpackage.e.q(this.f9476b, " is invalid - expected 36", new StringBuilder("Axon event key length "));
            if (q7.c(this)) {
                throw new IllegalArgumentException(strQ);
            }
            p.h("AppLovinSdk", strQ);
        }
        if (v0VarY.l()) {
            String str2 = "Terms Flow has been replaced. " + v0VarY.g();
            if (q7.c(this)) {
                throw new IllegalStateException(str2);
            }
            p.h("AppLovinSdk", str2);
        }
        if (q7.j()) {
            p.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!q7.b(this)) {
            p.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (q7.m(context)) {
            this.f9491j.setVerboseLogging(true);
        }
        q0().a(z4.f10181k, Boolean.valueOf(this.f9491j.isVerboseLoggingEnabled()));
        y3.e(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        b5 b5Var = b5.f7545c;
        if (TextUtils.isEmpty((String) c5VarR0.a(b5Var, (Object) null, defaultSharedPreferences))) {
            this.t0 = true;
            c5VarR0.b(b5Var, Boolean.toString(true), defaultSharedPreferences);
        } else {
            c5VarR0.b(b5Var, Boolean.toString(false), defaultSharedPreferences);
        }
        b5 b5Var2 = b5.f7546d;
        if (((Boolean) c5VarR0.a(b5Var2, Boolean.FALSE)).booleanValue()) {
            if (p.a()) {
                pVarQ.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f9511u0 = true;
        } else {
            if (p.a()) {
                pVarQ.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            c5VarR0.b(b5Var2, Boolean.TRUE);
            c5VarR0.b(b5.f7561t, Boolean.valueOf(v0VarY.j()));
        }
        b5 b5Var3 = b5.f7547e;
        this.f9484f = ((Long) c5VarR0.a(b5Var3, 0L)).longValue() + 1;
        r0().b(b5Var3, Long.valueOf(this.f9484f));
        b5 b5Var4 = b5.f7548f;
        this.f9486g = (Long) c5VarR0.a(b5Var4, null);
        r0().b(b5Var4, Long.valueOf(H0));
        b5 b5Var5 = b5.f7549g;
        String str3 = (String) c5VarR0.a(b5Var5, null);
        if (StringUtils.isValidString(str3)) {
            if (AppLovinSdk.VERSION_CODE > q7.g(str3)) {
                c5VarR0.b(b5Var5, AppLovinSdk.VERSION);
            }
        } else {
            c5VarR0.b(b5Var5, AppLovinSdk.VERSION);
        }
        x0().d(f2.f7845e, CollectionUtils.map("details", "isInitProviderContextSet=" + G0));
    }

    public static boolean H0() {
        return I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        if (s0().f()) {
            return;
        }
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "Timing out adapters init...");
        }
        s0().g();
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        f6 f6VarS0 = s0();
        int i10 = this.f9513v0 + 1;
        this.f9513v0 = i10;
        f6VarS0.a((k5) new v5(i10, this, new c()), f6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0() {
        if (I0()) {
            m2.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0() {
        synchronized (this.f9499n0) {
            try {
                boolean zA = s0.a(p());
                if (!I0()) {
                    Q();
                    if (p.a()) {
                        Q().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + X());
                    }
                }
                if (!((Boolean) a(z4.f10176j3)).booleanValue() || zA) {
                    T0();
                }
                if (((Boolean) a(z4.f10167i3)).booleanValue() && !zA) {
                    Q();
                    if (p.a()) {
                        Q().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                    }
                    U0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        Long l = (Long) a(z4.r3);
        if (l.longValue() >= 0 && this.f9489i.compareAndSet(false, true)) {
            j8.a(l.longValue(), false, this, new z(3, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        if (!I0()) {
            c("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.f9503p0.compareAndSet(false, true)) {
            c("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!y().j()) {
            c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            y().a(w0(), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        a4 a4VarE0 = e0();
        a4VarE0.a(new d(a4VarE0));
    }

    private Map Y() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(z4.f10219o4)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    public static long o() {
        return H0;
    }

    public static Context p() {
        return F0;
    }

    public g1 A() {
        Object g1Var = this.U.get();
        if (g1Var == null) {
            synchronized (this.U) {
                try {
                    g1Var = this.U.get();
                    if (g1Var == null) {
                        g1Var = new g1(this);
                        this.U.set(g1Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (g1Var == this.U) {
            g1Var = null;
        }
        return (g1) g1Var;
    }

    public AppLovinSdk A0() {
        return this.f9504q;
    }

    public m B() {
        Object mVar = this.A.get();
        if (mVar == null) {
            synchronized (this.A) {
                try {
                    mVar = this.A.get();
                    if (mVar == null) {
                        mVar = new m(this);
                        this.A.set(mVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (mVar == this.A) {
            mVar = null;
        }
        return (m) mVar;
    }

    public boolean B0() {
        return this.f9511u0;
    }

    public k1 C() {
        Object k1Var = this.D.get();
        if (k1Var == null) {
            synchronized (this.D) {
                try {
                    k1Var = this.D.get();
                    if (k1Var == null) {
                        k1Var = new k1(this);
                        this.D.set(k1Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (k1Var == this.D) {
            k1Var = null;
        }
        return (k1) k1Var;
    }

    public String D() {
        return this.f9515w0;
    }

    public boolean D0() {
        boolean z10;
        synchronized (this.f9499n0) {
            z10 = this.f9508s0;
        }
        return z10;
    }

    public s1 E() {
        return this.f9510u;
    }

    public boolean E0() {
        return this.t0;
    }

    public String F() {
        return y0().d();
    }

    public boolean F0() {
        boolean z10;
        synchronized (this.f9519y0) {
            z10 = this.f9517x0 != null;
        }
        return z10;
    }

    public EventServiceImpl G() {
        Object eventServiceImpl = this.f9500o.get();
        if (eventServiceImpl == null) {
            synchronized (this.f9500o) {
                try {
                    eventServiceImpl = this.f9500o.get();
                    if (eventServiceImpl == null) {
                        eventServiceImpl = new EventServiceImpl(this);
                        this.f9500o.set(eventServiceImpl);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (eventServiceImpl == this.f9500o) {
            eventServiceImpl = null;
        }
        return (EventServiceImpl) eventServiceImpl;
    }

    public boolean G0() {
        boolean z10;
        synchronized (this.f9499n0) {
            z10 = this.r0;
        }
        return z10;
    }

    public v1 H() {
        Object v1Var = this.f9494k0.get();
        if (v1Var == null) {
            synchronized (this.f9494k0) {
                try {
                    v1Var = this.f9494k0.get();
                    if (v1Var == null) {
                        v1Var = new v1(this);
                        this.f9494k0.set(v1Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (v1Var == this.f9494k0) {
            v1Var = null;
        }
        return (v1) v1Var;
    }

    public n I() {
        Object nVar = this.G.get();
        if (nVar == null) {
            synchronized (this.G) {
                try {
                    nVar = this.G.get();
                    if (nVar == null) {
                        nVar = new n(this);
                        this.G.set(nVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (nVar == this.G) {
            nVar = null;
        }
        return (n) nVar;
    }

    public boolean I0() {
        return StringUtils.containsIgnoreCase(X(), AppLovinMediationProvider.MAX);
    }

    public o J() {
        Object oVar = this.I.get();
        if (oVar == null) {
            synchronized (this.I) {
                try {
                    oVar = this.I.get();
                    if (oVar == null) {
                        oVar = new o(this);
                        this.I.set(oVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (oVar == this.I) {
            oVar = null;
        }
        return (o) oVar;
    }

    public boolean J0() {
        return q7.a("com.unity3d.player.UnityPlayerActivity");
    }

    public Activity K() {
        WeakReference weakReference;
        if (!((Boolean) a(z4.D4)).booleanValue() || (weakReference = this.f9478c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public AppLovinSdkInitializationConfiguration L() {
        return this.f9517x0;
    }

    public long M() {
        return this.f9480d;
    }

    public Long N() {
        return this.f9486g;
    }

    public long O() {
        return this.f9484f;
    }

    public void O0() {
        b(false);
    }

    public q2 P() {
        Object q2Var = this.Y.get();
        if (q2Var == null) {
            synchronized (this.Y) {
                try {
                    q2Var = this.Y.get();
                    if (q2Var == null) {
                        q2Var = new q2(this);
                        this.Y.set(q2Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (q2Var == this.Y) {
            q2Var = null;
        }
        return (q2) q2Var;
    }

    public p Q() {
        return this.f9506r;
    }

    public void Q0() {
        if (StringUtils.isValidString(this.l)) {
            return;
        }
        this.l = AppLovinMediationProvider.MAX;
    }

    public b3 R() {
        return this.f9509t;
    }

    public com.applovin.impl.mediation.d S() {
        Object dVar = this.f9490i0.get();
        if (dVar == null) {
            synchronized (this.f9490i0) {
                try {
                    dVar = this.f9490i0.get();
                    if (dVar == null) {
                        dVar = new com.applovin.impl.mediation.d(this);
                        this.f9490i0.set(dVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (dVar == this.f9490i0) {
            dVar = null;
        }
        return (com.applovin.impl.mediation.d) dVar;
    }

    public void S0() {
        u().a();
    }

    public com.applovin.impl.mediation.e T() {
        return this.f9492j0;
    }

    public void T0() {
        synchronized (this.f9499n0) {
            this.r0 = true;
            s0().h();
            d();
        }
    }

    public com.applovin.impl.mediation.f U() {
        Object fVar = this.f9481d0.get();
        if (fVar == null) {
            synchronized (this.f9481d0) {
                try {
                    fVar = this.f9481d0.get();
                    if (fVar == null) {
                        fVar = new com.applovin.impl.mediation.f(this);
                        this.f9481d0.set(fVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (fVar == this.f9481d0) {
            fVar = null;
        }
        return (com.applovin.impl.mediation.f) fVar;
    }

    public com.applovin.impl.mediation.g V() {
        Object gVar = this.f9479c0.get();
        if (gVar == null) {
            synchronized (this.f9479c0) {
                try {
                    gVar = this.f9479c0.get();
                    if (gVar == null) {
                        gVar = new com.applovin.impl.mediation.g(this);
                        this.f9479c0.set(gVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (gVar == this.f9479c0) {
            gVar = null;
        }
        return (com.applovin.impl.mediation.g) gVar;
    }

    public void V0() {
        p.h("AppLovinSdk", "Resetting SDK state...");
        q0().a();
        q0().e();
        if (this.f9501o0.compareAndSet(true, false)) {
            T0();
        } else {
            this.f9501o0.set(true);
        }
    }

    public r3 W() {
        Object r3Var = this.g0.get();
        if (r3Var == null) {
            synchronized (this.g0) {
                try {
                    r3Var = this.g0.get();
                    if (r3Var == null) {
                        r3Var = new r3(this);
                        this.g0.set(r3Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (r3Var == this.g0) {
            r3Var = null;
        }
        return (r3) r3Var;
    }

    public void W0() {
        if (StringUtils.isValidString(this.f9515w0)) {
            return;
        }
        this.f9515w0 = AppLovinMediationProvider.MAX;
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public String X() {
        return this.l;
    }

    public void X0() {
        z().n();
    }

    public void Y0() {
        a((Map) null);
    }

    public MediationServiceImpl Z() {
        Object mediationServiceImpl = this.f9483e0.get();
        if (mediationServiceImpl == null) {
            synchronized (this.f9483e0) {
                try {
                    mediationServiceImpl = this.f9483e0.get();
                    if (mediationServiceImpl == null) {
                        mediationServiceImpl = new MediationServiceImpl(this);
                        this.f9483e0.set(mediationServiceImpl);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (mediationServiceImpl == this.f9483e0) {
            mediationServiceImpl = null;
        }
        return (MediationServiceImpl) mediationServiceImpl;
    }

    public void Z0() {
        if (AppLovinMediationProvider.ADMOB.equalsIgnoreCase(this.l) && ((Boolean) a(z4.S3)).booleanValue()) {
            String str = (String) a(z4.R3);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            String str2 = AppLovinSdk.VERSION;
            sb2.append(str2);
            sb2.append(".");
            if (str.startsWith(sb2.toString())) {
                return;
            }
            String strH = l1.d.h("Mismatched AdMob adapter (", str, ") and AppLovin SDK (", str2, ") versions detected, which may cause compatibility issues.");
            p.h("AppLovinSdk", strH);
            AppLovinSdkUtils.runOnUiThread(true, new s(2, this, strH));
        }
    }

    public w3 a0() {
        Object w3Var = this.f9520z.get();
        if (w3Var == null) {
            synchronized (this.f9520z) {
                try {
                    w3Var = this.f9520z.get();
                    if (w3Var == null) {
                        w3Var = new w3(this);
                        this.f9520z.set(w3Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (w3Var == this.f9520z) {
            w3Var = null;
        }
        return (w3) w3Var;
    }

    public x3 b0() {
        Object x3Var = this.f9485f0.get();
        if (x3Var == null) {
            synchronized (this.f9485f0) {
                try {
                    x3Var = this.f9485f0.get();
                    if (x3Var == null) {
                        x3Var = new x3();
                        this.f9485f0.set(x3Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (x3Var == this.f9485f0) {
            x3Var = null;
        }
        return (x3) x3Var;
    }

    public q c0() {
        Object qVar = this.f9488h0.get();
        if (qVar == null) {
            synchronized (this.f9488h0) {
                try {
                    qVar = this.f9488h0.get();
                    if (qVar == null) {
                        qVar = new q(this);
                        this.f9488h0.set(qVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (qVar == this.f9488h0) {
            qVar = null;
        }
        return (q) qVar;
    }

    public AppLovinNativeAdService d0() {
        Object appLovinNativeAdService = this.f9498n.get();
        if (appLovinNativeAdService == null) {
            synchronized (this.f9498n) {
                try {
                    appLovinNativeAdService = this.f9498n.get();
                    if (appLovinNativeAdService == null) {
                        appLovinNativeAdService = new AppLovinNativeAdService(this);
                        this.f9498n.set(appLovinNativeAdService);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (appLovinNativeAdService == this.f9498n) {
            appLovinNativeAdService = null;
        }
        return (AppLovinNativeAdService) appLovinNativeAdService;
    }

    public a4 e0() {
        Object a4Var = this.M.get();
        if (a4Var == null) {
            synchronized (this.M) {
                try {
                    a4Var = this.M.get();
                    if (a4Var == null) {
                        a4Var = new a4(p());
                        this.M.set(a4Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (a4Var == this.M) {
            a4Var = null;
        }
        return (a4) a4Var;
    }

    public e4 f0() {
        Object e4Var = this.X.get();
        if (e4Var == null) {
            synchronized (this.X) {
                try {
                    e4Var = this.X.get();
                    if (e4Var == null) {
                        e4Var = new e4(this);
                        this.X.set(e4Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (e4Var == this.X) {
            e4Var = null;
        }
        return (e4) e4Var;
    }

    public l4 g0() {
        Object l4Var = this.T.get();
        if (l4Var == null) {
            synchronized (this.T) {
                try {
                    l4Var = this.T.get();
                    if (l4Var == null) {
                        l4Var = new l4(this);
                        this.T.set(l4Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (l4Var == this.T) {
            l4Var = null;
        }
        return (l4) l4Var;
    }

    public com.applovin.impl.sdk.network.b h0() {
        Object bVar = this.f9475a0.get();
        if (bVar == null) {
            synchronized (this.f9475a0) {
                try {
                    bVar = this.f9475a0.get();
                    if (bVar == null) {
                        bVar = new com.applovin.impl.sdk.network.b(this);
                        this.f9475a0.set(bVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (bVar == this.f9475a0) {
            bVar = null;
        }
        return (com.applovin.impl.sdk.network.b) bVar;
    }

    public PostbackServiceImpl i0() {
        Object postbackServiceImpl = this.Z.get();
        if (postbackServiceImpl == null) {
            synchronized (this.Z) {
                try {
                    postbackServiceImpl = this.Z.get();
                    if (postbackServiceImpl == null) {
                        postbackServiceImpl = new PostbackServiceImpl(this);
                        this.Z.set(postbackServiceImpl);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (postbackServiceImpl == this.Z) {
            postbackServiceImpl = null;
        }
        return (PostbackServiceImpl) postbackServiceImpl;
    }

    public String j0() {
        return y0().a();
    }

    public String k0() {
        return this.f9474a;
    }

    public MaxSegmentCollectionImpl l0() {
        return (MaxSegmentCollectionImpl) this.f9493k;
    }

    public Map m0() {
        MaxSegmentCollectionImpl maxSegmentCollectionImplL0 = l0();
        if (maxSegmentCollectionImplL0 == null) {
            return null;
        }
        return maxSegmentCollectionImplL0.getJsonData();
    }

    public y4 n0() {
        Object y4Var = this.O.get();
        if (y4Var == null) {
            synchronized (this.O) {
                try {
                    y4Var = this.O.get();
                    if (y4Var == null) {
                        y4Var = new y4(this);
                        this.O.set(y4Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (y4Var == this.O) {
            y4Var = null;
        }
        return (y4) y4Var;
    }

    public SessionTracker o0() {
        Object sessionTracker = this.H.get();
        if (sessionTracker == null) {
            synchronized (this.H) {
                try {
                    sessionTracker = this.H.get();
                    if (sessionTracker == null) {
                        sessionTracker = new SessionTracker(this);
                        this.H.set(sessionTracker);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (sessionTracker == this.H) {
            sessionTracker = null;
        }
        return (SessionTracker) sessionTracker;
    }

    public AppLovinSdkSettings p0() {
        return this.f9491j;
    }

    public j q() {
        Object jVar = this.P.get();
        if (jVar == null) {
            synchronized (this.P) {
                try {
                    jVar = this.P.get();
                    if (jVar == null) {
                        jVar = new j(this);
                        this.P.set(jVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (jVar == this.P) {
            jVar = null;
        }
        return (j) jVar;
    }

    public a5 q0() {
        Object a5Var = this.f9516x.get();
        if (a5Var == null) {
            synchronized (this.f9516x) {
                try {
                    a5Var = this.f9516x.get();
                    if (a5Var == null) {
                        a5Var = new a5(this);
                        this.f9516x.set(a5Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (a5Var == this.f9516x) {
            a5Var = null;
        }
        return (a5) a5Var;
    }

    public String r() {
        return this.f9476b;
    }

    public c5 r0() {
        Object c5Var = this.B.get();
        if (c5Var == null) {
            synchronized (this.B) {
                try {
                    c5Var = this.B.get();
                    if (c5Var == null) {
                        c5Var = new c5(this);
                        this.B.set(c5Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (c5Var == this.B) {
            c5Var = null;
        }
        return (c5) c5Var;
    }

    public String s() {
        return y0().b();
    }

    public f6 s0() {
        Object f6Var = this.f9514w.get();
        if (f6Var == null) {
            synchronized (this.f9514w) {
                try {
                    f6Var = this.f9514w.get();
                    if (f6Var == null) {
                        f6Var = new f6(this);
                        this.f9514w.set(f6Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (f6Var == this.f9514w) {
            f6Var = null;
        }
        return (f6) f6Var;
    }

    public CmpServiceImpl t() {
        Object cmpServiceImpl = this.f9502p.get();
        if (cmpServiceImpl == null) {
            synchronized (this.f9502p) {
                try {
                    cmpServiceImpl = this.f9502p.get();
                    if (cmpServiceImpl == null) {
                        cmpServiceImpl = new CmpServiceImpl(this);
                        this.f9502p.set(cmpServiceImpl);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (cmpServiceImpl == this.f9502p) {
            cmpServiceImpl = null;
        }
        return (CmpServiceImpl) cmpServiceImpl;
    }

    public c7 t0() {
        Object c7Var = this.R.get();
        if (c7Var == null) {
            synchronized (this.R) {
                try {
                    c7Var = this.R.get();
                    if (c7Var == null) {
                        c7Var = new c7(this);
                        this.R.set(c7Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (c7Var == this.R) {
            c7Var = null;
        }
        return (c7) c7Var;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CoreSdk{sdkKey='");
        sb2.append(this.f9474a);
        sb2.append("', enabled=");
        sb2.append(this.f9508s0);
        sb2.append(", isFirstSession=");
        return defpackage.e.t(sb2, this.t0, '}');
    }

    public k u() {
        Object kVar = this.N.get();
        if (kVar == null) {
            synchronized (this.N) {
                try {
                    kVar = this.N.get();
                    if (kVar == null) {
                        kVar = new k(this);
                        this.N.set(kVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (kVar == this.N) {
            kVar = null;
        }
        return (k) kVar;
    }

    public i7 u0() {
        Object i7Var = this.f9495l0.get();
        if (i7Var == null) {
            synchronized (this.f9495l0) {
                try {
                    i7Var = this.f9495l0.get();
                    if (i7Var == null) {
                        i7Var = new i7(this);
                        this.f9495l0.set(i7Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (i7Var == this.f9495l0) {
            i7Var = null;
        }
        return (i7) i7Var;
    }

    public String v() {
        return y0().c();
    }

    public long v0() {
        if (this.f9487h == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f9487h;
    }

    public SdkConfigurationImpl w() {
        return this.f9521z0;
    }

    public Activity w0() {
        Activity activityB = a(p()).b();
        return activityB != null ? activityB : K();
    }

    public r0 x() {
        Object r0Var = this.f9518y.get();
        if (r0Var == null) {
            synchronized (this.f9518y) {
                try {
                    r0Var = this.f9518y.get();
                    if (r0Var == null) {
                        r0Var = new r0(this);
                        this.f9518y.set(r0Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (r0Var == this.f9518y) {
            r0Var = null;
        }
        return (r0) r0Var;
    }

    public o7 x0() {
        return this.f9512v;
    }

    public v0 y() {
        Object v0Var = this.Q.get();
        if (v0Var == null) {
            synchronized (this.Q) {
                try {
                    v0Var = this.Q.get();
                    if (v0Var == null) {
                        v0Var = new v0(this);
                        this.Q.set(v0Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (v0Var == this.Q) {
            v0Var = null;
        }
        return (v0) v0Var;
    }

    public p7 y0() {
        Object p7Var = this.C.get();
        if (p7Var == null) {
            synchronized (this.C) {
                try {
                    p7Var = this.C.get();
                    if (p7Var == null) {
                        p7Var = new p7(this);
                        this.C.set(p7Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (p7Var == this.C) {
            p7Var = null;
        }
        return (p7) p7Var;
    }

    public f1 z() {
        Object f1Var = this.S.get();
        if (f1Var == null) {
            synchronized (this.S) {
                try {
                    f1Var = this.S.get();
                    if (f1Var == null) {
                        f1Var = new f1(this);
                        this.S.set(f1Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (f1Var == this.S) {
            f1Var = null;
        }
        return (f1) f1Var;
    }

    public n8 z0() {
        Object n8Var = this.L.get();
        if (n8Var == null) {
            synchronized (this.L) {
                try {
                    n8Var = this.L.get();
                    if (n8Var == null) {
                        n8Var = new n8(this);
                        this.L.set(n8Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (n8Var == this.L) {
            n8Var = null;
        }
        return (n8) n8Var;
    }

    private void d() {
        f6 f6VarS0 = s0();
        int i10 = this.f9513v0 + 1;
        this.f9513v0 = i10;
        f6VarS0.a((k5) new v5(i10, this, new a()), f6.b.CORE);
    }

    public com.applovin.impl.c e() {
        return a(F0);
    }

    public com.applovin.impl.sdk.a f() {
        Object aVar = this.F.get();
        if (aVar == null) {
            synchronized (this.F) {
                try {
                    aVar = this.F.get();
                    if (aVar == null) {
                        aVar = new com.applovin.impl.sdk.a(this);
                        this.F.set(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (aVar == this.F) {
            aVar = null;
        }
        return (com.applovin.impl.sdk.a) aVar;
    }

    public com.applovin.impl.f g() {
        return this.f9507s;
    }

    public com.applovin.impl.sdk.c h() {
        Object cVar = this.K.get();
        if (cVar == null) {
            synchronized (this.K) {
                try {
                    cVar = this.K.get();
                    if (cVar == null) {
                        cVar = new com.applovin.impl.sdk.c(this);
                        this.K.set(cVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (cVar == this.K) {
            cVar = null;
        }
        return (com.applovin.impl.sdk.c) cVar;
    }

    public e i() {
        Object eVar = this.V.get();
        if (eVar == null) {
            synchronized (this.V) {
                try {
                    eVar = this.V.get();
                    if (eVar == null) {
                        eVar = new e(this);
                        this.V.set(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (eVar == this.V) {
            eVar = null;
        }
        return (e) eVar;
    }

    public f j() {
        Object fVar = this.E.get();
        if (fVar == null) {
            synchronized (this.E) {
                try {
                    fVar = this.E.get();
                    if (fVar == null) {
                        fVar = new f(this);
                        this.E.set(fVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (fVar == this.E) {
            fVar = null;
        }
        return (f) fVar;
    }

    public com.applovin.impl.j k() {
        Object jVar = this.f9477b0.get();
        if (jVar == null) {
            synchronized (this.f9477b0) {
                try {
                    jVar = this.f9477b0.get();
                    if (jVar == null) {
                        jVar = new com.applovin.impl.j(this);
                        this.f9477b0.set(jVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (jVar == this.f9477b0) {
            jVar = null;
        }
        return (com.applovin.impl.j) jVar;
    }

    public AppLovinAdServiceImpl l() {
        Object appLovinAdServiceImpl = this.f9496m.get();
        if (appLovinAdServiceImpl == null) {
            synchronized (this.f9496m) {
                try {
                    appLovinAdServiceImpl = this.f9496m.get();
                    if (appLovinAdServiceImpl == null) {
                        appLovinAdServiceImpl = new AppLovinAdServiceImpl(this);
                        this.f9496m.set(appLovinAdServiceImpl);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (appLovinAdServiceImpl == this.f9496m) {
            appLovinAdServiceImpl = null;
        }
        return (AppLovinAdServiceImpl) appLovinAdServiceImpl;
    }

    public h m() {
        Object hVar = this.J.get();
        if (hVar == null) {
            synchronized (this.J) {
                try {
                    hVar = this.J.get();
                    if (hVar == null) {
                        hVar = new h();
                        this.J.set(hVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (hVar == this.J) {
            hVar = null;
        }
        return (h) hVar;
    }

    public i n() {
        Object iVar = this.W.get();
        if (iVar == null) {
            synchronized (this.W) {
                try {
                    iVar = this.W.get();
                    if (iVar == null) {
                        iVar = new i(this);
                        this.W.set(iVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (iVar == this.W) {
            iVar = null;
        }
        return (i) iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        if (JsonUtils.isValid(jSONObject)) {
            this.f9487h = System.currentTimeMillis();
            s0.c(jSONObject, this);
            s0.b(jSONObject, this);
            s0.a(jSONObject, this);
            n3.f(jSONObject, this);
            n3.d(jSONObject, this);
            n3.e(jSONObject, this);
            n3.g(jSONObject, this);
        }
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        F0 = context.getApplicationContext();
        G0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        C0();
        this.f9491j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            p.g("AppLovinSdk", "Setting plugin version: ".concat(pluginVersion));
            q0().a(z4.R3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(z4.f10243s)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        f6 f6VarS0 = s0();
        k5 k5Var = this.C0;
        f6.b bVar = f6.b.CORE;
        f6VarS0.a(k5Var, bVar);
        s0().a(this.D0, bVar);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f9504q = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(int i10) {
        return a(i10, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context contextP = p();
        return a(contextP.getResources().getIdentifier(str, "string", contextP.getPackageName()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", str);
        }
        s0().a(new e6(this));
    }

    public static String a(int i10, List list) {
        String string = p().getResources().getString(i10);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public void c() {
        synchronized (this.f9499n0) {
            try {
                if (!this.r0 && !this.f9508s0) {
                    T0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.EMPTY_LIST).iterator();
        while (it.hasNext()) {
            p.h("AppLovinSdk", (String) it.next());
        }
    }

    public static com.applovin.impl.c a(Context context) {
        if (J0 == null) {
            synchronized (K0) {
                try {
                    if (J0 == null) {
                        J0 = new com.applovin.impl.c(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return J0;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements a4.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a4 f9525a;

        public d(a4 a4Var) {
            this.f9525a = a4Var;
        }

        @Override // com.applovin.impl.a4.a
        public void a() {
            l.this.Q();
            if (p.a()) {
                l.this.Q().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (l.this.f9499n0) {
                try {
                    if (!l.this.r0) {
                        l.this.T0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f9525a.b(this);
        }

        @Override // com.applovin.impl.a4.a
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        if (!q7.c(this)) {
            HashMap map = new HashMap();
            map.put("details", AppLovinMediationProvider.ADMOB);
            map.put("error_message", str);
            E().a(f2.f7836a1, "adapterVersionMismatch", map);
            return;
        }
        throw new IllegalStateException(str);
    }

    public List c(z4 z4Var) {
        return q0().c(z4Var);
    }

    public void c(b5 b5Var) {
        r0().b(b5Var);
    }

    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        synchronized (this.f9519y0) {
            try {
                if (this.f9517x0 != null) {
                    p.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.f9517x0 + ". Ignoring the provided initialization configuration.");
                    if (!D0() || sdkInitializationListener == null) {
                        return;
                    }
                    AppLovinSdkUtils.runOnUiThread(new y(this, sdkInitializationListener, 0));
                    return;
                }
                this.f9482e = System.currentTimeMillis();
                this.f9517x0 = appLovinSdkInitializationConfiguration;
                this.A0 = sdkInitializationListener;
                if (p.a()) {
                    p pVar = this.f9506r;
                    StringBuilder sb2 = new StringBuilder("Initializing with configuration: ");
                    sb2.append(this.f9517x0);
                    sb2.append(", listener: ");
                    sb2.append(this.A0 != null ? "configured" : "none");
                    pVar.a("AppLovinSdk", sb2.toString());
                }
                this.f9474a = appLovinSdkInitializationConfiguration.getSdkKey();
                this.f9476b = appLovinSdkInitializationConfiguration.getAxonEventKey();
                this.l = appLovinSdkInitializationConfiguration.getMediationProvider();
                this.f9493k = appLovinSdkInitializationConfiguration.getSegmentCollection();
                q7.a((Runnable) new s(3, this, appLovinSdkInitializationConfiguration));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(boolean z10) {
        AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (y().i() || (sdkInitializationListener = this.A0) == null) {
            return;
        }
        if (D0()) {
            this.A0 = null;
            this.B0 = null;
            U().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.B0 == sdkInitializationListener) {
                return;
            }
            U().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(z4.f10221p)).booleanValue()) {
                this.A0 = null;
            } else {
                this.B0 = sdkInitializationListener;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putBoolean(jSONObject, "enabled", D0());
        JsonUtils.putBoolean(jSONObject, "timeout", z10);
        JsonUtils.putBoolean(jSONObject, "consent_flow_shown", this.f9505q0.get());
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f9482e;
        HashMap map = new HashMap();
        map.put("duration_ms", String.valueOf(jCurrentTimeMillis));
        map.put("details", jSONObject.toString());
        this.f9512v.d(f2.f7858j, map);
        AppLovinSdkUtils.runOnUiThreadDelayed(new y(this, sdkInitializationListener, 1), Math.max(0L, ((Long) a(z4.f10230q)).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f9521z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f9521z0);
    }

    public void a(boolean z10) {
        synchronized (this.f9499n0) {
            this.r0 = false;
            this.f9508s0 = z10;
        }
        if (z10) {
            List listA = y3.a(this);
            if (listA.isEmpty()) {
                s0().g();
                O0();
                return;
            }
            Long l = (Long) a(t3.f9783t7);
            u6 u6Var = new u6(this, true, "timeoutInitAdapters", new z(2, this));
            Q();
            if (p.a()) {
                Q().a("AppLovinSdk", "Waiting for required adapters to init: " + listA + " - timing out in " + l + "ms...");
            }
            s0().a(u6Var, f6.b.TIMEOUT, l.longValue(), true);
        }
    }

    public List b(z4 z4Var) {
        return q0().b(z4Var);
    }

    public void b(b5 b5Var, Object obj) {
        r0().b(b5Var, obj);
    }

    public Object b(b5 b5Var) {
        return r0().a(b5Var);
    }

    public String b() {
        if (StringUtils.isValidString(this.f9515w0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Map mapY = Y();
        List listC = c(z4.f10235q4);
        Boolean bool = (Boolean) a(z4.f10240r4);
        if (mapY.isEmpty() && !bool.booleanValue()) {
            return null;
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Integer numValueOf = (Integer) a(z4.f10226p4);
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (numValueOf.intValue() <= 0) {
                    break;
                }
                String className = stackTraceElement.getClassName();
                Iterator it = listC.iterator();
                do {
                    if (!it.hasNext()) {
                        for (Map.Entry entry : mapY.entrySet()) {
                            if (className.startsWith((String) entry.getKey())) {
                                this.f9515w0 = (String) entry.getValue();
                                Q();
                                if (p.a()) {
                                    Q().a("AppLovinSdk", "Detected mediation provider: " + this.f9515w0);
                                }
                                return null;
                            }
                        }
                        if (bool.booleanValue()) {
                            arrayList.add(className);
                        }
                        numValueOf = Integer.valueOf(numValueOf.intValue() - 1);
                        break;
                    }
                } while (!className.startsWith((String) it.next()));
            }
        } catch (Throwable th2) {
            E().a("AppLovinSdk", "detectMediationProvider", th2);
        }
        this.f9515w0 = "unknown";
        Q();
        if (p.a()) {
            Q().k("AppLovinSdk", "Unable to detect mediation provider");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String strJoin = StringUtils.join(",", arrayList);
        if (!((Boolean) a(z4.f10248s4)).booleanValue()) {
            return strJoin;
        }
        E().a(f2.f7842d, "detectMediationProvider", CollectionUtils.hashMap("details", strJoin));
        return null;
    }

    public void a(m3 m3Var) {
        if (s0().f()) {
            return;
        }
        List listA = y3.a(this);
        if (listA.size() <= 0 || !U().a().containsAll(listA)) {
            return;
        }
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "All required adapters initialized");
        }
        s0().g();
        O0();
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.f9497m0;
        return (list == null || list.size() <= 0 || this.f9497m0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) r0().a(b5.f7549g, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < q7.g(str)) {
                p.h("AppLovinSdk", d5.u.h(new StringBuilder("Current version ("), AppLovinSdk.VERSION, ") is older than earlier installed version (", str, "), which may cause compatibility issues."));
            }
        }
    }

    public Object a(z4 z4Var) {
        return q0().a(z4Var);
    }

    public boolean a(z4 z4Var, MaxAdFormat maxAdFormat) {
        return b(z4Var).contains(maxAdFormat);
    }

    public void a(Map map) {
        W().a(map);
    }

    public void a(Uri uri) {
        C().a(uri);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        r0().a(str, obj, editor);
    }

    public Object a(b5 b5Var) {
        return a(b5Var, (Object) null);
    }

    public Object a(b5 b5Var, Object obj) {
        return r0().a(b5Var, obj);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return c5.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        r0().a(sharedPreferences);
    }
}

package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.o;
import bc.r;
import com.applovin.impl.a3;
import com.applovin.impl.b5;
import com.applovin.impl.e3;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.h2;
import com.applovin.impl.i0;
import com.applovin.impl.j;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u1;
import com.applovin.impl.u6;
import com.applovin.impl.v1;
import com.applovin.impl.v2;
import com.applovin.impl.y3;
import com.applovin.impl.z3;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import d5.u;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements com.applovin.impl.sdk.a.InterfaceC0015a, j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f8502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f8503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f8504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.mediation.b f8505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e3 f8507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f8508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f8509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f8510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i0 f8511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f8512k;
    private boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d f8513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f8514n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f8515o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f8516p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WeakReference f8517q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f8518r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f8519s;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        Activity getActivity();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements MaxAdListener, MaxAdRevenueListener, com.applovin.impl.mediation.ads.a.InterfaceC0010a {
        public b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                p pVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                defpackage.e.B(sb2, MaxFullscreenAdImpl.this.adListener, pVar2, str);
            }
            v2.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final e3 e3Var = (e3) maxAd;
            MaxFullscreenAdImpl.this.e();
            d dVar = MaxFullscreenAdImpl.this.f8513m;
            d dVar2 = d.NONE;
            final boolean z10 = dVar != dVar2;
            if (z10) {
                p pVar = MaxFullscreenAdImpl.this.logger;
                if (p.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Ad failover failed from: " + MaxFullscreenAdImpl.this.f8513m.b());
                }
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", e3Var.x0());
                CollectionUtils.putStringIfValid("source", MaxFullscreenAdImpl.this.f8513m.b(), mapHashMap);
                MaxFullscreenAdImpl.this.sdk.R().a(f2.C0, e3Var, mapHashMap);
                MaxFullscreenAdImpl.this.f8513m = dVar2;
            }
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8568a.a(maxAd, z10, e3Var, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            e3 e3Var = (e3) maxAd;
            d dVar = MaxFullscreenAdImpl.this.f8513m;
            d dVar2 = d.NONE;
            if (dVar != dVar2) {
                p pVar = MaxFullscreenAdImpl.this.logger;
                if (p.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    defpackage.e.C(new StringBuilder("Ad failover succeeded from: "), MaxFullscreenAdImpl.this.f8513m.b(), maxFullscreenAdImpl.logger, maxFullscreenAdImpl.tag);
                }
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", e3Var.x0());
                CollectionUtils.putStringIfValid("source", MaxFullscreenAdImpl.this.f8513m.b(), mapHashMap);
                MaxFullscreenAdImpl.this.sdk.R().a(f2.B0, e3Var, mapHashMap);
                MaxFullscreenAdImpl.this.f8513m = dVar2;
            }
            MaxFullscreenAdImpl.this.sdk.f().a(e3Var);
            MaxFullscreenAdImpl.this.e(e3Var);
            MaxFullscreenAdImpl.this.g();
            Integer num = (Integer) MaxFullscreenAdImpl.this.sdk.a(t3.v8);
            if (num.intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.s0().b(new u6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new i(3, this, e3Var)), f6.b.TIMEOUT, TimeUnit.SECONDS.toMillis(num.intValue()));
            }
            p pVar2 = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                p pVar3 = maxFullscreenAdImpl2.logger;
                String str = maxFullscreenAdImpl2.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                defpackage.e.B(sb2, MaxFullscreenAdImpl.this.adListener, pVar3, str);
            }
            v2.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f8513m = d.NONE;
            MaxFullscreenAdImpl.this.e();
            MaxFullscreenAdImpl.this.a(c.IDLE, new i(2, this, maxAd));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxFullscreenAdImpl.this.f();
            MaxFullscreenAdImpl.this.a(c.IDLE, new androidx.fragment.app.d(this, str, maxError, 14));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            e3 e3Var;
            synchronized (MaxFullscreenAdImpl.this.f8506e) {
                e3Var = MaxFullscreenAdImpl.this.f8507f;
            }
            MaxFullscreenAdImpl.this.sdk.J().a(MaxFullscreenAdImpl.this.adUnitId);
            e3 e3Var2 = (e3) maxAd;
            MaxFullscreenAdImpl.this.d(e3Var2);
            if (!MaxFullscreenAdImpl.this.f8509h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new androidx.fragment.app.d(this, e3Var2, maxAd, 13));
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f8510i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.h();
            }
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + e3Var + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            v2.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) e3Var, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                p pVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sbK = u.k("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbK.append(MaxFullscreenAdImpl.this.requestListener);
                pVar2.a(str2, sbK.toString());
            }
            v2.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            v2.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(e3 e3Var, MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f8513m == d.NONE) {
                p pVar = MaxFullscreenAdImpl.this.logger;
                if (p.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    p pVar2 = maxFullscreenAdImpl.logger;
                    String str = maxFullscreenAdImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    defpackage.e.B(sb2, MaxFullscreenAdImpl.this.adListener, pVar2, str);
                }
                v2.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                return;
            }
            p pVar3 = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                defpackage.e.C(new StringBuilder("Attempting ad failover from: "), MaxFullscreenAdImpl.this.f8513m.b(), maxFullscreenAdImpl2.logger, maxFullscreenAdImpl2.tag);
            }
            e3Var.j(MaxFullscreenAdImpl.this.f8516p);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", MaxFullscreenAdImpl.this.f8516p);
            CollectionUtils.putStringIfValid("source", MaxFullscreenAdImpl.this.f8513m.b(), mapHashMap);
            MaxFullscreenAdImpl.this.sdk.R().a(f2.A0, e3Var, mapHashMap);
            MaxFullscreenAdImpl.this.h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                p pVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(str);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                defpackage.e.B(sb2, MaxFullscreenAdImpl.this.adListener, pVar2, str2);
            }
            v2.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(e3 e3Var) {
            if (e3Var.x().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.R().a(f2.f7882u0, e3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                p pVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                defpackage.e.B(sb2, MaxFullscreenAdImpl.this.adListener, pVar2, str);
            }
            v2.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z10, e3 e3Var, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z10 ? MaxFullscreenAdImpl.this.c(e3Var) : false) {
                return;
            }
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                p pVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(maxAd);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                defpackage.e.B(sb2, MaxFullscreenAdImpl.this.adListener, pVar2, str);
            }
            v2.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum d {
        NONE("none"),
        FAILOVER_CACHE("failover_cache"),
        PRELOADED_ADS_QUEUE("preloaded_ads_queue");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8531a;

        d(String str) {
            this.f8531a = str;
        }

        public String b() {
            return this.f8531a;
        }
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, l lVar, Context context) {
        super(str, maxAdFormat, str2, lVar);
        this.f8506e = new Object();
        this.f8507f = null;
        this.f8508g = c.IDLE;
        this.f8509h = new AtomicBoolean();
        this.f8510i = new AtomicBoolean();
        this.f8513m = d.NONE;
        this.f8517q = new WeakReference(null);
        this.f8518r = new WeakReference(null);
        this.f8519s = new WeakReference(null);
        this.f8502a = aVar;
        this.f8504c = createAdListenerWrapper();
        this.f8505d = new com.applovin.impl.mediation.b(lVar);
        this.f8503b = new WeakReference(context);
        lVar.k().a(this);
        p.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    public b createAdListenerWrapper() {
        return new b();
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new g(this, 0));
    }

    public boolean isLoading() {
        boolean z10;
        synchronized (this.f8506e) {
            z10 = this.f8508g == c.LOADING;
        }
        return z10;
    }

    public boolean isReady() {
        boolean z10;
        synchronized (this.f8506e) {
            try {
                e3 e3Var = this.f8507f;
                z10 = e3Var != null && e3Var.a0() && this.f8508g == c.READY;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            this.sdk.J().c(this.adUnitId);
        }
        return z10;
    }

    public boolean isShowing() {
        boolean z10;
        synchronized (this.f8506e) {
            z10 = this.f8508g == c.SHOWING;
        }
        return z10;
    }

    public void loadAd() {
        loadAd(com.applovin.impl.i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0015a
    public void onAdExpired(u1 u1Var) {
        if (p.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f8509h.set(true);
        a aVar = this.f8502a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            f();
            this.f8504c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.Z().loadAd(this.adUnitId, null, this.adFormat, com.applovin.impl.i.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.f8504c);
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        e3 e3Var = this.f8507f;
        if (e3Var == null || !e3Var.T().equalsIgnoreCase(str)) {
            return;
        }
        this.f8507f.h(str2);
        v2.b(this.adReviewListener, str2, this.f8507f);
    }

    public void showAd(String str, String str2, Activity activity) {
        e3 e3Var;
        List listB = this.sdk.u0().b();
        if (!this.sdk.u0().d() || listB == null || (e3Var = this.f8507f) == null || listB.contains(e3Var.c())) {
            if (activity == null) {
                activity = this.sdk.w0();
            }
            Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new r(this, str, str2, activity2, 7));
                return;
            }
            return;
        }
        String str3 = "Attempting to show ad from <" + this.f8507f.c() + "> which is not in the list of selected ad networks " + listB;
        p.h(this.tag, str3);
        a(c.IDLE, new e(this, str3, 2));
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tag);
        sb2.append("{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f8502a) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", revenueListener=");
        sb2.append(this.revenueListener);
        sb2.append(", requestListener");
        sb2.append(this.requestListener);
        sb2.append(", adReviewListener");
        sb2.append(this.adReviewListener);
        sb2.append(", isReady=");
        sb2.append(isReady());
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(e3 e3Var) {
        if (!this.sdk.f().a(e3Var, this)) {
            if (p.a()) {
                this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
            }
            onAdExpired(e3Var);
            return;
        }
        if (p.a()) {
            this.logger.a(this.tag, "Handle ad loaded for regular ad: " + e3Var);
        }
        this.f8507f = e3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(e3 e3Var) {
        if (((Boolean) this.sdk.a(z4.G2)).booleanValue()) {
            List listB = e3Var.b("mappk_urls");
            if (CollectionUtils.isEmpty(listB)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putLong(jSONObject, "timestamp_ms", System.currentTimeMillis());
            JsonUtils.putJsonArray(jSONObject, "app_killed_urls", new JSONArray((Collection) listB));
            JsonUtils.putJSONObject(jSONObject, "ad_info", new JSONObject(h2.a((a3) e3Var)));
            JsonUtils.putJSONObject(jSONObject, "user_info", new JSONObject(y3.a(e3Var, this.sdk)));
            HashMap map = new HashMap(this.sdk.B().e());
            map.put("mcode", e3Var.v0());
            map.put("bcode", e3Var.C());
            JsonUtils.putJSONObject(jSONObject, "postback_body", new JSONObject(map));
            this.sdk.r0().b(b5.R, jSONObject.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        e3 e3Var;
        if (this.f8509h.compareAndSet(true, false)) {
            synchronized (this.f8506e) {
                e3Var = this.f8507f;
                this.f8507f = null;
            }
            this.sdk.Z().destroyAd(e3Var);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Long l = (Long) this.sdk.a(z4.H2);
        if (l.longValue() <= 0) {
            return;
        }
        this.f8511j = i0.a(l.longValue(), true, this.sdk, new i(1, this, l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Activity activityW0 = (Activity) this.f8517q.get();
        if (activityW0 == null) {
            activityW0 = this.sdk.w0();
        }
        Activity activity = activityW0;
        if (this.l) {
            showAd(this.f8514n, this.f8515o, (ViewGroup) this.f8518r.get(), (o) this.f8519s.get(), activity);
        } else {
            showAd(this.f8514n, this.f8515o, activity);
        }
    }

    public void loadAd(com.applovin.impl.i iVar) {
        if (p.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f8508g == c.DESTROYED) {
            boolean zC = q7.c(this.sdk);
            this.sdk.E().a(f2.f7836a1, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            a aVar = this.f8502a;
            a(c.LOADING, new r(this, aVar != null ? aVar.getActivity() : null, (Context) this.f8503b.get(), iVar, 6));
            return;
        }
        if (p.a()) {
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (p.a()) {
            p pVar = this.logger;
            String str = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
            sb2.append(this.f8507f);
            sb2.append("), listener=");
            defpackage.e.B(sb2, this.adListener, pVar, str);
        }
        v2.f(this.adListener, (MaxAd) this.f8507f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        e3 e3Var = this.f8507f;
        a((MaxAd) e3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (p.a()) {
            p pVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(e3Var);
            sb2.append(", error=");
            sb2.append(maxErrorImpl);
            sb2.append("), listener=");
            defpackage.e.B(sb2, this.adListener, pVar, str2);
        }
        v2.a(this.adListener, (MaxAd) e3Var, (MaxError) maxErrorImpl, true);
        this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f8506e) {
            try {
                if (this.f8507f != null) {
                    if (p.a()) {
                        this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f8507f + "...");
                    }
                    this.sdk.Z().destroyAd(this.f8507f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.sdk.k().b(this);
        this.f8505d.a();
        i0 i0Var = this.f8511j;
        if (i0Var != null) {
            i0Var.a();
            this.f8511j = null;
        }
        super.destroy();
    }

    private boolean g(e3 e3Var) {
        if (!e3Var.E0()) {
            return false;
        }
        if (!b()) {
            a(d.PRELOADED_ADS_QUEUE, e3Var);
            return false;
        }
        AppLovinSdkUtils.runOnUiThread(true, new g(this, 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, Context context, com.applovin.impl.i iVar) {
        Context context2;
        Context contextP = activity;
        if (activity != null) {
            context2 = contextP;
        } else if (context != null) {
            context2 = context;
        } else {
            if (this.sdk.w0() != null) {
                contextP = this.sdk.w0();
            } else {
                contextP = l.p();
            }
            context2 = contextP;
        }
        this.sdk.Z().loadAd(this.adUnitId, null, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, context2, this.f8504c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f8513m = d.PRELOADED_ADS_QUEUE;
        loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.l = false;
        this.f8517q = new WeakReference(activity);
        this.sdk.Z().showFullscreenAd(this.f8507f, activity, this.localExtraParameters, this.extraParameters, this.f8504c);
    }

    private boolean f(e3 e3Var) {
        if (!e3Var.D0()) {
            return false;
        }
        v1 v1VarH = this.sdk.H();
        e3 e3VarA = v1VarH.a(this.adUnitId);
        if (e3VarA == null) {
            a(d.FAILOVER_CACHE, e3Var);
            return false;
        }
        if (e3VarA.H() < e3Var.J()) {
            if (p.a()) {
                this.logger.a(this.tag, "The failover ad's eCPM does not exceed floor value");
            }
            this.sdk.R().a(f2.H0, e3Var);
            return false;
        }
        if (p.a()) {
            this.logger.a(this.tag, "Loading ad from failover cache");
        }
        v1VarH.b(e3VarA);
        if (e3VarA.R().endsWith("load")) {
            this.f8504c.onAdRevenuePaid(e3VarA);
        }
        AppLovinSdkUtils.runOnUiThread(true, new f(this, e3VarA, 1));
        return true;
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, o oVar, Activity activity) {
        e3 e3Var;
        if (viewGroup != null && oVar != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(t3.f9778q8)).booleanValue()) {
                p.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                v2.a(this.adListener, (MaxAd) this.f8507f, (MaxError) maxErrorImpl, true);
                this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f8507f);
                return;
            }
            List listB = this.sdk.u0().b();
            if (this.sdk.u0().d() && listB != null && (e3Var = this.f8507f) != null && !listB.contains(e3Var.c())) {
                String str3 = "Attempting to show ad from <" + this.f8507f.c() + "> which is not in the list of selected ad networks " + listB;
                p.h(this.tag, str3);
                a(c.IDLE, new e(this, str3, 0));
                return;
            }
            if (activity == null) {
                activity = this.sdk.w0();
            }
            Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new com.applovin.impl.mediation.l(this, str, str2, activity2, viewGroup, oVar));
                return;
            }
            return;
        }
        p.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (p.a()) {
            p pVar = this.logger;
            String str4 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(this.f8507f);
            sb2.append(", error=");
            sb2.append(maxErrorImpl2);
            sb2.append("), listener=");
            defpackage.e.B(sb2, this.adListener, pVar, str4);
        }
        v2.a(this.adListener, (MaxAd) this.f8507f, (MaxError) maxErrorImpl2, true);
        this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f8507f);
    }

    private boolean b() {
        if (this.sdk.T() != null) {
            return this.sdk.T().e(this.adUnitId);
        }
        return this.sdk.S().d(this.adUnitId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, o oVar) {
        a(str, str2);
        this.l = true;
        this.f8517q = new WeakReference(activity);
        this.f8518r = new WeakReference(viewGroup);
        this.f8519s = new WeakReference(oVar);
        this.sdk.Z().showFullscreenAd(this.f8507f, viewGroup, oVar, activity, this.localExtraParameters, this.extraParameters, this.f8504c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(e3 e3Var) {
        this.f8513m = d.FAILOVER_CACHE;
        e3Var.B().c().a(this.f8504c);
        a(c.LOADING, new f(this, e3Var, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        e3 e3Var = this.f8507f;
        a((MaxAd) e3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (p.a()) {
            p pVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(e3Var);
            sb2.append(", error=");
            sb2.append(maxErrorImpl);
            sb2.append("), listener=");
            defpackage.e.B(sb2, this.adListener, pVar, str2);
        }
        v2.a(this.adListener, (MaxAd) e3Var, (MaxError) maxErrorImpl, true);
        this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (((Boolean) this.sdk.a(z4.G2)).booleanValue()) {
            this.sdk.r0().b(b5.R);
        }
        if (this.f8511j != null) {
            this.sdk.r0().b(b5.S);
            this.f8511j.a();
            this.f8511j = null;
        }
    }

    private boolean a(Activity activity, String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f8508g == c.DESTROYED) {
            boolean zC = q7.c(this.sdk);
            this.sdk.E().a(f2.f7836a1, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String strQ = defpackage.e.q(this.tag, "#isReady()", new StringBuilder("Attempting to show ad before it is ready - please check ad readiness using "));
            p.h(this.tag, strQ);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, strQ);
            z3 z3Var = new z3(this.adUnitId, this.adFormat, str);
            if (p.a()) {
                p pVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(z3Var);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                defpackage.e.B(sb2, this.adListener, pVar, str2);
            }
            v2.a(this.adListener, (MaxAd) z3Var, (MaxError) maxErrorImpl, true);
            if (this.f8507f != null) {
                this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f8507f);
            }
            return false;
        }
        Long l = (Long) this.sdk.a(t3.a8);
        Long l10 = (Long) this.sdk.a(t3.T7);
        if (l.longValue() > 0 && (this.f8507f.getTimeToLiveMillis() < l10.longValue() || this.f8509h.get())) {
            this.f8510i.set(true);
            this.sdk.s0().a(new u6(this.sdk, "handleShowOnLoadTimeoutError", new e(this, str, 1)), f6.b.TIMEOUT, l.longValue());
            return false;
        }
        if (q7.a(l.p()) != 0 && this.sdk.p0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!q7.c(this.sdk)) {
                if (((Boolean) this.sdk.a(t3.f9777p8)).booleanValue()) {
                    p.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (p.a()) {
                        p pVar2 = this.logger;
                        String str3 = this.tag;
                        StringBuilder sb3 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                        sb3.append(this.f8507f);
                        sb3.append(", error=");
                        sb3.append(maxErrorImpl2);
                        sb3.append("), listener=");
                        defpackage.e.B(sb3, this.adListener, pVar2, str3);
                    }
                    v2.a(this.adListener, (MaxAd) this.f8507f, (MaxError) maxErrorImpl2, true);
                    this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f8507f);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.J().e() && !this.sdk.J().d()) {
            return true;
        }
        p.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (p.a()) {
            p pVar3 = this.logger;
            String str4 = this.tag;
            StringBuilder sb4 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb4.append(this.f8507f);
            sb4.append(", error=");
            sb4.append(maxErrorImpl3);
            sb4.append("), listener=");
            defpackage.e.B(sb4, this.adListener, pVar3, str4);
        }
        v2.a(this.adListener, (MaxAd) this.f8507f, (MaxError) maxErrorImpl3, true);
        this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f8507f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(e3 e3Var) {
        if (f(e3Var)) {
            return true;
        }
        return g(e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (this.f8510i.compareAndSet(true, false)) {
            p.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.J().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            z3 z3Var = new z3(this.adUnitId, this.adFormat, str);
            if (p.a()) {
                p pVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(z3Var);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                defpackage.e.B(sb2, this.adListener, pVar, str2);
            }
            v2.a(this.adListener, (MaxAd) z3Var, (MaxError) maxErrorImpl, true);
            if (this.f8507f != null) {
                this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f8507f);
            }
        }
    }

    private void a(String str, String str2) {
        this.f8505d.e(this.f8507f);
        this.f8507f.g(str);
        this.f8507f.f(str2);
        this.f8514n = str;
        this.f8515o = str2;
        this.f8516p = this.f8507f.getNetworkName();
        this.sdk.z().d(this.f8507f);
        if (p.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f8507f + "...");
        }
        a((a3) this.f8507f);
    }

    private void a() {
        e3 e3Var;
        synchronized (this.f8506e) {
            e3Var = this.f8507f;
            this.f8507f = null;
        }
        this.sdk.Z().destroyAd(e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l) {
        this.f8512k = l.longValue() + this.f8512k;
        this.sdk.r0().b(b5.S, Long.valueOf(this.f8512k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z10;
        c cVar2 = this.f8508g;
        synchronized (this.f8506e) {
            try {
                c cVar3 = c.IDLE;
                if (cVar2 == cVar3) {
                    if (cVar == c.LOADING || cVar == c.DESTROYED) {
                        z10 = true;
                    } else {
                        if (cVar == c.SHOWING) {
                            p.h(this.tag, "No ad is loading or loaded");
                        } else if (p.a()) {
                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                        }
                        z10 = false;
                    }
                } else {
                    c cVar4 = c.LOADING;
                    if (cVar2 == cVar4) {
                        if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                p.h(this.tag, "An ad is already loading");
                            } else if (cVar != c.READY) {
                                if (cVar == c.SHOWING) {
                                    p.h(this.tag, "An ad is not ready to be shown yet");
                                } else if (cVar != c.DESTROYED) {
                                    if (p.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                            }
                            z10 = false;
                        }
                        z10 = true;
                    } else {
                        c cVar5 = c.READY;
                        if (cVar2 == cVar5) {
                            if (cVar != cVar3) {
                                if (cVar == cVar4) {
                                    p.h(this.tag, "An ad is already loaded");
                                } else if (cVar == cVar5) {
                                    if (p.a()) {
                                        this.logger.b(this.tag, "An ad is already marked as ready");
                                    }
                                } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                                    if (p.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                                z10 = false;
                            }
                            z10 = true;
                        } else {
                            c cVar6 = c.SHOWING;
                            if (cVar2 == cVar6) {
                                if (cVar != cVar3) {
                                    if (cVar == cVar4) {
                                        p.h(this.tag, "Can not load another ad while the ad is showing");
                                    } else if (cVar == cVar5) {
                                        if (p.a()) {
                                            this.logger.b(this.tag, "An ad is already showing, ignoring");
                                        }
                                    } else if (cVar == cVar6) {
                                        p.h(this.tag, "The ad is already showing, not showing another one");
                                    } else if (cVar != c.DESTROYED) {
                                        if (p.a()) {
                                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                        }
                                    }
                                }
                                z10 = true;
                            } else if (cVar2 == c.DESTROYED) {
                                p.h(this.tag, "No operations are allowed on a destroyed instance");
                            } else if (p.a()) {
                                this.logger.b(this.tag, "Unknown state: " + this.f8508g);
                            }
                            z10 = false;
                        }
                    }
                }
                if (z10) {
                    if (p.a()) {
                        this.logger.a(this.tag, "Transitioning from " + this.f8508g + " to " + cVar + "...");
                    }
                    this.f8508g = cVar;
                } else {
                    if (p.a()) {
                        this.logger.k(this.tag, "Not allowed to transition from " + this.f8508g + " to " + cVar);
                    }
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("ad_unit_id", this.adUnitId);
                    CollectionUtils.putStringIfValid("ad_format", this.adFormat.getLabel(), mapHashMap);
                    CollectionUtils.putStringIfValid("details", "current_state=" + this.f8508g + ",target_state=" + cVar, mapHashMap);
                    this.sdk.E().a(f2.f7857i1, "stateTransitionFailed", mapHashMap);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((e3) maxAd);
        this.f8505d.a();
        a();
        this.sdk.c0().a((a3) maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var) {
        this.f8504c.onAdLoaded(e3Var);
    }

    private void a(d dVar, e3 e3Var) {
        if (p.a()) {
            defpackage.e.C(new StringBuilder("Failover ad missing from: "), dVar.b(), this.logger, this.tag);
        }
        this.sdk.R().a(f2.f7892z0, e3Var, CollectionUtils.hashMap("source", dVar.b()));
    }
}

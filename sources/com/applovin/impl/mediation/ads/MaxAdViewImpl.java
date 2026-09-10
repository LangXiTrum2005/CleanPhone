package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.a3;
import com.applovin.impl.d3;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.g8;
import com.applovin.impl.h8;
import com.applovin.impl.i8;
import com.applovin.impl.j;
import com.applovin.impl.k5;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.p0;
import com.applovin.impl.q7;
import com.applovin.impl.s;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u6;
import com.applovin.impl.v2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import d5.u;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements com.applovin.impl.sdk.g.a, i8.a, j.b {
    private static final Map E = new HashMap();
    private static final Object F = new Object();
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxAdView f8475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f8477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d3 f8479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f8480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f8481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MaxAdViewConfiguration f8482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f8483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f8484k;
    private final com.applovin.impl.sdk.g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final h8 f8485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final i8 f8486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f8487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f8488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private d3 f8489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MaxAd f8490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8493u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f8494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f8497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f8498z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            p pVar = MaxAdViewImpl.this.logger;
            if (p.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                p pVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(str);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                defpackage.e.B(sb2, MaxAdViewImpl.this.adListener, pVar2, str2);
            }
            v2.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.Z().destroyAd(maxAd);
                return;
            }
            d3 d3Var = (d3) maxAd;
            d3Var.g(MaxAdViewImpl.this.f8480g);
            d3Var.f(MaxAdViewImpl.this.f8481h);
            if (d3Var.z() == null) {
                MaxAdViewImpl.this.sdk.Z().destroyAd(d3Var);
                onAdLoadFailed(d3Var.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (d3Var.z0()) {
                long jU0 = d3Var.u0();
                MaxAdViewImpl.this.sdk.Q();
                if (p.a()) {
                    p pVarQ = MaxAdViewImpl.this.sdk.Q();
                    String str = MaxAdViewImpl.this.tag;
                    StringBuilder sbL = wi.d.l(jU0, "Scheduling banner ad refresh ", " milliseconds from now for '");
                    sbL.append(MaxAdViewImpl.this.adUnitId);
                    sbL.append("'...");
                    pVarQ.a(str, sbL.toString());
                }
                MaxAdViewImpl.this.l.a(jU0);
                if (MaxAdViewImpl.this.l.g() || MaxAdViewImpl.this.f8493u) {
                    p pVar2 = MaxAdViewImpl.this.logger;
                    if (p.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.l.j();
                }
            }
            p pVar3 = MaxAdViewImpl.this.logger;
            if (p.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                p pVar4 = maxAdViewImpl3.logger;
                String str2 = maxAdViewImpl3.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                defpackage.e.B(sb2, MaxAdViewImpl.this.adListener, pVar4, str2);
            }
            v2.f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.d(d3Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, com.applovin.impl.mediation.ads.a.InterfaceC0010a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8489q)) {
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    p pVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    defpackage.e.B(sb2, MaxAdViewImpl.this.adListener, pVar2, str);
                }
                v2.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8490r)) {
                MaxAdViewImpl.this.f8490r = null;
                if ((MaxAdViewImpl.this.f8489q.A0() || MaxAdViewImpl.this.B) && MaxAdViewImpl.this.f8491s) {
                    MaxAdViewImpl.this.f8491s = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    p pVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdViewAdListener.onAdCollapsed(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    defpackage.e.B(sb2, MaxAdViewImpl.this.adListener, pVar2, str);
                }
                v2.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f8489q)) {
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    p pVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                    sb2.append(maxAd);
                    sb2.append(", error=");
                    sb2.append(maxError);
                    sb2.append("), listener=");
                    defpackage.e.B(sb2, MaxAdViewImpl.this.adListener, pVar2, str);
                }
                v2.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8489q)) {
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    p pVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    defpackage.e.B(sb2, MaxAdViewImpl.this.adListener, pVar2, str);
                }
                v2.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8489q)) {
                MaxAdViewImpl.this.f8490r = maxAd;
                if ((MaxAdViewImpl.this.f8489q.A0() || MaxAdViewImpl.this.B) && !MaxAdViewImpl.this.l.g()) {
                    MaxAdViewImpl.this.f8491s = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    p pVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdViewAdListener.onAdExpanded(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    defpackage.e.B(sb2, MaxAdViewImpl.this.adListener, pVar2, str);
                }
                v2.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8489q)) {
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    p pVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    defpackage.e.B(sb2, MaxAdViewImpl.this.adListener, pVar2, str);
                }
                v2.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            p pVar = MaxAdViewImpl.this.logger;
            if (p.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                p pVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sbK = u.k("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbK.append(MaxAdViewImpl.this.requestListener);
                pVar2.a(str2, sbK.toString());
            }
            v2.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            p pVar = MaxAdViewImpl.this.logger;
            if (p.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            v2.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            p pVar = MaxAdViewImpl.this.logger;
            if (p.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f8496x) {
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Successfully precached ad for refresh");
                }
                if (((Boolean) MaxAdViewImpl.this.sdk.a(t3.M7)).booleanValue()) {
                    MaxAdViewImpl.this.b(maxAd);
                    return;
                } else {
                    MaxAdViewImpl.this.a(maxAd);
                    return;
                }
            }
            p pVar2 = MaxAdViewImpl.this.logger;
            if (p.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.Z().destroyAd(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, MaxAdView maxAdView, View view, Context context) {
        super(str, maxAdFormat, "MaxAdView", AppLovinSdk.getInstance(context).a());
        this.f8476c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f8478e = Long.MAX_VALUE;
        this.f8487o = new Object();
        this.f8488p = new Object();
        this.f8489q = null;
        this.f8490r = null;
        this.f8494v = new AtomicBoolean();
        this.f8496x = false;
        this.f8474a = context.getApplicationContext();
        this.f8475b = maxAdView;
        this.f8477d = view;
        this.f8483j = new b();
        this.f8484k = new d();
        this.l = new com.applovin.impl.sdk.g(this.sdk, this);
        this.f8485m = new h8(maxAdView, this.sdk);
        this.f8486n = new i8(maxAdView, this.sdk, this);
        this.f8482i = maxAdViewConfiguration;
        this.sdk.k().a(this);
        if (maxAdViewConfiguration != null && maxAdViewConfiguration.getAdaptiveType() != MaxAdViewConfiguration.AdaptiveType.NONE) {
            setExtraParameter("adaptive_banner", Boolean.toString(true));
            setLocalExtraParameter("adaptive_banner_type", maxAdViewConfiguration.getAdaptiveType().toString());
            int adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth();
            if (adaptiveWidth > 0) {
                setLocalExtraParameter("adaptive_banner_width", Integer.valueOf(adaptiveWidth));
            }
            int inlineMaximumHeight = maxAdViewConfiguration.getInlineMaximumHeight();
            if (inlineMaximumHeight > 0) {
                setLocalExtraParameter("inline_adaptive_banner_max_height", Integer.valueOf(inlineMaximumHeight));
            }
        }
        a(str);
        if (p.a()) {
            this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        if (((Boolean) this.sdk.a(t3.N7)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.c(this, 0));
        } else {
            g();
        }
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f8480g;
    }

    public void loadAd() {
        loadAd(com.applovin.impl.i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.g.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.a(t3.M7)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        d3 d3Var = this.f8489q;
        if (d3Var != null && d3Var.T().equalsIgnoreCase(str)) {
            this.f8489q.h(str2);
            v2.b(this.adReviewListener, str2, this.f8489q);
            return;
        }
        d3 d3Var2 = this.f8479f;
        if (d3Var2 == null || !d3Var2.T().equalsIgnoreCase(str)) {
            return;
        }
        this.f8479f.h(str2);
    }

    @Override // com.applovin.impl.i8.a
    public void onLogVisibilityImpression() {
        a(this.f8489q, this.f8485m.a(this.f8489q));
    }

    public void onWindowVisibilityChanged(int i10) {
        if (((Boolean) this.sdk.a(t3.J7)).booleanValue() && this.l.h()) {
            if (g8.b(i10)) {
                if (p.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.l.d();
            } else {
                if (p.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.l.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f8489q != null && p.a()) {
            p pVar = this.logger;
            String str2 = this.tag;
            StringBuilder sbK = u.k("Setting custom data (", str, ") for Ad Unit ID (");
            sbK.append(this.adUnitId);
            sbK.append(") after an ad has been loaded already.");
            pVar.k(str2, sbK.toString());
        }
        q7.b(str, this.tag);
        this.f8481h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f8489q != null && p.a()) {
            p pVar = this.logger;
            String str2 = this.tag;
            StringBuilder sbK = u.k("Setting placement (", str, ") for Ad Unit ID (");
            sbK.append(this.adUnitId);
            sbK.append(") after an ad has been loaded already.");
            pVar.k(str2, sbK.toString());
        }
        this.f8480g = str;
    }

    public void setPublisherBackgroundColor(int i10) {
        this.f8478e = i10;
    }

    public void startAutoRefresh() {
        this.f8493u = false;
        if (!this.l.g()) {
            if (p.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.l.m();
        if (p.a()) {
            this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.l.b() + "ms");
        }
    }

    public void stopAutoRefresh() {
        if (this.f8489q == null) {
            if (this.f8497y || ((Boolean) this.sdk.a(t3.L7)).booleanValue()) {
                this.f8493u = true;
                return;
            } else {
                p.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (p.a()) {
            this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.l.b() + "ms");
        }
        this.l.j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdView{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f8475b) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", isDestroyed=");
        return defpackage.e.t(sb2, a(), '}');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d3 d3Var) {
        AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.d(this, d3Var, 0));
    }

    private void e() {
        this.f8494v.set(false);
        if (this.f8479f != null) {
            i();
            return;
        }
        if (!b()) {
            if (p.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(com.applovin.impl.i.REFRESH);
        } else if (this.f8492t) {
            if (p.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(com.applovin.impl.i.REFRESH);
        } else {
            if (p.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f8494v.set(true);
        }
    }

    private void f() {
        boolean z10;
        boolean z11;
        synchronized (this.f8488p) {
            try {
                z10 = false;
                this.f8494v.set(false);
                z11 = this.f8479f != null;
                if (!z11) {
                    if (b()) {
                        if (!this.f8492t) {
                            if (p.a()) {
                                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                            }
                            this.f8494v.set(true);
                        } else if (p.a()) {
                            this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                        }
                    } else if (p.a()) {
                        this.logger.a(this.tag, "Refreshing ad from network...");
                    }
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            i();
        } else if (z10) {
            loadAd(com.applovin.impl.i.REFRESH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        h();
        if (this.f8479f != null) {
            this.sdk.Z().destroyAd(this.f8479f);
        }
        synchronized (this.f8487o) {
            this.f8496x = true;
        }
        this.l.a();
        this.sdk.k().b(this);
        if (this.sdk.T() != null) {
            this.sdk.T().c(this.adUnitId, this.f8476c);
        } else {
            this.sdk.S().c(this.adUnitId, this.f8476c);
        }
        super.destroy();
    }

    private void h() {
        d3 d3Var;
        if (this.f8475b != null) {
            if (((Boolean) this.sdk.a(z4.Z6)).booleanValue()) {
                s.b(this.f8475b, this.f8477d);
            } else {
                s.a(this.f8475b, this.f8477d);
            }
        }
        this.f8486n.b();
        synchronized (this.f8487o) {
            d3Var = this.f8489q;
        }
        MaxAd maxAd = this.f8490r;
        if (maxAd != null && maxAd.equals(d3Var)) {
            if (p.a()) {
                this.logger.a(this.tag, "Collapsing ad manually for removed ad.");
            }
            v2.b(this.f8483j, maxAd);
        }
        if (d3Var != null) {
            this.sdk.Z().destroyAd(d3Var);
        }
    }

    private void i() {
        if (p.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f8479f + "...");
        }
        this.f8483j.onAdLoaded(this.f8479f);
        this.f8479f = null;
    }

    public void loadAd(com.applovin.impl.i iVar) {
        if (p.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z10 = this.f8497y || ((Boolean) this.sdk.a(t3.L7)).booleanValue();
        if (z10 && !this.l.g() && this.l.h()) {
            p.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.l.b()) + " seconds.");
            return;
        }
        if (!z10) {
            if (p.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.f8483j);
        } else if (this.f8479f != null) {
            if (p.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            i();
        } else if (this.f8495w) {
            if (p.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.f8494v.set(true);
        } else {
            if (p.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.f8483j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d3 d3Var) {
        View viewZ = d3Var.z();
        String str = viewZ == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f8475b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (p.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (p.a()) {
                p pVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(d3Var);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                defpackage.e.B(sb2, this.adListener, pVar, str2);
            }
            v2.a(this.adListener, (MaxAd) d3Var, (MaxError) maxErrorImpl, true);
            this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, d3Var);
            return;
        }
        h();
        a((a3) d3Var);
        if (d3Var.t0()) {
            this.f8486n.a(d3Var);
        }
        maxAdView.setDescendantFocusability(393216);
        if (d3Var.v0() != Long.MAX_VALUE) {
            this.f8477d.setBackgroundColor((int) d3Var.v0());
        } else {
            long j10 = this.f8478e;
            if (j10 != Long.MAX_VALUE) {
                this.f8477d.setBackgroundColor((int) j10);
            } else {
                this.f8477d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(viewZ);
        a(viewZ, d3Var);
        this.sdk.z().d(d3Var);
        c(d3Var);
        synchronized (this.f8487o) {
            this.f8489q = d3Var;
        }
        if (p.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.Z().processRawAdImpression(d3Var, this.f8483j);
        if (StringUtils.isValidString(this.f8489q.getAdReviewCreativeId())) {
            v2.a(this.adReviewListener, this.f8489q.getAdReviewCreativeId(), (MaxAd) this.f8489q, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new com.applovin.impl.mediation.ads.d(this, d3Var, 1), d3Var.x0());
    }

    private void d() {
        if (b()) {
            if (p.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f8495w = true;
            this.sdk.s0().a((k5) new u6(this.sdk, "loadMaxAdForPrecacheRequest", new com.applovin.impl.mediation.ads.c(this, 1)), f6.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (p.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE, this.f8484k);
    }

    private void a(com.applovin.impl.i iVar, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        if (a()) {
            boolean zC = q7.c(this.sdk);
            this.sdk.E().a(f2.f7836a1, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + zC));
            if (!zC) {
                p.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            } else {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        AppLovinSdkUtils.runOnUiThread(true, new androidx.fragment.app.d(this, interfaceC0010a, iVar, 12));
    }

    private void c(d3 d3Var) {
        int height = this.f8475b.getHeight();
        int width = this.f8475b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f8474a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f8474a, width);
            MaxAdFormat format = d3Var.getFormat();
            int height2 = (this.D ? format.getAdaptiveSize(iPxToDp2, this.f8475b.getContext()) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), p0.b(this.f8474a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sbL = l1.d.l("\n**************************************************\n`MaxAdView` size ", iPxToDp2, "x", iPxToDp, " dp smaller than required ");
                sbL.append(this.D ? "adaptive " : "");
                sbL.append("size: ");
                sbL.append(iMin);
                sbL.append("x");
                String strI = l1.d.i(sbL, height2, " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                if (p.a()) {
                    this.logger.b("AppLovinSdk", strI);
                }
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putInt(jSONObject, "container_width_dp", iPxToDp2);
                JsonUtils.putInt(jSONObject, "container_height_dp", iPxToDp);
                JsonUtils.putInt(jSONObject, "required_width_dp", iMin);
                JsonUtils.putInt(jSONObject, "required_height_dp", height2);
                JsonUtils.putBoolean(jSONObject, "is_adaptive", this.D);
                this.sdk.E().a(f2.f7836a1, "adViewContainerUndersized", CollectionUtils.hashMap("details", jSONObject.toString()), this.f8476c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a, com.applovin.impl.i iVar) {
        int adaptiveWidth;
        d3 d3Var = this.f8489q;
        if (d3Var != null) {
            long jA = this.f8485m.a(d3Var);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f8489q.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(jA));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f8475b.getContext(), this.f8475b.getWidth());
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f8475b.getContext(), this.f8475b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(iPxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.l.g() || this.f8493u));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f8498z));
        MaxAdViewConfiguration maxAdViewConfiguration = this.f8482i;
        if (maxAdViewConfiguration != null && (adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth()) > 0 && iPxToDp != adaptiveWidth) {
            p.j(this.tag, l1.d.f("The requested adaptive ad view width (", adaptiveWidth, " dp) is different from the MaxAdView width (", iPxToDp, " dp)."));
        }
        if (p.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0010a + "...");
        }
        this.sdk.Z().loadAd(this.adUnitId, this.f8476c, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, this.f8474a, interfaceC0010a);
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (p.a()) {
                defpackage.e.A("Updated allow immediate auto-refresh pause and ad load to: ", str2, this.logger, this.tag);
            }
            this.f8497y = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (p.a()) {
                defpackage.e.A("Updated disable auto-retries to: ", str2, this.logger, this.tag);
            }
            this.f8498z = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (p.a()) {
                defpackage.e.A("Updated precached disabled to: ", str2, this.logger, this.tag);
            }
            this.A = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (p.a()) {
                defpackage.e.A("Updated should stop auto-refresh on ad expand to: ", str2, this.logger, this.tag);
            }
            this.B = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (p.a()) {
                defpackage.e.A("Updated force precache to: ", str2, this.logger, this.tag);
            }
            this.C = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (p.a()) {
                defpackage.e.A("Updated is adaptive banner to: ", str2, this.logger, this.tag);
            }
            if (this.f8482i == null) {
                p.h(this.tag, "You configured adaptive banners incorrectly by setting extra parameters to the MaxAdView! Please configure adaptive banners via MaxAdViewConfiguration instead. Learn more: https://support.axon.ai/en/max/android/ad-formats/banner-and-mrec-ads#adaptive-banners");
            }
            this.D = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MaxAd maxAd) {
        boolean zCompareAndSet;
        this.f8495w = false;
        synchronized (this.f8488p) {
            try {
                zCompareAndSet = this.f8494v.compareAndSet(true, false);
                if (!zCompareAndSet) {
                    if (p.a()) {
                        this.logger.a(this.tag, "Saving precache ad...");
                    }
                    d3 d3Var = (d3) maxAd;
                    this.f8479f = d3Var;
                    d3Var.g(this.f8480g);
                    this.f8479f.f(this.f8481h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zCompareAndSet) {
            if (p.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f8483j.onAdLoaded(maxAd);
        }
    }

    private boolean b() {
        if (this.A) {
            return false;
        }
        return ((Boolean) this.sdk.a(t3.S7)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(d3 d3Var) {
        long jA = this.f8485m.a(d3Var);
        if (!d3Var.t0()) {
            a(d3Var, jA);
        }
        a(jA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (a()) {
            if (p.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(t3.F7).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.Q();
            if (p.a()) {
                this.sdk.Q().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f8493u && !this.l.g()) {
            this.f8492t = true;
            this.f8495w = false;
            long jLongValue = ((Long) this.sdk.a(t3.E7)).longValue();
            if (jLongValue >= 0) {
                this.sdk.Q();
                if (p.a()) {
                    p pVarQ = this.sdk.Q();
                    String str = this.tag;
                    StringBuilder sbL = wi.d.l(jLongValue, "Scheduling failed banner ad refresh ", " milliseconds from now for '");
                    sbL.append(this.adUnitId);
                    sbL.append("'...");
                    pVarQ.a(str, sbL.toString());
                }
                this.l.a(jLongValue);
                return;
            }
            return;
        }
        if (this.f8495w) {
            if (p.a()) {
                this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.f8495w = false;
        }
        if (this.f8494v.get()) {
            if (p.a()) {
                p pVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(this.adUnitId);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                defpackage.e.B(sb2, this.adListener, pVar, str2);
            }
            v2.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(String str) {
        int iIntValue;
        synchronized (F) {
            try {
                Map map = E;
                Integer num = (Integer) map.get(str);
                iIntValue = num != null ? 1 + num.intValue() : 1;
                map.put(str, Integer.valueOf(iIntValue));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iIntValue == ((Integer) this.sdk.a(t3.A8)).intValue()) {
            p.j(this.tag, "You are creating multiple MaxAdView instances for ad unit (" + str + ")! For best ad performance, please use a single MaxAdView instance and call loadAd() to refresh.");
            this.sdk.E().a(f2.f7836a1, "excessiveAdViewAllocations", CollectionUtils.hashMap("ad_unit_id", str));
        }
    }

    private void a(View view, d3 d3Var) {
        int iY0 = d3Var.y0();
        int iW0 = d3Var.w0();
        int iDpToPx = iY0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), iY0);
        int iDpToPx2 = iW0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iW0) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (p.a()) {
                this.logger.a(this.tag, l1.d.f("Pinning ad view to MAX ad view with width: ", iDpToPx, " and height: ", iDpToPx2, "."));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i10 : g8.a(this.f8475b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i10);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void a(d3 d3Var, long j10) {
        if (p.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.Z().processViewabilityAdImpressionPostback(d3Var, j10, this.f8483j);
    }

    private void a(long j10) {
        if (q7.a(j10, ((Long) this.sdk.a(t3.R7)).longValue()) && !this.C) {
            if (p.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j10) + ", undesired: " + Long.toBinaryString(j10));
            }
            if (p.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f8492t = true;
            return;
        }
        if (p.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.f8492t = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f8495w = false;
        if (this.f8494v.compareAndSet(true, false)) {
            if (p.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f8483j.onAdLoaded(maxAd);
            return;
        }
        if (p.a()) {
            this.logger.a(this.tag, "Saving precache ad...");
        }
        d3 d3Var = (d3) maxAd;
        this.f8479f = d3Var;
        d3Var.g(this.f8480g);
        this.f8479f.f(this.f8481h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z10;
        synchronized (this.f8487o) {
            z10 = this.f8496x;
        }
        return z10;
    }
}

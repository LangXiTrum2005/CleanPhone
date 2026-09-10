package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a3 extends m3 implements MaxAd {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f7381k;
    private final AtomicBoolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f7382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c3 f7383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected com.applovin.impl.mediation.h f7384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f7385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MaxAdWaterfallInfo f7386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f7387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f7388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f7389t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f7390u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f7391v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f7392w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f7393x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f7394y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f7395z;

    public a3(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.l lVar) {
        super(c3Var.e(), jSONObject, jSONObject2, lVar);
        this.f7381k = new AtomicBoolean();
        this.l = new AtomicBoolean();
        this.f7382m = new AtomicBoolean();
        this.f7383n = c3Var;
        this.f7384o = hVar;
        this.f7385p = hVar != null ? hVar.b() : null;
    }

    private long M() {
        return a("load_started_time_ms", 0L);
    }

    public static a3 a(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat fromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(fromString, "Invalid ad format for string: " + string);
        if (fromString.isAdViewAd()) {
            return new d3(c3Var, jSONObject, jSONObject2, lVar);
        }
        if (fromString == MaxAdFormat.NATIVE) {
            return new f3(c3Var, jSONObject, jSONObject2, lVar);
        }
        if (fromString.isFullscreenAd()) {
            return new e3(c3Var, jSONObject, jSONObject2, lVar);
        }
        throw new IllegalArgumentException(defpackage.e.n("Unsupported ad format: ", string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject b(j5 j5Var) {
        return JsonUtils.deepCopy(j5Var.a("ad_values", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle c(j5 j5Var) {
        JSONObject jSONObjectY;
        if (j5Var.a("credentials")) {
            jSONObjectY = defpackage.e.y(j5Var, "credentials");
        } else {
            JSONObject jSONObjectY2 = defpackage.e.y(j5Var, "server_parameters");
            JsonUtils.putString(jSONObjectY2, "placement_id", U());
            jSONObjectY = jSONObjectY2;
        }
        return JsonUtils.toBundle(jSONObjectY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject d(j5 j5Var) {
        return JsonUtils.deepCopy(j5Var.a("publisher_extra_info", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double e(j5 j5Var) {
        return Double.valueOf(JsonUtils.getDouble(j5Var.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject f(j5 j5Var) {
        return JsonUtils.deepCopy(j5Var.a("revenue_parameters", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(j5 j5Var) {
        return JsonUtils.getString(j5Var.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public String A() {
        return this.f7385p;
    }

    public com.applovin.impl.mediation.h B() {
        return this.f7384o;
    }

    public String C() {
        return a("bcode", "");
    }

    public long D() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public String E() {
        return a("bid_response", (String) null);
    }

    public Bundle F() {
        JSONObject jSONObjectA;
        j5 j5Var = this.f8402h;
        if (j5Var != null) {
            return (Bundle) j5Var.a(new t8(this, 0));
        }
        if (c("credentials")) {
            jSONObjectA = a("credentials", new JSONObject());
        } else {
            JSONObject jSONObjectA2 = a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA2, "placement_id", U());
            jSONObjectA = jSONObjectA2;
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    public long G() {
        return this.f7393x;
    }

    public double H() {
        return a("ecpm", -1.0f);
    }

    public long I() {
        if (M() > 0) {
            return L() - M();
        }
        return -1L;
    }

    public double J() {
        return a("floor", -1.0d);
    }

    public long K() {
        return this.f7391v;
    }

    public long L() {
        return a("load_completed_time_ms", 0L);
    }

    public String N() {
        return this.f7394y;
    }

    public int O() {
        return a("mspc", ((Integer) this.f8395a.a(t3.f9774m8)).intValue());
    }

    public JSONObject P() {
        j5 j5Var = this.f8402h;
        return j5Var != null ? (JSONObject) j5Var.a(new ae.b(20)) : a("publisher_extra_info", new JSONObject());
    }

    public c3 Q() {
        return this.f7383n;
    }

    public String R() {
        return JsonUtils.getString(S(), "revenue_event", "");
    }

    public JSONObject S() {
        j5 j5Var = this.f8402h;
        return j5Var != null ? (JSONObject) j5Var.a(new ae.b(21)) : a("revenue_parameters", new JSONObject());
    }

    public String T() {
        return b("event_id", "");
    }

    public String U() {
        return a("third_party_ad_placement_id", (String) null);
    }

    public long V() {
        return this.f7392w;
    }

    public List W() {
        return b("mwf_info_urls");
    }

    public String X() {
        return b("waterfall_name", "");
    }

    public String Y() {
        return b("waterfall_test_name", "");
    }

    public boolean Z() {
        return StringUtils.isValidString(E());
    }

    public abstract a3 a(com.applovin.impl.mediation.h hVar);

    public boolean a0() {
        com.applovin.impl.mediation.h hVar = this.f7384o;
        return hVar != null && hVar.k() && this.f7384o.j();
    }

    public boolean b0() {
        return a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean c0() {
        return a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    public void d0() {
        this.f7393x = SystemClock.elapsedRealtime() - this.f7389t;
    }

    public void e0() {
        this.f7388s = SystemClock.elapsedRealtime();
        this.f7390u = this.f8395a.o0().getTotalBackgroundDurationMillis();
    }

    public void f0() {
        long totalBackgroundDurationMillis = this.f8395a.o0().getTotalBackgroundDurationMillis() - this.f7390u;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f7388s;
        this.f7392w = jElapsedRealtime;
        this.f7391v = jElapsedRealtime - totalBackgroundDurationMillis;
    }

    public void g0() {
        this.f7389t = SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f7395z;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a(CampaignEx.JSON_KEY_CREATIVE_ID, (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a("ad_format", b("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.h hVar = this.f7384o;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(U());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f7387r;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (!((Boolean) this.f8395a.a(t3.f9780r8)).booleanValue() || !getFormat().isFullscreenAd() || u().get()) {
            j5 j5Var = this.f8402h;
            return j5Var != null ? ((Double) j5Var.a(new ae.b(19))).doubleValue() : JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f8395a.Q();
        if (!com.applovin.impl.sdk.p.a()) {
            return 0.0d;
        }
        this.f8395a.Q().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        j5 j5Var = this.f8402h;
        return j5Var != null ? (String) j5Var.a(new ae.b(18)) : JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int iA = a("ad_width", -3);
        int iA2 = a("ad_height", -3);
        return (iA == -3 || iA2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(iA, iA2);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f7386q;
    }

    public void h(String str) {
        this.f7395z = str;
    }

    public void h0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void i(String str) {
        this.f7394y = str;
    }

    public void i0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public Boolean j0() {
        return a("destroy_on_ui_thread", (Boolean) null);
    }

    public Boolean k0() {
        return a("load_on_ui_thread", (Boolean) null);
    }

    public Boolean l0() {
        return a("show_on_ui_thread", (Boolean) null);
    }

    @Override // com.applovin.impl.m3
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + U() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public View z() {
        com.applovin.impl.mediation.h hVar;
        if (!a0() || (hVar = this.f7384o) == null) {
            return null;
        }
        return hVar.d();
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject jSONObjectY = y();
        if (jSONObjectY.has(str)) {
            return JsonUtils.getString(jSONObjectY, str, str2);
        }
        Bundle bundleL = l();
        if (bundleL.containsKey(str)) {
            return bundleL.getString(str);
        }
        JSONObject jSONObjectP = P();
        return jSONObjectP.has(str) ? JsonUtils.getString(jSONObjectP, str, str2) : a(str, str2);
    }

    public void t() {
        this.f7384o = null;
        this.f7386q = null;
    }

    public AtomicBoolean u() {
        return this.f7381k;
    }

    public String v() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean w() {
        return this.f7382m;
    }

    public AtomicBoolean x() {
        return this.l;
    }

    public JSONObject y() {
        j5 j5Var = this.f8402h;
        return j5Var != null ? (JSONObject) j5Var.a(new ae.b(22)) : a("ad_values", new JSONObject());
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f7386q = maxAdWaterfallInfo;
    }

    public void a(long j10) {
        this.f7387r = j10;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectP = P();
        JsonUtils.putAll(jSONObjectP, jSONObject);
        a("publisher_extra_info", (Object) jSONObjectP);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && !c(CampaignEx.JSON_KEY_CREATIVE_ID)) {
            c(CampaignEx.JSON_KEY_CREATIVE_ID, BundleUtils.getString(CampaignEx.JSON_KEY_CREATIVE_ID, bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i10 = BundleUtils.getInt("ad_width", bundle);
            int i11 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i10);
            c("ad_height", i11);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}

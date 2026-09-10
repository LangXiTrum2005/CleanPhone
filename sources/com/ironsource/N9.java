package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class N9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f26646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0576t f26647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0576t f26648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0576t f26649f;

    public N9(int i10, String controllerUrl, JSONObject controllerConfig, C0576t bannerConfig, C0576t interstitialConfig, C0576t rewardedConfig) {
        kotlin.jvm.internal.n.f(controllerUrl, "controllerUrl");
        kotlin.jvm.internal.n.f(controllerConfig, "controllerConfig");
        kotlin.jvm.internal.n.f(bannerConfig, "bannerConfig");
        kotlin.jvm.internal.n.f(interstitialConfig, "interstitialConfig");
        kotlin.jvm.internal.n.f(rewardedConfig, "rewardedConfig");
        this.f26644a = i10;
        this.f26645b = controllerUrl;
        this.f26646c = controllerConfig;
        this.f26647d = bannerConfig;
        this.f26648e = interstitialConfig;
        this.f26649f = rewardedConfig;
    }

    public final int a() {
        return this.f26644a;
    }

    public final String b() {
        return this.f26645b;
    }

    public final JSONObject c() {
        return this.f26646c;
    }

    public final C0576t d() {
        return this.f26647d;
    }

    public final C0576t e() {
        return this.f26648e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N9)) {
            return false;
        }
        N9 n9 = (N9) obj;
        return this.f26644a == n9.f26644a && kotlin.jvm.internal.n.a(this.f26645b, n9.f26645b) && kotlin.jvm.internal.n.a(this.f26646c, n9.f26646c) && kotlin.jvm.internal.n.a(this.f26647d, n9.f26647d) && kotlin.jvm.internal.n.a(this.f26648e, n9.f26648e) && kotlin.jvm.internal.n.a(this.f26649f, n9.f26649f);
    }

    public final C0576t f() {
        return this.f26649f;
    }

    public final C0576t g() {
        return this.f26647d;
    }

    public final JSONObject h() {
        return this.f26646c;
    }

    public int hashCode() {
        return this.f26649f.hashCode() + ((this.f26648e.hashCode() + ((this.f26647d.hashCode() + ((this.f26646c.hashCode() + d5.u.e(Integer.hashCode(this.f26644a) * 31, 31, this.f26645b)) * 31)) * 31)) * 31);
    }

    public final String i() {
        return this.f26645b;
    }

    public final C0576t j() {
        return this.f26648e;
    }

    public final int k() {
        return this.f26644a;
    }

    public final C0576t l() {
        return this.f26649f;
    }

    public String toString() {
        return "IronSourceAdsInitConfig(logLevel=" + this.f26644a + ", controllerUrl=" + this.f26645b + ", controllerConfig=" + this.f26646c + ", bannerConfig=" + this.f26647d + ", interstitialConfig=" + this.f26648e + ", rewardedConfig=" + this.f26649f + ")";
    }

    public final N9 a(int i10, String controllerUrl, JSONObject controllerConfig, C0576t bannerConfig, C0576t interstitialConfig, C0576t rewardedConfig) {
        kotlin.jvm.internal.n.f(controllerUrl, "controllerUrl");
        kotlin.jvm.internal.n.f(controllerConfig, "controllerConfig");
        kotlin.jvm.internal.n.f(bannerConfig, "bannerConfig");
        kotlin.jvm.internal.n.f(interstitialConfig, "interstitialConfig");
        kotlin.jvm.internal.n.f(rewardedConfig, "rewardedConfig");
        return new N9(i10, controllerUrl, controllerConfig, bannerConfig, interstitialConfig, rewardedConfig);
    }

    public static /* synthetic */ N9 a(N9 n9, int i10, String str, JSONObject jSONObject, C0576t c0576t, C0576t c0576t2, C0576t c0576t3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = n9.f26644a;
        }
        if ((i11 & 2) != 0) {
            str = n9.f26645b;
        }
        if ((i11 & 4) != 0) {
            jSONObject = n9.f26646c;
        }
        if ((i11 & 8) != 0) {
            c0576t = n9.f26647d;
        }
        if ((i11 & 16) != 0) {
            c0576t2 = n9.f26648e;
        }
        if ((i11 & 32) != 0) {
            c0576t3 = n9.f26649f;
        }
        C0576t c0576t4 = c0576t2;
        C0576t c0576t5 = c0576t3;
        return n9.a(i10, str, jSONObject, c0576t, c0576t4, c0576t5);
    }
}

package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.q4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0528q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30086d;

    public C0528q4() {
        this(null, null, null, null, 15, null);
    }

    public final String a() {
        return this.f30083a;
    }

    public final String b() {
        return this.f30084b;
    }

    public final String c() {
        return this.f30085c;
    }

    public final String d() {
        return this.f30086d;
    }

    public final String e() {
        return this.f30086d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0528q4)) {
            return false;
        }
        C0528q4 c0528q4 = (C0528q4) obj;
        return kotlin.jvm.internal.n.a(this.f30083a, c0528q4.f30083a) && kotlin.jvm.internal.n.a(this.f30084b, c0528q4.f30084b) && kotlin.jvm.internal.n.a(this.f30085c, c0528q4.f30085c) && kotlin.jvm.internal.n.a(this.f30086d, c0528q4.f30086d);
    }

    public final String f() {
        return this.f30085c;
    }

    public final String g() {
        return this.f30083a;
    }

    public final String h() {
        return this.f30084b;
    }

    public int hashCode() {
        return this.f30086d.hashCode() + d5.u.e(d5.u.e(this.f30083a.hashCode() * 31, 31, this.f30084b), 31, this.f30085c);
    }

    public String toString() {
        String str = this.f30083a;
        String str2 = this.f30084b;
        return d5.u.h(defpackage.e.v("CustomAdapterSettings(customNetworkAdapterName=", str, ", customRewardedVideoAdapterName=", str2, ", customInterstitialAdapterName="), this.f30085c, ", customBannerAdapterName=", this.f30086d, ")");
    }

    public C0528q4(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        kotlin.jvm.internal.n.f(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.n.f(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.n.f(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.n.f(customBannerAdapterName, "customBannerAdapterName");
        this.f30083a = customNetworkAdapterName;
        this.f30084b = customRewardedVideoAdapterName;
        this.f30085c = customInterstitialAdapterName;
        this.f30086d = customBannerAdapterName;
    }

    public final C0528q4 a(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        kotlin.jvm.internal.n.f(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.n.f(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.n.f(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.n.f(customBannerAdapterName, "customBannerAdapterName");
        return new C0528q4(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public static /* synthetic */ C0528q4 a(C0528q4 c0528q4, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c0528q4.f30083a;
        }
        if ((i10 & 2) != 0) {
            str2 = c0528q4.f30084b;
        }
        if ((i10 & 4) != 0) {
            str3 = c0528q4.f30085c;
        }
        if ((i10 & 8) != 0) {
            str4 = c0528q4.f30086d;
        }
        return c0528q4.a(str, str2, str3, str4);
    }

    public /* synthetic */ C0528q4(String str, String str2, String str3, String str4, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}

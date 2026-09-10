package com.ironsource;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3685p4 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public C3685p4() {
        this(null, null, null, null, 15, null);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3685p4)) {
            return false;
        }
        C3685p4 c3685p4 = (C3685p4) obj;
        return Intrinsics.wireman(this.a, c3685p4.a) && Intrinsics.wireman(this.b, c3685p4.b) && Intrinsics.wireman(this.c, c3685p4.c) && Intrinsics.wireman(this.d, c3685p4.d);
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.a + ", customRewardedVideoAdapterName=" + this.b + ", customInterstitialAdapterName=" + this.c + ", customBannerAdapterName=" + this.d + ")";
    }

    public C3685p4(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        this.a = customNetworkAdapterName;
        this.b = customRewardedVideoAdapterName;
        this.c = customInterstitialAdapterName;
        this.d = customBannerAdapterName;
    }

    public final C3685p4 a(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        return new C3685p4(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public static /* synthetic */ C3685p4 a(C3685p4 c3685p4, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3685p4.a;
        }
        if ((i & 2) != 0) {
            str2 = c3685p4.b;
        }
        if ((i & 4) != 0) {
            str3 = c3685p4.c;
        }
        if ((i & 8) != 0) {
            str4 = c3685p4.d;
        }
        return c3685p4.a(str, str2, str3, str4);
    }

    public /* synthetic */ C3685p4(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}

package com.p004ironsource;

import androidx.datastore.preferences.protobuf.a;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/ironsource/t9;", "", "", "a", "b", "c", "d", "customNetworkAdapterName", "customRewardedVideoAdapterName", "customInterstitialAdapterName", "customBannerAdapterName", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", g.f40227p, "()Ljava/lang/String;", h.f36614b, f.j, "e", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class t9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String customNetworkAdapterName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String customRewardedVideoAdapterName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String customInterstitialAdapterName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String customBannerAdapterName;

    public t9() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ t9 a(t9 t9Var, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = t9Var.customNetworkAdapterName;
        }
        if ((i2 & 2) != 0) {
            str2 = t9Var.customRewardedVideoAdapterName;
        }
        if ((i2 & 4) != 0) {
            str3 = t9Var.customInterstitialAdapterName;
        }
        if ((i2 & 8) != 0) {
            str4 = t9Var.customBannerAdapterName;
        }
        return t9Var.a(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCustomRewardedVideoAdapterName() {
        return this.customRewardedVideoAdapterName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCustomInterstitialAdapterName() {
        return this.customInterstitialAdapterName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCustomBannerAdapterName() {
        return this.customBannerAdapterName;
    }

    public final String e() {
        return this.customBannerAdapterName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) other;
        return Intrinsics.a(this.customNetworkAdapterName, t9Var.customNetworkAdapterName) && Intrinsics.a(this.customRewardedVideoAdapterName, t9Var.customRewardedVideoAdapterName) && Intrinsics.a(this.customInterstitialAdapterName, t9Var.customInterstitialAdapterName) && Intrinsics.a(this.customBannerAdapterName, t9Var.customBannerAdapterName);
    }

    public final String f() {
        return this.customInterstitialAdapterName;
    }

    public final String g() {
        return this.customNetworkAdapterName;
    }

    public final String h() {
        return this.customRewardedVideoAdapterName;
    }

    public int hashCode() {
        return this.customBannerAdapterName.hashCode() + a.b(this.customInterstitialAdapterName, a.b(this.customRewardedVideoAdapterName, this.customNetworkAdapterName.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomAdapterSettings(customNetworkAdapterName=");
        sb.append(this.customNetworkAdapterName);
        sb.append(", customRewardedVideoAdapterName=");
        sb.append(this.customRewardedVideoAdapterName);
        sb.append(", customInterstitialAdapterName=");
        sb.append(this.customInterstitialAdapterName);
        sb.append(", customBannerAdapterName=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.customBannerAdapterName, ')');
    }

    public t9(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        Intrinsics.f(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.f(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.f(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.f(customBannerAdapterName, "customBannerAdapterName");
        this.customNetworkAdapterName = customNetworkAdapterName;
        this.customRewardedVideoAdapterName = customRewardedVideoAdapterName;
        this.customInterstitialAdapterName = customInterstitialAdapterName;
        this.customBannerAdapterName = customBannerAdapterName;
    }

    public final t9 a(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        Intrinsics.f(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.f(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.f(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.f(customBannerAdapterName, "customBannerAdapterName");
        return new t9(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public /* synthetic */ t9(String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCustomNetworkAdapterName() {
        return this.customNetworkAdapterName;
    }
}

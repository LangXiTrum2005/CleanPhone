package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum cl implements us1 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13209a;

    cl(int i10) {
        this.f13209a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13209a);
    }

    @Override // com.google.android.gms.internal.ads.us1
    public final int zza() {
        return this.f13209a;
    }
}

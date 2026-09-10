package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum qj implements us1 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19106a;

    qj(int i10) {
        this.f19106a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f19106a);
    }

    @Override // com.google.android.gms.internal.ads.us1
    public final int zza() {
        return this.f19106a;
    }
}

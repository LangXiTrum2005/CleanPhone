package com.startapp.sdk.ads.nativead;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f40511a;

    static {
        int[] iArr = new int[StartAppNativeAd.CampaignAction.values().length];
        f40511a = iArr;
        try {
            iArr[StartAppNativeAd.CampaignAction.OPEN_MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f40511a[StartAppNativeAd.CampaignAction.LAUNCH_APP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

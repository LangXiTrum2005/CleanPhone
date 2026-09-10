package com.startapp.sdk.adsbase;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f40678a;

    static {
        int[] iArr = new int[StartAppAd.AdMode.values().length];
        f40678a = iArr;
        try {
            iArr[StartAppAd.AdMode.FULLPAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f40678a[StartAppAd.AdMode.OFFERWALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f40678a[StartAppAd.AdMode.OVERLAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f40678a[StartAppAd.AdMode.REWARDED_VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

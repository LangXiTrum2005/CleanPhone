package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.StartAppAd;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f41260a;

    static {
        int[] iArr = new int[StartAppAd.AdMode.values().length];
        f41260a = iArr;
        try {
            iArr[StartAppAd.AdMode.OFFERWALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f41260a[StartAppAd.AdMode.OVERLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f41260a[StartAppAd.AdMode.FULLPAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f41260a[StartAppAd.AdMode.VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f41260a[StartAppAd.AdMode.REWARDED_VIDEO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f41260a[StartAppAd.AdMode.AUTOMATIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

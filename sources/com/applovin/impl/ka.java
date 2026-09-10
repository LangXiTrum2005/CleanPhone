package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdListener f8316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAd f8317d;

    public /* synthetic */ ka(boolean z10, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, int i10) {
        this.f8314a = i10;
        this.f8315b = z10;
        this.f8316c = maxNativeAdListener;
        this.f8317d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8314a) {
            case 0:
                v2.b(this.f8315b, this.f8316c, this.f8317d);
                break;
            default:
                v2.a(this.f8315b, this.f8316c, this.f8317d);
                break;
        }
    }
}

package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class la implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewAdListener f8376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAd f8377d;

    public /* synthetic */ la(boolean z10, MaxAdViewAdListener maxAdViewAdListener, MaxAd maxAd, int i10) {
        this.f8374a = i10;
        this.f8375b = z10;
        this.f8376c = maxAdViewAdListener;
        this.f8377d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8374a) {
            case 0:
                v2.b(this.f8375b, this.f8376c, this.f8377d);
                break;
            default:
                v2.d(this.f8375b, this.f8376c, this.f8377d);
                break;
        }
    }
}

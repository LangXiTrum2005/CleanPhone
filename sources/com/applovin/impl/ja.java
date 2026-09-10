package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f8243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAd f8244d;

    public /* synthetic */ ja(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd, int i10) {
        this.f8241a = i10;
        this.f8242b = z10;
        this.f8243c = maxAdListener;
        this.f8244d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8241a) {
            case 0:
                v2.f(this.f8242b, this.f8243c, this.f8244d);
                break;
            case 1:
                v2.e(this.f8242b, this.f8243c, this.f8244d);
                break;
            case 2:
                v2.c(this.f8242b, this.f8243c, this.f8244d);
                break;
            default:
                v2.a(this.f8242b, this.f8243c, this.f8244d);
                break;
        }
    }
}

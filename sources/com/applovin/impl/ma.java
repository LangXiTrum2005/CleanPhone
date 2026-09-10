package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdDisplayListener f8418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f8419c;

    public /* synthetic */ ma(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd, int i10) {
        this.f8417a = i10;
        this.f8418b = appLovinAdDisplayListener;
        this.f8419c = appLovinAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8417a) {
            case 0:
                v2.d(this.f8418b, this.f8419c);
                break;
            default:
                v2.c(this.f8418b, this.f8419c);
                break;
        }
    }
}

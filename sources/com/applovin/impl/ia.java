package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ia implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewEventListener f8181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f8182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdView f8183d;

    public /* synthetic */ ia(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, int i10) {
        this.f8180a = i10;
        this.f8181b = appLovinAdViewEventListener;
        this.f8182c = appLovinAd;
        this.f8183d = appLovinAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8180a) {
            case 0:
                v2.e(this.f8181b, this.f8182c, this.f8183d);
                break;
            case 1:
                v2.f(this.f8181b, this.f8182c, this.f8183d);
                break;
            default:
                v2.d(this.f8181b, this.f8182c, this.f8183d);
                break;
        }
    }
}

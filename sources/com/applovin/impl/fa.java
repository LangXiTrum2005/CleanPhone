package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdRewardListener f7950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f7951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f7952d;

    public /* synthetic */ fa(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map, int i10) {
        this.f7949a = i10;
        this.f7950b = appLovinAdRewardListener;
        this.f7951c = appLovinAd;
        this.f7952d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7949a) {
            case 0:
                v2.f(this.f7950b, this.f7951c, this.f7952d);
                break;
            case 1:
                v2.d(this.f7950b, this.f7951c, this.f7952d);
                break;
            default:
                v2.e(this.f7950b, this.f7951c, this.f7952d);
                break;
        }
    }
}

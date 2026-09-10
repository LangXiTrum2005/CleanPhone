package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinPostbackListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9909d;

    public /* synthetic */ v8(int i10, int i11, Object obj, Object obj2) {
        this.f9906a = i11;
        this.f9908c = obj;
        this.f9909d = obj2;
        this.f9907b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9906a) {
            case 0:
                ((c1) this.f9908c).b((c1.c) this.f9909d, this.f9907b);
                break;
            case 1:
                v2.b((AppLovinPostbackListener) this.f9908c, (String) this.f9909d, this.f9907b);
                break;
            default:
                v2.b((AppLovinAdRewardListener) this.f9908c, (AppLovinAd) this.f9909d, this.f9907b);
                break;
        }
    }
}

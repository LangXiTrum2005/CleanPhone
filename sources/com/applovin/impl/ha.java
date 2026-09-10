package com.applovin.impl;

import com.applovin.sdk.AppLovinBidTokenCollectionListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ha implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinBidTokenCollectionListener f8111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8112c;

    public /* synthetic */ ha(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str, int i10) {
        this.f8110a = i10;
        this.f8111b = appLovinBidTokenCollectionListener;
        this.f8112c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8110a) {
            case 0:
                v2.c(this.f8111b, this.f8112c);
                break;
            default:
                v2.d(this.f8111b, this.f8112c);
                break;
        }
    }
}

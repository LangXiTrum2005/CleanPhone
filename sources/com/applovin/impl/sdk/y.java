package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f9717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinSdk.SdkInitializationListener f9718c;

    public /* synthetic */ y(l lVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener, int i10) {
        this.f9716a = i10;
        this.f9717b = lVar;
        this.f9718c = sdkInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9716a) {
            case 0:
                this.f9717b.a(this.f9718c);
                break;
            default:
                this.f9717b.b(this.f9718c);
                break;
        }
    }
}

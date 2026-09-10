package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f11884Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ t(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.Z = obj;
        this.f11884Y = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                ((AppLovinAdServiceImpl.b) this.Z).adReceived((com.applovin.impl.sdk.ad.b) this.f11884Y);
                break;
            case 1:
                ((AppLovinAdLoadListener) this.Z).adReceived((com.applovin.impl.sdk.ad.b) this.f11884Y);
                break;
            case 2:
                ((k) this.Z).a((AppLovinSdkInitializationConfiguration) this.f11884Y);
                break;
            case 3:
                ((k) this.Z).b((String) this.f11884Y);
                break;
            case 4:
                ((l) this.Z).b((AppLovinBidTokenCollectionListener) this.f11884Y);
                break;
            default:
                ((n) this.Z).a((Long) this.f11884Y);
                break;
        }
    }
}

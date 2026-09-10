package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9691c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.f9689a = i10;
        this.f9691c = obj;
        this.f9690b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9689a) {
            case 0:
                ((AppLovinAdServiceImpl.b) this.f9691c).adReceived((com.applovin.impl.sdk.ad.b) this.f9690b);
                break;
            case 1:
                ((AppLovinAdLoadListener) this.f9691c).adReceived((com.applovin.impl.sdk.ad.b) this.f9690b);
                break;
            case 2:
                ((l) this.f9691c).b((String) this.f9690b);
                break;
            case 3:
                ((l) this.f9691c).a((AppLovinSdkInitializationConfiguration) this.f9690b);
                break;
            case 4:
                ((m) this.f9691c).b((AppLovinBidTokenCollectionListener) this.f9690b);
                break;
            default:
                ((o) this.f9691c).a((Long) this.f9690b);
                break;
        }
    }
}

package com.applovin.impl.sdk.nativeAd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9586b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f9585a = i10;
        this.f9586b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9585a;
        Object obj = this.f9586b;
        switch (i10) {
            case 0:
                ((AppLovinVastMediaView.e) obj).a();
                break;
            case 1:
                ((AppLovinVastMediaView.f) obj).a();
                break;
            default:
                ((AppLovinNativeAdImpl) obj).lambda$unregisterViewsForInteraction$0();
                break;
        }
    }
}

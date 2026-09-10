package com.unity3d.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IUnityAdsTokenListener f38413b;

    public /* synthetic */ b(IUnityAdsTokenListener iUnityAdsTokenListener, int i10) {
        this.f38412a = i10;
        this.f38413b = iUnityAdsTokenListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f38412a;
        IUnityAdsTokenListener iUnityAdsTokenListener = this.f38413b;
        switch (i10) {
            case 0:
                UnityAds.getToken$lambda$26$lambda$25$lambda$24(iUnityAdsTokenListener);
                break;
            case 1:
                UnityAds.getToken$lambda$29$lambda$28(iUnityAdsTokenListener);
                break;
            default:
                iUnityAdsTokenListener.onUnityAdsTokenReady(null);
                break;
        }
    }
}

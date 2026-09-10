package com.unity3d.services.ads;

import com.unity3d.ads.IUnityAdsInitializationListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IUnityAdsInitializationListener f38587b;

    public /* synthetic */ a(IUnityAdsInitializationListener iUnityAdsInitializationListener, int i10) {
        this.f38586a = i10;
        this.f38587b = iUnityAdsInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f38586a;
        IUnityAdsInitializationListener iUnityAdsInitializationListener = this.f38587b;
        switch (i10) {
            case 0:
                UnityAdsImplementation.lambda$initialize$0(iUnityAdsInitializationListener);
                break;
            default:
                iUnityAdsInitializationListener.onInitializationComplete();
                break;
        }
    }
}

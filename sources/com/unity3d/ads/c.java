package com.unity3d.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IUnityAdsInitializationListener f38415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f38416c;

    public /* synthetic */ c(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th2, int i10) {
        this.f38414a = i10;
        this.f38415b = iUnityAdsInitializationListener;
        this.f38416c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38414a) {
            case 0:
                UnityAds.initialize$lambda$9$lambda$8$lambda$7(this.f38415b, this.f38416c);
                break;
            default:
                UnityAds.initialize$lambda$4$lambda$3$lambda$2(this.f38415b, this.f38416c);
                break;
        }
    }
}

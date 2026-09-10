package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShowOperationState f38593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UnityAds.UnityAdsShowError f38594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f38595d;

    public /* synthetic */ a(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str, int i10) {
        this.f38592a = i10;
        this.f38593b = showOperationState;
        this.f38594c = unityAdsShowError;
        this.f38595d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38592a) {
            case 0:
                this.f38593b.onUnityAdsShowFailure(this.f38594c, this.f38595d);
                break;
            default:
                this.f38593b.lambda$onUnityAdsShowFailure$0(this.f38594c, this.f38595d);
                break;
        }
    }
}

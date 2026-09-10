package com.unity3d.services.ads.operation.load;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoadOperationState f38591b;

    public /* synthetic */ a(LoadOperationState loadOperationState, int i10) {
        this.f38590a = i10;
        this.f38591b = loadOperationState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f38590a;
        LoadOperationState loadOperationState = this.f38591b;
        switch (i10) {
            case 0:
                LoadModuleDecoratorTimeout.lambda$onOperationTimeout$0(loadOperationState);
                break;
            default:
                loadOperationState.lambda$onUnityAdsAdLoaded$1();
                break;
        }
    }
}

package com.unity3d.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoadListener f38408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f38409c;

    public /* synthetic */ a(LoadListener loadListener, Throwable th2, int i10) {
        this.f38407a = i10;
        this.f38408b = loadListener;
        this.f38409c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38407a) {
            case 0:
                InterstitialAd$Companion$load$1.invokeSuspend$lambda$3$lambda$2(this.f38408b, this.f38409c);
                break;
            default:
                RewardedAd$Companion$load$1.invokeSuspend$lambda$3$lambda$2(this.f38408b, this.f38409c);
                break;
        }
    }
}

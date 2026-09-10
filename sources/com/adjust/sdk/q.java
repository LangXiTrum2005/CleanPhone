package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustEvent f6905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OnPurchaseVerificationFinishedListener f6906d;

    public /* synthetic */ q(ActivityHandler activityHandler, AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i10) {
        this.f6903a = i10;
        this.f6904b = activityHandler;
        this.f6905c = adjustEvent;
        this.f6906d = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6903a) {
            case 0:
                this.f6904b.lambda$verifyAndTrackPlayStorePurchase$46(this.f6905c, this.f6906d);
                break;
            default:
                this.f6904b.lambda$verifyAndTrackPlayStorePurchase$47(this.f6905c, this.f6906d);
                break;
        }
    }
}

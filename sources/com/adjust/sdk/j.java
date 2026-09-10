package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustPlayStorePurchase f6862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OnPurchaseVerificationFinishedListener f6863d;

    public /* synthetic */ j(ActivityHandler activityHandler, AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i10) {
        this.f6860a = i10;
        this.f6861b = activityHandler;
        this.f6862c = adjustPlayStorePurchase;
        this.f6863d = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6860a) {
            case 0:
                this.f6861b.lambda$verifyPlayStorePurchase$44(this.f6862c, this.f6863d);
                break;
            default:
                this.f6861b.lambda$verifyPlayStorePurchase$45(this.f6862c, this.f6863d);
                break;
        }
    }
}

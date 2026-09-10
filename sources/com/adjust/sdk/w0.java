package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchaseVerificationHandler f7060b;

    public /* synthetic */ w0(PurchaseVerificationHandler purchaseVerificationHandler, int i10) {
        this.f7059a = i10;
        this.f7060b = purchaseVerificationHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7059a) {
            case 0:
                this.f7060b.sendNextPurchaseVerificationPackageI();
                break;
            default:
                PurchaseVerificationHandler purchaseVerificationHandler = this.f7060b;
                purchaseVerificationHandler.lastPackageRetryInMilli = 0L;
                purchaseVerificationHandler.sendNextPurchaseVerificationPackage();
                break;
        }
    }
}

package com.facebook.appevents.iap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppPurchaseBillingClientWrapperV2V4 f10591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InAppPurchaseUtils.IAPProductType f10592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f10593d;

    public /* synthetic */ b(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable, int i10) {
        this.f10590a = i10;
        this.f10591b = inAppPurchaseBillingClientWrapperV2V4;
        this.f10592c = iAPProductType;
        this.f10593d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10590a) {
            case 0:
                InAppPurchaseBillingClientWrapperV2V4.queryPurchaseHistory$lambda$2(this.f10591b, this.f10592c, this.f10593d);
                break;
            default:
                InAppPurchaseBillingClientWrapperV2V4.queryPurchases$lambda$0(this.f10591b, this.f10592c, this.f10593d);
                break;
        }
    }
}

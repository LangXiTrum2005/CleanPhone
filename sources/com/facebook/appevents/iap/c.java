package com.facebook.appevents.iap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppPurchaseBillingClientWrapperV5V7 f10595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InAppPurchaseUtils.IAPProductType f10596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f10597d;

    public /* synthetic */ c(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable, int i10) {
        this.f10594a = i10;
        this.f10595b = inAppPurchaseBillingClientWrapperV5V7;
        this.f10596c = iAPProductType;
        this.f10597d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10594a) {
            case 0:
                InAppPurchaseBillingClientWrapperV5V7.queryPurchases$lambda$0(this.f10595b, this.f10596c, this.f10597d);
                break;
            default:
                InAppPurchaseBillingClientWrapperV5V7.queryPurchaseHistory$lambda$1(this.f10595b, this.f10596c, this.f10597d);
                break;
        }
    }
}

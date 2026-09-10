package com.facebook.appevents.iap;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppPurchaseUtils.BillingClientVersion f10588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f10589c;

    public /* synthetic */ a(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context, int i10) {
        this.f10587a = i10;
        this.f10588b = billingClientVersion;
        this.f10589c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10587a) {
            case 0:
                InAppPurchaseAutoLogger.startIapLogging$lambda$1$lambda$0(this.f10588b, this.f10589c);
                break;
            default:
                InAppPurchaseAutoLogger.startIapLogging$lambda$2(this.f10588b, this.f10589c);
                break;
        }
    }
}

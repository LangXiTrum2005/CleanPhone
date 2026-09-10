package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wireman implements Callable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final /* synthetic */ PurchaseHistoryResponseListener f16546arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final /* synthetic */ String f16547kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final /* synthetic */ attabal f16548monoploid;

    public wireman(attabal attabalVar, String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.f16547kowloon = str;
        this.f16546arytenoidectomy = purchaseHistoryResponseListener;
        this.f16548monoploid = attabalVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        triweekly triweeklyVarMilliradian = attabal.milliradian(this.f16548monoploid, this.f16547kowloon);
        this.f16546arytenoidectomy.onPurchaseHistoryResponse(triweeklyVarMilliradian.attabal(), triweeklyVarMilliradian.saneness());
        return null;
    }
}

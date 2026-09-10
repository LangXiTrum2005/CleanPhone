package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f16531attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final gintrap f16532beachfront = new gintrap(this, true);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final gintrap f16533competently = new gintrap(this, false);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final zzc f16534dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f16535impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final kowloon f16536marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final PurchasesUpdatedListener f16537saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final UserChoiceBillingListener f16538wireman;

    public rotuma(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzck zzckVar, zzc zzcVar, UserChoiceBillingListener userChoiceBillingListener, kowloon kowloonVar) {
        this.f16531attabal = context;
        this.f16537saneness = purchasesUpdatedListener;
        this.f16534dern = zzcVar;
        this.f16538wireman = userChoiceBillingListener;
        this.f16536marial = kowloonVar;
    }

    public final void beachfront() {
        this.f16532beachfront.dern(this.f16531attabal);
        this.f16533competently.dern(this.f16531attabal);
    }

    public final void competently(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f16535impromptu = z;
        this.f16533competently.attabal(this.f16531attabal, intentFilter2);
        if (this.f16535impromptu) {
            this.f16532beachfront.saneness(this.f16531attabal, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f16532beachfront.attabal(this.f16531attabal, intentFilter);
        }
    }

    public final PurchasesUpdatedListener wireman() {
        return this.f16537saneness;
    }
}

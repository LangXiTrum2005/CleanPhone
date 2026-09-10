package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzaw extends ResultReceiver {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final /* synthetic */ InAppMessageResponseListener f16549kowloon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaw(attabal attabalVar, Handler handler, InAppMessageResponseListener inAppMessageResponseListener) {
        super(handler);
        this.f16549kowloon = inAppMessageResponseListener;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f16549kowloon.onInAppMessageResponse(com.google.android.gms.internal.play_billing.zzb.zzf(bundle, "BillingClient"));
    }
}

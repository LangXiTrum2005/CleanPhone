package com.android.billingclient.api;

import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.android.gms.internal.play_billing.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f7257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ResultReceiver f7258d;

    public e(WeakReference weakReference, ResultReceiver resultReceiver) {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback", 0);
        this.f7257c = weakReference;
        this.f7258d = resultReceiver;
    }
}

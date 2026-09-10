package com.android.billingclient.api;

import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.google.android.gms.internal.play_billing.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f7264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ResultReceiver f7265d;

    public h(WeakReference weakReference, ResultReceiver resultReceiver) {
        super("com.android.vending.billing.IInAppBillingServiceCallback", 3);
        this.f7264c = weakReference;
        this.f7265d = resultReceiver;
    }
}

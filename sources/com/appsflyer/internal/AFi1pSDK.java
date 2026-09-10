package com.appsflyer.internal;

import android.content.Context;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFi1pSDK {
    public final Context getMediationNetwork;
    public AFi1qSDK getMonetizationNetwork;

    public AFi1pSDK(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.getMediationNetwork = context;
    }
}

package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1248aT extends BroadcastReceiver {
    public final /* synthetic */ C1253aY A00;

    public C1248aT(C1253aY c1253aY) {
        this.A00 = c1253aY;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.A00.A03();
    }
}

package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1569fj extends BroadcastReceiver {
    public final /* synthetic */ C1570fk A00;

    public C1569fj(C1570fk c1570fk) {
        this.A00 = c1570fk;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iA00 = C1570fk.A00(context);
        if (AbstractC1600gE.A02 >= 31 && iA00 == 5) {
            C1567fh.A02(context, this.A00);
        } else {
            this.A00.A07(iA00);
        }
    }
}

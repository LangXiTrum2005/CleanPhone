package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1802bN implements View.OnClickListener {
    public final /* synthetic */ C1335Kx A00;

    public ViewOnClickListenerC1802bN(C1335Kx c1335Kx) {
        this.A00 = c1335Kx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

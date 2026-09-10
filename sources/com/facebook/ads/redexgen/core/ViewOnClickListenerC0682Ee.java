package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0682Ee implements View.OnClickListener {
    public final /* synthetic */ C1660hD A00;

    public ViewOnClickListenerC0682Ee(C1660hD c1660hD) {
        this.A00 = c1660hD;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A9S();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}

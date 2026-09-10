package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1713Zw implements View.OnClickListener {
    public final /* synthetic */ MC A00;

    public ViewOnClickListenerC1713Zw(MC mc) {
        this.A00 = mc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.A9c();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

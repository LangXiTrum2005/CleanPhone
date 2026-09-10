package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1837Yd implements View.OnClickListener {
    public final /* synthetic */ C1614Pe A00;

    public ViewOnClickListenerC1837Yd(C1614Pe c1614Pe) {
        this.A00 = c1614Pe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0G();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0705Fb implements View.OnClickListener {
    public final /* synthetic */ C0707Fd A00;

    public ViewOnClickListenerC0705Fb(C0707Fd c0707Fd) {
        this.A00 = c0707Fd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}

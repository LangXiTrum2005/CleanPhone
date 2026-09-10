package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0679Eb implements View.OnClickListener {
    public final /* synthetic */ EL A00;
    public final /* synthetic */ C1660hD A01;

    public ViewOnClickListenerC0679Eb(C1660hD c1660hD, EL el) {
        this.A01 = c1660hD;
        this.A00 = el;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AE6(EnumC04233i.A04);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}

package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0662Dk implements View.OnClickListener {
    public final /* synthetic */ C0665Dn A00;

    public ViewOnClickListenerC0662Dk(C0665Dn c0665Dn) {
        this.A00 = c0665Dn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0D();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}

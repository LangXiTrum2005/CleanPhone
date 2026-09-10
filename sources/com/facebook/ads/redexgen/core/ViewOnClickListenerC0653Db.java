package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0653Db implements View.OnClickListener {
    public final /* synthetic */ C1695hn A00;

    public ViewOnClickListenerC0653Db(C1695hn c1695hn) {
        this.A00 = c1695hn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (this.A00.A01 == null || !this.A00.A02.A02()) {
                return;
            }
            this.A00.A01.AC5(this.A00);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}

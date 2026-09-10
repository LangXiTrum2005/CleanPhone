package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EX implements View.OnClickListener {
    public final /* synthetic */ EZ A00;

    public EX(EZ ez) {
        this.A00 = ez;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A9S();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}

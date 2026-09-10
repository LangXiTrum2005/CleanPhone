package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class GM implements View.OnClickListener {
    public final /* synthetic */ C1580fu A00;

    public GM(C1580fu c1580fu) {
        this.A00 = c1580fu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0P) {
                this.A00.A0Q = true;
                this.A00.A0f(((N9) this.A00.A0g).A0G().toString());
                if (this.A00.A0G.A0a() >= 0) {
                    this.A00.A09.postDelayed(this.A00.A0n, this.A00.A0G.A0a());
                }
            }
            this.A00.A0i(this.A00.A0P ? false : true);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}

package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0789Ih implements View.OnClickListener {
    public final /* synthetic */ C1307bT A00;

    public ViewOnClickListenerC0789Ih(C1307bT c1307bT) {
        this.A00 = c1307bT;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A04.A04(AE.A0l, null);
            this.A00.A03.A0F().A3c();
            if (this.A00.A00 == null) {
                return;
            }
            if (this.A00.A07()) {
                this.A00.A00.setVolume(1.0f);
            } else {
                this.A00.A00.setVolume(0.0f);
            }
            this.A00.A09();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}

package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1700Zj implements View.OnClickListener {
    public final /* synthetic */ ME A00;

    public ViewOnClickListenerC1700Zj(ME me2) {
        this.A00 = me2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.AEr(EnumC1423Oi.A04);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

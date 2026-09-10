package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1714Zx implements View.OnClickListener {
    public final /* synthetic */ C1698Zh A00;
    public final /* synthetic */ MC A01;

    public ViewOnClickListenerC1714Zx(MC mc, C1698Zh c1698Zh) {
        this.A01 = mc;
        this.A00 = c1698Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC1423Oi.A04);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

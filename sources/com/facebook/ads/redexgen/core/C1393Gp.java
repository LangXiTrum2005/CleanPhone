package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1393Gp implements InterfaceC1839Yf {
    public final /* synthetic */ AbstractC1387Gj A00;

    public C1393Gp(AbstractC1387Gj abstractC1387Gj) {
        this.A00 = abstractC1387Gj;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1839Yf
    public final void AEZ(int i2) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i2;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}

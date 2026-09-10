package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1224Gp implements InterfaceC1670Yf {
    public final /* synthetic */ AbstractC1218Gj A00;

    public C1224Gp(AbstractC1218Gj abstractC1218Gj) {
        this.A00 = abstractC1218Gj;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1670Yf
    public final void AEZ(int i) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}

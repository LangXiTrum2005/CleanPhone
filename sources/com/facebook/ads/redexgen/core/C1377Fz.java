package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1377Fz implements InterfaceC2064cs {
    public final /* synthetic */ C1376Fy A00;

    public C1377Fz(C1376Fy c1376Fy) {
        this.A00 = c1376Fy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064cs
    public final void AGY(View view) {
        AbstractC1461Jg abstractC1461Jg = (AbstractC1461Jg) view;
        abstractC1461Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1461Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}

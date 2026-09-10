package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1208Fz implements InterfaceC1895cs {
    public final /* synthetic */ C1207Fy A00;

    public C1208Fz(C1207Fy c1207Fy) {
        this.A00 = c1207Fy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1895cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1895cs
    public final void AGY(View view) {
        AbstractC1292Jg abstractC1292Jg = (AbstractC1292Jg) view;
        abstractC1292Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1292Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}

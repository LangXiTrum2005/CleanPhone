package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1421dJ implements GX {
    public final /* synthetic */ C1420dI A00;

    public C1421dJ(C1420dI c1420dI) {
        this.A00 = c1420dI;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AFe(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AFg(View view) {
        AbstractC1574fo abstractC1574fo = (AbstractC1574fo) view;
        abstractC1574fo.A1D();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1574fo.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}

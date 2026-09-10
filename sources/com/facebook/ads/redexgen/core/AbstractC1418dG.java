package com.facebook.ads.redexgen.core;

import com.google.android.exoplayer2.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1418dG {
    public InterfaceC1417dF A00;
    public InterfaceC1430dS A01;

    public abstract boolean A0Y();

    public abstract C1419dH A0b(InterfaceC0983Qi[] interfaceC0983QiArr, C0992Qs c0992Qs, R5 r5, Timeline timeline) throws EK;

    public abstract void A0c(Object obj);

    public final InterfaceC1430dS A00() {
        return (InterfaceC1430dS) AbstractC1517es.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AFL();
        }
    }

    public final void A02(InterfaceC1417dF interfaceC1417dF, InterfaceC1430dS interfaceC1430dS) {
        this.A00 = interfaceC1417dF;
        this.A01 = interfaceC1430dS;
    }
}

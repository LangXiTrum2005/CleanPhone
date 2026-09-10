package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1030Se implements YK {
    public ZM A00;
    public InterfaceC1086Uo A01;
    public C1590g4 A02;

    public C1030Se(String str) {
        this.A00 = new P5().A11(str).A14();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void A00() {
        AbstractC1517es.A02(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.YK
    public final void A50(C1576fq c1576fq) {
        A00();
        long jA03 = this.A02.A03();
        long jA04 = this.A02.A04();
        if (jA03 == C.TIME_UNSET || jA04 == C.TIME_UNSET) {
            return;
        }
        if (jA04 != this.A00.A0M) {
            this.A00 = this.A00.A07().A0s(jA04).A14();
            this.A01.A6U(this.A00);
        }
        int iA07 = c1576fq.A07();
        this.A01.AHx(c1576fq, iA07);
        this.A01.AI0(jA03, 1, iA07, 0, null);
    }

    @Override // com.facebook.ads.redexgen.core.YK
    public final void AA3(C1590g4 c1590g4, UL ul, YS ys) {
        this.A02 = c1590g4;
        ys.A05();
        this.A01 = ul.AJX(ys.A03(), 5);
        this.A01.A6U(this.A00);
    }
}

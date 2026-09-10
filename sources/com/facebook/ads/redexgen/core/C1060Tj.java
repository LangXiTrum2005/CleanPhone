package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1060Tj implements W8 {
    public static String[] A05 = {"BOpzke3HSvuvmeVnmiaVrxdORixc6Y2a", "KuMknchEp2tYrPxbkbTOIlIpu7O6LZkz", "cRZ84mYV8E9rL0wPhakCzqIOvbn5oFRb", "", "6fdBkfFbM1N8DeCnHCsHK1BtFp1GW6aS", "JIwP51bNbFnyOohnZXJNwf2wLGgH98HV", "", "dIKOpPRXcS8YM9h96zmn0xuImhqIREY"};
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C1576fq A04;

    public C1060Tj(C1062Tl c1062Tl) {
        this.A04 = c1062Tl.A00;
        this.A04.A0f(12);
        this.A02 = this.A04.A0L() & 255;
        this.A03 = this.A04.A0L();
    }

    @Override // com.facebook.ads.redexgen.core.W8
    public final int A80() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.W8
    public final int A8l() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.W8
    public final int AGa() {
        if (this.A02 == 8) {
            return this.A04.A0I();
        }
        int i = this.A02;
        String[] strArr = A05;
        if (strArr[4].charAt(18) == strArr[1].charAt(18)) {
            throw new RuntimeException();
        }
        A05[0] = "Nppd4KchEcZXKXSxfvNaIYmt9KXSlyMe";
        if (i == 16) {
            return this.A04.A0M();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 == 0) {
            this.A00 = this.A04.A0I();
            return (this.A00 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
        return this.A00 & 15;
    }
}

package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2451mB implements InterfaceC1283Ix {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C09384v A04;

    public C2451mB(C2453mD c2453mD) {
        this.A04 = c2453mD.A00;
        this.A04.A0f(12);
        this.A02 = this.A04.A0L() & 255;
        this.A03 = this.A04.A0L();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1283Ix
    public final int A8A() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1283Ix
    public final int A8v() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1283Ix
    public final int AHS() {
        if (this.A02 == 8) {
            return this.A04.A0I();
        }
        if (this.A02 == 16) {
            return this.A04.A0M();
        }
        int i = this.A01;
        this.A01 = i + 1;
        if (i % 2 == 0) {
            this.A00 = this.A04.A0I();
            return (this.A00 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
        return this.A00 & 15;
    }
}

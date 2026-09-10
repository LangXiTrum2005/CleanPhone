package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1110Vo implements UC {
    public final int A00;
    public final UP A01;
    public final UU A02;

    @Override // com.facebook.ads.redexgen.core.UC
    public final /* synthetic */ void AF2() {
    }

    public C1110Vo(UU uu, int i) {
        this.A02 = uu;
        this.A00 = i;
        this.A01 = new UP();
    }

    private long A00(WJ wj) throws IOException {
        while (wj.A8Y() < wj.A8E() - 6 && !UQ.A04(wj, this.A02, this.A00, this.A01)) {
            wj.A3x(1);
        }
        if (wj.A8Y() >= wj.A8E() - 6) {
            wj.A3x((int) (wj.A8E() - wj.A8Y()));
            return this.A02.A09;
        }
        return this.A01.A00;
    }

    @Override // com.facebook.ads.redexgen.core.UC
    public final UA AI2(WJ wj, long j) throws IOException {
        long rightFrameFirstSampleNumber = wj.A8d();
        long leftFrameFirstSampleNumber = A00(wj);
        long jA8Y = wj.A8Y();
        wj.A3x(Math.max(6, this.A02.A06));
        long searchPosition = A00(wj);
        long leftFramePosition = wj.A8Y();
        if (leftFrameFirstSampleNumber <= j && searchPosition > j) {
            return UA.A03(jA8Y);
        }
        if (searchPosition <= j) {
            return UA.A05(searchPosition, leftFramePosition);
        }
        return UA.A04(leftFrameFirstSampleNumber, rightFrameFirstSampleNumber);
    }
}

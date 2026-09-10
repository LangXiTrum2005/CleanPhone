package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2586ld implements InterfaceC1464Jj {
    public final long[] A00;
    public final C2810pT[] A01;

    public C2586ld(C2810pT[] c2810pTArr, long[] jArr) {
        this.A01 = c2810pTArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1464Jj
    public final List<C2810pT> A7X(long j) {
        int iA0L = C5C.A0L(this.A00, j, true, false);
        if (iA0L == -1 || this.A01[iA0L] == C2810pT.A0J) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[iA0L]);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1464Jj
    public final long A83(int i2) {
        boolean z2 = true;
        AbstractC10843y.A07(i2 >= 0);
        if (i2 >= this.A00.length) {
            z2 = false;
        }
        AbstractC10843y.A07(z2);
        return this.A00[i2];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1464Jj
    public final int A84() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1464Jj
    public final int A8a(long j) {
        int iA0K = C5C.A0K(this.A00, j, false, false);
        int index = this.A00.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}

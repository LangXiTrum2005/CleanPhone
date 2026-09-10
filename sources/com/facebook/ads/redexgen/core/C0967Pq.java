package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0967Pq implements InterfaceC1464e1 {
    public final int A00;

    public C0967Pq() {
        this(-1);
    }

    public C0967Pq(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1464e1
    public final int A8P(int i) {
        if (this.A00 == -1) {
            if (i == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1464e1
    public final long A8k(C1463e0 c1463e0) {
        IOException iOException = c1463e0.A03;
        if ((iOException instanceof Q6) || (iOException instanceof FileNotFoundException) || (iOException instanceof C5I) || (iOException instanceof C1474eB) || C1440dc.A06(iOException)) {
            return C.TIME_UNSET;
        }
        return Math.min((c1463e0.A00 - 1) * 1000, 5000);
    }
}

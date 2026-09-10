package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2498n9 implements FF {
    public final int A00;

    public C2498n9() {
        this(-1);
    }

    public C2498n9(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.FF
    public final int A8Z(int i) {
        if (this.A00 == -1) {
            if (i == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.FF
    public final long A8u(FE fe) {
        IOException iOException = fe.A03;
        if ((iOException instanceof C3K) || (iOException instanceof FileNotFoundException) || (iOException instanceof AM) || (iOException instanceof FP) || C09445b.A00(iOException)) {
            return C.TIME_UNSET;
        }
        return Math.min((fe.A00 - 1) * 1000, 5000);
    }
}

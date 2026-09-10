package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2696qP implements InterfaceC08943b {
    public final C2656pj A00 = new C2656pj();

    @MetaExoPlayerCustomization("Should be final")
    public abstract void A0H(int i, long j);

    public final int A00() {
        long jA77 = A77();
        long jA7s = A7s();
        if (jA77 == C.TIME_UNSET || jA7s == C.TIME_UNSET) {
            return 0;
        }
        if (jA7s == 0) {
            return 100;
        }
        return C5C.A07((int) ((100 * jA77) / jA7s), 0, 100);
    }

    public void A01() {
        AKG(false);
    }

    public final void A02() {
        A03(A7h());
    }

    public final void A03(int i) {
        A0H(i, C.TIME_UNSET);
    }

    public final void A04(long j) {
        A0H(A7h(), j);
    }
}

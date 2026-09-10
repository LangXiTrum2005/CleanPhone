package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1208Zl implements QQ {
    public static String[] A01 = {"", "", "iCliAypVoqzC0fx0BJXwi", "cFtA", "ks94OJZY24YP0W", "zWHYKq", "smr4D72sS6PujANkMfaeYcGk", "ag4eND"};
    public final C1177Yf A00 = new C1177Yf();

    @MetaExoPlayerCustomization("Should be final")
    public abstract void A0H(int i, long j);

    public final int A00() {
        long jA6x = A6x();
        long jA7i = A7i();
        if (jA6x == C.TIME_UNSET || jA7i == C.TIME_UNSET) {
            return 0;
        }
        if (jA7i == 0) {
            return 100;
        }
        long j = 100 * jA6x;
        if (A01[3].length() != 4) {
            throw new RuntimeException();
        }
        A01[4] = "KOrcxd9hxYrcdf";
        return AbstractC1600gE.A07((int) (j / jA7i), 0, 100);
    }

    public void A01() {
        AJL(false);
    }

    public final void A02() {
        A03(A7X());
    }

    public final void A03(int i) {
        A0H(i, C.TIME_UNSET);
    }

    public final void A04(long j) {
        A0H(A7X(), j);
    }
}

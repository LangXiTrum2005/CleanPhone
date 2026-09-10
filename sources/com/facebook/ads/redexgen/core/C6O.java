package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6O extends RC implements InterfaceC1298bK {
    public long A00;
    public InterfaceC1486eN A01;
    public InterfaceC1729iP<InterfaceExecutorC1579ft> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final PP A07;
    public final ZE A08;
    public final TO A09;
    public final InterfaceC1292bE A0A;
    public final InterfaceC1437dZ A0B;
    public final InterfaceC1464e1 A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iP != com.google.common.base.Supplier<com.google.android.exoplayer2.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C6O(ZE ze, InterfaceC1437dZ interfaceC1437dZ, InterfaceC1292bE interfaceC1292bE, TO to, InterfaceC1464e1 interfaceC1464e1, int i, InterfaceC1729iP<InterfaceExecutorC1579ft> interfaceC1729iP) {
        this.A07 = (PP) AbstractC1517es.A01(ze.A03);
        this.A08 = ze;
        this.A0B = interfaceC1437dZ;
        this.A0A = interfaceC1292bE;
        this.A09 = to == null ? TO.A00 : to;
        this.A0C = interfaceC1464e1;
        this.A06 = i;
        this.A04 = true;
        this.A00 = C.TIME_UNSET;
        this.A02 = interfaceC1729iP;
    }

    private void A00() {
        final Timeline c6g = new C6G(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C8W(c6g) { // from class: com.facebook.ads.redexgen.X.0y
                @Override // com.facebook.ads.redexgen.core.C8W, com.google.android.exoplayer2.Timeline
                public final C1179Yh A0I(int i, C1179Yh c1179Yh, boolean z) {
                    super.A0I(i, c1179Yh, z);
                    c1179Yh.A05 = true;
                    return c1179Yh;
                }

                @Override // com.facebook.ads.redexgen.core.C8W, com.google.android.exoplayer2.Timeline
                public final C1177Yf A0L(int i, C1177Yf c1177Yf, long j) {
                    super.A0L(i, c1177Yf, j);
                    c1177Yf.A0F = true;
                    return c1177Yf;
                }
            };
            c6g = timeline;
        }
        A05(c6g);
    }

    @Override // com.facebook.ads.redexgen.core.RC
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.RC
    public final void A0A(InterfaceC1486eN interfaceC1486eN) {
        this.A01 = interfaceC1486eN;
        this.A09.AGC();
        this.A09.AIk((Looper) AbstractC1517es.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1280az
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final R7 A5M(R5 r5, InterfaceC1424dM interfaceC1424dM, long j) {
        InterfaceExecutorC1579ft interfaceExecutorC1579ft;
        Q7 q7A58 = this.A0B.A58();
        if (this.A01 != null) {
            q7A58.A3t(this.A01);
        }
        Uri uri = this.A07.A00;
        InterfaceC1293bF interfaceC1293bFA5N = this.A0A.A5N(RK.A03);
        TO to = this.A09;
        TJ tjA01 = A01(r5);
        InterfaceC1464e1 interfaceC1464e1 = this.A0C;
        C1288bA c1288bAA02 = A02(r5);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC1579ft = this.A02.get();
        } else {
            interfaceExecutorC1579ft = null;
        }
        return new C05237h(uri, q7A58, interfaceC1293bFA5N, to, tjA01, interfaceC1464e1, c1288bAA02, this, interfaceC1424dM, str, i, interfaceExecutorC1579ft);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1280az
    public final void ABo() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1298bK
    public final void AF9(long j, boolean z, boolean z2) {
        if (j == C.TIME_UNSET) {
            j = this.A00;
        }
        if (!this.A04 && this.A00 == j && this.A05 == z && this.A03 == z2) {
            return;
        }
        this.A00 = j;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1280az
    public final void AGs(R7 r7) {
        ((C05237h) r7).A0a();
    }
}

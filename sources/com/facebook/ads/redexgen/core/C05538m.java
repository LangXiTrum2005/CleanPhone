package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05538m implements R7, R8 {
    public static String[] A06 = {"1ZsuQqUhgt3teitMQ4GeUimcSTtZqrrN", "DlI2FIcWwBGEcUI8VbyxE2F7", "OBys2kVokAWves5jveaeXr7SlmXqNqeo", "7Rss8w8nbZuaEy0gv2BXxPtsZLUwfx9E", "pqA0QvXfNioCnyAr5bWRnoOg", "RB2UTNKQNa60zux4ojHI3jJrjUoVAO0q", "Q0iesb3nsbpa6asi4Da9qGj", "pzRBeELMN3nbeWYj8"};
    public long A00;
    public long A01;
    public long A02;
    public R8 A03;
    public RA[] A04 = new RA[0];
    public final R7 A05;

    public C05538m(R7 r7, boolean z, long j, long j2) {
        this.A05 = r7;
        this.A02 = z ? j : C.TIME_UNSET;
        this.A01 = j;
        this.A00 = j2;
    }

    private C0988Qn A00(long j, C0988Qn c0988Qn) {
        long toleranceBeforeUs = AbstractC1600gE.A0T(c0988Qn.A01, 0L, j - this.A01);
        long jA0T = AbstractC1600gE.A0T(c0988Qn.A00, 0L, this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j);
        if (toleranceBeforeUs == c0988Qn.A01 && jA0T == c0988Qn.A00) {
            return c0988Qn;
        }
        return new C0988Qn(toleranceBeforeUs, jA0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1312bY
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ACl(R7 r7) {
        ((R8) AbstractC1517es.A01(this.A03)).ACl(this);
    }

    public static boolean A02(long j, QD[] qdArr) {
        if (j != 0) {
            for (QD qd : qdArr) {
                if (qd != null) {
                    ZM zmA8s = qd.A8s();
                    if (!Q2.A0G(zmA8s.A0W, zmA8s.A0R)) {
                        String[] strArr = A06;
                        if (strArr[0].charAt(6) == strArr[2].charAt(6)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A06;
                        strArr2[3] = "cNHmY7WEn6O0myy1x5i2L94uENuLU76g";
                        strArr2[5] = "MKObJyUV6aR753Z8T9WnvbR0y1G3p3TC";
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != C.TIME_UNSET;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1313bZ
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4i(long j) {
        this.A05.A4i(j);
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final boolean A52(long j) {
        return this.A05.A52(j);
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final void A5q(long j, boolean z) {
        this.A05.A5q(j, z);
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final long A6h(long j, C0988Qn c0988Qn) {
        if (j == this.A01) {
            long j2 = this.A01;
            if (A06[7].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[3] = "30kzOjmO5DnFKolqOzwFG5SV9Z7ljgLg";
            strArr[5] = "g6sJ5KQ0ZZizLSy8t4ccOewAGY9Ihc56";
            return j2;
        }
        return this.A05.A6h(j, A00(j, c0988Qn));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1313bZ
    @MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A6w(long j) {
        return this.A05.A6w(j);
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final long A6y() {
        long jA6y = this.A05.A6y();
        if (jA6y == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && jA6y >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return jA6y;
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final long A8R() {
        long jA8R = this.A05.A8R();
        if (jA8R == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && jA8R >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return jA8R;
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final C0992Qs A9C() {
        return this.A05.A9C();
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final void ABn() throws IOException {
        if (0 == 0) {
            this.A05.ABn();
            return;
        }
        throw null;
    }

    @Override // com.facebook.ads.redexgen.core.R8
    public final void AEd(R7 r7) {
        if (0 != 0) {
            return;
        }
        ((R8) AbstractC1517es.A01(this.A03)).AEd(this);
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final void AGD(R8 r8, long j) {
        this.A03 = r8;
        this.A05.AGD(this, j);
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final long AGY() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = C.TIME_UNSET;
            long initialDiscontinuityUs = AGY();
            return initialDiscontinuityUs != C.TIME_UNSET ? initialDiscontinuityUs : childDiscontinuityUs;
        }
        long jAGY = this.A05.AGY();
        if (jAGY == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        boolean z = true;
        AbstractC1517es.A08(jAGY >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && jAGY > this.A00) {
            z = false;
        }
        AbstractC1517es.A08(z);
        return jAGY;
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final void AGe(long j) {
        this.A05.AGe(j);
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final long AIE(@MetaExoPlayerCustomization long j, boolean z) {
        this.A02 = C.TIME_UNSET;
        boolean z2 = false;
        for (RA ra : this.A04) {
            if (ra != null) {
                ra.A00();
            }
        }
        long jAIE = this.A05.AIE(j, z);
        String[] strArr = A06;
        if (strArr[0].charAt(6) == strArr[2].charAt(6)) {
            throw new RuntimeException();
        }
        A06[7] = "WZ2rEvOPvt3D7Egmlv2P0kl";
        if (jAIE == j || (jAIE >= this.A01 && (this.A00 == Long.MIN_VALUE || jAIE <= this.A00))) {
            z2 = true;
        }
        AbstractC1517es.A08(z2);
        return jAIE;
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final long AIF(QD[] qdArr, boolean[] zArr, InterfaceC1309bV[] interfaceC1309bVArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.A04 = new RA[interfaceC1309bVArr.length];
        InterfaceC1309bV[] interfaceC1309bVArr2 = new InterfaceC1309bV[interfaceC1309bVArr.length];
        int i = 0;
        while (true) {
            int length = interfaceC1309bVArr.length;
            String[] strArr = A06;
            String str = strArr[0];
            String str2 = strArr[2];
            int i2 = str.charAt(6);
            if (i2 == str2.charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[1] = "MNH3AAALMT77dkhCn1drzuNk";
            strArr2[4] = "XYvFRpGVwD3oshapADFK1sF6";
            InterfaceC1309bV interfaceC1309bV = null;
            if (i < length) {
                this.A04[i] = (RA) interfaceC1309bVArr[i];
                InterfaceC1309bV[] childStreams = this.A04;
                if (childStreams[i] != null) {
                    interfaceC1309bV = this.A04[i].A01;
                }
                interfaceC1309bVArr2[i] = interfaceC1309bV;
                i++;
            } else {
                long jAIF = this.A05.AIF(qdArr, zArr, interfaceC1309bVArr2, zArr2, j);
                if (A03() && j == this.A01 && A02(this.A01, qdArr)) {
                    j2 = jAIF;
                } else {
                    j2 = C.TIME_UNSET;
                }
                this.A02 = j2;
                if (jAIF != j) {
                    long enablePositionUs = this.A01;
                    if (jAIF >= enablePositionUs) {
                        long enablePositionUs2 = this.A00;
                        if (enablePositionUs2 != Long.MIN_VALUE) {
                            long enablePositionUs3 = this.A00;
                            if (jAIF <= enablePositionUs3) {
                            }
                        }
                        z = true;
                    }
                    z = false;
                } else {
                    z = true;
                }
                AbstractC1517es.A08(z);
                for (int i3 = 0; i3 < interfaceC1309bVArr.length; i3++) {
                    if (interfaceC1309bVArr2[i3] == null) {
                        InterfaceC1309bV[] childStreams2 = this.A04;
                        childStreams2[i3] = null;
                    } else {
                        InterfaceC1309bV[] childStreams3 = this.A04;
                        if (childStreams3[i3] == null || this.A04[i3].A01 != interfaceC1309bVArr2[i3]) {
                            this.A04[i3] = new RA(this, interfaceC1309bVArr2[i3]);
                        }
                    }
                    InterfaceC1309bV[] childStreams4 = this.A04;
                    interfaceC1309bVArr[i3] = childStreams4[i3];
                }
                return jAIF;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1313bZ
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AIi(boolean z) {
        this.A05.AIi(z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1313bZ
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AJg(byte b) {
        this.A05.AJg(b);
    }
}

package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2570lN implements InterfaceC1502Kv {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public boolean A03;
    public final List<LC> A04;
    public final InterfaceC1407Hd[] A05;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{1, 16, 16, 12, 9, 3, 1, 20, 9, 15, 14, -49, 4, 22, 2, 19, 21, 2, 19};
    }

    public C2570lN(List<LC> list) {
        this.A04 = list;
        this.A05 = new InterfaceC1407Hd[list.size()];
    }

    private boolean A02(C11074v c11074v, int i2) {
        if (c11074v.A07() == 0) {
            return false;
        }
        if (c11074v.A0I() != i2) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void A5A(C11074v c11074v) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c11074v, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c11074v, 0)) {
                return;
            }
            int iA09 = c11074v.A09();
            int iA07 = c11074v.A07();
            for (InterfaceC1407Hd interfaceC1407Hd : this.A05) {
                c11074v.A0f(iA09);
                interfaceC1407Hd.AIr(c11074v, iA07);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + iA07;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void A5c(HA ha, LG lg) {
        for (int i2 = 0; i2 < i; i2++) {
            LC lc = this.A04.get(i2);
            lg.A05();
            InterfaceC1407Hd interfaceC1407HdAKS = ha.AKS(lg.A03(), 3);
            interfaceC1407HdAKS.A6e(new C10512p().A0y(lg.A04()).A11(A00(0, 19, 111)).A12(Collections.singletonList(lc.A02)).A10(lc.A01).A14());
            this.A05[i2] = interfaceC1407HdAKS;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void AGp() {
        if (this.A03) {
            if (this.A02 != -9223372036854775807L) {
                for (InterfaceC1407Hd interfaceC1407Hd : this.A05) {
                    interfaceC1407Hd.AIu(this.A02, 1, this.A01, 0, null);
                }
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void AGq(long j, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.A03 = true;
        if (j != -9223372036854775807L) {
            this.A02 = j;
        }
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void AJ5() {
        this.A03 = false;
        this.A02 = -9223372036854775807L;
    }
}

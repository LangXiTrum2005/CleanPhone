package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.He, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1408He {
    public static byte[] A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public final byte[] A06 = new byte[10];

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{78, 104, 111, AbstractJsonLexerKt.TC_INVALID, 82, 94, 58, 121, 114, 111, 116, 113, 58, 105, 123, 119, 106, 118, AbstractJsonLexerKt.TC_INVALID, 105, 58, 119, 111, 105, 110, 58, 120, AbstractJsonLexerKt.TC_INVALID, 58, 121, 117, 116, 110, 115, 125, 111, 117, 111, 105, 58, 115, 116, 58, 110, 114, AbstractJsonLexerKt.TC_INVALID, 58, 105, 123, 119, 106, 118, AbstractJsonLexerKt.TC_INVALID, 58, 107, 111, AbstractJsonLexerKt.TC_INVALID, 111, AbstractJsonLexerKt.TC_INVALID, 52};
    }

    public final void A02() {
        this.A05 = false;
        this.A02 = 0;
    }

    public final void A03(InterfaceC2651ms interfaceC2651ms) throws IOException {
        if (this.A05) {
            return;
        }
        interfaceC2651ms.AGt(this.A06, 0, 10);
        interfaceC2651ms.AIl();
        if (AbstractC1395Gr.A06(this.A06) == 0) {
            return;
        }
        this.A05 = true;
    }

    public final void A04(InterfaceC1407Hd interfaceC1407Hd, long j, int i2, int i3, int i4, C1405Hb c1405Hb) {
        AbstractC10843y.A0A(this.A01 <= i3 + i4, A00(0, 60, 64));
        if (!this.A05) {
            return;
        }
        int i5 = this.A02;
        this.A02 = i5 + 1;
        if (i5 == 0) {
            this.A04 = j;
            this.A00 = i2;
            this.A03 = 0;
        }
        this.A03 += i3;
        this.A01 = i4;
        if (this.A02 >= 16) {
            A05(interfaceC1407Hd, c1405Hb);
        }
    }

    public final void A05(InterfaceC1407Hd interfaceC1407Hd, C1405Hb c1405Hb) {
        if (this.A02 > 0) {
            interfaceC1407Hd.AIu(this.A04, this.A00, this.A03, this.A01, c1405Hb);
            this.A02 = 0;
        }
    }
}

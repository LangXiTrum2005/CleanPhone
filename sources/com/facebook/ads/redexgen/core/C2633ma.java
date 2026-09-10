package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2633ma extends AbstractC1424Hu {
    public static byte[] A06;
    public static String[] A07 = {"k0wYTkKie1JHeFYg", "DKl7H6qsoN4MQmGVFxhVfc9YoKR", "eOp5RF4DxMr8YboQGZKTl4GQk1b", "2gSlciuhxyUpZq2z", "EzoVAngWIMXE2t797gVmsxYwwugMTqE8", "YSwU3mnkrzPmwh4w8hA9Gpc9iPzLacTq", "wmfh6", "T9R7fvqNl5WyvyD6SUGUJNeU84vDYmq7"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final C11074v A04;
    public final C11074v A05;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{68, 123, 118, 119, 125, 50, 116, 125, 96, AbstractJsonLexerKt.TC_INVALID, 115, 102, 50, 124, 125, 102, 50, 97, 103, 98, 98, 125, 96, 102, 119, 118, 40, 50, 43, 52, 57, 56, 50, 114, 60, 43, 62};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC1424Hu
    public final boolean A0C(C11074v c11074v, long j) throws C3K {
        int iA0I = c11074v.A0I();
        long jA0D = j + (((long) c11074v.A0D()) * 1000);
        if (iA0I == 0 && !this.A02) {
            C11074v c11074v2 = new C11074v(new byte[c11074v.A07()]);
            c11074v.A0k(c11074v2.A0l(), 0, c11074v.A07());
            C1399Gv c1399GvA00 = C1399Gv.A00(c11074v2);
            this.A01 = c1399GvA00.A02;
            super.A00.A6e(new C10512p().A11(A00(28, 9, 29)).A0w(c1399GvA00.A04).A0r(c1399GvA00.A03).A0f(c1399GvA00.A01).A0Y(c1399GvA00.A00).A12(c1399GvA00.A05).A14());
            this.A02 = true;
            return false;
        }
        if (iA0I != 1 || !this.A02) {
            return false;
        }
        int i2 = this.A00;
        if (A07[1].length() != 27) {
            throw new RuntimeException();
        }
        A07[5] = "ywa4QqUhdtSZ68DIQ13xWUOznnvwilgI";
        boolean z2 = i2 == 1;
        if (A07[2].length() == 28) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[6] = "IIAwH";
        strArr[0] = "qu1M6PwQ9kLePSP6";
        if (!this.A03 && !z2) {
            return false;
        }
        byte[] bArrA0l = this.A04.A0l();
        bArrA0l[0] = 0;
        bArrA0l[1] = 0;
        bArrA0l[2] = 0;
        int i3 = 4 - this.A01;
        int i4 = 0;
        while (c11074v.A07() > 0) {
            c11074v.A0k(this.A04.A0l(), i3, this.A01);
            this.A04.A0f(0);
            int iA0L = this.A04.A0L();
            this.A05.A0f(0);
            super.A00.AIr(this.A05, 4);
            super.A00.AIr(c11074v, iA0L);
            i4 = i4 + 4 + iA0L;
        }
        super.A00.AIu(jA0D, z2 ? 1 : 0, i4, 0, null);
        this.A03 = true;
        return true;
    }

    static {
        A01();
    }

    public C2633ma(InterfaceC1407Hd interfaceC1407Hd) {
        super(interfaceC1407Hd);
        this.A05 = new C11074v(HS.A03);
        this.A04 = new C11074v(4);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1424Hu
    public final boolean A0B(C11074v c11074v) throws C2634mb {
        int iA0I = c11074v.A0I();
        int header = iA0I >> 4;
        int frameType = header & 15;
        int i2 = iA0I & 15;
        if (i2 == 7) {
            this.A00 = frameType;
            return frameType != 5;
        }
        throw new C2634mb(A00(0, 28, 82) + i2);
    }
}

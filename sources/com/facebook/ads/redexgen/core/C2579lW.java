package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2579lW implements InterfaceC1502Kv {
    public static byte[] A0C;
    public static String[] A0D = {"zgZfEJGGgdHtew2g1FfNkkcnB", "zHXWmVVfspRqZTFEHweYGYwJXvEszQMx", "7abqffqd10TBp3FWdGN7VvMrN7O1UkYM", "p0MVW5l5", "JyEkXe6y14TztCHpc8kpfDGRXJv0nuKA", "euIGF7oBB7KZa", "ak0CBs2Ex4lMz9dSuXO", "PviIixxcvW6ZcpMh0sztGl9"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C2860qI A05;
    public InterfaceC1407Hd A06;
    public String A07;
    public boolean A08;
    public final C11064u A09;
    public final C11074v A0A;
    public final String A0B;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{40, 60, 45, 32, 38, 102, 40, 42, 122};
    }

    static {
        A02();
    }

    public C2579lW() {
        this(null);
    }

    public C2579lW(String str) {
        this.A09 = new C11064u(new byte[128]);
        this.A0A = new C11074v(this.A09.A00);
        this.A02 = 0;
        this.A04 = -9223372036854775807L;
        this.A0B = str;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006a  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a4  */
    @RequiresNonNull({"output"})
    private void A01() {
        C10512p c10512pA0j;
        this.A09.A08(0);
        C1394Gq c1394GqA09 = AbstractC1395Gr.A09(this.A09);
        if (this.A05 != null) {
            int i2 = c1394GqA09.A01;
            int i3 = this.A05.A06;
            String[] strArr = A0D;
            if (strArr[2].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[0] = "s5ZnNr7Ga7MlLfd70p6uFHM8x";
            strArr2[5] = "utwzV9oXgtTkd";
            if (i2 == i3) {
                int i4 = c1394GqA09.A04;
                String[] strArr3 = A0D;
                if (strArr3[4].charAt(13) == strArr3[1].charAt(13)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0D;
                strArr4[2] = "MPTvnFyqCCYkwFwXTKwYW3O2KaIbPHbI";
                strArr4[6] = "dVnQ4greYxNN5pQgdCf";
                if (i4 != this.A05.A0G || !C5C.A1E(c1394GqA09.A06, this.A05.A0W)) {
                    c10512pA0j = new C10512p().A0y(this.A07).A11(c1394GqA09.A06).A0b(c1394GqA09.A01).A0m(c1394GqA09.A04).A10(this.A0B).A0j(c1394GqA09.A00);
                    if (A00(0, 9, 31).equals(c1394GqA09.A06)) {
                        c10512pA0j.A0a(c1394GqA09.A00);
                    }
                    this.A05 = c10512pA0j.A14();
                    this.A06.A6e(this.A05);
                }
            } else {
                c10512pA0j = new C10512p().A0y(this.A07).A11(c1394GqA09.A06).A0b(c1394GqA09.A01).A0m(c1394GqA09.A04).A10(this.A0B).A0j(c1394GqA09.A00);
                if (A00(0, 9, 31).equals(c1394GqA09.A06)) {
                    c10512pA0j.A0a(c1394GqA09.A00);
                }
                this.A05 = c10512pA0j.A14();
                this.A06.A6e(this.A05);
            }
        } else {
            c10512pA0j = new C10512p().A0y(this.A07).A11(c1394GqA09.A06).A0b(c1394GqA09.A01).A0m(c1394GqA09.A04).A10(this.A0B).A0j(c1394GqA09.A00);
            if (A00(0, 9, 31).equals(c1394GqA09.A06)) {
                c10512pA0j.A0a(c1394GqA09.A00);
            }
            this.A05 = c10512pA0j.A14();
            this.A06.A6e(this.A05);
        }
        this.A01 = c1394GqA09.A02;
        this.A03 = (((long) c1394GqA09.A03) * 1000000) / ((long) this.A05.A0G);
    }

    private boolean A03(C11074v c11074v) {
        while (true) {
            if (c11074v.A07() <= 0) {
                return false;
            }
            boolean z2 = this.A08;
            if (A0D[3].length() != 8) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[4] = "9XFIg7618hJvvA4xETZzayJ4sl88kXfd";
            strArr[1] = "F6kFQyxnROPq81yNs7RnOkiGPjgAvEmB";
            if (!z2) {
                this.A08 = c11074v.A0I() == 11;
            } else {
                int iA0I = c11074v.A0I();
                if (iA0I == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = iA0I == 11;
            }
        }
    }

    private boolean A04(C11074v c11074v, byte[] bArr, int i2) {
        int iMin = Math.min(c11074v.A07(), i2 - this.A00);
        int bytesToRead = this.A00;
        c11074v.A0k(bArr, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void A5A(C11074v c11074v) {
        AbstractC10843y.A02(this.A06);
        while (c11074v.A07() > 0) {
            int i2 = this.A02;
            String[] strArr = A0D;
            if (strArr[0].length() != strArr[5].length()) {
                String[] strArr2 = A0D;
                strArr2[0] = "xuhMWsLm7IhyfpFjlZpQdmw9F";
                strArr2[5] = "BOgMYXTSIypYk";
                switch (i2) {
                    case 0:
                        if (A03(c11074v)) {
                            this.A02 = 1;
                            this.A0A.A0l()[0] = 11;
                            this.A0A.A0l()[1] = 119;
                            this.A00 = 2;
                        }
                        break;
                    case 1:
                        if (A04(c11074v, this.A0A.A0l(), 128)) {
                            A01();
                            this.A0A.A0f(0);
                            this.A06.AIr(this.A0A, 128);
                            this.A02 = 2;
                        }
                        break;
                    case 2:
                        int iMin = Math.min(c11074v.A07(), this.A01 - this.A00);
                        this.A06.AIr(c11074v, iMin);
                        this.A00 += iMin;
                        if (this.A00 == this.A01) {
                            if (this.A04 != -9223372036854775807L) {
                                this.A06.AIu(this.A04, 1, this.A01, 0, null);
                                this.A04 += this.A03;
                            }
                            this.A02 = 0;
                        }
                        break;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void A5c(HA ha, LG lg) {
        lg.A05();
        this.A07 = lg.A04();
        this.A06 = ha.AKS(lg.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void AGp() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void AGq(long j, int i2) {
        if (j != -9223372036854775807L) {
            this.A04 = j;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void AJ5() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A04 = -9223372036854775807L;
    }
}

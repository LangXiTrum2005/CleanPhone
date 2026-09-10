package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2576lT implements InterfaceC1502Kv {
    public static byte[] A0D;
    public static String[] A0E = {"eg1HF5xa7z40pAwthJhUwMgyYSflMm57", "vTWXZUhc0T5ye2gU", "5CU7tG4vDC5MrJOvyrKXJFg3lgmAd80k", "DBSeFcO6ZOsoqUplN3HsHa32omlpR5Gp", "ocqdBidFvokLCywFTEXKHS5uCgObv9g8", "Mmwr1Jc9dpTbQpvT", "ugccp26DZT8wLBdxyPVLtxapsfOoaJDE", "eNeWJfNXyWcyw1SOouQPEZVsCwWfQhE2"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C2860qI A05;
    public InterfaceC1407Hd A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final C11064u A0A;
    public final C11074v A0B;
    public final String A0C;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = (bArrCopyOfRange[i5] - i4) - 29;
            String[] strArr = A0E;
            if (strArr[1].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "llPzXaIPGYOm1jx09XShEDSvCSxFzIZB";
            strArr2[4] = "gGGXbxf7z5B4GQeBG0q6dPqvCPeZy7ri";
            bArrCopyOfRange[i5] = (byte) i6;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{-108, -88, -105, -100, -94, 98, -108, -106, 103};
    }

    static {
        A02();
    }

    public C2576lT() {
        this(null);
    }

    public C2576lT(String str) {
        this.A0A = new C11064u(new byte[16]);
        this.A0B = new C11074v(this.A0A.A00);
        this.A02 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A08 = false;
        this.A04 = -9223372036854775807L;
        this.A0C = str;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0057  */
    @RequiresNonNull({"output"})
    private void A01() {
        this.A0A.A08(0);
        C1397Gt c1397GtA04 = AbstractC1398Gu.A04(this.A0A);
        C2860qI c2860qI = this.A05;
        String strA00 = A00(0, 9, 22);
        if (c2860qI != null) {
            int i2 = c1397GtA04.A01;
            String[] strArr = A0E;
            if (strArr[1].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "SKD2aiuMz12sC9MEHPwFtgw1C1HH3qQd";
            strArr2[4] = "2YOZvYYyczeO9UVS3DIHqXjJCxImTVhM";
            if (i2 != this.A05.A06 || c1397GtA04.A04 != this.A05.A0G || !strA00.equals(this.A05.A0W)) {
                this.A05 = new C10512p().A0y(this.A07).A11(strA00).A0b(c1397GtA04.A01).A0m(c1397GtA04.A04).A10(this.A0C).A14();
                this.A06.A6e(this.A05);
            }
        } else {
            this.A05 = new C10512p().A0y(this.A07).A11(strA00).A0b(c1397GtA04.A01).A0m(c1397GtA04.A04).A10(this.A0C).A14();
            this.A06.A6e(this.A05);
        }
        this.A01 = c1397GtA04.A02;
        long j = (((long) c1397GtA04.A03) * 1000000) / ((long) this.A05.A0G);
        String[] strArr3 = A0E;
        if (strArr3[7].charAt(24) != strArr3[4].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0E;
        strArr4[6] = "AWQIxDR1BxjJqdSwyyHMPwKr6xoKH6oB";
        strArr4[2] = "F7eavifvP420Kso3ywMcgn0EXVt9uheB";
        this.A03 = j;
    }

    private boolean A03(C11074v c11074v) {
        while (true) {
            if (c11074v.A07() <= 0) {
                return false;
            }
            if (!this.A09) {
                this.A09 = c11074v.A0I() == 172;
            } else {
                int iA0I = c11074v.A0I();
                this.A09 = iA0I == 172;
                if (iA0I == 64 || iA0I == 65) {
                    this.A08 = iA0I == 65;
                    return true;
                }
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
            switch (this.A02) {
                case 0:
                    if (A03(c11074v)) {
                        this.A02 = 1;
                        this.A0B.A0l()[0] = -84;
                        this.A0B.A0l()[1] = (byte) (this.A08 ? 65 : 64);
                        this.A00 = 2;
                    }
                    break;
                case 1:
                    if (A04(c11074v, this.A0B.A0l(), 16)) {
                        A01();
                        this.A0B.A0f(0);
                        this.A06.AIr(this.A0B, 16);
                        this.A02 = 2;
                    }
                    break;
                case 2:
                    int iMin = Math.min(c11074v.A07(), this.A01 - this.A00);
                    this.A06.AIr(c11074v, iMin);
                    int bytesToRead = this.A00;
                    this.A00 = bytesToRead + iMin;
                    int i2 = this.A00;
                    int bytesToRead2 = this.A01;
                    if (i2 != bytesToRead2) {
                        continue;
                    } else {
                        long j = this.A04;
                        String[] strArr = A0E;
                        String str = strArr[1];
                        String str2 = strArr[5];
                        int length = str.length();
                        int bytesToRead3 = str2.length();
                        if (length != bytesToRead3) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0E;
                        strArr2[7] = "IAM9NHxQABFG0hTE5bn7OXwICUUtPCRY";
                        strArr2[4] = "ryput7yIrWVq6mIAY3kQFQghClw5ei8P";
                        if (j != -9223372036854775807L) {
                            this.A06.AIu(this.A04, 1, this.A01, 0, null);
                            this.A04 += this.A03;
                        }
                        this.A02 = 0;
                    }
                    break;
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
        this.A09 = false;
        this.A08 = false;
        this.A04 = -9223372036854775807L;
    }
}

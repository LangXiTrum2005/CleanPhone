package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1072Tw implements InterfaceC1118Vw {
    public static byte[] A07;
    public static String[] A08 = {"AXanLBD5", "cxzcnJ5c3rtZzyOsedkRogNaZaM", "qCScgsm7gMkdzSU5flsFjq7eh73mgIkM", "qd63BdSNLygUXiUCbiklc0bSa8abxQTw", "KcQt5DBx71I6mvfrsll4kXbYQqkfCOTQ", "G3sen8OGcKNIorDp8luBv", "N0bpWUi1uCoW1VeZtln0WhJ0lPYqtIuB", "vpwm7L2h8VGBcLk4BeTJXxbvlUpiMuGj"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC1117Vv A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C1115Vt> A05 = new ArrayDeque<>();
    public final W1 A04 = new W1();

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{73, 110, 118, 97, 108, 105, 100, 32, 101, 108, 101, 109, 101, 110, 116, 32, 116, 121, 112, 101, 32, 95, 120, 96, 119, 122, 127, 114, 54, 112, 122, 121, 119, 98, 54, 101, 127, 108, 115, 44, 54, 52, 19, 11, 28, 17, 20, 25, 93, 20, 19, 9, 24, 26, 24, cw.m, 93, cw.l, 20, 7, 24, 71, 93, 24, 63, 57, 34, 37, 44, 107, 46, 39, 46, 38, 46, 37, 63, 107, 56, 34, 49, 46, 113, 107};
    }

    static {
        A05();
    }

    private double A00(WJ wj, int i) throws IOException {
        long jA02 = A02(wj, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) jA02);
        }
        return Double.longBitsToDouble(jA02);
    }

    @RequiresNonNull({"processor"})
    private long A01(WJ wj) throws IOException {
        wj.AHr();
        while (true) {
            wj.AG1(this.A06, 0, 4);
            int iA00 = W1.A00(this.A06[0]);
            if (iA00 != -1 && iA00 <= 4) {
                int iA01 = (int) W1.A01(this.A06, iA00, false);
                if (this.A03.AAL(iA01)) {
                    wj.AJ9(iA00);
                    return iA01;
                }
            }
            wj.AJ9(1);
        }
    }

    private long A02(WJ wj, int i) throws IOException {
        wj.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j << 8;
            int i3 = this.A06[i2] & 255;
            if (A08[7].charAt(25) == '3') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "AAdD3Zel612Im9NGyRSCVZpBx2KnlgAo";
            strArr[2] = "t9BeebdBrqmswLEfPqj3oKG7yJWK4XZy";
            long value = i3;
            j = j2 | value;
        }
        return j;
    }

    public static String A04(WJ wj, int i) throws IOException {
        if (i == 0) {
            String strA03 = A03(0, 0, 88);
            String[] strArr = A08;
            if (strArr[3].charAt(22) != strArr[4].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "ULSG1fTbhXZ2UFfRt5SvWpbv68GTbzNC";
            strArr2[4] = "23kZqozas7siKMKnWkE0uTb3fv3BQCc6";
            return strA03;
        }
        byte[] bArr = new byte[i];
        wj.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1118Vw
    public final void AA1(InterfaceC1117Vv interfaceC1117Vv) {
        this.A03 = interfaceC1117Vv;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00df  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fd  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1118Vw
    public final boolean AGW(WJ wj) throws IOException {
        AbstractC1517es.A02(this.A03);
        while (true) {
            C1115Vt head = this.A05.peek();
            if (head == null || wj.A8d() < head.A01) {
                if (this.A01 == 0) {
                    long jA05 = this.A04.A05(wj, true, false, 4);
                    if (jA05 == -2) {
                        jA05 = A01(wj);
                    }
                    if (jA05 == -1) {
                        return false;
                    }
                    this.A00 = (int) jA05;
                    String[] strArr = A08;
                    if (strArr[3].charAt(22) != strArr[4].charAt(22)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A08;
                    strArr2[3] = "e7mxuMrD93ZfhDc5mul9S7bTowsBDuMo";
                    strArr2[4] = "fSua2rT4WnewUx0lQszWsLbh0fcaHqrT";
                    this.A01 = 1;
                }
                if (this.A01 == 1) {
                    this.A02 = this.A04.A05(wj, false, true, 8);
                    this.A01 = 2;
                }
                int iA7k = this.A03.A7k(this.A00);
                switch (iA7k) {
                    case 0:
                        wj.AJ9((int) this.A02);
                        this.A01 = 0;
                        break;
                    case 1:
                        long jA8d = wj.A8d();
                        this.A05.push(new C1115Vt(this.A00, jA8d + this.A02));
                        this.A03.AJE(this.A00, jA8d, this.A02);
                        this.A01 = 0;
                        return true;
                    case 2:
                        if (this.A02 <= 8) {
                            this.A03.AA7(this.A00, A02(wj, (int) this.A02));
                            this.A01 = 0;
                            return true;
                        }
                        throw Q6.A01(A03(41, 22, 115) + this.A02, null);
                    case 3:
                        if (this.A02 <= 2147483647L) {
                            this.A03.AJP(this.A00, A04(wj, (int) this.A02));
                            this.A01 = 0;
                            return true;
                        }
                        throw Q6.A01(A03(63, 21, 69) + this.A02, null);
                    case 4:
                        this.A03.A4Y(this.A00, (int) this.A02, wj);
                        this.A01 = 0;
                        return true;
                    case 5:
                        long j = this.A02;
                        String[] strArr3 = A08;
                        if (strArr3[1].length() != strArr3[5].length()) {
                            A08[7] = "1VfdQFWyEOfZZlNKaLLWhaM46jxshNnK";
                            if (j != 4) {
                                if (this.A02 != 8) {
                                    throw Q6.A01(A03(21, 20, 24) + this.A02, null);
                                }
                            }
                        } else if (j != 4) {
                            if (this.A02 != 8) {
                                throw Q6.A01(A03(21, 20, 24) + this.A02, null);
                            }
                        }
                        this.A03.A6Q(this.A00, A00(wj, (int) this.A02));
                        this.A01 = 0;
                        return true;
                    default:
                        throw Q6.A01(A03(0, 21, 14) + iA7k, null);
                }
            } else {
                this.A03.A6D(this.A05.pop().A00);
                return true;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1118Vw
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}

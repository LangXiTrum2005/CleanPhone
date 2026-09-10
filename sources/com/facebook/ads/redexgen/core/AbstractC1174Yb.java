package com.facebook.ads.redexgen.core;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1174Yb {
    public static byte[] A00;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static YZ A02(WJ wj) throws IOException {
        byte[] bArr;
        C1576fq c1576fq = new C1576fq(16);
        C1173Ya c1173YaA03 = A03(1718449184, wj, c1576fq);
        AbstractC1517es.A08(c1173YaA03.A01 >= 16);
        wj.AG1(c1576fq.A0l(), 0, 16);
        c1576fq.A0f(0);
        int iA0G = c1576fq.A0G();
        int iA0G2 = c1576fq.A0G();
        int iA0F = c1576fq.A0F();
        int iA0F2 = c1576fq.A0F();
        int iA0G3 = c1576fq.A0G();
        int iA0G4 = c1576fq.A0G();
        int i = ((int) c1173YaA03.A01) - 16;
        if (i > 0) {
            bArr = new byte[i];
            wj.AG1(bArr, 0, i);
        } else {
            bArr = AbstractC1600gE.A07;
        }
        wj.AJ9((int) (wj.A8Y() - wj.A8d()));
        return new YZ(iA0G, iA0G2, iA0F, iA0F2, iA0G3, iA0G4, bArr);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{5, 42, 55, 48, 45, -30, 43, 53, -30, 54, 49, 49, -30, 46, 35, 52, 41, 39, -30, -22, 64, -12, 9, 4, -19, -21, -30, 54, 49, -30, 53, 45, 43, 50, -3, -30, 43, 38, -4, -30, -34, -4, 3, 4, 7, -2, 3, -4, -75, 10, 3, 0, 3, 4, 12, 3, -75, -20, -42, -21, -75, -8, -3, 10, 3, 0, -49, -75, -37, -12, -7, -5, -10, -10, -11, -8, -6, -21, -22, -90, -20, -11, -8, -13, -90, -6, -1, -10, -21, -64, -90, 56, 66, 87, 41, 70, 66, 69, 70, 83, 51, 70, 66, 69, 70, 83};
    }

    public static long A00(WJ wj) throws IOException {
        C1576fq c1576fq = new C1576fq(8);
        C1173Ya chunkHeader = C1173Ya.A00(wj, c1576fq);
        if (chunkHeader.A00 != 1685272116) {
            wj.AHr();
            return -1L;
        }
        wj.A3x(8);
        c1576fq.A0f(0);
        wj.AG1(c1576fq.A0l(), 0, 8);
        long sampleDataSize = c1576fq.A0N();
        wj.AJ9(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(WJ wj) throws IOException {
        wj.AHr();
        C1173Ya c1173YaA03 = A03(1684108385, wj, new C1576fq(8));
        wj.AJ9(8);
        return Pair.create(Long.valueOf(wj.A8d()), Long.valueOf(c1173YaA03.A01));
    }

    public static C1173Ya A03(int i, WJ wj, C1576fq c1576fq) throws IOException {
        C1173Ya c1173YaA00 = C1173Ya.A00(wj, c1576fq);
        while (c1173YaA00.A00 != i) {
            AbstractC1561fb.A07(A04(91, 15, 115), A04(40, 28, 39) + c1173YaA00.A00);
            long j = c1173YaA00.A01 + 8;
            if (j <= 2147483647L) {
                wj.AJ9((int) j);
                c1173YaA00 = C1173Ya.A00(wj, c1576fq);
            } else {
                throw Q6.A00(A04(0, 40, 84) + c1173YaA00.A00);
            }
        }
        return c1173YaA00;
    }

    public static boolean A06(WJ wj) throws IOException {
        C1576fq c1576fq = new C1576fq(8);
        C1173Ya c1173YaA00 = C1173Ya.A00(wj, c1576fq);
        if (c1173YaA00.A00 != 1380533830 && c1173YaA00.A00 != 1380333108) {
            return false;
        }
        wj.AG1(c1576fq.A0l(), 0, 4);
        c1576fq.A0f(0);
        int iA0C = c1576fq.A0C();
        if (iA0C != 1463899717) {
            AbstractC1561fb.A05(A04(91, 15, 115), A04(68, 23, 24) + iA0C);
            return false;
        }
        return true;
    }
}

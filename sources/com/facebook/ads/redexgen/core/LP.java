package com.facebook.ads.redexgen.core;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class LP {
    public static byte[] A00;
    public static String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static LN A02(InterfaceC2651ms interfaceC2651ms) throws IOException {
        byte[] bArr;
        C11074v c11074v = new C11074v(16);
        LO loA03 = A03(1718449184, interfaceC2651ms, c11074v);
        AbstractC10843y.A08(loA03.A01 >= 16);
        interfaceC2651ms.AGt(c11074v.A0l(), 0, 16);
        c11074v.A0f(0);
        int iA0G = c11074v.A0G();
        int iA0G2 = c11074v.A0G();
        int iA0F = c11074v.A0F();
        int iA0F2 = c11074v.A0F();
        int iA0G3 = c11074v.A0G();
        int iA0G4 = c11074v.A0G();
        int i2 = ((int) loA03.A01) - 16;
        if (i2 > 0) {
            bArr = new byte[i2];
            interfaceC2651ms.AGt(bArr, 0, i2);
        } else {
            bArr = C5C.A07;
        }
        interfaceC2651ms.AK3((int) (interfaceC2651ms.A8i() - interfaceC2651ms.A8n()));
        return new LN(iA0G, iA0G2, iA0F, iA0F2, iA0G3, iA0G4, bArr);
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{59, 16, 13, 22, 19, 88, 17, 11, 88, 12, 23, 23, 88, 20, 25, 10, 31, 29, 88, 80, 6, 74, 63, 58, 83, 81, 88, 12, 23, 88, 11, 19, 17, 8, 67, 88, 17, 28, 66, 88, 45, 3, 10, 11, 22, 13, 10, 3, 68, 17, 10, 15, 10, 11, 19, 10, 68, 51, 37, 50, 68, 7, 12, 17, 10, 15, 94, 68, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, 28, 90, 83, 78, 81, 28, 72, 69, 76, 89, 6, 28, 105, 95, 72, 118, 91, 95, 90, 91, 76, 108, 91, 95, 90, 91, 76};
    }

    static {
        A05();
    }

    public static long A00(InterfaceC2651ms interfaceC2651ms) throws IOException {
        C11074v c11074v = new C11074v(8);
        LO chunkHeader = LO.A00(interfaceC2651ms, c11074v);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC2651ms.AIl();
            return -1L;
        }
        interfaceC2651ms.A47(8);
        c11074v.A0f(0);
        interfaceC2651ms.AGt(c11074v.A0l(), 0, 8);
        long sampleDataSize = c11074v.A0N();
        interfaceC2651ms.AK3(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(InterfaceC2651ms interfaceC2651ms) throws IOException {
        interfaceC2651ms.AIl();
        LO loA03 = A03(1684108385, interfaceC2651ms, new C11074v(8));
        interfaceC2651ms.AK3(8);
        return Pair.create(Long.valueOf(interfaceC2651ms.A8n()), Long.valueOf(loA03.A01));
    }

    public static LO A03(int i2, InterfaceC2651ms interfaceC2651ms, C11074v c11074v) throws IOException {
        LO loA00 = LO.A00(interfaceC2651ms, c11074v);
        while (loA00.A00 != i2) {
            AbstractC10924g.A07(A04(91, 15, 125), A04(40, 28, 39) + loA00.A00);
            long j = loA00.A01 + 8;
            if (j <= 2147483647L) {
                interfaceC2651ms.AK3((int) j);
                loA00 = LO.A00(interfaceC2651ms, c11074v);
            } else {
                throw C3K.A00(A04(0, 40, 59) + loA00.A00);
            }
        }
        return loA00;
    }

    public static boolean A06(InterfaceC2651ms interfaceC2651ms) throws IOException {
        C11074v c11074v = new C11074v(8);
        LO loA00 = LO.A00(interfaceC2651ms, c11074v);
        if (loA00.A00 != 1380533830) {
            int i2 = loA00.A00;
            if (A01[1].charAt(26) == 'h') {
                throw new RuntimeException();
            }
            A01[4] = "7d3HBnqB6pKujyEoyh9Hov6";
            if (i2 != 1380333108) {
                return false;
            }
        }
        interfaceC2651ms.AGt(c11074v.A0l(), 0, 4);
        c11074v.A0f(0);
        int iA0C = c11074v.A0C();
        if (iA0C != 1463899717) {
            AbstractC10924g.A05(A04(91, 15, 125), A04(68, 23, 127) + iA0C);
            return false;
        }
        return true;
    }
}

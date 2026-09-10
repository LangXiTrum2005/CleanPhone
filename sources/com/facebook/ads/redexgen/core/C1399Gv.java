package com.facebook.ads.redexgen.core;

import com.smartdigimkt.h5.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1399Gv {
    public static byte[] A06;
    public static String[] A07 = {f.j, "7N0kip4m3flPJ4wRylUb66l3ycty4bLO", "ZrqOCWQk631j6sxAoqisBRdwge9gr5QF", "2DRaKiCosA9Zs551XHqRbpaUmywwD6L7", "dzNr4lbarI8PqRX9M2ICRMrM1SnLdD", "nBYqh81NM1tC", "zWHuac", "46iX5XNzwkY5yhjGLtKEm3XHMbBVctSm"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final List<byte[]> A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1399Gv A00(C11074v c11074v) throws C3K {
        try {
            c11074v.A0g(4);
            int iA0I = (c11074v.A0I() & 3) + 1;
            if (iA0I == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iA0I2 = c11074v.A0I() & 31;
            for (int i2 = 0; i2 < iA0I2; i2++) {
                arrayList.add(A03(c11074v));
            }
            int iA0I3 = c11074v.A0I();
            String[] strArr = A07;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A07[1] = "rQ6g8gs4UtzNEdd6WIb5nHQ3c92ce055";
            for (int i3 = 0; i3 < iA0I3; i3++) {
                arrayList.add(A03(c11074v));
            }
            int i4 = -1;
            int i5 = -1;
            float f = 1.0f;
            String strA01 = null;
            if (iA0I2 > 0) {
                HR hrA09 = HS.A09((byte[]) arrayList.get(0), iA0I, ((byte[]) arrayList.get(0)).length);
                i4 = hrA09.A0A;
                i5 = hrA09.A03;
                f = hrA09.A00;
                strA01 = AnonymousClass46.A01(hrA09.A08, hrA09.A01, hrA09.A04);
            }
            return new C1399Gv(arrayList, iA0I, i4, i5, f, strA01);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw C3K.A01(A01(0, 24, 51), e2);
        }
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-106, -61, -61, -64, -61, 113, -63, -78, -61, -60, -70, -65, -72, 113, -110, -89, -108, 113, -76, -64, -65, -73, -70, -72};
    }

    static {
        A02();
    }

    public C1399Gv(List<byte[]> initializationData, int i2, int i3, int i4, float f, String str) {
        this.A05 = initializationData;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = f;
        this.A04 = str;
    }

    public static byte[] A03(C11074v c11074v) {
        int iA0M = c11074v.A0M();
        int offset = c11074v.A09();
        c11074v.A0g(iA0M);
        return AnonymousClass46.A07(c11074v.A0l(), offset, iA0M);
    }
}

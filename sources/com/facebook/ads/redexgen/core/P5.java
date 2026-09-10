package com.facebook.ads.redexgen.core;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class P5 {
    public static String[] A00 = {"nDiC2V", "xvPzB4voGkHgvzabNn8fejRwCVSwo6Ah", "OJIGMHO1ySc0mzACRtkWxwocBaSnW5m2", "JbsfTTx", "hwYl", "U04BYM1NuctRYg5sssH2", "d2TQ", "mxYxJu"};
    public static final int[] A01 = new int[0];
    public static final long[] A02 = new long[0];
    public static final Object[] A03 = new Object[0];

    public static int A00(int i2) {
        return A01(i2 * 8) / 8;
    }

    public static int A01(int i2) {
        int i3 = 4;
        while (A00[5].length() == 20) {
            A00[5] = "sf2HjvEbKVwFe9jamb5q";
            if (i3 >= 32) {
                return i2;
            }
            int i4 = 1 << i3;
            if (i2 <= i4 - 12) {
                int i5 = (1 << i3) - 12;
                return i5;
            }
            i3++;
        }
        throw new RuntimeException();
    }

    public static int A02(int[] iArr, int i2, int i3) {
        int midVal = 0;
        int i4 = i2 - 1;
        while (midVal <= i4) {
            int i5 = midVal + i4;
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[2];
            int hi = str.charAt(26);
            int lo = str2.charAt(26);
            if (hi != lo) {
                throw new RuntimeException();
            }
            A00[3] = "GyF3CdngjgIBS8WP";
            int hi2 = i5 >>> 1;
            int lo2 = iArr[hi2];
            if (lo2 < i3) {
                midVal = hi2 + 1;
            } else if (lo2 > i3) {
                i4 = hi2 - 1;
            } else {
                return hi2;
            }
        }
        int lo3 = ~midVal;
        return lo3;
    }

    public static int A03(long[] jArr, int i2, long j) {
        int i3 = 0;
        int i4 = i2 - 1;
        while (i3 <= i4) {
            int lo = i3 + i4;
            int i5 = lo >>> 1;
            long j2 = jArr[i5];
            if (j2 < j) {
                i3 = i5 + 1;
            } else {
                String[] strArr = A00;
                String str = strArr[4];
                String str2 = strArr[6];
                int hi = str.length();
                int lo2 = str2.length();
                if (hi != lo2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A00;
                strArr2[4] = "jlrm";
                strArr2[6] = "MXd0";
                if (j2 > j) {
                    i4 = i5 - 1;
                } else {
                    return i5;
                }
            }
        }
        int lo3 = ~i3;
        return lo3;
    }

    public static boolean A04(@Nullable Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}

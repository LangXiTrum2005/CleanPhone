package com.facebook.ads.redexgen.core;

import com.google.common.math.ElementTypesAreNonnullByDefault;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC1625Pr {
    public static int[] A00;
    public static byte[] A01;
    public static String[] A02 = {"xE1uVhGB69CiXPpHcJa10wbSlC3W3Pqt", "6IpI1YgYEWBIhrDPxczszndZYzSCWcQF", "bz", "MzPVaMVFsogiMWrn4KMw3MbbkZJMuH", "2ugKETTJdLvfYrUKb1TohGbXSYfe6n6C", "hmUXQG87xVCBxVGQbZ2KvW4kNx5lzwQm", "IXb1TBLYeY5D6VfxvuWbchUwU2o2Kpep", "MzSHxO025yCTKgxZvpDu7SYsFbhNKTLL"};
    public static final byte[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[0].charAt(20) != '0') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "Wzlt7pC9sZ6E4twls83s4vi3o8ZTUgJv";
            strArr[5] = "VyCJESJZLvIfYV7xXyp1DHPmX8SMlxdC";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 97);
            i5++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-46, -61, 5, 28, -61, 29, 8, 21, 18};
    }

    static {
        A02();
        A03 = new byte[]{9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
        A05 = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        A04 = new int[]{3, 31, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
        A06 = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
        A00 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0061  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static int A00(int p2, int q, RoundingMode mode) {
        AbstractC2530ki.A04(mode);
        if (q != 0) {
            int i2 = p2 / q;
            int div = q * i2;
            int i3 = p2 - div;
            if (i3 == 0) {
                return i2;
            }
            boolean z2 = true;
            int i4 = ((p2 ^ q) >> 31) | 1;
            int[] iArr = C1279Cc.A00;
            int div2 = mode.ordinal();
            switch (iArr[div2]) {
                case 1:
                    AbstractC2284gS.A02(i3 == 0);
                case 2:
                    z2 = false;
                    if (z2) {
                        return i2 + i4;
                    }
                    return i2;
                case 3:
                    if (i4 >= 0) {
                        z2 = false;
                    }
                    if (z2) {
                        return i2 + i4;
                    }
                    return i2;
                case 4:
                    z2 = true;
                    if (z2) {
                        return i2 + i4;
                    }
                    return i2;
                case 5:
                    if (i4 <= 0) {
                        z2 = false;
                    }
                    if (z2) {
                        return i2 + i4;
                    }
                    return i2;
                case 6:
                case 7:
                case 8:
                    int rem = Math.abs(i3);
                    int div3 = Math.abs(q);
                    int rem2 = rem - (div3 - rem);
                    if (rem2 == 0) {
                        if (mode != RoundingMode.HALF_UP) {
                            int rem3 = mode == RoundingMode.HALF_EVEN ? 1 : 0;
                            int div4 = i2 & 1;
                            int div5 = div4 != 0 ? 1 : 0;
                            if ((rem3 & div5) == 0) {
                                z2 = false;
                            }
                        }
                    } else if (rem2 <= 0) {
                        z2 = false;
                    }
                    if (z2) {
                        return i2 + i4;
                    }
                    return i2;
                default:
                    throw new AssertionError();
            }
        } else {
            throw new ArithmeticException(A01(0, 9, 66));
        }
    }
}

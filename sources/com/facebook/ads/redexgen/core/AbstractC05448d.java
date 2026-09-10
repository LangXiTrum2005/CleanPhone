package com.facebook.ads.redexgen.core;

import com.badlogic.gdx.Input;
import com.google.common.math.ElementTypesAreNonnullByDefault;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC05448d {
    public static int[] A00;
    public static byte[] A01;
    public static String[] A02 = {"xE1uVhGB69CiXPpHcJa10wbSlC3W3Pqt", "6IpI1YgYEWBIhrDPxczszndZYzSCWcQF", "bz", "MzPVaMVFsogiMWrn4KMw3MbbkZJMuH", "2ugKETTJdLvfYrUKb1TohGbXSYfe6n6C", "hmUXQG87xVCBxVGQbZ2KvW4kNx5lzwQm", "IXb1TBLYeY5D6VfxvuWbchUwU2o2Kpep", "MzSHxO025yCTKgxZvpDu7SYsFbhNKTLL"};
    public static final byte[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[0].charAt(20) != '0') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "Wzlt7pC9sZ6E4twls83s4vi3o8ZTUgJv";
            strArr[5] = "VyCJESJZLvIfYV7xXyp1DHPmX8SMlxdC";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
            i4++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-46, -61, 5, 28, -61, 29, 8, 21, 18};
    }

    static {
        A02();
        A03 = new byte[]{9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
        A05 = new int[]{1, 10, 100, 1000, 10000, DefaultOggSeeker.MATCH_BYTE_RANGE, 1000000, 10000000, 100000000, 1000000000};
        A04 = new int[]{3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
        A06 = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
        A00 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, Input.Keys.F23, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0061  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static int A00(int p, int q, RoundingMode mode) {
        AbstractC1718iD.A04(mode);
        if (q != 0) {
            int i = p / q;
            int div = q * i;
            int i2 = p - div;
            if (i2 == 0) {
                return i;
            }
            boolean z = true;
            int i3 = ((p ^ q) >> 31) | 1;
            int[] iArr = C04564r.A00;
            int div2 = mode.ordinal();
            switch (iArr[div2]) {
                case 1:
                    AbstractC0832Jy.A02(i2 == 0);
                case 2:
                    z = false;
                    if (z) {
                        return i + i3;
                    }
                    return i;
                case 3:
                    if (i3 >= 0) {
                        z = false;
                    }
                    if (z) {
                        return i + i3;
                    }
                    return i;
                case 4:
                    z = true;
                    if (z) {
                        return i + i3;
                    }
                    return i;
                case 5:
                    if (i3 <= 0) {
                        z = false;
                    }
                    if (z) {
                        return i + i3;
                    }
                    return i;
                case 6:
                case 7:
                case 8:
                    int rem = Math.abs(i2);
                    int div3 = Math.abs(q);
                    int rem2 = rem - (div3 - rem);
                    if (rem2 == 0) {
                        if (mode != RoundingMode.HALF_UP) {
                            int rem3 = mode == RoundingMode.HALF_EVEN ? 1 : 0;
                            int div4 = i & 1;
                            int div5 = div4 != 0 ? 1 : 0;
                            if ((rem3 & div5) == 0) {
                                z = false;
                            }
                        }
                    } else if (rem2 <= 0) {
                        z = false;
                    }
                    if (z) {
                        return i + i3;
                    }
                    return i;
                default:
                    throw new AssertionError();
            }
        } else {
            throw new ArithmeticException(A01(0, 9, 66));
        }
    }
}

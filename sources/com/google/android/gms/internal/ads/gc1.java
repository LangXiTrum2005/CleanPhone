package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.internal.Buffer;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gc1 {
    public static int a(long j10) {
        int i10 = (int) j10;
        ps1.R(j10, ((long) i10) == j10, "Out of range: %s");
        return i10;
    }

    public static boolean c(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char cCharAt = str.charAt(i10);
            int i11 = i10 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i10 = i11;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i11 == length || !Character.isLowSurrogate(str.charAt(i11))) {
                    return false;
                }
                i10 += 2;
            }
        }
        return true;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        long jF = f(0, bArr) & 67108863;
        int i10 = 3;
        long jF2 = (f(3, bArr) >> 2) & 67108611;
        long jF3 = (f(6, bArr) >> 4) & 67092735;
        long jF4 = (f(9, bArr) >> 6) & 66076671;
        long jF5 = (f(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        int i11 = 0;
        while (true) {
            int length = bArr2.length;
            if (i11 >= length) {
                long j15 = j10 + (j11 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j12 + (j15 >> 26);
                long j18 = j17 & 67108863;
                long j19 = j13 + (j17 >> 26);
                long j20 = j19 & 67108863;
                long j21 = ((j19 >> 26) * 5) + j14;
                long j22 = j21 >> 26;
                long j23 = j21 & 67108863;
                long j24 = j23 + 5;
                long j25 = (j11 & 67108863) + j22;
                long j26 = j25 + (j24 >> 26);
                long j27 = j16 + (j26 >> 26);
                long j28 = j18 + (j27 >> 26);
                long j29 = (j20 + (j28 >> 26)) - 67108864;
                long j30 = j29 >> 63;
                long j31 = ~j30;
                long j32 = (j25 & j30) | (j26 & 67108863 & j31);
                long j33 = (j16 & j30) | (j27 & 67108863 & j31);
                long j34 = (j18 & j30) | (j28 & 67108863 & j31);
                long jF6 = f(16, bArr) + (((j24 & 67108863 & j31) | (j23 & j30) | (j32 << 26)) & 4294967295L);
                long jF7 = f(20, bArr);
                long jF8 = f(24, bArr);
                long jF9 = f(28, bArr) + (((j34 >> 18) | (((j20 & j30) | (j29 & j31)) << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                k(jF6 & 4294967295L, bArr4, 0);
                long j35 = jF7 + (((j32 >> 6) | (j33 << 20)) & 4294967295L) + (jF6 >> 32);
                k(j35 & 4294967295L, bArr4, 4);
                long j36 = jF8 + (((j34 << 14) | (j33 >> 12)) & 4294967295L) + (j35 >> 32);
                k(j36 & 4294967295L, bArr4, 8);
                k((jF9 + (j36 >> 32)) & 4294967295L, bArr4, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long j37 = jF5 * 5;
            long j38 = jF4 * 5;
            long j39 = jF3 * 5;
            long jF10 = j14 + (f(0, bArr3) & 67108863);
            long jF11 = j11 + ((f(i10, bArr3) >> 2) & 67108863);
            long jF12 = j10 + ((f(6, bArr3) >> 4) & 67108863);
            long jF13 = j12 + ((f(9, bArr3) >> 6) & 67108863);
            long j40 = jF2;
            long jF14 = j13 + (((f(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j41 = jF11 * jF;
            long j42 = jF11 * j40;
            long j43 = jF12 * jF;
            long j44 = jF11 * jF3;
            long j45 = jF12 * j40;
            long j46 = jF13 * jF;
            long j47 = jF11 * jF4;
            long j48 = jF12 * jF3;
            long j49 = jF13 * j40;
            long j50 = jF14 * jF;
            long j51 = (jF2 * 5 * jF14) + (jF13 * j39) + (jF12 * j38) + (jF11 * j37) + (jF10 * jF);
            long j52 = j51 & 67108863;
            long j53 = jF13 * j38;
            long j54 = j39 * jF14;
            long j55 = j54 + j53 + (jF12 * j37) + (jF10 * j40) + j41 + (j51 >> 26);
            long j56 = j38 * jF14;
            long j57 = j56 + (jF13 * j37) + (jF10 * jF3) + j42 + j43 + (j55 >> 26);
            long j58 = (jF14 * j37) + (jF10 * jF4) + j44 + j45 + j46 + (j57 >> 26);
            long j59 = (jF10 * jF5) + j47 + j48 + j49 + j50 + (j58 >> 26);
            long j60 = ((j59 >> 26) * 5) + j52;
            j11 = (j55 & 67108863) + (j60 >> 26);
            i11 += 16;
            j10 = j57 & 67108863;
            j12 = j58 & 67108863;
            j13 = j59 & 67108863;
            j14 = j60 & 67108863;
            jF2 = j40;
            i10 = 3;
        }
    }

    public static int e(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static long f(int i10, byte[] bArr) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16))) & 4294967295L;
    }

    public static dr1 g(String str) throws IOException {
        try {
            return ai1.j(new pr1(new StringReader(str)));
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    public static String h(sq1 sq1Var) throws GeneralSecurityException {
        int iOrdinal = sq1Var.ordinal();
        if (iOrdinal == 0) {
            return AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1;
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(sq1Var.toString()));
    }

    public static LinkedHashMap i(int i10) {
        int i11;
        if (i10 < 3) {
            i11 = i10 + 1;
        } else {
            i11 = i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return new LinkedHashMap(i11);
    }

    public static Executor j(final Executor executor, final ud1 ud1Var) {
        executor.getClass();
        return executor == td1.f20333a ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.he1
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e10) {
                    ud1Var.d(e10);
                }
            }
        };
    }

    public static void k(long j10, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i10 + i11] = (byte) (255 & j10);
            j10 >>= 8;
        }
    }

    public static int l(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int[] m(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof fc1) {
            fc1 fc1Var = (fc1) abstractCollection;
            return Arrays.copyOfRange(fc1Var.f14359a, fc1Var.f14360b, fc1Var.f14361c);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List n(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new fc1(0, length, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer o(String str) {
        byte b10;
        Long lValueOf;
        byte b11;
        str.getClass();
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            int i10 = cCharAt == '-' ? 1 : 0;
            if (i10 != str.length()) {
                int i11 = i10 + 1;
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    b10 = hc1.f15256a[cCharAt2];
                } else {
                    byte[] bArr = hc1.f15256a;
                    b10 = -1;
                }
                if (b10 >= 0 && b10 < 10) {
                    long j10 = -b10;
                    while (true) {
                        if (i11 >= str.length()) {
                            if (cCharAt != '-') {
                                if (j10 != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j10);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j10);
                            break;
                        }
                        int i12 = i11 + 1;
                        char cCharAt3 = str.charAt(i11);
                        if (cCharAt3 < 128) {
                            b11 = hc1.f15256a[cCharAt3];
                        } else {
                            byte[] bArr2 = hc1.f15256a;
                            b11 = -1;
                        }
                        if (b11 >= 0 && b11 < 10 && j10 >= Buffer.OVERFLOW_ZONE) {
                            long j11 = j10 * 10;
                            long j12 = b11;
                            if (j11 >= Long.MIN_VALUE + j12) {
                                j10 = j11 - j12;
                                i11 = i12;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public abstract void b(byte[] bArr, int i10, int i11);
}

package com.google.common.primitives;

import java.math.BigInteger;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedLongs {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LexicographicalComparator implements Comparator<long[]> {
        public static final /* synthetic */ LexicographicalComparator[] X = {new LexicographicalComparator("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        LexicographicalComparator EF5;

        public static LexicographicalComparator valueOf(String str) {
            return (LexicographicalComparator) Enum.valueOf(LexicographicalComparator.class, str);
        }

        public static LexicographicalComparator[] values() {
            return (LexicographicalComparator[]) X.clone();
        }

        @Override // java.util.Comparator
        public final int compare(long[] jArr, long[] jArr2) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int iMin = Math.min(jArr3.length, jArr4.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                long j = jArr3[i2];
                long j2 = jArr4[i2];
                if (j != j2) {
                    return UnsignedLongs.a(j, j2);
                }
            }
            return jArr3.length - jArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    public static final class ParseOverflowDetection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final long[] f20066a = new long[37];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f20067b = new int[37];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int[] f20068c = new int[37];

        static {
            long j;
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i2 = 2; i2 <= 36; i2++) {
                long[] jArr = f20066a;
                long j2 = i2;
                long j3 = -1;
                if (j2 < 0) {
                    j = UnsignedLongs.a(-1L, j2) < 0 ? 0L : 1L;
                } else {
                    long j4 = (Long.MAX_VALUE / j2) << 1;
                    j = j4 + ((long) (UnsignedLongs.a((-1) - (j4 * j2), j2) >= 0 ? 1 : 0));
                }
                jArr[i2] = j;
                int[] iArr = f20067b;
                if (j2 < 0) {
                    if (UnsignedLongs.a(-1L, j2) < 0) {
                    }
                    iArr[i2] = (int) j3;
                    f20068c[i2] = bigInteger.toString(i2).length() - 1;
                } else {
                    j3 = (-1) - (((Long.MAX_VALUE / j2) << 1) * j2);
                    if (UnsignedLongs.a(j3, j2) < 0) {
                        j2 = 0;
                    }
                }
                j3 -= j2;
                iArr[i2] = (int) j3;
                f20068c[i2] = bigInteger.toString(i2).length() - 1;
            }
        }
    }

    public static int a(long j, long j2) {
        long j3 = j ^ Long.MIN_VALUE;
        long j4 = j2 ^ Long.MIN_VALUE;
        if (j3 < j4) {
            return -1;
        }
        return j3 > j4 ? 1 : 0;
    }
}

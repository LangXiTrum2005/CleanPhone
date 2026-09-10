package com.smartdigimkt.c4;

import com.smartdigimkt.p4.f0;

/* JADX INFO: loaded from: classes5.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f34201a = 8192;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f34202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f34203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f34204c;
        public final long[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f34205e;
        public final long f;

        private b(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j) {
            this.f34202a = jArr;
            this.f34203b = iArr;
            this.f34204c = i2;
            this.d = jArr2;
            this.f34205e = iArr2;
            this.f = j;
        }
    }

    private d() {
    }

    public static b a(int i2, long[] jArr, int[] iArr, long j) {
        int i3 = 8192 / i2;
        int iA = 0;
        for (int i4 : iArr) {
            iA += f0.a(i4, i3);
        }
        long[] jArr2 = new long[iA];
        int[] iArr2 = new int[iA];
        long[] jArr3 = new long[iA];
        int[] iArr3 = new int[iA];
        int i5 = 0;
        int i6 = 0;
        int iMax = 0;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i8 = iArr[i7];
            long j2 = jArr[i7];
            while (i8 > 0) {
                int iMin = Math.min(i3, i8);
                jArr2[i6] = j2;
                int i9 = i2 * iMin;
                iArr2[i6] = i9;
                iMax = Math.max(iMax, i9);
                jArr3[i6] = ((long) i5) * j;
                iArr3[i6] = 1;
                j2 += (long) iArr2[i6];
                i5 += iMin;
                i8 -= iMin;
                i6++;
            }
        }
        return new b(jArr2, iArr2, iMax, jArr3, iArr3, j * ((long) i5));
    }
}

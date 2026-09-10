package nattier;

import decarock.grimness;

/* JADX INFO: compiled from: FixedSampleSizeRechunker.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: compiled from: FixedSampleSizeRechunker.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long[] f33813attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final long f33814beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f33815dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int[] f33816marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int[] f33817saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final long[] f33818wireman;

        public saneness(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f33813attabal = jArr;
            this.f33817saneness = iArr;
            this.f33815dern = i;
            this.f33818wireman = jArr2;
            this.f33816marial = iArr2;
            this.f33814beachfront = j;
        }
    }

    public static saneness attabal(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int iCutely = 0;
        for (int i3 : iArr) {
            iCutely += grimness.cutely(i3, i2);
        }
        long[] jArr2 = new long[iCutely];
        int[] iArr2 = new int[iCutely];
        long[] jArr3 = new long[iCutely];
        int[] iArr3 = new int[iCutely];
        int i4 = 0;
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            long j2 = jArr[i6];
            while (i7 > 0) {
                int iMin = Math.min(i2, i7);
                jArr2[i5] = j2;
                int i8 = i * iMin;
                iArr2[i5] = i8;
                iMax = Math.max(iMax, i8);
                jArr3[i5] = ((long) i4) * j;
                iArr3[i5] = 1;
                j2 += (long) iArr2[i5];
                i4 += iMin;
                i7 -= iMin;
                i5++;
            }
        }
        return new saneness(jArr2, iArr2, iMax, jArr3, iArr3, j * ((long) i4));
    }
}

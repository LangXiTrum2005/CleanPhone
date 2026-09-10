package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class XingSeeker implements Seeker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17748c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17749e;
    public final long[] f;

    public XingSeeker(long j, int i2, long j2, long j3, long[] jArr) {
        this.f17746a = j;
        this.f17747b = i2;
        this.f17748c = j2;
        this.f = jArr;
        this.d = j3;
        this.f17749e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public final long a() {
        return this.f17749e;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.f17748c;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        double d;
        double d2;
        boolean zIsSeekable = isSeekable();
        int i2 = this.f17747b;
        long j2 = this.f17746a;
        if (!zIsSeekable) {
            SeekPoint seekPoint = new SeekPoint(0L, j2 + ((long) i2));
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        long jK = Util.k(j, 0L, this.f17748c);
        double d3 = (jK * 100.0d) / this.f17748c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i3 = (int) d3;
            long[] jArr = this.f;
            Assertions.e(jArr);
            double d5 = jArr[i3];
            if (i3 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i3 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i3))) + d5;
        }
        long j3 = this.d;
        SeekPoint seekPoint2 = new SeekPoint(jK, j2 + Util.k(Math.round((d4 / d) * j3), i2, j3 - 1));
        return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        long j2 = j - this.f17746a;
        if (!isSeekable() || j2 <= this.f17747b) {
            return 0L;
        }
        long[] jArr = this.f;
        Assertions.e(jArr);
        double d = (j2 * 256.0d) / this.d;
        int iF = Util.f(jArr, (long) d, true);
        long j3 = this.f17748c;
        long j4 = (((long) iF) * j3) / 100;
        long j5 = jArr[iF];
        int i2 = iF + 1;
        long j6 = (j3 * ((long) i2)) / 100;
        long j7 = iF == 99 ? 256L : jArr[i2];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return this.f != null;
    }
}

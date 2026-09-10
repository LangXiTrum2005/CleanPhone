package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* JADX INFO: loaded from: classes.dex */
final class XingSeeker implements Seeker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7051c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7052e;
    public final long f;
    public final long[] g;

    public XingSeeker(long j, int i2, long j2, int i3, long j3, long[] jArr) {
        this.f7049a = j;
        this.f7050b = i2;
        this.f7051c = j2;
        this.d = i3;
        this.f7052e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long a() {
        return this.f;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final int g() {
        return this.d;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.f7051c;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        double d;
        double d2;
        boolean zIsSeekable = isSeekable();
        int i2 = this.f7050b;
        long j2 = this.f7049a;
        if (!zIsSeekable) {
            SeekPoint seekPoint = new SeekPoint(0L, j2 + ((long) i2));
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        long jK = Util.k(j, 0L, this.f7051c);
        double d3 = (jK * 100.0d) / this.f7051c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i3 = (int) d3;
            long[] jArr = this.g;
            Assertions.f(jArr);
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
        long j3 = this.f7052e;
        SeekPoint seekPoint2 = new SeekPoint(jK, j2 + Util.k(Math.round((d4 / d) * j3), i2, j3 - 1));
        return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        long j2 = j - this.f7049a;
        if (!isSeekable() || j2 <= this.f7050b) {
            return 0L;
        }
        long[] jArr = this.g;
        Assertions.f(jArr);
        double d = (j2 * 256.0d) / this.f7052e;
        int iE = Util.e(jArr, (long) d, true);
        long j3 = this.f7051c;
        long j4 = (((long) iE) * j3) / 100;
        long j5 = jArr[iE];
        int i2 = iE + 1;
        long j6 = (j3 * ((long) i2)) / 100;
        long j7 = iE == 99 ? 256L : jArr[i2];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return this.g != null;
    }
}

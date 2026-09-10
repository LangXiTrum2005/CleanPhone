package androidx.media3.extractor.wav;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
final class WavSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WavFormat f7679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7681c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7682e;

    public WavSeekMap(WavFormat wavFormat, int i2, long j, long j2) {
        this.f7679a = wavFormat;
        this.f7680b = i2;
        this.f7681c = j;
        long j3 = (j2 - j) / ((long) wavFormat.f7675c);
        this.d = j3;
        this.f7682e = b(j3);
    }

    public final long b(long j) {
        long j2 = j * ((long) this.f7680b);
        long j3 = this.f7679a.f7674b;
        int i2 = Util.f5683a;
        return Util.O(j2, 1000000L, j3, RoundingMode.FLOOR);
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.f7682e;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        WavFormat wavFormat = this.f7679a;
        long j2 = (((long) wavFormat.f7674b) * j) / (((long) this.f7680b) * 1000000);
        long j3 = this.d;
        long jK = Util.k(j2, 0L, j3 - 1);
        long j4 = ((long) wavFormat.f7675c) * jK;
        long j5 = this.f7681c;
        long jB = b(jK);
        SeekPoint seekPoint = new SeekPoint(jB, j4 + j5);
        if (jB >= j || jK == j3 - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        long j6 = jK + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(b(j6), (((long) wavFormat.f7675c) * j6) + j5));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}

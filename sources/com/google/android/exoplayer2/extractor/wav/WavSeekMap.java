package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class WavSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WavFormat f18126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18128c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18129e;

    public WavSeekMap(WavFormat wavFormat, int i2, long j, long j2) {
        this.f18126a = wavFormat;
        this.f18127b = i2;
        this.f18128c = j;
        long j3 = (j2 - j) / ((long) wavFormat.f18122c);
        this.d = j3;
        this.f18129e = Util.F(j3 * ((long) i2), 1000000L, wavFormat.f18121b);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.f18129e;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        WavFormat wavFormat = this.f18126a;
        long j2 = ((long) wavFormat.f18121b) * j;
        int i2 = this.f18127b;
        long j3 = this.d - 1;
        long jK = Util.k(j2 / (((long) i2) * 1000000), 0L, j3);
        int i3 = wavFormat.f18122c;
        long j4 = this.f18128c;
        long jF = Util.F(jK * ((long) i2), 1000000L, wavFormat.f18121b);
        SeekPoint seekPoint = new SeekPoint(jF, (((long) i3) * jK) + j4);
        if (jF >= j || jK == j3) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        long j5 = jK + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(Util.F(j5 * ((long) i2), 1000000L, wavFormat.f18121b), (((long) i3) * j5) + j4));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}

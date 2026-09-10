package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class FlacSeekTableSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlacStreamMetadata f17535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17536b;

    public FlacSeekTableSeekMap(FlacStreamMetadata flacStreamMetadata, long j) {
        this.f17535a = flacStreamMetadata;
        this.f17536b = j;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.f17535a.b();
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        FlacStreamMetadata flacStreamMetadata = this.f17535a;
        Assertions.e(flacStreamMetadata.k);
        FlacStreamMetadata.SeekTable seekTable = flacStreamMetadata.k;
        long[] jArr = seekTable.f17544a;
        int iF = Util.f(jArr, Util.k((((long) flacStreamMetadata.f17540e) * j) / 1000000, 0L, flacStreamMetadata.j - 1), false);
        long j2 = iF == -1 ? 0L : jArr[iF];
        long[] jArr2 = seekTable.f17545b;
        long j3 = iF != -1 ? jArr2[iF] : 0L;
        int i2 = flacStreamMetadata.f17540e;
        long j4 = (j2 * 1000000) / ((long) i2);
        long j5 = this.f17536b;
        SeekPoint seekPoint = new SeekPoint(j4, j3 + j5);
        if (j4 == j || iF == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i3 = iF + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint((jArr[i3] * 1000000) / ((long) i2), j5 + jArr2[i3]));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}

package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final class FlacSeekTableSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlacStreamMetadata f6759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6760b;

    public FlacSeekTableSeekMap(FlacStreamMetadata flacStreamMetadata, long j) {
        this.f6759a = flacStreamMetadata;
        this.f6760b = j;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.f6759a.b();
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        FlacStreamMetadata flacStreamMetadata = this.f6759a;
        Assertions.f(flacStreamMetadata.k);
        FlacStreamMetadata.SeekTable seekTable = flacStreamMetadata.k;
        long[] jArr = seekTable.f6768a;
        int iE = Util.e(jArr, Util.k((((long) flacStreamMetadata.f6764e) * j) / 1000000, 0L, flacStreamMetadata.j - 1), false);
        long j2 = iE == -1 ? 0L : jArr[iE];
        long[] jArr2 = seekTable.f6769b;
        long j3 = iE != -1 ? jArr2[iE] : 0L;
        int i2 = flacStreamMetadata.f6764e;
        long j4 = (j2 * 1000000) / ((long) i2);
        long j5 = this.f6760b;
        SeekPoint seekPoint = new SeekPoint(j4, j3 + j5);
        if (j4 == j || iE == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i3 = iE + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint((jArr[i3] * 1000000) / ((long) i2), j5 + jArr2[i3]));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}

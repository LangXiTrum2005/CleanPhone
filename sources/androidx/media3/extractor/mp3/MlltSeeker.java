package androidx.media3.extractor.mp3;

import android.util.Pair;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* JADX INFO: loaded from: classes.dex */
final class MlltSeeker implements Seeker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f7031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f7032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7033c;

    public MlltSeeker(long[] jArr, long[] jArr2, long j) {
        this.f7031a = jArr;
        this.f7032b = jArr2;
        this.f7033c = j == -9223372036854775807L ? Util.I(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair b(long j, long[] jArr, long[] jArr2) {
        int iE = Util.e(jArr, j, true);
        long j2 = jArr[iE];
        long j3 = jArr2[iE];
        int i2 = iE + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i2];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i2] - j3))) + j3));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long a() {
        return -1L;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final int g() {
        return -2147483647;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.f7033c;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        Pair pairB = b(Util.T(Util.k(j, 0L, this.f7033c)), this.f7032b, this.f7031a);
        SeekPoint seekPoint = new SeekPoint(Util.I(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue());
        return new SeekMap.SeekPoints(seekPoint, seekPoint);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        return Util.I(((Long) b(j, this.f7031a, this.f7032b).second).longValue());
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}

package com.google.android.exoplayer2.extractor.mp3;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class MlltSeeker implements Seeker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f17731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f17732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17733c;

    public MlltSeeker(long[] jArr, long[] jArr2, long j) {
        this.f17731a = jArr;
        this.f17732b = jArr2;
        this.f17733c = j == -9223372036854775807L ? Util.B(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair b(long j, long[] jArr, long[] jArr2) {
        int iF = Util.f(jArr, j, true);
        long j2 = jArr[iF];
        long j3 = jArr2[iF];
        int i2 = iF + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i2];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i2] - j3))) + j3));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public final long a() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.f17733c;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        Pair pairB = b(Util.J(Util.k(j, 0L, this.f17733c)), this.f17732b, this.f17731a);
        SeekPoint seekPoint = new SeekPoint(Util.B(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue());
        return new SeekMap.SeekPoints(seekPoint, seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        return Util.B(((Long) b(j, this.f17731a, this.f17732b).second).longValue());
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}

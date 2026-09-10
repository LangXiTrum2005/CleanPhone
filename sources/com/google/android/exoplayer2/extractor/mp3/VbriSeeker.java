package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class VbriSeeker implements Seeker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f17743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f17744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17745c;
    public final long d;

    public VbriSeeker(long[] jArr, long[] jArr2, long j, long j2) {
        this.f17743a = jArr;
        this.f17744b = jArr2;
        this.f17745c = j;
        this.d = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public final long a() {
        return this.d;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.f17745c;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        long[] jArr = this.f17743a;
        int iF = Util.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.f17744b;
        SeekPoint seekPoint = new SeekPoint(j2, jArr2[iF]);
        if (j2 >= j || iF == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i2 = iF + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        return this.f17743a[Util.f(this.f17744b, j, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}

package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class IndexSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f17551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f17552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17553c;
    public final boolean d;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j) {
        Assertions.b(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z2 = length > 0;
        this.d = z2;
        if (!z2 || jArr2[0] <= 0) {
            this.f17551a = jArr;
            this.f17552b = jArr2;
        } else {
            int i2 = length + 1;
            long[] jArr3 = new long[i2];
            this.f17551a = jArr3;
            long[] jArr4 = new long[i2];
            this.f17552b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f17553c = j;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.f17553c;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        if (!this.d) {
            SeekPoint seekPoint = SeekPoint.f17559c;
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        long[] jArr = this.f17552b;
        int iF = Util.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.f17551a;
        SeekPoint seekPoint2 = new SeekPoint(j2, jArr2[iF]);
        if (j2 == j || iF == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
        }
        int i2 = iF + 1;
        return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return this.d;
    }
}

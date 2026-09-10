package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ChunkIndex implements SeekMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f17518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f17519c;
    public final long[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f17520e;
    public final long f;

    public ChunkIndex(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f17518b = iArr;
        this.f17519c = jArr;
        this.d = jArr2;
        this.f17520e = jArr3;
        int length = iArr.length;
        this.f17517a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        long[] jArr = this.f17520e;
        int iF = Util.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.f17519c;
        SeekPoint seekPoint = new SeekPoint(j2, jArr2[iF]);
        if (j2 >= j || iF == this.f17517a - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i2 = iF + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f17517a + ", sizes=" + Arrays.toString(this.f17518b) + ", offsets=" + Arrays.toString(this.f17519c) + ", timeUs=" + Arrays.toString(this.f17520e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}

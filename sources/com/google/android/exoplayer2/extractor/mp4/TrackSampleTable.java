package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class TrackSampleTable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Track f17849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f17851c;
    public final int[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17852e;
    public final long[] f;
    public final int[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f17853h;

    public TrackSampleTable(Track track, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j) {
        Assertions.b(iArr.length == jArr2.length);
        Assertions.b(jArr.length == jArr2.length);
        Assertions.b(iArr2.length == jArr2.length);
        this.f17849a = track;
        this.f17851c = jArr;
        this.d = iArr;
        this.f17852e = i2;
        this.f = jArr2;
        this.g = iArr2;
        this.f17853h = j;
        this.f17850b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int iB = Util.b(jArr, j, true); iB < jArr.length; iB++) {
            if ((this.g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}

package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
final class TrackSampleTable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Track f7158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f7160c;
    public final int[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7161e;
    public final long[] f;
    public final int[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7162h;

    public TrackSampleTable(Track track, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j) {
        Assertions.b(iArr.length == jArr2.length);
        Assertions.b(jArr.length == jArr2.length);
        Assertions.b(iArr2.length == jArr2.length);
        this.f7158a = track;
        this.f7160c = jArr;
        this.d = iArr;
        this.f7161e = i2;
        this.f = jArr2;
        this.g = iArr2;
        this.f7162h = j;
        this.f7159b = jArr.length;
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

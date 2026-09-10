package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final class IndexSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f6782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f6783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6784c;
    public final boolean d;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j) {
        Assertions.b(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z2 = length > 0;
        this.d = z2;
        if (!z2 || jArr2[0] <= 0) {
            this.f6782a = jArr;
            this.f6783b = jArr2;
        } else {
            int i2 = length + 1;
            long[] jArr3 = new long[i2];
            this.f6782a = jArr3;
            long[] jArr4 = new long[i2];
            this.f6783b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f6784c = j;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.f6784c;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        if (!this.d) {
            SeekPoint seekPoint = SeekPoint.f6798c;
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        long[] jArr = this.f6783b;
        int iE = Util.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.f6782a;
        SeekPoint seekPoint2 = new SeekPoint(j2, jArr2[iE]);
        if (j2 == j || iE == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
        }
        int i2 = iE + 1;
        return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(jArr[i2], jArr2[i2]));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return this.d;
    }
}

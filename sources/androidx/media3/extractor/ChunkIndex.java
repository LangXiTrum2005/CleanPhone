package androidx.media3.extractor;

import androidx.media3.common.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ChunkIndex implements SeekMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f6732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f6733c;
    public final long[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f6734e;
    public final long f;

    public ChunkIndex(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f6732b = iArr;
        this.f6733c = jArr;
        this.d = jArr2;
        this.f6734e = jArr3;
        int length = iArr.length;
        this.f6731a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.f;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        long[] jArr = this.f6734e;
        int iE = Util.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.f6733c;
        SeekPoint seekPoint = new SeekPoint(j2, jArr2[iE]);
        if (j2 >= j || iE == this.f6731a - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i2 = iE + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr[i2], jArr2[i2]));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f6731a + ", sizes=" + Arrays.toString(this.f6732b) + ", offsets=" + Arrays.toString(this.f6733c) + ", timeUs=" + Arrays.toString(this.f6734e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}

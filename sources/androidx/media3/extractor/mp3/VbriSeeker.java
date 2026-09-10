package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* JADX INFO: loaded from: classes.dex */
final class VbriSeeker implements Seeker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f7043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f7044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7045c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7046e;

    public VbriSeeker(long[] jArr, long[] jArr2, long j, long j2, int i2) {
        this.f7043a = jArr;
        this.f7044b = jArr2;
        this.f7045c = j;
        this.d = j2;
        this.f7046e = i2;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long a() {
        return this.d;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final int g() {
        return this.f7046e;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.f7045c;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        long[] jArr = this.f7043a;
        int iE = Util.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.f7044b;
        SeekPoint seekPoint = new SeekPoint(j2, jArr2[iE]);
        if (j2 >= j || iE == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i2 = iE + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr[i2], jArr2[i2]));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        return this.f7043a[Util.e(this.f7044b, j, true)];
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}

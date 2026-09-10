package androidx.media3.extractor.mp3;

import androidx.media3.extractor.ConstantBitrateSeekMap;

/* JADX INFO: loaded from: classes.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7029i;

    public ConstantBitrateSeeker(long j, long j2, int i2, int i3, boolean z2) {
        super(j, j2, i2, i3, z2);
        long j3 = j;
        this.f7028h = i2;
        this.f7029i = j3 == -1 ? -1L : j3;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long a() {
        return this.f7029i;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final int g() {
        return this.f7028h;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        return (Math.max(0L, j - this.f6736b) * 8000000) / ((long) this.f6738e);
    }
}

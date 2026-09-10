package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public class ConstantBitrateSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6737c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6738e;
    public final long f;
    public final boolean g;

    public ConstantBitrateSeekMap(long j, long j2, int i2, int i3, boolean z2) {
        this.f6735a = j;
        this.f6736b = j2;
        this.f6737c = i3 == -1 ? 1 : i3;
        this.f6738e = i2;
        this.g = z2;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / ((long) i2);
        }
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.f;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        long j2 = this.d;
        long j3 = this.f6736b;
        if (j2 == -1 && !this.g) {
            SeekPoint seekPoint = new SeekPoint(0L, j3);
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i2 = this.f6738e;
        long j4 = this.f6737c;
        long jMin = (((((long) i2) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / ((long) i2);
        SeekPoint seekPoint2 = new SeekPoint(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.f6735a) {
                return new SeekMap.SeekPoints(seekPoint2, new SeekPoint((Math.max(0L, j5 - j3) * 8000000) / ((long) i2), j5));
            }
        }
        return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return this.d != -1 || this.g;
    }
}

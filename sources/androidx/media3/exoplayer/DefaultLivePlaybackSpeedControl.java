package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f5836c;
    public long d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5837e = -9223372036854775807L;
    public long g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5838h = -9223372036854775807L;
    public float k = 0.97f;
    public float j = 1.03f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f5840l = 1.0f;
    public long m = -9223372036854775807L;
    public long f = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5839i = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5841n = -9223372036854775807L;
    public long o = -9223372036854775807L;

    public static final class Builder {
    }

    public DefaultLivePlaybackSpeedControl(long j, long j2, float f) {
        this.f5834a = j;
        this.f5835b = j2;
        this.f5836c = f;
    }

    public final void a() {
        long j;
        long j2 = this.d;
        if (j2 != -9223372036854775807L) {
            j = this.f5837e;
            if (j == -9223372036854775807L) {
                long j3 = this.g;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.f5838h;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f == j) {
            return;
        }
        this.f = j;
        this.f5839i = j;
        this.f5841n = -9223372036854775807L;
        this.o = -9223372036854775807L;
        this.m = -9223372036854775807L;
    }

    public final void b(long j) {
        this.f5837e = j;
        a();
    }
}

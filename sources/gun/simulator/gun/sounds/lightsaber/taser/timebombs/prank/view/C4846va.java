package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4846va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5137a;
    public final long b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    public C4846va(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f5137a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.c = j7;
        this.h = a(j2, j3, j4, j5, j6, j7);
    }

    public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return Ug0.k(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}

package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class Hj0 implements O30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3219d0 f3180a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public Hj0(C3219d0 c3219d0, int i, long j, long j2) {
        this.f3180a = c3219d0;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) c3219d0.f);
        this.d = j3;
        this.e = Ug0.R(j3 * ((long) i), 1000000L, c3219d0.d);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final long getDurationUs() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final N30 getSeekPoints(long j) {
        C3219d0 c3219d0 = this.f3180a;
        long j2 = ((long) c3219d0.d) * j;
        int i = this.b;
        long j3 = j2 / (((long) i) * 1000000);
        long j4 = this.d - 1;
        long jK = Ug0.k(j3, 0L, j4);
        long j5 = ((long) c3219d0.f) * jK;
        long j6 = this.c;
        long jR = Ug0.R(jK * ((long) i), 1000000L, c3219d0.d);
        Q30 q30 = new Q30(jR, j5 + j6);
        if (jR >= j || jK == j4) {
            return new N30(q30, q30);
        }
        long j7 = jK + 1;
        return new N30(q30, new Q30(Ug0.R(j7 * ((long) i), 1000000L, c3219d0.d), (((long) c3219d0.f) * j7) + j6));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final boolean isSeekable() {
        return true;
    }
}

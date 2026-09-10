package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3065bD implements S30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4163a;
    public final C2329Ca b;
    public final C2329Ca c;
    public long d;

    public C3065bD(long j, long j2, long j3) {
        this.d = j;
        this.f4163a = j3;
        C2329Ca c2329Ca = new C2329Ca(5);
        this.b = c2329Ca;
        C2329Ca c2329Ca2 = new C2329Ca(5);
        this.c = c2329Ca2;
        c2329Ca.a(0L);
        c2329Ca2.a(j2);
    }

    public final boolean a(long j) {
        C2329Ca c2329Ca = this.b;
        return j - c2329Ca.e(c2329Ca.f2927a - 1) < 100000;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S30
    public final long c() {
        return this.f4163a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final long getDurationUs() {
        return this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final N30 getSeekPoints(long j) {
        C2329Ca c2329Ca = this.b;
        int iC = Ug0.c(c2329Ca, j);
        long jE = c2329Ca.e(iC);
        C2329Ca c2329Ca2 = this.c;
        Q30 q30 = new Q30(jE, c2329Ca2.e(iC));
        if (jE == j || iC == c2329Ca.f2927a - 1) {
            return new N30(q30, q30);
        }
        int i = iC + 1;
        return new N30(q30, new Q30(c2329Ca.e(i), c2329Ca2.e(i)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S30
    public final long getTimeUs(long j) {
        return this.b.e(Ug0.c(this.c, j));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final boolean isSeekable() {
        return true;
    }
}

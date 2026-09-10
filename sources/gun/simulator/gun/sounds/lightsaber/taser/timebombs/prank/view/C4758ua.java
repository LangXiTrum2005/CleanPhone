package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4758ua implements O30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4934wa f5084a;
    public final long b;
    public final long c = 0;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public C4758ua(InterfaceC4934wa interfaceC4934wa, long j, long j2, long j3, long j4, long j5) {
        this.f5084a = interfaceC4934wa;
        this.b = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final long getDurationUs() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final N30 getSeekPoints(long j) {
        Q30 q30 = new Q30(j, C4846va.a(this.f5084a.c(j), this.c, this.d, this.e, this.f, this.g));
        return new N30(q30, q30);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final boolean isSeekable() {
        return true;
    }
}

package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4292p90 implements O30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O30 f4826a;
    public final /* synthetic */ C4380q90 b;

    public C4292p90(C4380q90 c4380q90, O30 o30) {
        this.b = c4380q90;
        this.f4826a = o30;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final long getDurationUs() {
        return this.f4826a.getDurationUs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final N30 getSeekPoints(long j) {
        N30 seekPoints = this.f4826a.getSeekPoints(j);
        Q30 q30 = seekPoints.f3437a;
        long j2 = q30.f3588a;
        long j3 = q30.b;
        long j4 = this.b.f4872a;
        Q30 q31 = new Q30(j2, j3 + j4);
        Q30 q32 = seekPoints.b;
        return new N30(q31, new Q30(q32.f3588a, q32.b + j4));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final boolean isSeekable() {
        return this.f4826a.isSeekable();
    }
}

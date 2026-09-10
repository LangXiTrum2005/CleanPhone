package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3518gP implements W20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W20 f4414a;
    public final long b;

    public C3518gP(W20 w20, long j) {
        this.f4414a = w20;
        this.b = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int a(C3692iN c3692iN, C2677Pl c2677Pl, int i) {
        int iA = this.f4414a.a(c3692iN, c2677Pl, i);
        if (iA == -4) {
            c2677Pl.f = Math.max(0L, c2677Pl.f + this.b);
        }
        return iA;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final boolean isReady() {
        return this.f4414a.isReady();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final void maybeThrowError() {
        this.f4414a.maybeThrowError();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int skipData(long j) {
        return this.f4414a.skipData(j - this.b);
    }
}

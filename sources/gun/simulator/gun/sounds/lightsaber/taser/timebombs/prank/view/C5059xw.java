package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5059xw extends Ic0 {
    public Ic0 e;

    public C5059xw(Ic0 ic0) {
        AbstractC2995aW.q(ic0, "delegate");
        this.e = ic0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ic0
    public final Ic0 a() {
        return this.e.a();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ic0
    public final Ic0 b() {
        return this.e.b();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ic0
    public final long c() {
        return this.e.c();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ic0
    public final Ic0 d(long j) {
        return this.e.d(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ic0
    public final boolean e() {
        return this.e.e();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ic0
    public final void f() {
        this.e.f();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ic0
    public final Ic0 g(long j, TimeUnit timeUnit) {
        AbstractC2995aW.q(timeUnit, "unit");
        return this.e.g(j, timeUnit);
    }
}

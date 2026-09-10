package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4981x20 extends BF {
    public static volatile C4981x20 l;
    public C2328Bz k;

    public static C4981x20 u() {
        if (l != null) {
            return l;
        }
        synchronized (C4981x20.class) {
            try {
                if (l == null) {
                    C4981x20 c4981x20 = new C4981x20();
                    c4981x20.k = new C2328Bz(1);
                    l = c4981x20;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BF
    public final boolean n() {
        return this.k.n();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BF
    public final void q(Runnable runnable) {
        this.k.q(runnable);
    }

    public final void t(Runnable runnable) {
        this.k.t(runnable);
    }

    public final void v(long j, Runnable runnable) {
        this.k.v(j, runnable);
    }

    public final void w(Runnable runnable) {
        this.k.y(runnable);
    }
}

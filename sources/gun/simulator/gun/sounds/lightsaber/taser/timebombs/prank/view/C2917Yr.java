package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2917Yr extends AbstractRunnableC2943Zr {
    public final Runnable c;

    public C2917Yr(long j, Runnable runnable) {
        super(j);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractRunnableC2943Zr
    public final String toString() {
        return super.toString() + this.c;
    }
}

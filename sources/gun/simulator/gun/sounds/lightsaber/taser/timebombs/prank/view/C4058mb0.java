package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4058mb0 extends AbstractRunnableC3970lb0 {
    public final Runnable c;

    public C4058mb0(Runnable runnable, long j, Qm0 qm0) {
        super(j, qm0);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.run();
        } finally {
            this.b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC2340Cl.x(runnable));
        sb.append(", ");
        sb.append(this.f4652a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(']');
        return sb.toString();
    }
}

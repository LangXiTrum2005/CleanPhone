package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2891Xr extends AbstractRunnableC2943Zr {
    public final InterfaceC2772Tc c;
    public final /* synthetic */ AbstractC3122bs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2891Xr(AbstractC3122bs abstractC3122bs, long j, C2798Uc c2798Uc) {
        super(j);
        this.d = abstractC3122bs;
        this.c = c2798Uc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.r(this.d);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractRunnableC2943Zr
    public final String toString() {
        return super.toString() + this.c;
    }
}

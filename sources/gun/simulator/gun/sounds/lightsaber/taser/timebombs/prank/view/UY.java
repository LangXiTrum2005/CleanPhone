package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes.dex */
public final class UY implements InterfaceC4161nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4288p70 f3824a;
    public final /* synthetic */ VY b;

    public UY(VY vy, C4288p70 c4288p70) {
        this.b = vy;
        this.f3824a = c4288p70;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4161nj
    public final void a(boolean z) {
        if (z) {
            synchronized (this.b) {
                this.f3824a.g();
            }
        }
    }
}

package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2555Ks implements BI, InterfaceC2494Ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3328a;

    public /* synthetic */ C2555Ks(int i) {
        this.f3328a = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2494Ij
    public final void accept(Object obj) {
        ((C3031aq) obj).d(this.f3328a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
    public final void invoke(Object obj) {
        ((JU) obj).onRepeatModeChanged(this.f3328a);
    }
}

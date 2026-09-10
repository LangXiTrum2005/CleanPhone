package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.q90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4380q90 implements InterfaceC4353pt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4872a;
    public final InterfaceC4353pt b;

    public C4380q90(long j, InterfaceC4353pt interfaceC4353pt) {
        this.f4872a = j;
        this.b = interfaceC4353pt;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final void a(O30 o30) {
        this.b.a(new C4292p90(this, o30));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final void endTracks() {
        this.b.endTracks();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final InterfaceC4326pd0 track(int i, int i2) {
        return this.b.track(i, i2);
    }
}

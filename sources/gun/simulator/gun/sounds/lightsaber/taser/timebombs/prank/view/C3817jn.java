package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3817jn implements InterfaceC4341pl {
    public String b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RE f4571a = new RE(1);
    public final int c = 8000;
    public final int d = 8000;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4341pl
    public final InterfaceC4429ql createDataSource() {
        return new C3993ln(this.b, this.c, this.d, this.f4571a);
    }
}

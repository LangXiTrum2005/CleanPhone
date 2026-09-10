package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2983aK implements InterfaceC3072bK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3160cK f4118a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ C2983aK(C3160cK c3160cK, int i, int i2) {
        this.f4118a = c3160cK;
        this.b = i;
        this.c = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3072bK
    public final void run() {
        C3160cK c3160cK = this.f4118a;
        MJ mj = c3160cK.f4216a;
        int i = this.b;
        int i2 = this.c;
        if (mj == null) {
            c3160cK.f.add(new C2983aK(c3160cK, i, i2));
        } else {
            c3160cK.b.v(i, i2 + 0.99f);
        }
    }
}

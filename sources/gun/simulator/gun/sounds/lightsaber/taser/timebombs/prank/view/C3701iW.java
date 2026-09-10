package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3701iW implements InterfaceC5098yO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4341pl f4504a;
    public final Md0 b;
    public C2808Um c;
    public G7 d;
    public final int e;

    public C3701iW(InterfaceC4341pl interfaceC4341pl, InterfaceC4441qt interfaceC4441qt) {
        Md0 md0 = new Md0(interfaceC4441qt, 21);
        C2808Um c2808Um = new C2808Um();
        G7 g7 = new G7();
        this.f4504a = interfaceC4341pl;
        this.b = md0;
        this.c = c2808Um;
        this.d = g7;
        this.e = 1048576;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final InterfaceC5098yO a(C2808Um c2808Um) {
        FW.p(c2808Um, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = c2808Um;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final InterfaceC5098yO b(G7 g7) {
        FW.p(g7, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.d = g7;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final G9 c(C3693iO c3693iO) {
        c3693iO.b.getClass();
        return new C3787jW(c3693iO, this.f4504a, this.b, this.c.b(c3693iO), this.d, this.e);
    }
}

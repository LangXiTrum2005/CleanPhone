package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5080y8 extends AbstractC2746Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4992x8[] f5264a;

    public C5080y8(C4992x8[] c4992x8Arr) {
        this.f5264a = c4992x8Arr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2746Sc
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (C4992x8 c4992x8 : this.f5264a) {
            InterfaceC4612sp interfaceC4612sp = c4992x8.f;
            if (interfaceC4612sp == null) {
                AbstractC2995aW.x0("handle");
                throw null;
            }
            interfaceC4612sp.c();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final Object invoke(Object obj) {
        b();
        return C5033xf0.f5238a;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f5264a + ']';
    }
}

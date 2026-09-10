package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3688iJ implements InterfaceC3616hZ, InterfaceC2322Bt {
    public static final C2296At e = AbstractC2374Dt.a(20, new C4710tz(5));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4508rh f4496a = new C4508rh();
    public InterfaceC3616hZ b;
    public boolean c;
    public boolean d;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final int a() {
        return this.b.a();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final Class b() {
        return this.b.b();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2322Bt
    public final C4508rh c() {
        return this.f4496a;
    }

    public final synchronized void d() {
        this.f4496a.a();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final Object get() {
        return this.b.get();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final synchronized void recycle() {
        this.f4496a.a();
        this.d = true;
        if (!this.c) {
            this.b.recycle();
            this.b = null;
            e.release(this);
        }
    }
}

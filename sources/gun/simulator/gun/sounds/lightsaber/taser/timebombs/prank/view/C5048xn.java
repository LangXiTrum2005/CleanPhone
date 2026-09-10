package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5048xn implements InterfaceC4042mN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3764j90 f5245a;
    public final InterfaceC4960wn b;
    public L9 c;
    public InterfaceC4042mN d;
    public boolean e = true;
    public boolean f;

    public C5048xn(InterfaceC4960wn interfaceC4960wn, InterfaceC2412Ff interfaceC2412Ff) {
        this.b = interfaceC4960wn;
        this.f5245a = new C3764j90(interfaceC2412Ff);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4042mN
    public final void a(EU eu) {
        InterfaceC4042mN interfaceC4042mN = this.d;
        if (interfaceC4042mN != null) {
            interfaceC4042mN.a(eu);
            eu = this.d.getPlaybackParameters();
        }
        this.f5245a.a(eu);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4042mN
    public final EU getPlaybackParameters() {
        InterfaceC4042mN interfaceC4042mN = this.d;
        return interfaceC4042mN != null ? interfaceC4042mN.getPlaybackParameters() : this.f5245a.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4042mN
    public final long getPositionUs() {
        if (this.e) {
            return this.f5245a.getPositionUs();
        }
        InterfaceC4042mN interfaceC4042mN = this.d;
        interfaceC4042mN.getClass();
        return interfaceC4042mN.getPositionUs();
    }
}

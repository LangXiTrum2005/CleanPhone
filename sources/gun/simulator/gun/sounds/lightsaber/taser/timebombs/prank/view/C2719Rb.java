package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2719Rb implements InterfaceC3551gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3664a;
    public final InterfaceC2693Qb b;

    public C2719Rb(byte[] bArr, InterfaceC2693Qb interfaceC2693Qb) {
        this.f3664a = bArr;
        this.b = interfaceC2693Qb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final Class a() {
        return this.b.a();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void c(IV iv, InterfaceC3463fl interfaceC3463fl) {
        interfaceC3463fl.k(this.b.j(this.f3664a));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final EnumC4516rl e() {
        return EnumC4516rl.f4942a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void b() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void cancel() {
    }
}

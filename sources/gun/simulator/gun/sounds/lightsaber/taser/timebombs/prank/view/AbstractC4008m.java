package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4008m implements InterfaceC3373ek {
    private final InterfaceC3461fk key;

    public AbstractC4008m(InterfaceC3461fk interfaceC3461fk) {
        AbstractC2995aW.q(interfaceC3461fk, "key");
        this.key = interfaceC3461fk;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public <R> R fold(R r, InterfaceC3567gx interfaceC3567gx) {
        AbstractC2995aW.q(interfaceC3567gx, "operation");
        return (R) interfaceC3567gx.invoke(r, this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public <E extends InterfaceC3373ek> E get(InterfaceC3461fk interfaceC3461fk) {
        return (E) AbstractC2995aW.D(this, interfaceC3461fk);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3373ek
    public InterfaceC3461fk getKey() {
        return this.key;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public InterfaceC3549gk minusKey(InterfaceC3461fk interfaceC3461fk) {
        return AbstractC2995aW.b0(this, interfaceC3461fk);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public InterfaceC3549gk plus(InterfaceC3549gk interfaceC3549gk) {
        return AbstractC2995aW.f0(this, interfaceC3549gk);
    }
}

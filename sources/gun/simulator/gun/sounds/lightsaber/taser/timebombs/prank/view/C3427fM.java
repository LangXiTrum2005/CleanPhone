package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3427fM extends AbstractC5002xG {
    public final /* synthetic */ int c;
    public final F40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3427fM(InterfaceC4123nG interfaceC4123nG, InterfaceC4123nG interfaceC4123nG2, int i) {
        super(interfaceC4123nG, interfaceC4123nG2);
        this.c = i;
        if (i != 1) {
            this.d = AbstractC3375el.i("kotlin.collections.Map.Entry", C3442fa0.c, new D40[0], new C3339eM(interfaceC4123nG, interfaceC4123nG2, 0));
        } else {
            super(interfaceC4123nG, interfaceC4123nG2);
            this.d = AbstractC3375el.h("kotlin.Pair", new D40[0], new C3339eM(interfaceC4123nG, interfaceC4123nG2, 1));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return this.d;
    }
}

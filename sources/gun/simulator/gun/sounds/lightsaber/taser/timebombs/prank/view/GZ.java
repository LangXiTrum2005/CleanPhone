package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public abstract class GZ extends FZ implements InterfaceC4445qx {
    private final int arity;

    public GZ(int i, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.arity = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4445qx
    public int getArity() {
        return this.arity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        AbstractC3263dY.f4274a.getClass();
        String strA = C3351eY.a(this);
        AbstractC2995aW.p(strA, "renderLambdaToString(this)");
        return strA;
    }
}

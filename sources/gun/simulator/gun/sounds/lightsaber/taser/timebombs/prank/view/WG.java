package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WG implements InterfaceC4445qx, Serializable {
    private final int arity;

    public WG(int i) {
        this.arity = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4445qx
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        AbstractC3263dY.f4274a.getClass();
        String strA = C3351eY.a(this);
        AbstractC2995aW.p(strA, "renderLambdaToString(this)");
        return strA;
    }
}

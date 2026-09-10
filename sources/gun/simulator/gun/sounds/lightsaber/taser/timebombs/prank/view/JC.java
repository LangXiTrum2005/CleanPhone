package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class JC extends AbstractC4554s9 implements Serializable {
    public final transient FC d;
    public final transient int e;

    public JC(C4405qY c4405qY, int i) {
        this.d = c4405qY;
        this.e = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3255dQ
    public final Map a() {
        return this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O
    public final Map c() {
        throw new AssertionError("should never be called");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3255dQ
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O
    public final Set d() {
        throw new AssertionError("unreachable");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O
    public final Iterator e() {
        return new GC(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O
    public final Iterator f() {
        return new HC(this);
    }

    public final KC g() {
        return this.d.keySet();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3255dQ
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3255dQ
    public final int size() {
        return this.e;
    }
}

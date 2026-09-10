package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4998xC extends AbstractC4734uC {
    public C4998xC() {
        FW.n(4, "initialCapacity");
        this.f = new Object[4];
        this.g = 0;
    }

    public final void H0(Object obj) {
        obj.getClass();
        G0(this.g + 1);
        Object[] objArr = this.f;
        int i = this.g;
        this.g = i + 1;
        objArr[i] = obj;
    }

    public final void I0(List list) {
        if (list instanceof Collection) {
            List list2 = list;
            G0(list2.size() + this.g);
            if (list2 instanceof AbstractC4822vC) {
                this.g = ((AbstractC4822vC) list2).b(this.g, this.f);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            H0(it.next());
        }
    }

    public final C3965lY J0() {
        this.h = true;
        return AC.h(this.g, this.f);
    }
}

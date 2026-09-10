package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H4 implements O4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3152a;

    public H4() {
        this.f3152a = new ArrayList();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O4
    public final AbstractC5170z9 d() {
        List list = this.f3152a;
        return ((C5090yG) list.get(0)).c() ? new C4270oy(list, 1) : new WT(list);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O4
    public final List f() {
        return this.f3152a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O4
    public final boolean g() {
        List list = this.f3152a;
        return list.size() == 1 && ((C5090yG) list.get(0)).c();
    }

    public H4(ArrayList arrayList) {
        this.f3152a = arrayList;
    }
}

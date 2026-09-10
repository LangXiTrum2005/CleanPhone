package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class HU implements InterfaceC2538Kb {
    public static final String b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3125bv f3173a;

    static {
        new C4581sZ(3).b();
        int i = Ug0.f3833a;
        b = Integer.toString(0, 36);
    }

    public HU(C3125bv c3125bv) {
        this.f3173a = c3125bv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HU) {
            return this.f3173a.equals(((HU) obj).f3173a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3173a.hashCode();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            C3125bv c3125bv = this.f3173a;
            if (i >= c3125bv.f4194a.size()) {
                bundle.putIntegerArrayList(b, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(c3125bv.a(i)));
            i++;
        }
    }
}

package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2469Hk implements InterfaceC2538Kb {
    public static final C2469Hk c;
    public static final String d;
    public static final String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AC f3181a;
    public final long b;

    static {
        C5086yC c5086yC = AC.b;
        c = new C2469Hk(0L, C3965lY.e);
        int i = Ug0.f3833a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
    }

    public C2469Hk(long j, List list) {
        this.f3181a = AC.j(list);
        this.b = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        C5086yC c5086yC = AC.b;
        FW.n(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        int i2 = 0;
        while (true) {
            AC ac = this.f3181a;
            if (i >= ac.size()) {
                bundle.putParcelableArrayList(d, FW.g0(AC.h(i2, objArrCopyOf)));
                bundle.putLong(e, this.b);
                return bundle;
            }
            if (((C2417Fk) ac.get(i)).d == null) {
                C2417Fk c2417Fk = (C2417Fk) ac.get(i);
                c2417Fk.getClass();
                int i3 = i2 + 1;
                if (objArrCopyOf.length < i3) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC2995aW.y(objArrCopyOf.length, i3));
                }
                objArrCopyOf[i2] = c2417Fk;
                i2 = i3;
            }
            i++;
        }
    }
}

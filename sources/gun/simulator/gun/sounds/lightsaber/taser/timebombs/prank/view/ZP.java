package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ZP implements FP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4070a;
    public final Pools.Pool b;

    public ZP(ArrayList arrayList, Pools.Pool pool) {
        this.f4070a = arrayList;
        this.b = pool;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final boolean a(Object obj) {
        Iterator it = this.f4070a.iterator();
        while (it.hasNext()) {
            if (((FP) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final EP b(Object obj, int i, int i2, YS ys) {
        EP epB;
        List list = this.f4070a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC4650tG interfaceC4650tG = null;
        for (int i3 = 0; i3 < size; i3++) {
            FP fp = (FP) list.get(i3);
            if (fp.a(obj) && (epB = fp.b(obj, i, i2, ys)) != null) {
                arrayList.add(epB.c);
                interfaceC4650tG = epB.f3021a;
            }
        }
        if (arrayList.isEmpty() || interfaceC4650tG == null) {
            return null;
        }
        return new EP(interfaceC4650tG, new YP(arrayList, this.b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f4070a.toArray()) + '}';
    }
}

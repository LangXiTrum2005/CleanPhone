package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f3267a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(HV.f3174a, 0);
        map.put(HV.b, 1);
        map.put(HV.c, 2);
        for (HV hv : map.keySet()) {
            f3267a.append(((Integer) b.get(hv)).intValue(), hv);
        }
    }

    public static int a(HV hv) {
        Integer num = (Integer) b.get(hv);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + hv);
    }

    public static HV b(int i) {
        HV hv = (HV) f3267a.get(i);
        if (hv != null) {
            return hv;
        }
        throw new IllegalArgumentException(AbstractC3950lJ.p("Unknown Priority for value ", i));
    }
}

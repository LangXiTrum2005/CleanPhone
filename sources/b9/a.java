package b9;

import android.util.SparseArray;
import java.util.HashMap;
import o8.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f5509a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f5510b;

    static {
        HashMap map = new HashMap();
        f5510b = map;
        map.put(d.f47211a, 0);
        map.put(d.f47212b, 1);
        map.put(d.f47213c, 2);
        for (d dVar : map.keySet()) {
            f5509a.append(((Integer) f5510b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f5510b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f5509a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(l1.d.e(i10, "Unknown Priority for value "));
    }
}

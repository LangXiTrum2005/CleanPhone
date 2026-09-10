package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4525a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4526b;

    public b(HashMap map) {
        this.f4526b = map;
        for (Map.Entry entry : map.entrySet()) {
            m mVar = (m) entry.getValue();
            List arrayList = (List) this.f4525a.get(mVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f4525a.put(mVar, arrayList);
            }
            arrayList.add((c) entry.getKey());
        }
    }

    public static void a(List list, v vVar, m mVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.f4529b;
                try {
                    int i10 = cVar.f4528a;
                    if (i10 == 0) {
                        method.invoke(obj, null);
                    } else if (i10 == 1) {
                        method.invoke(obj, vVar);
                    } else if (i10 == 2) {
                        method.invoke(obj, vVar, mVar);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}

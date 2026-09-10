package v0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import wj.r;
import xj.b0;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ck.i implements jk.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ u0.e f52287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ w0.b f52288g;

    @Override // jk.d
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k kVar = new k(3, (ak.f) obj3);
        kVar.f52287f = (u0.e) obj;
        kVar.f52288g = (w0.b) obj2;
        return kVar.invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        t9.e.z(obj);
        u0.e eVar = this.f52287f;
        w0.b bVar = this.f52288g;
        Set setKeySet = bVar.a().keySet();
        ArrayList arrayList = new ArrayList(p.W(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((w0.d) it.next()).f52738a);
        }
        Map<String, ?> all = eVar.f51656a.getAll();
        n.e(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = eVar.f51657b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(b0.O(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = xj.n.R0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        w0.b bVar2 = new w0.b(b0.Y(bVar.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String name = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                bVar2.f(go.k.d(name), value2);
            } else if (value2 instanceof Float) {
                n.f(name, "name");
                bVar2.f(new w0.d(name), value2);
            } else if (value2 instanceof Integer) {
                bVar2.f(go.k.O(name), value2);
            } else if (value2 instanceof Long) {
                bVar2.f(go.k.Q(name), value2);
            } else if (value2 instanceof String) {
                bVar2.f(go.k.X(name), value2);
            } else if (value2 instanceof Set) {
                bVar2.f(go.k.Y(name), (Set) value2);
            }
        }
        return new w0.b(b0.Y(bVar2.a()), true);
    }
}

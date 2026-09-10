package n1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oa.z1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends oa.q implements Map {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f46389b;

    public n(Map map) {
        this.f46389b = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f46389b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f46389b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((z1) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return oa.q.i(this.f46389b.entrySet(), new m(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && oa.q.g(obj, this);
    }

    @Override // oa.q
    public final Object f() {
        return this.f46389b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f46389b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return oa.q.o(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f46389b;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return oa.q.i(this.f46389b.keySet(), new m(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f46389b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f46389b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f46389b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f46389b;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f46389b.values();
    }
}

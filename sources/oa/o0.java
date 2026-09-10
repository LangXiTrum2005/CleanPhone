package oa;

import com.ironsource.B5;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 implements Map, Serializable {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient p1 f47284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient q1 f47285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient r1 f47286c;

    public static b2.p d() {
        return new b2.p(4);
    }

    public static o0 e(Map map) {
        if ((map instanceof o0) && !(map instanceof SortedMap)) {
            return (o0) map;
        }
        Set setEntrySet = map.entrySet();
        b2.p pVar = new b2.p(setEntrySet != null ? setEntrySet.size() : 4);
        pVar.m(setEntrySet);
        return pVar.c(true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return q.g(obj, this);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final u0 entrySet() {
        p1 p1Var = this.f47284a;
        if (p1Var != null) {
            return p1Var;
        }
        s1 s1Var = (s1) this;
        p1 p1Var2 = new p1(s1Var, s1Var.f47309e, s1Var.f47310f);
        this.f47284a = p1Var2;
        return p1Var2;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final u0 keySet() {
        q1 q1Var = this.f47285b;
        if (q1Var != null) {
            return q1Var;
        }
        s1 s1Var = (s1) this;
        q1 q1Var2 = new q1(s1Var, new r1(0, s1Var.f47310f, s1Var.f47309e));
        this.f47285b = q1Var2;
        return q1Var2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return q.o(entrySet());
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final c0 values() {
        r1 r1Var = this.f47286c;
        if (r1Var != null) {
            return r1Var;
        }
        s1 s1Var = (s1) this;
        r1 r1Var2 = new r1(1, s1Var.f47310f, s1Var.f47309e);
        this.f47286c = r1Var2;
        return r1Var2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((s1) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i10 = ((s1) this).f47310f;
        q.d(i10, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
        sb2.append('{');
        e2 it = ((p1) entrySet()).iterator();
        boolean z10 = true;
        while (true) {
            f0 f0Var = (f0) it;
            if (!f0Var.hasNext()) {
                sb2.append('}');
                return sb2.toString();
            }
            Map.Entry entry = (Map.Entry) f0Var.next();
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append(B5.U);
            sb2.append(entry.getValue());
            z10 = false;
        }
    }

    public Object writeReplace() {
        return new n0(this);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uq1 extends ps1 implements Map {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Map f20863u;

    public uq1(Map map) {
        super(27);
        this.f20863u = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f20863u.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f20863u.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((hb1) entrySet()).iterator();
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
        return dv.q(this.f20863u.entrySet(), u2.f20599e);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && pi1.u(obj, this);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f20863u.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return dv.v(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f20863u;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return dv.q(this.f20863u.keySet(), u2.f20600f);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f20863u.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f20863u.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f20863u.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f20863u;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f20863u.values();
    }

    @Override // com.google.android.gms.internal.ads.ps1
    public final /* synthetic */ Object z() {
        return this.f20863u;
    }
}

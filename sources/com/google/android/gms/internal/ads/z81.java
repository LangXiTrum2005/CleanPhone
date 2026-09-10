package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class z81 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22561a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Map f22562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient AbstractSet f22563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient AbstractCollection f22564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Serializable f22565e;

    public z81(ua1 ua1Var, Map map) {
        Objects.requireNonNull(ua1Var);
        this.f22565e = ua1Var;
        this.f22562b = map;
    }

    public oa.d0 a(Map.Entry entry) {
        Object key = entry.getKey();
        oa.a aVar = (oa.a) ((oa.l) this.f22565e);
        List list = (List) ((Collection) entry.getValue());
        return new oa.d0(key, list instanceof RandomAccess ? new oa.h(aVar, key, list, null) : new i91(aVar, key, list, (i91) null));
    }

    public AbstractMap.SimpleImmutableEntry b(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        ua1 ua1Var = (ua1) this.f22565e;
        ua1Var.getClass();
        List list = (List) collection;
        return new AbstractMap.SimpleImmutableEntry(key, list instanceof RandomAccess ? new e91(ua1Var, key, list, null) : new i91(ua1Var, key, list, (i91) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.f22561a) {
            case 0:
                ua1 ua1Var = (ua1) this.f22565e;
                if (this.f22562b != ua1Var.f20713d) {
                    y81 y81Var = new y81(this);
                    while (y81Var.hasNext()) {
                        y81Var.next();
                        y81Var.remove();
                    }
                } else {
                    ua1Var.j();
                }
                break;
            default:
                oa.l lVar = (oa.l) this.f22565e;
                if (this.f22562b != lVar.f47270d) {
                    oa.d dVar = new oa.d(this);
                    while (dVar.hasNext()) {
                        dVar.next();
                        dVar.remove();
                    }
                } else {
                    lVar.j();
                }
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f22561a) {
            case 0:
                Map map = this.f22562b;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                Map map2 = this.f22562b;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.f22561a) {
            case 0:
                x81 x81Var = (x81) this.f22563c;
                if (x81Var != null) {
                    return x81Var;
                }
                x81 x81Var2 = new x81(this);
                this.f22563c = x81Var2;
                return x81Var2;
            default:
                oa.c cVar = (oa.c) this.f22563c;
                if (cVar != null) {
                    return cVar;
                }
                oa.c cVar2 = new oa.c(this);
                this.f22563c = cVar2;
                return cVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f22561a) {
            case 0:
                return this == obj || this.f22562b.equals(obj);
            default:
                return this == obj || this.f22562b.equals(obj);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f22561a) {
            case 0:
                Map map = this.f22562b;
                map.getClass();
                try {
                    obj2 = map.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                ua1 ua1Var = (ua1) this.f22565e;
                ua1Var.getClass();
                List list = (List) collection;
                return list instanceof RandomAccess ? new e91(ua1Var, obj, list, null) : new i91(ua1Var, obj, list, (i91) null);
            default:
                Map map2 = this.f22562b;
                map2.getClass();
                try {
                    obj3 = map2.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                oa.a aVar = (oa.a) ((oa.l) this.f22565e);
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new oa.h(aVar, obj, list2, null) : new i91(aVar, obj, list2, (i91) null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.f22561a) {
            case 0:
                return this.f22562b.hashCode();
            default:
                return this.f22562b.hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        Set g91Var;
        switch (this.f22561a) {
            case 0:
                ua1 ua1Var = (ua1) this.f22565e;
                Set set = ua1Var.f16385a;
                if (set == null) {
                    Map map = ua1Var.f20713d;
                    if (map instanceof NavigableMap) {
                        g91Var = new d91(ua1Var, (NavigableMap) map);
                    } else {
                        g91Var = map instanceof SortedMap ? new g91(ua1Var, (SortedMap) map) : new a91(ua1Var, map);
                    }
                    set = g91Var;
                    ua1Var.f16385a = set;
                }
                return set;
            default:
                return ((oa.l) this.f22565e).i();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.f22561a) {
            case 0:
                Collection collection = (Collection) this.f22562b.remove(obj);
                if (collection == null) {
                    return null;
                }
                ua1 ua1Var = (ua1) this.f22565e;
                List list = (List) ua1Var.f20715f.zza();
                list.addAll(collection);
                ua1Var.f20714e -= collection.size();
                collection.clear();
                return list;
            default:
                oa.l lVar = (oa.l) this.f22565e;
                Collection collection2 = (Collection) this.f22562b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                Collection collectionK = lVar.k();
                collectionK.addAll(collection2);
                lVar.f47271e -= collection2.size();
                collection2.clear();
                return collectionK;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.f22561a) {
            case 0:
                break;
        }
        return this.f22562b.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.f22561a) {
            case 0:
                break;
        }
        return this.f22562b.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.f22561a) {
            case 0:
                j91 j91Var = (j91) this.f22564d;
                if (j91Var != null) {
                    return j91Var;
                }
                j91 j91Var2 = new j91(this, 2);
                this.f22564d = j91Var2;
                return j91Var2;
            default:
                j91 j91Var3 = (j91) this.f22564d;
                if (j91Var3 != null) {
                    return j91Var3;
                }
                j91 j91Var4 = new j91(this, 5);
                this.f22564d = j91Var4;
                return j91Var4;
        }
    }

    public z81(oa.l lVar, Map map) {
        this.f22565e = lVar;
        this.f22562b = map;
    }
}

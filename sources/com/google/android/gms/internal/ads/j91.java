package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j91 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16032b;

    public /* synthetic */ j91(int i10, Serializable serializable) {
        this.f16031a = i10;
        this.f16032b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f16031a) {
            case 0:
                ((ua1) this.f16032b).j();
                break;
            case 1:
                ((r91) this.f16032b).clear();
                break;
            case 2:
                ((z81) this.f16032b).clear();
                break;
            case 3:
                ((oa.l) this.f16032b).j();
                break;
            case 4:
                ((oa.u) this.f16032b).clear();
                break;
            default:
                ((AbstractMap) this.f16032b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f16031a) {
            case 0:
                return ((ua1) this.f16032b).h(obj);
            case 1:
            case 4:
            default:
                return super.contains(obj);
            case 2:
                return ((z81) this.f16032b).containsValue(obj);
            case 3:
                return ((oa.l) this.f16032b).e(obj);
            case 5:
                return ((AbstractMap) this.f16032b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f16031a) {
            case 2:
                return ((z81) this.f16032b).isEmpty();
            case 5:
                return ((AbstractMap) this.f16032b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f16031a) {
            case 0:
                ua1 ua1Var = (ua1) this.f16032b;
                ua1Var.getClass();
                return new w81(ua1Var);
            case 1:
                r91 r91Var = (r91) this.f16032b;
                Map mapJ = r91Var.j();
                return mapJ != null ? mapJ.values().iterator() : new n91(r91Var, 2);
            case 2:
                return new sa1(((z81) this.f16032b).entrySet().iterator());
            case 3:
                return new oa.b((oa.l) this.f16032b);
            case 4:
                oa.u uVar = (oa.u) this.f16032b;
                Map mapG = uVar.g();
                return mapG != null ? mapG.values().iterator() : new oa.r(uVar, 2);
            default:
                return new oa.h1(((AbstractMap) this.f16032b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f16031a) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    z81 z81Var = (z81) this.f16032b;
                    for (Map.Entry entry : z81Var.entrySet()) {
                        if (Objects.equals(obj, entry.getValue())) {
                            z81Var.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 5:
                AbstractMap abstractMap = (AbstractMap) this.f16032b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (d0.c.h(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f16031a) {
            case 2:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    z81 z81Var = (z81) this.f16032b;
                    for (Map.Entry entry : z81Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return z81Var.keySet().removeAll(hashSet);
                }
            case 5:
                AbstractMap abstractMap = (AbstractMap) this.f16032b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet2);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f16031a) {
            case 2:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    z81 z81Var = (z81) this.f16032b;
                    for (Map.Entry entry : z81Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return z81Var.keySet().retainAll(hashSet);
                }
            case 5:
                AbstractMap abstractMap = (AbstractMap) this.f16032b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet2);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f16031a) {
            case 0:
                return ((ua1) this.f16032b).f20714e;
            case 1:
                return ((r91) this.f16032b).size();
            case 2:
                return ((z81) this.f16032b).f22562b.size();
            case 3:
                return ((oa.l) this.f16032b).f47271e;
            case 4:
                return ((oa.u) this.f16032b).size();
            default:
                return ((AbstractMap) this.f16032b).size();
        }
    }

    public /* synthetic */ j91(AbstractMap abstractMap, int i10) {
        this.f16031a = i10;
        this.f16032b = abstractMap;
    }
}

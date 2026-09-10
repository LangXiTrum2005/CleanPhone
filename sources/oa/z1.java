package oa;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class z1 extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f47359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final na.i f47360b;

    public z1(Set set, na.i iVar) {
        this.f47359a = set;
        this.f47360b = iVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        go.k.i(this.f47360b.apply(obj));
        return this.f47359a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            go.k.i(this.f47360b.apply(it.next()));
        }
        return this.f47359a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f47359a;
        boolean z10 = set instanceof RandomAccess;
        na.i iVar = this.f47360b;
        if (!z10 || !(set instanceof List)) {
            Iterator it = set.iterator();
            iVar.getClass();
            while (it.hasNext()) {
                if (iVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        iVar.getClass();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            if (!iVar.apply(obj)) {
                if (i11 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        q.u(list, iVar, i10, i11);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        q.u(list, iVar, i10, i11);
                        return;
                    }
                }
                i10++;
            }
        }
        list.subList(i10, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f47359a;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f47360b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return q.h(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return q.o(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f47359a.iterator();
        na.i iVar = this.f47360b;
        go.k.o(iVar, "predicate");
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (iVar.apply(it.next())) {
                break;
            }
            i10++;
        }
        return true ^ (i10 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f47359a.iterator();
        it.getClass();
        na.i iVar = this.f47360b;
        iVar.getClass();
        return new y0(it, iVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f47359a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f47359a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f47360b.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f47359a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f47360b.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f47359a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f47360b.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            y0 y0Var = (y0) it;
            if (!y0Var.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(y0Var.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            y0 y0Var = (y0) it;
            if (y0Var.hasNext()) {
                arrayList.add(y0Var.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}

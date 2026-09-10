package oa;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 extends x0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v1 f47336h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient j0 f47337g;

    static {
        f0 f0Var = j0.f47265b;
        f47336h = new v1(n1.f47281e, l1.f47272a);
    }

    public v1(j0 j0Var, Comparator comparator) {
        super(comparator);
        this.f47337g = j0Var;
    }

    public final v1 A(int i10, int i11) {
        j0 j0Var = this.f47337g;
        if (i10 == 0 && i11 == j0Var.size()) {
            return this;
        }
        Comparator comparator = this.f47343d;
        return i10 < i11 ? new v1(j0Var.subList(i10, i11), comparator) : x0.y(comparator);
    }

    public final int B(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f47337g, obj, this.f47343d);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int C(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f47337g, obj, this.f47343d);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iC = C(obj, true);
        j0 j0Var = this.f47337g;
        if (iC == j0Var.size()) {
            return null;
        }
        return j0Var.get(iC);
    }

    @Override // oa.c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f47337g, obj, this.f47343d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof k1) {
            collection = ((t1) ((k1) collection)).t();
        }
        Comparator comparator = this.f47343d;
        if (!q.l(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        e2 it = iterator();
        Iterator it2 = collection.iterator();
        f0 f0Var = (f0) it;
        if (!f0Var.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = f0Var.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!f0Var.hasNext()) {
                        return false;
                    }
                    next2 = f0Var.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f47337g.E().listIterator(0);
    }

    @Override // oa.u0, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f47337g.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f47343d;
        if (!q.l(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            e2 it2 = iterator();
            do {
                f0 f0Var = (f0) it2;
                if (!f0Var.hasNext()) {
                    return true;
                }
                next = f0Var.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f47337g.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iB = B(obj, true) - 1;
        if (iB == -1) {
            return null;
        }
        return this.f47337g.get(iB);
    }

    @Override // oa.u0, oa.c0
    public final j0 h() {
        return this.f47337g;
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iC = C(obj, false);
        j0 j0Var = this.f47337g;
        if (iC == j0Var.size()) {
            return null;
        }
        return j0Var.get(iC);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        j0 j0Var = this.f47337g;
        return j0Var.get(j0Var.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iB = B(obj, false) - 1;
        if (iB == -1) {
            return null;
        }
        return this.f47337g.get(iB);
    }

    @Override // oa.c0
    public final int m(int i10, Object[] objArr) {
        return this.f47337g.m(i10, objArr);
    }

    @Override // oa.c0
    public final Object[] n() {
        return this.f47337g.n();
    }

    @Override // oa.c0
    public final int p() {
        return this.f47337g.p();
    }

    @Override // oa.c0
    public final int q() {
        return this.f47337g.q();
    }

    @Override // oa.c0
    public final boolean r() {
        return this.f47337g.r();
    }

    @Override // oa.c0
    /* JADX INFO: renamed from: s */
    public final e2 iterator() {
        return this.f47337g.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47337g.size();
    }

    @Override // oa.x0, oa.u0, oa.c0
    public Object writeReplace() {
        return super.writeReplace();
    }
}

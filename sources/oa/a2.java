package oa;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a2 extends z1 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f47359a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f47359a.iterator();
        it.getClass();
        na.i iVar = this.f47360b;
        iVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (iVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new a2(((SortedSet) this.f47359a).headSet(obj), this.f47360b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f47359a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f47360b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new a2(((SortedSet) this.f47359a).subSet(obj, obj2), this.f47360b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new a2(((SortedSet) this.f47359a).tailSet(obj), this.f47360b);
    }
}

package x;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f53491a;

    public d(e eVar) {
        this.f53491a = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f53491a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f53491a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f53491a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f53491a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f53491a;
        int iA = eVar.a(obj);
        if (iA < 0) {
            return false;
        }
        eVar.h(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f53491a;
        int i10 = eVar.f53506c;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (collection.contains(eVar.j(i11))) {
                eVar.h(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f53491a;
        int i10 = eVar.f53506c;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (!collection.contains(eVar.j(i11))) {
                eVar.h(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f53491a.f53506c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f53491a;
        int i10 = eVar.f53506c;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = eVar.j(i11);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f53491a;
        int i10 = eVar.f53506c;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = eVar.j(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}

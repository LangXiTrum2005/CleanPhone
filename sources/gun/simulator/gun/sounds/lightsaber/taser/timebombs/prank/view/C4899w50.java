package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.w50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4899w50 extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f5167a;
    public final InterfaceC4753uV b;

    public C4899w50(Set set, InterfaceC4753uV interfaceC4753uV) {
        this.f5167a = set;
        this.b = interfaceC4753uV;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean add(Object obj) {
        if (this.b.apply(obj)) {
            return this.f5167a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.b.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f5167a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        Collection collection = this.f5167a;
        boolean z = collection instanceof RandomAccess;
        InterfaceC4753uV interfaceC4753uV = this.b;
        if (!z || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            interfaceC4753uV.getClass();
            while (it.hasNext()) {
                if (interfaceC4753uV.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        interfaceC4753uV.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!interfaceC4753uV.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        FW.a0(list, interfaceC4753uV, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        FW.a0(list, interfaceC4753uV, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        Collection collection = this.f5167a;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.b.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
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
        return AbstractC2995aW.x(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        Iterator it = this.f5167a.iterator();
        InterfaceC4753uV interfaceC4753uV = this.b;
        if (interfaceC4753uV == null) {
            throw new NullPointerException("predicate");
        }
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            if (interfaceC4753uV.apply(it.next())) {
                if (i == -1) {
                    break;
                }
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Iterator iterator() {
        Iterator it = this.f5167a.iterator();
        it.getClass();
        InterfaceC4753uV interfaceC4753uV = this.b;
        interfaceC4753uV.getClass();
        return new C3857kE(it, interfaceC4753uV);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean remove(Object obj) {
        return contains(obj) && this.f5167a.remove(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC2995aW.R(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f5167a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f5167a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final int size() {
        Iterator it = this.f5167a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.b.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray() {
        return AbstractC2995aW.c0(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray(Object[] objArr) {
        return AbstractC2995aW.c0(iterator()).toArray(objArr);
    }
}

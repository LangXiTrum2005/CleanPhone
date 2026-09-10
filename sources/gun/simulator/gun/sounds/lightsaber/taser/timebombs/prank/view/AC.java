package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AC extends AbstractC4822vC implements List, RandomAccess {
    public static final C5086yC b = new C5086yC(0, C3965lY.e);

    public static C3965lY h(int i, Object[] objArr) {
        return i == 0 ? C3965lY.e : new C3965lY(objArr, i);
    }

    public static C4998xC i() {
        return new C4998xC();
    }

    public static AC j(Collection collection) {
        if (!(collection instanceof AbstractC4822vC)) {
            Object[] array = collection.toArray();
            AbstractC2340Cl.n(array);
            return h(array.length, array);
        }
        AC acA = ((AbstractC4822vC) collection).a();
        if (!acA.f()) {
            return acA;
        }
        Object[] array2 = acA.toArray(AbstractC4822vC.f5124a);
        return h(array2.length, array2);
    }

    public static C3965lY k(Object[] objArr) {
        if (objArr.length == 0) {
            return C3965lY.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC2340Cl.n(objArr2);
        return h(objArr2.length, objArr2);
    }

    public static C3965lY n() {
        return C3965lY.e;
    }

    public static C3965lY o(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        AbstractC2340Cl.n(objArr);
        return h(5, objArr);
    }

    public static C3965lY p(Object obj) {
        Object[] objArr = {obj};
        AbstractC2340Cl.n(objArr);
        return h(1, objArr);
    }

    public static C3965lY q(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC2340Cl.n(objArr);
        return h(2, objArr);
    }

    public static C3965lY r(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        AbstractC2340Cl.n(objArr);
        return h(3, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (FW.B(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && FW.B(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    /* JADX INFO: renamed from: g */
    public final Yf0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C5086yC listIterator(int i) {
        FW.q(i, size());
        return isEmpty() ? b : new C5086yC(i, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public AC subList(int i, int i2) {
        FW.r(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? C3965lY.e : new C5174zC(this, i, i3);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final AC a() {
        return this;
    }
}

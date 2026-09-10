package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes4.dex */
public final class WE extends AbstractC4122nF implements List {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3915a;

    public WE(List list) {
        AbstractC2995aW.q(list, "content");
        this.f3915a = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC4122nF)) {
            return false;
        }
        AbstractC4122nF abstractC4122nF = (AbstractC4122nF) obj;
        AbstractC2995aW.q(abstractC4122nF, "element");
        return this.f3915a.contains(abstractC4122nF);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC2995aW.q(collection, "elements");
        return this.f3915a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC2995aW.i(this.f3915a, obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (AbstractC4122nF) this.f3915a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f3915a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC4122nF)) {
            return -1;
        }
        AbstractC4122nF abstractC4122nF = (AbstractC4122nF) obj;
        AbstractC2995aW.q(abstractC4122nF, "element");
        return this.f3915a.indexOf(abstractC4122nF);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3915a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f3915a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC4122nF)) {
            return -1;
        }
        AbstractC4122nF abstractC4122nF = (AbstractC4122nF) obj;
        AbstractC2995aW.q(abstractC4122nF, "element");
        return this.f3915a.lastIndexOf(abstractC4122nF);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f3915a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3915a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.f3915a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return BF.r(this);
    }

    public final String toString() {
        return AbstractC2853Wf.l0(this.f3915a, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f3915a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC2995aW.q(objArr, "array");
        return BF.s(this, objArr);
    }
}

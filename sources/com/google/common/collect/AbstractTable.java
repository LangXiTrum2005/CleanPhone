package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractTable<R, C, V> implements Table<R, C, V> {
    public transient Set X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient Collection f19794Y;

    /* JADX INFO: renamed from: com.google.common.collect.AbstractTable$1, reason: invalid class name */
    class AnonymousClass1 extends TransformedIterator<Table.Cell<Object, Object, Object>, Object> {
        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return ((Table.Cell) obj).getValue();
        }
    }

    public class CellSet extends AbstractSet<Table.Cell<R, C, V>> {
        public CellSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AbstractTable.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Map map = (Map) Maps.i(AbstractTable.this.g(), cell.d());
            if (map != null) {
                return Collections2.c(new ImmutableEntry(cell.g(), cell.getValue()), map.entrySet());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return AbstractTable.this.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            boolean zRemove;
            if (obj instanceof Table.Cell) {
                Table.Cell cell = (Table.Cell) obj;
                Map map = (Map) Maps.i(AbstractTable.this.g(), cell.d());
                if (map != null) {
                    Set setEntrySet = map.entrySet();
                    ImmutableEntry immutableEntry = new ImmutableEntry(cell.g(), cell.getValue());
                    setEntrySet.getClass();
                    try {
                        zRemove = setEntrySet.remove(immutableEntry);
                    } catch (ClassCastException | NullPointerException unused) {
                        zRemove = false;
                    }
                    if (zRemove) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return AbstractTable.this.size();
        }
    }

    public class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            AbstractTable.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return AbstractTable.this.i(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return AbstractTable.this.m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return AbstractTable.this.size();
        }
    }

    public abstract Iterator d();

    @Override // com.google.common.collect.Table
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Table) {
            return o().equals(((Table) obj).o());
        }
        return false;
    }

    public void h() {
        Iterators.b(o().iterator());
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
        return o().hashCode();
    }

    public boolean i(Object obj) {
        Iterator<V> it = g().values().iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public Set j() {
        return new CellSet();
    }

    public Collection k() {
        return new Values();
    }

    public Collection l() {
        Collection collection = this.f19794Y;
        if (collection != null) {
            return collection;
        }
        Collection collectionK = k();
        this.f19794Y = collectionK;
        return collectionK;
    }

    public Iterator m() {
        return new AnonymousClass1(o().iterator());
    }

    @Override // com.google.common.collect.Table
    public Set o() {
        Set set = this.X;
        if (set != null) {
            return set;
        }
        Set setJ = j();
        this.X = setJ;
        return setJ;
    }

    public String toString() {
        return g().toString();
    }
}

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: com.google.common.collect.TreeBasedTable$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractIterator<Object> {
        public Object Z;

        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            throw null;
        }
    }

    public static class Factory<C, V> implements Supplier<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Supplier
        public final Object get() {
            return new TreeMap((Comparator) null);
        }
    }

    public class TreeRow extends StandardTable<R, C, V>.Row implements SortedMap<C, V> {
        public final Object e0;
        public final Object f0;
        public transient SortedMap g0;

        public TreeRow(Object obj, Object obj2, Object obj3) {
            super(obj);
            this.e0 = obj2;
            this.f0 = obj3;
            if (obj2 == null || obj3 == null) {
                return;
            }
            comparator();
            throw null;
        }

        @Override // com.google.common.collect.StandardTable.Row
        public final Map b() {
            f();
            SortedMap sortedMapTailMap = this.g0;
            if (sortedMapTailMap == null) {
                return null;
            }
            Object obj = this.e0;
            if (obj != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(obj);
            }
            Object obj2 = this.f0;
            return obj2 != null ? sortedMapTailMap.headMap(obj2) : sortedMapTailMap;
        }

        @Override // com.google.common.collect.StandardTable.Row
        public final void c() {
            f();
            SortedMap sortedMap = this.g0;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            TreeBasedTable.this.getClass();
            throw null;
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            TreeBasedTable.this.getClass();
            return null;
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return e(obj) && super.containsKey(obj);
        }

        public final boolean e(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this.e0 != null) {
                comparator();
                throw null;
            }
            if (this.f0 == null) {
                return true;
            }
            comparator();
            throw null;
        }

        public final void f() {
            SortedMap sortedMap = this.g0;
            TreeBasedTable treeBasedTable = TreeBasedTable.this;
            if (sortedMap == null) {
                treeBasedTable.getClass();
                throw null;
            }
            if (sortedMap.isEmpty()) {
                treeBasedTable.getClass();
                throw null;
            }
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            d();
            Map map = this.f19965Y;
            if (map != null) {
                return ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            obj.getClass();
            Preconditions.f(e(obj));
            return new TreeRow(this.X, this.e0, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Set keySet() {
            return new Maps.SortedKeySet(this);
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            d();
            Map map = this.f19965Y;
            if (map != null) {
                return ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            obj.getClass();
            Preconditions.f(e(obj));
            return super.put(obj, obj2);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            boolean z2;
            obj.getClass();
            if (e(obj)) {
                obj2.getClass();
                if (e(obj2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            Preconditions.f(z2);
            return new TreeRow(this.X, obj, obj2);
        }

        @Override // java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            obj.getClass();
            Preconditions.f(e(obj));
            return new TreeRow(this.X, obj, this.f0);
        }
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.Table
    public final Map g() {
        return super.g();
    }

    @Override // com.google.common.collect.StandardTable
    public final Map p(Object obj) {
        return new StandardTable.Column(obj);
    }

    @Override // com.google.common.collect.StandardTable
    public final Iterator u() {
        throw null;
    }

    @Override // com.google.common.collect.StandardTable
    public final Map z(Object obj) {
        return new TreeRow(obj, null, null);
    }
}

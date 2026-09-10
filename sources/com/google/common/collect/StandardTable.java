package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class StandardTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public transient Set Z;
    public transient Map e0;

    public class CellIterator implements Iterator<Table.Cell<R, C, V>> {
        public final Iterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Map.Entry f19958Y;
        public Iterator Z;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X.hasNext() || this.Z.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.Z.hasNext()) {
                Map.Entry entry = (Map.Entry) this.X.next();
                this.f19958Y = entry;
                this.Z = ((Map) entry.getValue()).entrySet().iterator();
            }
            Objects.requireNonNull(this.f19958Y);
            Map.Entry entry2 = (Map.Entry) this.Z.next();
            return new Tables.ImmutableCell(this.f19958Y.getKey(), entry2.getKey(), entry2.getValue());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.Z.remove();
            Map.Entry entry = this.f19958Y;
            Objects.requireNonNull(entry);
            if (((Map) entry.getValue()).isEmpty()) {
                this.X.remove();
                this.f19958Y = null;
            }
        }
    }

    public class Column extends Maps.ViewCachingAbstractMap<R, V> {
        public final Object e0;

        public class EntrySet extends Sets.ImprovedAbstractSet<Map.Entry<R, V>> {
            public EntrySet() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                Column.this.d(Predicates.b());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Column column = Column.this;
                    StandardTable standardTable = StandardTable.this;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null && value.equals(standardTable.w(key, column.e0))) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                Column column = Column.this;
                return !StandardTable.this.s(column.e0);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return Column.this.new EntrySetIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Column column = Column.this;
                    StandardTable standardTable = StandardTable.this;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        Object obj2 = column.e0;
                        if (value.equals(standardTable.w(key, obj2))) {
                            standardTable.y(key, obj2);
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                return Column.this.d(Predicates.h(Predicates.f(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                StandardTable standardTable = StandardTable.this;
                throw null;
            }
        }

        public class EntrySetIterator extends AbstractIterator<Map.Entry<R, V>> {
            public final Iterator Z;

            public EntrySetIterator() {
                StandardTable standardTable = StandardTable.this;
                throw null;
            }

            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                final Map.Entry entry;
                do {
                    Iterator it = this.Z;
                    if (!it.hasNext()) {
                        this.X = AbstractIterator.State.Z;
                        return null;
                    }
                    entry = (Map.Entry) it.next();
                } while (!((Map) entry.getValue()).containsKey(Column.this.e0));
                return new AbstractMapEntry<Object, Object>() { // from class: com.google.common.collect.StandardTable.Column.EntrySetIterator.1EntryImpl
                    @Override // java.util.Map.Entry
                    public final Object getKey() {
                        return entry.getKey();
                    }

                    @Override // java.util.Map.Entry
                    public final Object getValue() {
                        return ((Map) entry.getValue()).get(Column.this.e0);
                    }

                    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                    public final Object setValue(Object obj) {
                        Map map = (Map) entry.getValue();
                        Object obj2 = Column.this.e0;
                        obj.getClass();
                        return map.put(obj2, obj);
                    }
                };
            }
        }

        public class KeySet extends Maps.KeySet<R, V> {
            public KeySet() {
                super(Column.this);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Column column = Column.this;
                return StandardTable.this.r(obj, column.e0);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Column column = Column.this;
                return StandardTable.this.y(obj, column.e0) != null;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                return Column.this.d(Predicates.d(Predicates.h(Predicates.f(collection)), Maps.EntryFunction.X));
            }
        }

        public class Values extends Maps.Values<R, V> {
            public Values() {
                super(Column.this);
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean remove(Object obj) {
                if (obj != null) {
                    return Column.this.d(Predicates.d(Predicates.e(obj), Maps.EntryFunction.f19914Y));
                }
                return false;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean removeAll(Collection collection) {
                return Column.this.d(Predicates.d(Predicates.f(collection), Maps.EntryFunction.f19914Y));
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean retainAll(Collection collection) {
                return Column.this.d(Predicates.d(Predicates.h(Predicates.f(collection)), Maps.EntryFunction.f19914Y));
            }
        }

        public Column(Object obj) {
            obj.getClass();
            this.e0 = obj;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return new KeySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new Values();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return StandardTable.this.r(obj, this.e0);
        }

        public final boolean d(Predicate predicate) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            return StandardTable.this.w(obj, this.e0);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            return StandardTable.this.x(obj, this.e0, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            return StandardTable.this.y(obj, this.e0);
        }
    }

    public class ColumnKeyIterator extends AbstractIterator<C> {
        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            throw null;
        }
    }

    public class ColumnKeySet extends StandardTable<R, C, V>.TableSet<C> {
        public ColumnKeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return StandardTable.this.s(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return StandardTable.this.u();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (obj == null) {
                return false;
            }
            StandardTable.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            StandardTable.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            StandardTable.this.getClass();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return Iterators.l(StandardTable.this.u());
        }
    }

    public class ColumnMap extends Maps.ViewCachingAbstractMap<C, Map<R, V>> {

        public final class ColumnMapEntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<C, Map<R, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.StandardTable$ColumnMap$ColumnMapEntrySet$1, reason: invalid class name */
            class AnonymousClass1 implements Function<Object, Map<Object, Object>> {
                public AnonymousClass1() {
                }

                @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
                public final Object apply(Object obj) {
                    ColumnMap.this.getClass();
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ColumnMapEntrySet() {
                super();
                ColumnMap.this.getClass();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                ColumnMap.this.getClass();
                ((Map.Entry) obj).getKey();
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                ColumnMap.this.getClass();
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                ColumnMap.this.getClass();
                StandardTable.n(null, ((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection collection) {
                collection.getClass();
                return Sets.i(this, collection.iterator());
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                collection.getClass();
                ColumnMap.this.getClass();
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                ColumnMap.this.getClass();
                throw null;
            }
        }

        public class ColumnMapValues extends Maps.Values<C, Map<R, V>> {
            public ColumnMapValues() {
                super(ColumnMap.this);
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean remove(Object obj) {
                for (Map.Entry entry : ColumnMap.this.entrySet()) {
                    if (((Map) entry.getValue()).equals(obj)) {
                        StandardTable.n(null, entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean removeAll(Collection collection) {
                collection.getClass();
                ColumnMap.this.getClass();
                throw null;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean retainAll(Collection collection) {
                collection.getClass();
                ColumnMap.this.getClass();
                throw null;
            }
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new ColumnMapEntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new ColumnMapValues();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            throw null;
        }
    }

    public class Row extends Maps.IteratorBasedAbstractMap<C, V> {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Map f19965Y;

        public Row(Object obj) {
            obj.getClass();
            this.X = obj;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            d();
            Map map = this.f19965Y;
            if (map == null) {
                return Iterators.EmptyModifiableIterator.X;
            }
            final Iterator it = map.entrySet().iterator();
            return new Iterator<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.StandardTable.Row.1
                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final Map.Entry<Object, Object> next() {
                    final Map.Entry entry = (Map.Entry) it.next();
                    Row.this.getClass();
                    return new ForwardingMapEntry<Object, Object>() { // from class: com.google.common.collect.StandardTable.Row.2
                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public final boolean equals(Object obj) {
                            if (!(obj instanceof Map.Entry)) {
                                return false;
                            }
                            Map.Entry entry2 = (Map.Entry) obj;
                            return com.google.common.base.Objects.a(getKey(), entry2.getKey()) && com.google.common.base.Objects.a(getValue(), entry2.getValue());
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public final Object setValue(Object obj) {
                            obj.getClass();
                            return super.setValue(obj);
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                        public final Object w() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry
                        /* JADX INFO: renamed from: x */
                        public final Map.Entry w() {
                            return entry;
                        }
                    };
                }

                @Override // java.util.Iterator
                public final void remove() {
                    it.remove();
                    Row.this.c();
                }
            };
        }

        public Map b() {
            StandardTable.this.getClass();
            throw null;
        }

        public void c() {
            d();
            Map map = this.f19965Y;
            if (map == null || !map.isEmpty()) {
                return;
            }
            StandardTable.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            d();
            Map map = this.f19965Y;
            if (map != null) {
                map.clear();
            }
            c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map map;
            d();
            return (obj == null || (map = this.f19965Y) == null || !Maps.h(map, obj)) ? false : true;
        }

        public final void d() {
            Map map = this.f19965Y;
            if (map == null) {
                this.f19965Y = b();
            } else if (map.isEmpty()) {
                StandardTable.this.getClass();
                throw null;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Map map;
            d();
            if (obj == null || (map = this.f19965Y) == null) {
                return null;
            }
            return Maps.i(map, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            obj.getClass();
            obj2.getClass();
            Map map = this.f19965Y;
            return (map == null || map.isEmpty()) ? StandardTable.this.x(this.X, obj, obj2) : this.f19965Y.put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            d();
            Map map = this.f19965Y;
            Object objRemove = null;
            if (map == null) {
                return null;
            }
            try {
                objRemove = map.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
            }
            c();
            return objRemove;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            d();
            Map map = this.f19965Y;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    public class RowMap extends Maps.ViewCachingAbstractMap<R, Map<C, V>> {

        public final class EntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<R, Map<C, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.StandardTable$RowMap$EntrySet$1, reason: invalid class name */
            class AnonymousClass1 implements Function<Object, Map<Object, Object>> {
                public AnonymousClass1() {
                }

                @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
                public final Object apply(Object obj) {
                    return StandardTable.this.z(obj);
                }
            }

            public EntrySet() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map)) {
                    return false;
                }
                StandardTable.this.getClass();
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                StandardTable.this.getClass();
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map)) {
                    return false;
                }
                StandardTable.this.getClass();
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                StandardTable.this.getClass();
                throw null;
            }
        }

        public RowMap() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return StandardTable.this.t(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            StandardTable standardTable = StandardTable.this;
            if (!standardTable.t(obj)) {
                return null;
            }
            Objects.requireNonNull(obj);
            return standardTable.z(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            if (obj == null) {
                return null;
            }
            StandardTable.this.getClass();
            throw null;
        }
    }

    public abstract class TableSet<T> extends Sets.ImprovedAbstractSet<T> {
        public TableSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            StandardTable.this.getClass();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            StandardTable.this.getClass();
            throw null;
        }
    }

    public static LinkedHashMap n(StandardTable standardTable, Object obj) {
        standardTable.getClass();
        new LinkedHashMap();
        throw null;
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator d() {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public Map g() {
        Map map = this.e0;
        if (map != null) {
            return map;
        }
        Map mapV = v();
        this.e0 = mapV;
        return mapV;
    }

    @Override // com.google.common.collect.AbstractTable
    public void h() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractTable
    public boolean i(Object obj) {
        return obj != null && super.i(obj);
    }

    public Map p(Object obj) {
        return new Column(obj);
    }

    public Set q() {
        Set set = this.Z;
        if (set != null) {
            return set;
        }
        ColumnKeySet columnKeySet = new ColumnKeySet();
        this.Z = columnKeySet;
        return columnKeySet;
    }

    public boolean r(Object obj, Object obj2) {
        Map map;
        return (obj == null || obj2 == null || (map = (Map) Maps.i(g(), obj)) == null || !Maps.h(map, obj2)) ? false : true;
    }

    public boolean s(Object obj) {
        if (obj == null) {
            return false;
        }
        throw null;
    }

    @Override // com.google.common.collect.Table
    public int size() {
        throw null;
    }

    public boolean t(Object obj) {
        return obj != null && Maps.h(null, obj);
    }

    public Iterator u() {
        throw null;
    }

    public Map v() {
        return new RowMap();
    }

    public Object w(Object obj, Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.i(g(), obj)) == null) {
            return null;
        }
        return Maps.i(map, obj2);
    }

    public Object x(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
        throw null;
    }

    public Object y(Object obj, Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.i(null, obj)) == null) {
            return null;
        }
        Object objRemove = map.remove(obj2);
        if (map.isEmpty()) {
            throw null;
        }
        return objRemove;
    }

    public Map z(Object obj) {
        return new Row(obj);
    }
}

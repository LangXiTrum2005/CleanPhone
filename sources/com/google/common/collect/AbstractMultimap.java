package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractMultimap<K, V> implements Multimap<K, V> {
    public transient Collection X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient Set f19792Y;
    public transient Multiset Z;
    public transient Collection e0;
    public transient Map f0;

    public class Entries extends Multimaps.Entries<K, V> {
        public Entries() {
        }

        @Override // com.google.common.collect.Multimaps.Entries
        public final Multimap a() {
            return AbstractMultimap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return AbstractMultimap.this.n();
        }
    }

    public class EntrySet extends AbstractMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return Sets.e(this);
        }
    }

    public class Values extends AbstractCollection<V> {
        public final /* synthetic */ AbstractMapBasedMultimap X;

        public Values(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            this.X = abstractMapBasedMultimap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.X.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return this.X.y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.X.size();
        }
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
        Iterator<V> it = u().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.Multimap
    public Collection d() {
        Collection collection = this.X;
        if (collection != null) {
            return collection;
        }
        Collection collectionJ = j();
        this.X = collectionJ;
        return collectionJ;
    }

    @Override // com.google.common.collect.Multimap
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Multimap) {
            return u().equals(((Multimap) obj).u());
        }
        return false;
    }

    public abstract Map g();

    @Override // com.google.common.collect.Multimap
    public Multiset h() {
        Multiset multiset = this.Z;
        if (multiset != null) {
            return multiset;
        }
        Multiset multisetL = l();
        this.Z = multisetL;
        return multisetL;
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return u().hashCode();
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract Collection j();

    public abstract Set k();

    @Override // com.google.common.collect.Multimap
    public Set keySet() {
        Set set = this.f19792Y;
        if (set != null) {
            return set;
        }
        Set setK = k();
        this.f19792Y = setK;
        return setK;
    }

    public abstract Multiset l();

    public abstract Collection m();

    public abstract Iterator n();

    @Override // com.google.common.collect.Multimap
    public boolean put(Object obj, Object obj2) {
        return get(obj).add(obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) u().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return u().toString();
    }

    @Override // com.google.common.collect.Multimap
    public Map u() {
        Map map = this.f0;
        if (map != null) {
            return map;
        }
        Map mapG = g();
        this.f0 = mapG;
        return mapG;
    }

    @Override // com.google.common.collect.Multimap
    public boolean v(Object obj, Object obj2) {
        Collection collection = (Collection) u().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.google.common.collect.Multimap
    public Collection values() {
        Collection collection = this.e0;
        if (collection != null) {
            return collection;
        }
        Collection collectionM = m();
        this.e0 = collectionM;
        return collectionM;
    }
}

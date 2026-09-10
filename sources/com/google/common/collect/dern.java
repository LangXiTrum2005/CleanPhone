package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractMultimap.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dern<K, V> implements claque<K, V> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    @CheckForNull
    public transient Set<K> f21896arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    @CheckForNull
    public transient Collection<Map.Entry<K, V>> f21897kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    @CheckForNull
    public transient Map<K, Collection<V>> f21898molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    @CheckForNull
    public transient hardpan<K> f21899monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    @CheckForNull
    public transient Collection<V> f21900polloi;

    /* JADX INFO: compiled from: AbstractMultimap.java */
    public class attabal extends Multimaps.attabal<K, V> {
        public attabal() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return dern.this.entryIterator();
        }

        @Override // com.google.common.collect.Multimaps.attabal
        public claque<K, V> saneness() {
            return dern.this;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractMultimap.java */
    public class C0313dern extends AbstractCollection<V> {
        public C0313dern() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            dern.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            return dern.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return dern.this.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return dern.this.size();
        }
    }

    /* JADX INFO: compiled from: AbstractMultimap.java */
    public class saneness extends dern<K, V>.attabal implements Set<Map.Entry<K, V>> {
        public saneness(dern dernVar) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return Sets.attabal(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.wireman(this);
        }
    }

    @Override // com.google.common.collect.claque
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f21898molybdenite;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapCreateAsMap = createAsMap();
        this.f21898molybdenite = mapCreateAsMap;
        return mapCreateAsMap;
    }

    @Override // com.google.common.collect.claque
    public boolean containsEntry(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection<V> collection2 = asMap().get(obj);
        return collection2 != null && collection2.contains(obj2);
    }

    public boolean containsValue(@CheckForNull Object obj) {
        Iterator<Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> createAsMap();

    public abstract Collection<Map.Entry<K, V>> createEntries();

    public abstract Set<K> createKeySet();

    public abstract hardpan<K> createKeys();

    public abstract Collection<V> createValues();

    @Override // com.google.common.collect.claque
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection2 = this.f21897kowloon;
        if (collection2 != null) {
            return collection2;
        }
        Collection<Map.Entry<K, V>> collectionCreateEntries = createEntries();
        this.f21897kowloon = collectionCreateEntries;
        return collectionCreateEntries;
    }

    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    public boolean equals(@CheckForNull Object obj) {
        return Multimaps.attabal(this, obj);
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // com.google.common.collect.claque
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.claque
    public Set<K> keySet() {
        Set<K> set = this.f21896arytenoidectomy;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.f21896arytenoidectomy = setCreateKeySet;
        return setCreateKeySet;
    }

    public hardpan<K> keys() {
        hardpan<K> hardpanVar = this.f21899monoploid;
        if (hardpanVar != null) {
            return hardpanVar;
        }
        hardpan<K> hardpanVarCreateKeys = createKeys();
        this.f21899monoploid = hardpanVarCreateKeys;
        return hardpanVarCreateKeys;
    }

    @Override // com.google.common.collect.claque
    public boolean put(K k, V v) {
        return get(k).add(v);
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        com.google.common.base.formularize.triweekly(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection2 = (Collection) iterable;
            return !collection2.isEmpty() && get(k).addAll(collection2);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && Iterators.attabal(get(k), it);
    }

    @Override // com.google.common.collect.claque
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection<V> collection2 = asMap().get(obj);
        return collection2 != null && collection2.remove(obj2);
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        com.google.common.base.formularize.triweekly(iterable);
        Collection<V> collectionRemoveAll = removeAll(k);
        putAll(k, iterable);
        return collectionRemoveAll;
    }

    public String toString() {
        return asMap().toString();
    }

    public Iterator<V> valueIterator() {
        return Maps.monoploid(entries().iterator());
    }

    @Override // com.google.common.collect.claque
    public Collection<V> values() {
        Collection<V> collection2 = this.f21900polloi;
        if (collection2 != null) {
            return collection2;
        }
        Collection<V> collectionCreateValues = createValues();
        this.f21900polloi = collectionCreateValues;
        return collectionCreateValues;
    }

    @Override // com.google.common.collect.claque
    public boolean putAll(claque<? extends K, ? extends V> claqueVar) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : claqueVar.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }
}

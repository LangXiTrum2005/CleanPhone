package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    public transient AbstractMap X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient AbstractBiMap f19776Y;
    public transient Set Z;
    public transient Set e0;
    public transient Set f0;

    public class BiMapEntry extends ForwardingMapEntry<K, V> {
        public final Map.Entry X;

        public BiMapEntry(Map.Entry entry) {
            this.X = entry;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            AbstractBiMap abstractBiMap = AbstractBiMap.this;
            abstractBiMap.A(obj);
            Preconditions.o("entry no longer in map", abstractBiMap.entrySet().contains(this));
            if (Objects.a(obj, getValue())) {
                return obj;
            }
            Preconditions.g(!abstractBiMap.containsValue(obj), "value already present: %s", obj);
            Object value = this.X.setValue(obj);
            Preconditions.o("entry no longer in map", Objects.a(obj, abstractBiMap.get(getKey())));
            Object key = getKey();
            abstractBiMap.f19776Y.X.remove(value);
            abstractBiMap.f19776Y.X.put(obj, key);
            return value;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: w */
        public final Object x() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingMapEntry
        /* JADX INFO: renamed from: x */
        public final Map.Entry w() {
            return this.X;
        }
    }

    public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
        public final Set X;

        public EntrySet() {
            this.X = AbstractBiMap.this.X.entrySet();
        }

        @Override // com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: A */
        public final Set x() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            return this.X.contains(new Maps.AnonymousClass7(entry));
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            return Collections2.a(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            final AbstractBiMap abstractBiMap = AbstractBiMap.this;
            final Iterator<Map.Entry<K, V>> it = abstractBiMap.X.entrySet().iterator();
            return new Iterator<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.AbstractBiMap.1
                public Map.Entry X;

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final Map.Entry<Object, Object> next() {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.X = entry;
                    return new BiMapEntry(entry);
                }

                @Override // java.util.Iterator
                public final void remove() {
                    Map.Entry entry = this.X;
                    if (entry == null) {
                        throw new IllegalStateException("no calls to next() since the last call to remove()");
                    }
                    Object value = entry.getValue();
                    it.remove();
                    AbstractBiMap.this.f19776Y.X.remove(value);
                    this.X = null;
                }
            };
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Set set = this.X;
            if (!set.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            AbstractBiMap.this.f19776Y.X.remove(entry.getValue());
            set.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            return Sets.h(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            Iterator it = iterator();
            collection.getClass();
            boolean z2 = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return ObjectArrays.c(this, objArr);
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: w */
        public final Object x() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final Collection x() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return y();
        }
    }

    public static class Inverse<K, V> extends AbstractBiMap<K, V> {
        private static final long serialVersionUID = 0;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            java.util.Objects.requireNonNull(object);
            this.f19776Y = (AbstractBiMap) object;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f19776Y);
        }

        @Override // com.google.common.collect.AbstractBiMap
        public final Object A(Object obj) {
            return this.f19776Y.z(obj);
        }

        public Object readResolve() {
            return this.f19776Y.H();
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
        public final /* bridge */ /* synthetic */ Collection values() {
            return values();
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: w */
        public final Object x() {
            return this.X;
        }

        @Override // com.google.common.collect.AbstractBiMap
        public final Object z(Object obj) {
            return this.f19776Y.A(obj);
        }
    }

    public class KeySet extends ForwardingSet<K> {
        public KeySet() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* JADX INFO: renamed from: A */
        public final Set x() {
            return AbstractBiMap.this.X.keySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Maps.AnonymousClass1(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractBiMap abstractBiMap = AbstractBiMap.this;
            abstractBiMap.f19776Y.X.remove(abstractBiMap.X.remove(obj));
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            return Sets.h(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            Iterator it = iterator();
            collection.getClass();
            boolean z2 = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }
    }

    public class ValueSet extends ForwardingSet<V> {
        public final Set X;

        public ValueSet() {
            this.X = AbstractBiMap.this.f19776Y.keySet();
        }

        @Override // com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: A */
        public final Set x() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Maps.AnonymousClass2(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return ObjectArrays.c(this, objArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public final String toString() {
            return z();
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: w */
        public final Object x() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final Collection x() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return y();
        }
    }

    public Object A(Object obj) {
        return obj;
    }

    public final void B(EnumMap enumMap, AbstractMap abstractMap) {
        Preconditions.p(this.X == null);
        Preconditions.p(this.f19776Y == null);
        Preconditions.f(enumMap.isEmpty());
        Preconditions.f(abstractMap.isEmpty());
        Preconditions.f(enumMap != abstractMap);
        this.X = enumMap;
        Inverse inverse = new Inverse();
        inverse.X = abstractMap;
        inverse.f19776Y = this;
        this.f19776Y = inverse;
    }

    @Override // com.google.common.collect.BiMap
    public BiMap H() {
        return this.f19776Y;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
        this.X.clear();
        this.f19776Y.X.clear();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(Object obj) {
        return this.f19776Y.containsKey(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set entrySet() {
        Set set = this.f0;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.f0 = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set keySet() {
        Set set = this.Z;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.Z = keySet;
        return keySet;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        z(obj);
        A(obj2);
        boolean zContainsKey = containsKey(obj);
        if (zContainsKey && Objects.a(obj2, get(obj))) {
            return obj2;
        }
        Preconditions.g(!containsValue(obj2), "value already present: %s", obj2);
        Object objPut = this.X.put(obj, obj2);
        if (zContainsKey) {
            this.f19776Y.X.remove(objPut);
        }
        this.f19776Y.X.put(obj2, obj);
        return objPut;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Object remove(Object obj) {
        if (!containsKey(obj)) {
            return null;
        }
        Object objRemove = this.X.remove(obj);
        this.f19776Y.X.remove(objRemove);
        return objRemove;
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: w */
    public Object x() {
        return this.X;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* JADX INFO: renamed from: x */
    public final Map w() {
        return this.X;
    }

    public Object z(Object obj) {
        return obj;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set values() {
        Set set = this.e0;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.e0 = valueSet;
        return valueSet;
    }
}

package kotlin.collections;

import androidx.room.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractMap<K, V> implements Map<K, V>, KMappedMarker {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/collections/AbstractMap$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: kotlin.collections.AbstractMap$values$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/collections/AbstractMap$values$1", "Lkotlin/collections/AbstractCollection;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AnonymousClass1 extends AbstractCollection<Object> {
        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public final int getZ() {
            throw null;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    public abstract Set a();

    public final Map.Entry c(Object obj) {
        Object next;
        Iterator it = a().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.a(((Map.Entry) next).getKey(), obj)) {
                return (Map.Entry) next;
            }
        }
        next = null;
        return (Map.Entry) next;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Set setA = a();
        if (setA != null && setA.isEmpty()) {
            return false;
        }
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            if (Intrinsics.a(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if (setEntrySet != null && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                V v = get(key);
                if (Intrinsics.a(value, v) && (v != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Map.Entry entryC = c(obj);
        if (entryC != null) {
            return entryC.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return null;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return a().size();
    }

    public final String toString() {
        return CollectionsKt.D(a(), ", ", "{", "}", new b(this, 13), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return null;
    }
}

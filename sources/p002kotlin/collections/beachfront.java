package p002kotlin.collections;

import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import unready.attabal;

/* JADX INFO: compiled from: AbstractMap.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u000e\b'\u0018\u0000 4*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u00015B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\u0010\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\tJ\u001a\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\u001a2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\"\u0010#R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lkotlin/collections/beachfront;", "K", "V", "", "<init>", "()V", X3.i.W, "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "", "entry", "wireman", "(Ljava/util/Map$Entry;)Z", "", C3414a2.d, "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "impassible", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "o", "cutely", "(Ljava/lang/Object;)Ljava/lang/String;", "taiyuan", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "", "kowloon", "Ljava/util/Set;", "_keys", "", "arytenoidectomy", "Ljava/util/Collection;", "_values", "competently", "size", "beachfront", "()Ljava/util/Set;", "keys", "impromptu", "()Ljava/util/Collection;", "values", "monoploid", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class beachfront<K, V> implements Map<K, V>, attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public volatile Collection<? extends V> _values;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public volatile Set<? extends K> _keys;

    /* JADX INFO: compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"kotlin/collections/beachfront$dern", "Lkotlin/collections/saneness;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class dern extends p002kotlin.collections.saneness<V> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ beachfront<K, V> f29305kowloon;

        /* JADX INFO: compiled from: AbstractMap.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlin/collections/beachfront$dern$attabal", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class attabal implements Iterator<V>, unready.attabal {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f29306kowloon;

            /* JADX WARN: Multi-variable type inference failed */
            public attabal(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f29306kowloon = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f29306kowloon.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f29306kowloon.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public dern(beachfront<K, ? extends V> beachfrontVar) {
            this.f29305kowloon = beachfrontVar;
        }

        @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
        public boolean contains(Object element) {
            return this.f29305kowloon.containsValue(element);
        }

        @Override // p002kotlin.collections.saneness
        /* JADX INFO: renamed from: getSize */
        public int get_size() {
            return this.f29305kowloon.size();
        }

        @Override // p002kotlin.collections.saneness, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<V> iterator() {
            return new attabal(this.f29305kowloon.entrySet().iterator());
        }
    }

    /* JADX INFO: compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"kotlin/collections/beachfront$saneness", "Lkotlin/collections/apical;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness extends apical<K> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ beachfront<K, V> f29307arytenoidectomy;

        /* JADX INFO: compiled from: AbstractMap.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlin/collections/beachfront$saneness$attabal", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class attabal implements Iterator<K>, unready.attabal {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f29308kowloon;

            /* JADX WARN: Multi-variable type inference failed */
            public attabal(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f29308kowloon = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f29308kowloon.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f29308kowloon.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public saneness(beachfront<K, ? extends V> beachfrontVar) {
            this.f29307arytenoidectomy = beachfrontVar;
        }

        @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
        public boolean contains(Object element) {
            return this.f29307arytenoidectomy.containsKey(element);
        }

        @Override // p002kotlin.collections.saneness
        /* JADX INFO: renamed from: getSize */
        public int get_size() {
            return this.f29307arytenoidectomy.size();
        }

        @Override // p002kotlin.collections.apical, p002kotlin.collections.saneness, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<K> iterator() {
            return new attabal(this.f29307arytenoidectomy.entrySet().iterator());
        }
    }

    public static final CharSequence triweekly(beachfront beachfrontVar, Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return beachfrontVar.impassible(it);
    }

    public Set<K> beachfront() {
        if (this._keys == null) {
            this._keys = new saneness(this);
        }
        Set<? extends K> set = this._keys;
        Intrinsics.beachfront(set);
        return set;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: competently */
    public int getSize() {
        return entrySet().size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return taiyuan(key) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (Intrinsics.wireman(((Map.Entry) it.next()).getValue(), value)) {
                return true;
            }
        }
        return false;
    }

    public final String cutely(Object o) {
        return o == this ? "(this Map)" : String.valueOf(o);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return marial();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Map)) {
            return false;
        }
        Map map = (Map) other;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!wireman((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object key) {
        Map.Entry<K, V> entryTaiyuan = taiyuan(key);
        if (entryTaiyuan != null) {
            return entryTaiyuan.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    public final String impassible(Map.Entry<? extends K, ? extends V> entry) {
        return cutely(entry.getKey()) + '=' + cutely(entry.getValue());
    }

    public Collection<V> impromptu() {
        if (this._values == null) {
            this._values = new dern(this);
        }
        Collection<? extends V> collection2 = this._values;
        Intrinsics.beachfront(collection2);
        return collection2;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return beachfront();
    }

    public abstract Set<Map.Entry<K, V>> marial();

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public final Map.Entry<K, V> taiyuan(K key) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.wireman(((Map.Entry) next).getKey(), key)) {
                return (Map.Entry) next;
            }
        }
        next = null;
        return (Map.Entry) next;
    }

    public String toString() {
        return CollectionsKt___CollectionsKt.preterite(entrySet(), ", ", "{", "}", 0, null, new Function1() { // from class: kotlin.collections.marial
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return beachfront.triweekly(this.f29345kowloon, (Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return impromptu();
    }

    public final boolean wireman(Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Intrinsics.competently(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v = get(key);
        if (!Intrinsics.wireman(value, v)) {
            return false;
        }
        if (v != null) {
            return true;
        }
        Intrinsics.competently(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }
}

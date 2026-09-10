package androidx.collection;

import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import androidx.collection.internal.RuntimeHelpersKt;
import com.p004ironsource.dc;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ1\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00012\b\u0010\u0014\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u000bJ\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001dJ\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001dJ\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001dJ\u0019\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010)R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010)R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010)R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010)¨\u00060"}, d2 = {"Landroidx/collection/LruCache;", "", "K", "V", "", "maxSize", "", "resize", "(I)V", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "trimToSize", "remove", "", "evicted", "oldValue", "newValue", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "create", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "evictAll", "()V", "size", "()I", "hitCount", "missCount", "createCount", "putCount", "evictionCount", "", "snapshot", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "I", "Landroidx/collection/internal/LruHashMap;", "map", "Landroidx/collection/internal/LruHashMap;", "Landroidx/collection/internal/Lock;", "lock", "Landroidx/collection/internal/Lock;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final Lock lock;
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i2) {
        this.maxSize = i2;
        if (i2 <= 0) {
            RuntimeHelpersKt.a("maxSize <= 0");
            throw null;
        }
        this.map = new LruHashMap<>();
        this.lock = new Lock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        String message = "Negative size: " + obj + dc.T + obj2;
        Intrinsics.f(message, "message");
        throw new IllegalStateException(message);
    }

    public V create(K key) {
        Intrinsics.f(key, "key");
        return null;
    }

    public final int createCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.createCount;
        }
        return i2;
    }

    public void entryRemoved(boolean evicted, K key, V oldValue, V newValue) {
        Intrinsics.f(key, "key");
        Intrinsics.f(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.evictionCount;
        }
        return i2;
    }

    public final V get(K key) {
        V v;
        Intrinsics.f(key, "key");
        synchronized (this.lock) {
            LruHashMap<K, V> lruHashMap = this.map;
            lruHashMap.getClass();
            V v2 = (V) lruHashMap.f3778a.get(key);
            if (v2 != null) {
                this.hitCount++;
                return v2;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v = (V) this.map.f3778a.put(key, vCreate);
                    if (v != null) {
                        this.map.f3778a.put(key, v);
                    } else {
                        this.size += a(key, vCreate);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v != null) {
                entryRemoved(false, key, vCreate, v);
                return v;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.hitCount;
        }
        return i2;
    }

    public final int maxSize() {
        int i2;
        synchronized (this.lock) {
            i2 = this.maxSize;
        }
        return i2;
    }

    public final int missCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.missCount;
        }
        return i2;
    }

    public final V put(K key, V value) {
        V v;
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(key, value);
            v = (V) this.map.f3778a.put(key, value);
            if (v != null) {
                this.size -= a(key, v);
            }
        }
        if (v != null) {
            entryRemoved(false, key, v, value);
        }
        trimToSize(this.maxSize);
        return v;
    }

    public final int putCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.putCount;
        }
        return i2;
    }

    public final V remove(K key) {
        V v;
        Intrinsics.f(key, "key");
        synchronized (this.lock) {
            LruHashMap<K, V> lruHashMap = this.map;
            lruHashMap.getClass();
            v = (V) lruHashMap.f3778a.remove(key);
            if (v != null) {
                this.size -= a(key, v);
            }
        }
        if (v != null) {
            entryRemoved(false, key, v, null);
        }
        return v;
    }

    public void resize(int maxSize) {
        if (!(maxSize > 0)) {
            RuntimeHelpersKt.a("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = maxSize;
        }
        trimToSize(maxSize);
    }

    public final int size() {
        int i2;
        synchronized (this.lock) {
            i2 = this.size;
        }
        return i2;
    }

    public int sizeOf(K key, V value) {
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set<Map.Entry<K, V>> setEntrySet = this.map.f3778a.entrySet();
            Intrinsics.e(setEntrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry<K, V>> setEntrySet2 = this.map.f3778a.entrySet();
            Intrinsics.e(setEntrySet2, "<get-entries>(...)");
            Iterator<T> it = setEntrySet2.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i2 = this.hitCount;
                int i3 = this.missCount + i2;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void trimToSize(int maxSize) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (!(this.size >= 0 && (!this.map.f3778a.isEmpty() || this.size == 0))) {
                        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.size > maxSize && !this.map.f3778a.isEmpty()) {
                        Set<Map.Entry<K, V>> setEntrySet = this.map.f3778a.entrySet();
                        Intrinsics.e(setEntrySet, "<get-entries>(...)");
                        Map.Entry entry = (Map.Entry) CollectionsKt.x(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        LruHashMap<K, V> lruHashMap = this.map;
                        lruHashMap.getClass();
                        Intrinsics.f(key, "key");
                        lruHashMap.f3778a.remove(key);
                        this.size -= a(key, value);
                        this.evictionCount++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}

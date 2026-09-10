package androidx.arch.core.internal;

import androidx.lifecycle.LifecycleObserver;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    public final HashMap f0 = new HashMap();

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final SafeIterableMap.Entry a(Object obj) {
        return (SafeIterableMap.Entry) this.f0.get(obj);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final Object c(Object obj, Object obj2) {
        SafeIterableMap.Entry entryA = a(obj);
        if (entryA != null) {
            return entryA.f3681Y;
        }
        HashMap map = this.f0;
        SafeIterableMap.Entry entry = new SafeIterableMap.Entry(obj, obj2);
        this.e0++;
        SafeIterableMap.Entry entry2 = this.f3680Y;
        if (entry2 == null) {
            this.X = entry;
            this.f3680Y = entry;
        } else {
            entry2.Z = entry;
            entry.e0 = entry2;
            this.f3680Y = entry;
        }
        map.put(obj, entry);
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final Object d(Object obj) {
        Object objD = super.d(obj);
        this.f0.remove(obj);
        return objD;
    }

    public final Map.Entry e(LifecycleObserver lifecycleObserver) {
        HashMap map = this.f0;
        if (map.containsKey(lifecycleObserver)) {
            return ((SafeIterableMap.Entry) map.get(lifecycleObserver)).e0;
        }
        return null;
    }
}

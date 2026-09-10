package com.bytedance.sdk.component.ri;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class bu<K, V> {
    private final Map<K, V> ri = new HashMap();
    private final Map<V, Set<K>> lr = new HashMap();

    public void lr(K k) {
        Set<K> set;
        V vRemove = this.ri.remove(k);
        if (vRemove == null || (set = this.lr.get(vRemove)) == null) {
            return;
        }
        set.remove(k);
        if (set.isEmpty()) {
            this.lr.remove(vRemove);
        }
    }

    public void ri(Set<K> set, V v) {
        for (K k : set) {
            if (this.ri.containsKey(k)) {
                lr(k);
            }
        }
        Set<K> hashSet = this.lr.get(v);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.lr.put(v, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.ri.put(it.next(), v);
        }
    }

    public V ri(K k) {
        return this.ri.get(k);
    }

    public void ri() {
        this.ri.clear();
        this.lr.clear();
    }
}

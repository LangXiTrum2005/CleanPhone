package com.bytedance.sdk.component.qdl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class yt<K, V> {
    private final Map<K, V> qdl = new HashMap();
    private final Map<V, Set<K>> ud = new HashMap();

    public void qdl(Set<K> set, V v) {
        for (K k : set) {
            if (this.qdl.containsKey(k)) {
                ud(k);
            }
        }
        Set<K> hashSet = this.ud.get(v);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.ud.put(v, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.qdl.put(it.next(), v);
        }
    }

    public void ud(K k) {
        Set<K> set;
        V vRemove = this.qdl.remove(k);
        if (vRemove == null || (set = this.ud.get(vRemove)) == null) {
            return;
        }
        set.remove(k);
        if (set.isEmpty()) {
            this.ud.remove(vRemove);
        }
    }

    public V qdl(K k) {
        return this.qdl.get(k);
    }

    public void qdl() {
        this.qdl.clear();
        this.ud.clear();
    }
}

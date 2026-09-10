package com.bytedance.sdk.component.fi.lr.ik.ri;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ik<K, V> {
    private int lr;
    private final LinkedHashMap<K, SoftReference<V>> ri = new LinkedHashMap<>(0, 0.75f, true);

    public ik(int i) {
        this.lr = i;
    }

    public synchronized V ri(K k) {
        V v = null;
        if (k == null) {
            return null;
        }
        if (this.lr <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.ri.get(k);
        if (softReference != null) {
            v = softReference.get();
            if (v != null) {
                return v;
            }
            this.ri.remove(k);
        }
        return v;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.lr), Integer.valueOf(this.ri.size()));
    }

    public synchronized void ri(K k, V v) {
        if (this.lr <= 0) {
            return;
        }
        if (k == null || v == null) {
            return;
        }
        this.ri.put(k, new SoftReference<>(v));
        int size = this.ri.size();
        int i = this.lr;
        if (size > i) {
            ri((int) (((double) i) * 0.7d));
        }
    }

    public synchronized void ri(int i) {
        int size = this.ri.size() - i;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.ri.entrySet().iterator();
            for (int i2 = 0; i2 < size; i2++) {
                it.next();
                it.remove();
            }
        }
        if (i == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.ri.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }
}

package com.bytedance.sdk.component.mzz.mml.lnr.qdl;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class lnr<K, V> {
    private final LinkedHashMap<K, SoftReference<V>> qdl = new LinkedHashMap<>(0, 0.75f, true);
    private int ud;

    public lnr(int i2) {
        this.ud = i2;
    }

    public synchronized V qdl(K k) {
        V v = null;
        if (k == null) {
            return null;
        }
        if (this.ud <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.qdl.get(k);
        if (softReference != null) {
            v = softReference.get();
            if (v != null) {
                return v;
            }
            this.qdl.remove(k);
        }
        return v;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.ud), Integer.valueOf(this.qdl.size()));
    }

    public synchronized void qdl(K k, V v) {
        if (this.ud <= 0) {
            return;
        }
        if (k == null || v == null) {
            return;
        }
        this.qdl.put(k, new SoftReference<>(v));
        int size = this.qdl.size();
        int i2 = this.ud;
        if (size > i2) {
            qdl((int) (((double) i2) * 0.7d));
        }
    }

    public synchronized void qdl(int i2) {
        int size = this.qdl.size() - i2;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.qdl.entrySet().iterator();
            for (int i3 = 0; i3 < size; i3++) {
                it.next();
                it.remove();
            }
        }
        if (i2 == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.qdl.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }
}

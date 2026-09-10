package com.smartdigimkt.g2;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class a<K, V> extends HashMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReferenceQueue<V> f35398a = new ReferenceQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<K, a<K, V>.C0490a<K, V>> f35399b = new HashMap<>();

    /* JADX INFO: renamed from: com.smartdigimkt.g2.a$a, reason: collision with other inner class name */
    public class C0490a<K, V> extends SoftReference<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        K f35400a;

        public C0490a(K k, V v, ReferenceQueue referenceQueue) {
            super(v, referenceQueue);
            this.f35400a = k;
        }
    }

    private void b() {
        while (true) {
            C0490a c0490a = (C0490a) this.f35398a.poll();
            if (c0490a == null) {
                return;
            } else {
                this.f35399b.remove(c0490a.f35400a);
            }
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        b();
        return this.f35399b.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        b();
        a<K, V>.C0490a<K, V> c0490a = this.f35399b.get(obj);
        if (c0490a == null) {
            return null;
        }
        return c0490a.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        b();
        a<K, V>.C0490a<K, V> c0490aPut = this.f35399b.put(k, new C0490a<>(k, v, this.f35398a));
        if (c0490aPut == null) {
            return null;
        }
        return c0490aPut.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        b();
        a<K, V>.C0490a<K, V> c0490aRemove = this.f35399b.remove(obj);
        if (c0490aRemove == null) {
            return null;
        }
        return c0490aRemove.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public int size() {
        b();
        return this.f35399b.size();
    }
}

package com.smartdigimkt.c0;

import java.lang.ref.Reference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a<K, V> implements e<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f34014b = "cache";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, Reference<V>> f34015a = androidx.datastore.preferences.protobuf.a.r();

    public abstract Reference<V> a(V v);

    @Override // com.smartdigimkt.c0.e
    public Collection<K> a() {
        HashSet hashSet;
        synchronized (this.f34015a) {
            hashSet = new HashSet(this.f34015a.keySet());
        }
        return hashSet;
    }

    @Override // com.smartdigimkt.c0.e
    public void clear() {
        this.f34015a.clear();
    }

    @Override // com.smartdigimkt.c0.e
    public V get(K k) {
        Reference<V> reference = this.f34015a.get(k);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // com.smartdigimkt.c0.e
    public boolean put(K k, V v) {
        this.f34015a.put(k, a(v));
        return true;
    }

    @Override // com.smartdigimkt.c0.e
    public void remove(K k) {
        this.f34015a.remove(k);
    }
}

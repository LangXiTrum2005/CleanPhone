package com.bumptech.glide.util;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes.dex */
public final class CachedHashCodeArrayMap<K, V> extends ArrayMap<K, V> {
    public int h0;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final void clear() {
        this.h0 = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap
    public final void g(SimpleArrayMap simpleArrayMap) {
        this.h0 = 0;
        super.g(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final Object h(int i2) {
        this.h0 = 0;
        return super.h(i2);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final int hashCode() {
        if (this.h0 == 0) {
            this.h0 = super.hashCode();
        }
        return this.h0;
    }

    @Override // androidx.collection.SimpleArrayMap
    public final Object i(int i2, Object obj) {
        this.h0 = 0;
        return super.i(i2, obj);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.h0 = 0;
        return super.put(obj, obj2);
    }
}

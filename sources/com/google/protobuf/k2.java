package com.google.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k2 implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map.Entry f24886a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f24886a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        LazyField lazyField = (LazyField) this.f24886a.getValue();
        if (lazyField == null) {
            return null;
        }
        return lazyField.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof MessageLite) {
            return ((LazyField) this.f24886a.getValue()).setValue((MessageLite) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

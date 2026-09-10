package com.google.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h2 implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map.Entry f24851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Internal.MapAdapter f24852b;

    public h2(Internal.MapAdapter mapAdapter, Map.Entry entry) {
        this.f24852b = mapAdapter;
        this.f24851a = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Map.Entry) && this.f24851a.getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f24851a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f24852b.valueConverter.doForward(this.f24851a.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f24851a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Internal.MapAdapter mapAdapter = this.f24852b;
        Object value = this.f24851a.setValue(mapAdapter.valueConverter.doBackward(obj));
        if (value == null) {
            return null;
        }
        return mapAdapter.valueConverter.doForward(value);
    }
}

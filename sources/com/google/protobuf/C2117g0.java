package com.google.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2117g0 implements Map.Entry {
    private final Map.Entry<Object, Object> realEntry;
    final /* synthetic */ Internal.MapAdapter this$0;

    public C2117g0(Internal.MapAdapter mapAdapter, Map.Entry<Object, Object> entry) {
        this.this$0 = mapAdapter;
        this.realEntry = entry;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.realEntry.getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.this$0.valueConverter.doForward(this.realEntry.getValue());
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.realEntry.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = this.realEntry.setValue(this.this$0.valueConverter.doBackward(obj));
        if (value == null) {
            return null;
        }
        return this.this$0.valueConverter.doForward(value);
    }
}

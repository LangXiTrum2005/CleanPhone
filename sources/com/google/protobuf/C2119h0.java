package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2119h0 implements Iterator {
    private final Iterator<Map.Entry<Object, Object>> realIterator;
    final /* synthetic */ Internal.MapAdapter this$0;

    public C2119h0(Internal.MapAdapter mapAdapter, Iterator<Map.Entry<Object, Object>> it) {
        this.this$0 = mapAdapter;
        this.realIterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.realIterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.realIterator.remove();
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        return new C2117g0(this.this$0, this.realIterator.next());
    }
}

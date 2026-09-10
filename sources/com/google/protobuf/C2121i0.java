package com.google.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.protobuf.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2121i0 extends AbstractSet {
    private final Set<Map.Entry<Object, Object>> realSet;
    final /* synthetic */ Internal.MapAdapter this$0;

    public C2121i0(Internal.MapAdapter mapAdapter, Set<Map.Entry<Object, Object>> set) {
        this.this$0 = mapAdapter;
        this.realSet = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new C2119h0(this.this$0, this.realSet.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.realSet.size();
    }
}

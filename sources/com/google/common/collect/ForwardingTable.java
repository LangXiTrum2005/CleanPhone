package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingTable<R, C, V> extends ForwardingObject implements Table<R, C, V> {
    @Override // com.google.common.collect.Table
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        throw null;
    }

    @Override // com.google.common.collect.Table
    public Map g() {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public final int hashCode() {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public Set o() {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        throw null;
    }

    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: w */
    public /* bridge */ /* synthetic */ Object x() {
        return null;
    }
}

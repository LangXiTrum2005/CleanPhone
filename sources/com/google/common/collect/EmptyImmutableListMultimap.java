package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {
    public static final EmptyImmutableListMultimap i0 = new EmptyImmutableListMultimap(RegularImmutableMap.h0, 0);
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return i0;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: o */
    public final ImmutableMap u() {
        return this.g0;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Map u() {
        return this.g0;
    }
}

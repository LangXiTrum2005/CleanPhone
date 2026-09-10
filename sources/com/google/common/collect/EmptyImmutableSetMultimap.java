package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class EmptyImmutableSetMultimap extends ImmutableSetMultimap<Object, Object> {
    public static final EmptyImmutableSetMultimap k0 = new EmptyImmutableSetMultimap();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return k0;
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

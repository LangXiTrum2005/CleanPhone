package com.google.common.collect;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSetMultimap<K, V> extends ForwardingMultimap<K, V> implements SetMultimap<K, V> {
    @Override // com.google.common.collect.ForwardingMultimap
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract SetMultimap x();

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Set a(Object obj) {
        return x().a(obj);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public final Set d() {
        return x().d();
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Set get(Object obj) {
        return x().get(obj);
    }
}

package com.google.common.collect;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingListMultimap<K, V> extends ForwardingMultimap<K, V> implements ListMultimap<K, V> {
    @Override // com.google.common.collect.ForwardingMultimap
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract ListMultimap x();

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List a(Object obj) {
        return x().a(obj);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List get(Object obj) {
        return x().get(obj);
    }
}

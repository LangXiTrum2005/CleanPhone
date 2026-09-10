package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements SetMultimap<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract Set o();

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Set s() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection x(Collection collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection z(Object obj, Collection collection) {
        return new AbstractMapBasedMultimap.WrappedSet(obj, (Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Set a(Object obj) {
        return (Set) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set d() {
        return (Set) super.d();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Set get(Object obj) {
        return (Set) super.get(obj);
    }
}

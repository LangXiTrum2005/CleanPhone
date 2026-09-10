package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements ListMultimap<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract List o();

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection s() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection x(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection z(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new AbstractMapBasedMultimap.RandomAccessWrappedList(obj, list, null) : new AbstractMapBasedMultimap.WrappedList(obj, list, null);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public List a(Object obj) {
        return (List) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public List get(Object obj) {
        return (List) super.get(obj);
    }
}

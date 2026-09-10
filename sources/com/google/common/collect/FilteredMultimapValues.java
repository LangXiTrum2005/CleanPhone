package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class FilteredMultimapValues<K, V> extends AbstractCollection<V> {
    public final AbstractMultimap X;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredMultimapValues(FilteredMultimap filteredMultimap) {
        this.X = (AbstractMultimap) filteredMultimap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.X.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Maps.AnonymousClass2(this.X.d().iterator());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.AbstractMultimap, com.google.common.collect.FilteredMultimap] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        ?? r0 = this.X;
        Predicate predicateT = r0.t();
        Iterator it = r0.i().d().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (predicateT.apply(entry) && Objects.a(entry.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.AbstractMultimap, com.google.common.collect.FilteredMultimap] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        ?? r0 = this.X;
        return Iterables.f(r0.i().d(), Predicates.c(r0.t(), Predicates.d(Predicates.f(collection), Maps.EntryFunction.f19914Y)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.AbstractMultimap, com.google.common.collect.FilteredMultimap] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        ?? r0 = this.X;
        return Iterables.f(r0.i().d(), Predicates.c(r0.t(), Predicates.d(Predicates.h(Predicates.f(collection)), Maps.EntryFunction.f19914Y)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.X.size();
    }
}

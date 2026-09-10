package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableCollection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/builders/MapBuilderValues;", "V", "", "Lkotlin/collections/AbstractMutableCollection;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapBuilderValues<V> extends AbstractMutableCollection<V> implements Collection<V>, KMutableCollection {
    public final MapBuilder X;

    public MapBuilderValues(MapBuilder mapBuilder) {
        this.X = mapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableCollection
    public final int a() {
        return this.X.j0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.X.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        MapBuilder mapBuilder = this.X;
        mapBuilder.getClass();
        return new MapBuilder.ValuesItr(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        MapBuilder mapBuilder = this.X;
        mapBuilder.g();
        int iM = mapBuilder.m(obj);
        if (iM < 0) {
            return false;
        }
        mapBuilder.q(iM);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        this.X.g();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        this.X.g();
        return super.retainAll(elements);
    }
}

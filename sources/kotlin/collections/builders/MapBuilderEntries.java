package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/collections/builders/MapBuilderEntries;", "K", "V", "Lkotlin/collections/builders/AbstractMapBuilderEntrySet;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapBuilderEntries<K, V> extends AbstractMapBuilderEntrySet<Map.Entry<K, V>, K, V> {
    public final MapBuilder X;

    public MapBuilderEntries(MapBuilder mapBuilder) {
        this.X = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.f(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        return this.X.i(elements);
    }

    @Override // kotlin.collections.AbstractMutableSet
    public final int d() {
        return this.X.j0;
    }

    @Override // kotlin.collections.builders.AbstractMapBuilderEntrySet
    public final boolean e(Map.Entry element) {
        Intrinsics.f(element, "element");
        return this.X.j(element);
    }

    @Override // kotlin.collections.builders.AbstractMapBuilderEntrySet
    public final boolean f(Map.Entry element) {
        Intrinsics.f(element, "element");
        MapBuilder mapBuilder = this.X;
        mapBuilder.getClass();
        mapBuilder.g();
        int iL = mapBuilder.l(element.getKey());
        if (iL < 0) {
            return false;
        }
        Object[] objArr = mapBuilder.f43283Y;
        Intrinsics.c(objArr);
        if (!Intrinsics.a(objArr[iL], element.getValue())) {
            return false;
        }
        mapBuilder.q(iL);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        MapBuilder mapBuilder = this.X;
        mapBuilder.getClass();
        return new MapBuilder.EntriesItr(mapBuilder);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        this.X.g();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        this.X.g();
        return super.retainAll(elements);
    }
}

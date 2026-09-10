package oa;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class j extends e implements SortedSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f47264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(j1 j1Var, SortedMap sortedMap) {
        super(j1Var, sortedMap);
        this.f47264d = j1Var;
    }

    public SortedMap b() {
        return (SortedMap) this.f47243b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new j(this.f47264d, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new j(this.f47264d, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new j(this.f47264d, b().tailMap(obj));
    }
}

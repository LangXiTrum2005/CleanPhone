package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class g91 extends a91 implements SortedSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ua1 f14801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g91(ua1 ua1Var, SortedMap sortedMap) {
        super(ua1Var, sortedMap);
        Objects.requireNonNull(ua1Var);
        this.f14801d = ua1Var;
    }

    public SortedMap b() {
        return (SortedMap) this.f11941b;
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
        return new g91(this.f14801d, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new g91(this.f14801d, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new g91(this.f14801d, b().tailMap(obj));
    }
}

package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class f91 extends z81 implements SortedMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SortedSet f14346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ua1 f14347g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f91(ua1 ua1Var, SortedMap sortedMap) {
        super(ua1Var, sortedMap);
        Objects.requireNonNull(ua1Var);
        this.f14347g = ua1Var;
    }

    public SortedSet c() {
        return new g91(this.f14347g, e());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override // com.google.android.gms.internal.ads.z81, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f14346f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetC = c();
        this.f14346f = sortedSetC;
        return sortedSetC;
    }

    public SortedMap e() {
        return (SortedMap) this.f22562b;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return e().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new f91(this.f14347g, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new f91(this.f14347g, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new f91(this.f14347g, e().tailMap(obj));
    }
}

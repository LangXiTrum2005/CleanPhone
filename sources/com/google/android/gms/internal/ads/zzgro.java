package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
class zzgro extends zzgrj implements SortedSet {
    final /* synthetic */ zzgrt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgro(zzgrt zzgrtVar, SortedMap sortedMap) {
        super(zzgrtVar, sortedMap);
        Objects.requireNonNull(zzgrtVar);
        this.zzc = zzgrtVar;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return zza().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return zza().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzgro(this.zzc, zza().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return zza().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzgro(this.zzc, zza().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzgro(this.zzc, zza().tailMap(obj));
    }

    public SortedMap zza() {
        return (SortedMap) this.zzd;
    }
}

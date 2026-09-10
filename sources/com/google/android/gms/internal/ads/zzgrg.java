package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
class zzgrg extends zzguj {
    final transient Map zza;
    final /* synthetic */ zzgrt zzb;

    public zzgrg(zzgrt zzgrtVar, Map map) {
        Objects.requireNonNull(zzgrtVar);
        this.zzb = zzgrtVar;
        this.zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzgrt zzgrtVar = this.zzb;
        if (this.zza == zzgrtVar.zzo()) {
            zzgrtVar.zzf();
        } else {
            zzgtw.zzb(new zzgrf(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.zza;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzguk.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzb(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzguj, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.zzb.zzs();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        zzgrt zzgrtVar = this.zzb;
        Collection collectionZzc = zzgrtVar.zzc();
        collectionZzc.addAll(collection);
        zzgrtVar.zzq(zzgrtVar.zzp() - collection.size());
        collection.clear();
        return collectionZzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzguj
    public final Set zza() {
        return new zzgre(this);
    }

    public final Map.Entry zzb(Map.Entry entry) {
        Object key = entry.getKey();
        return new AbstractMap.SimpleImmutableEntry(key, this.zzb.zzb(key, (Collection) entry.getValue()));
    }
}

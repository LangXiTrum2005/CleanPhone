package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgsh extends AbstractSet {
    final /* synthetic */ zzgsk zza;

    public /* synthetic */ zzgsh(zzgsk zzgskVar, byte[] bArr) {
        Objects.requireNonNull(zzgskVar);
        this.zza = zzgskVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgsk zzgskVar = this.zza;
        Map mapZzc = zzgskVar.zzc();
        return mapZzc != null ? mapZzc.keySet().iterator() : new zzgsc(zzgskVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzgsk zzgskVar = this.zza;
        Map mapZzc = zzgskVar.zzc();
        if (mapZzc != null) {
            return mapZzc.keySet().remove(obj);
        }
        return zzgskVar.zzj(obj) != zzgsk.zzd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}

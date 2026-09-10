package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgsf extends AbstractSet {
    final /* synthetic */ zzgsk zza;

    public /* synthetic */ zzgsf(zzgsk zzgskVar, byte[] bArr) {
        Objects.requireNonNull(zzgskVar);
        this.zza = zzgskVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zzgsk zzgskVar = this.zza;
        Map mapZzc = zzgskVar.zzc();
        if (mapZzc != null) {
            return mapZzc.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzi = zzgskVar.zzi(entry.getKey());
            if (iZzi != -1 && Objects.equals(zzgskVar.zzp(iZzi), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgsk zzgskVar = this.zza;
        Map mapZzc = zzgskVar.zzc();
        return mapZzc != null ? mapZzc.entrySet().iterator() : new zzgsd(zzgskVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iZzh;
        int iZze;
        zzgsk zzgskVar = this.zza;
        Map mapZzc = zzgskVar.zzc();
        if (mapZzc != null) {
            return mapZzc.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzgskVar.zzb() || (iZze = zzgsl.zze(entry.getKey(), entry.getValue(), (iZzh = zzgskVar.zzh()), zzgskVar.zzk(), zzgskVar.zzl(), zzgskVar.zzm(), zzgskVar.zzn())) == -1) {
            return false;
        }
        zzgskVar.zze(iZze, iZzh);
        zzgskVar.zzu(zzgskVar.zzt() - 1);
        zzgskVar.zzd();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}

package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgre extends zzgug {
    final /* synthetic */ zzgrg zza;

    public zzgre(zzgrg zzgrgVar) {
        Objects.requireNonNull(zzgrgVar);
        this.zza = zzgrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgug, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzgsb.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzgrf(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgug, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzgrg zzgrgVar = this.zza;
        zzgrgVar.zzb.zzn(entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgug
    public final Map zza() {
        return this.zza;
    }
}

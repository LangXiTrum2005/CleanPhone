package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgsj extends AbstractCollection {
    final /* synthetic */ zzgsk zza;

    public /* synthetic */ zzgsj(zzgsk zzgskVar, byte[] bArr) {
        Objects.requireNonNull(zzgskVar);
        this.zza = zzgskVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzgsk zzgskVar = this.zza;
        Map mapZzc = zzgskVar.zzc();
        return mapZzc != null ? mapZzc.values().iterator() : new zzgse(zzgskVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}

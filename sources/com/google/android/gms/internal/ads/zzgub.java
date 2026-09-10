package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgub extends zzgvq {
    final /* synthetic */ zzguc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgub(zzguc zzgucVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgucVar);
        this.zza = zzgucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}

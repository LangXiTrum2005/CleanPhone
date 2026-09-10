package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgtz extends zzgvq {
    final /* synthetic */ zzgua zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgtz(zzgua zzguaVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzguaVar);
        this.zza = zzguaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}

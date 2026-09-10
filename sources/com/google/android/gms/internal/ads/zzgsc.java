package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgsc extends zzgsg {
    final /* synthetic */ zzgsk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgsc(zzgsk zzgskVar) {
        super(zzgskVar, null);
        Objects.requireNonNull(zzgskVar);
        this.zza = zzgskVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsg
    public final Object zza(int i2) {
        return this.zza.zzo(i2);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgsd extends zzgsg {
    final /* synthetic */ zzgsk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgsd(zzgsk zzgskVar) {
        super(zzgskVar, null);
        Objects.requireNonNull(zzgskVar);
        this.zza = zzgskVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsg
    public final /* bridge */ /* synthetic */ Object zza(int i2) {
        return new zzgsi(this.zza, i2);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgao implements zzijp {
    final /* synthetic */ zzgap zza;

    public zzgao(zzgap zzgapVar) {
        Objects.requireNonNull(zzgapVar);
        this.zza = zzgapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgap zzgapVar = this.zza;
        return new zzgas(zzgapVar.zzb(), zzgapVar.zzc(), null);
    }
}

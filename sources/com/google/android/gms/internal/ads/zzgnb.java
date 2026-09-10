package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgnb implements zzgyj {
    final /* synthetic */ zzgna zza;

    public zzgnb(zzgnc zzgncVar, zzgna zzgnaVar) {
        this.zza = zzgnaVar;
        Objects.requireNonNull(zzgncVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        zzgna zzgnaVar = this.zza;
        zzgnaVar.zzb(th);
        zzgnaVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}

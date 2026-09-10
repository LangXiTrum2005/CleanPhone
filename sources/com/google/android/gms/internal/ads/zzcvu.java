package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcvu implements zzgyj {
    final /* synthetic */ zzgyj zza;
    final /* synthetic */ zzcvz zzb;

    public zzcvu(zzcvz zzcvzVar, zzgyj zzgyjVar) {
        this.zza = zzgyjVar;
        Objects.requireNonNull(zzcvzVar);
        this.zzb = zzcvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        this.zzb.zzf();
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzf();
        this.zza.zzb((zzcvk) obj);
    }
}

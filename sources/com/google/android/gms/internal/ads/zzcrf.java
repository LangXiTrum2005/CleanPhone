package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcrf implements zzgyj {
    final /* synthetic */ zzcrm zza;

    public zzcrf(zzcrm zzcrmVar) {
        Objects.requireNonNull(zzcrmVar);
        this.zza = zzcrmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrm zzcrmVar = this.zza;
        zzcrmVar.zzu().zzb(zzcrmVar.zzt().zzb(zzcrmVar.zzr(), zzcrmVar.zzs(), false, "", (String) obj, zzcrmVar.zzs().zzc, null, null), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(zzcrmVar.zzq()) ? 2 : 1);
    }
}

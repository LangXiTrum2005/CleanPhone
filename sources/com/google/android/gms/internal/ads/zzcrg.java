package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcrg implements zzgyj {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcrm zzb;

    public zzcrg(zzcrm zzcrmVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzcrmVar);
        this.zzb = zzcrmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        zzcrm zzcrmVar = this.zzb;
        zzcrmVar.zzu().zza(zzcrmVar.zzt().zzb(zzcrmVar.zzr(), zzcrmVar.zzs(), false, this.zza, null, zzcrmVar.zzp(), zzcrmVar.zzw(), zzcrmVar.zzx()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        String str2 = (String) obj;
        zzcrm zzcrmVar = this.zzb;
        zzcrmVar.zzu().zza(zzcrmVar.zzt().zzb(zzcrmVar.zzr(), zzcrmVar.zzs(), false, str, str2, zzcrmVar.zzp(), zzcrmVar.zzw(), zzcrmVar.zzx()), zzcrmVar.zzv());
    }
}

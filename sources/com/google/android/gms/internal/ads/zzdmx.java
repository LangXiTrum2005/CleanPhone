package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdmx implements zzgyj {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdnh zzb;

    public zzdmx(zzdnh zzdnhVar, String str, boolean z2) {
        Objects.requireNonNull(zzdnhVar);
        this.zzb = zzdnhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgm)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdnh zzdnhVar = this.zzb;
        zzdnhVar.zzZ().zzo((zzcir) obj);
        String str = this.zza;
        zzcdt zzcdtVarZzY = zzdnhVar.zzZ().zzY();
        zzejb zzejbVarZzL = zzdnhVar.zzL(str, true);
        if (zzejbVarZzL != null && zzcdtVarZzY != null) {
            zzcdtVarZzY.zzc(zzejbVarZzL);
        } else if (zzcdtVarZzY != null) {
            zzcdtVarZzY.cancel(false);
        }
    }
}

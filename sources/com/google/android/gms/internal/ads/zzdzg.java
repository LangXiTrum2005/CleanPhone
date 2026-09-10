package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdzg extends zzbpp {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfne zzd;
    final /* synthetic */ zzcdt zze;
    final /* synthetic */ zzdzp zzf;

    public zzdzg(zzdzp zzdzpVar, Object obj, String str, long j, zzfne zzfneVar, zzcdt zzcdtVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfneVar;
        this.zze = zzcdtVar;
        Objects.requireNonNull(zzdzpVar);
        this.zzf = zzdzpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zze() {
        synchronized (this.zza) {
            zzdzp zzdzpVar = this.zzf;
            String str = this.zzb;
            zzdzpVar.zzm(str, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzdzpVar.zzr().zzb(str);
            zzdzpVar.zzs().zzb(str);
            zzfnr zzfnrVarZzt = zzdzpVar.zzt();
            zzfne zzfneVar = this.zzd;
            zzfneVar.zzd(true);
            zzfnrVarZzt.zzb(zzfneVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzf(String str) {
        synchronized (this.zza) {
            zzdzp zzdzpVar = this.zzf;
            String str2 = this.zzb;
            zzdzpVar.zzm(str2, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzdzpVar.zzr().zzc(str2, "error");
            zzdzpVar.zzs().zzc(str2, "error");
            zzfnr zzfnrVarZzt = zzdzpVar.zzt();
            zzfne zzfneVar = this.zzd;
            zzfneVar.zzk(str);
            zzfneVar.zzd(false);
            zzfnrVarZzt.zzb(zzfneVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzfha implements zzgyj {
    final /* synthetic */ zzere zza;
    final /* synthetic */ zzfno zzb;
    final /* synthetic */ zzfne zzc;
    final /* synthetic */ zzfhd zzd;
    final /* synthetic */ zzfhe zze;

    public zzfha(zzfhe zzfheVar, zzere zzereVar, zzfno zzfnoVar, zzfne zzfneVar, zzfhd zzfhdVar) {
        this.zza = zzereVar;
        this.zzb = zzfnoVar;
        this.zzc = zzfneVar;
        this.zzd = zzfhdVar;
        Objects.requireNonNull(zzfheVar);
        this.zze = zzfheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        zzfno zzfnoVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgF)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzfhe zzfheVar = this.zze;
        zzdtj zzdtjVar = (zzdtj) zzfheVar.zzh().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdtjVar == null ? zzfjm.zzb(th, null) : zzdtjVar.zza().zzg(th);
        synchronized (zzfheVar) {
            try {
                if (zzdtjVar != null) {
                    zzdtjVar.zze().zzdI(zzeVarZzb);
                    zzfheVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdI(zzeVarZzb);
                        }
                    });
                } else {
                    zzfheVar.zzg().zzdI(zzeVarZzb);
                    zzfheVar.zze(this.zzd).zzh().zza().zzd().zzo();
                }
                zzfjh.zza(zzeVarZzb.zza, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbid.zzc.zze()).booleanValue() || (zzfnoVar = this.zzb) == null) {
                    zzfnr zzfnrVarZzi = zzfheVar.zzi();
                    zzfne zzfneVar = this.zzc;
                    zzfneVar.zzh(zzeVarZzb);
                    zzfneVar.zzj(th);
                    zzfneVar.zzd(false);
                    zzfnrVarZzi.zzb(zzfneVar.zzm());
                } else {
                    zzfnoVar.zzf(zzeVarZzb);
                    zzfne zzfneVar2 = this.zzc;
                    zzfneVar2.zzj(th);
                    zzfneVar2.zzd(false);
                    zzfnoVar.zza(zzfneVar2);
                    zzfnoVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfno zzfnoVar;
        zzfhe zzfheVar = this.zze;
        zzdte zzdteVar = (zzdte) obj;
        synchronized (zzfheVar) {
            if (zzdteVar != null) {
                try {
                    zzdteVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzdteVar.zzq().zzd(zzfheVar.zzg());
            this.zza.zzb(zzdteVar);
            Executor executorZzf = zzfheVar.zzf();
            final zzfgv zzfgvVarZzg = zzfheVar.zzg();
            Objects.requireNonNull(zzfgvVarZzg);
            executorZzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfgvVarZzg.zzg();
                }
            });
            zzfheVar.zzg().onAdMetadataChanged();
            if (!((Boolean) zzbid.zzc.zze()).booleanValue() || (zzfnoVar = this.zzb) == null) {
                zzfnr zzfnrVarZzi = zzfheVar.zzi();
                zzfne zzfneVar = this.zzc;
                zzfneVar.zzg(zzdteVar.zzr().zzb);
                zzfneVar.zzi(zzdteVar.zzn().zze());
                zzfneVar.zzd(true);
                zzfnrVarZzi.zzb(zzfneVar.zzm());
            } else {
                zzfnoVar.zze(zzdteVar.zzr().zzb);
                zzfnoVar.zzg(zzdteVar.zzn().zze());
                zzfne zzfneVar2 = this.zzc;
                zzfneVar2.zzd(true);
                zzfnoVar.zza(zzfneVar2);
                zzfnoVar.zzh();
            }
        }
    }
}

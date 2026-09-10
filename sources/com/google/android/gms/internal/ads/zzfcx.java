package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfcx implements zzgyj {
    final /* synthetic */ zzere zza;
    final /* synthetic */ zzfno zzb;
    final /* synthetic */ zzfne zzc;
    final /* synthetic */ zzfcy zzd;
    final /* synthetic */ zzfdb zze;

    public zzfcx(zzfdb zzfdbVar, zzere zzereVar, zzfno zzfnoVar, zzfne zzfneVar, zzfcy zzfcyVar) {
        this.zza = zzereVar;
        this.zzb = zzfnoVar;
        this.zzc = zzfneVar;
        this.zzd = zzfcyVar;
        Objects.requireNonNull(zzfdbVar);
        this.zze = zzfdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        zzfno zzfnoVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgF)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzfdb zzfdbVar = this.zze;
        zzcsm zzcsmVar = (zzcsm) zzfdbVar.zzj().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcsmVar == null ? zzfjm.zzb(th, null) : zzcsmVar.zza().zzg(th);
        synchronized (zzfdbVar) {
            try {
                zzfdbVar.zzl(null);
                if (zzcsmVar != null) {
                    zzcsmVar.zze().zzdI(zzeVarZzb);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjs)).booleanValue()) {
                        zzfdbVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zze.zzi().zzdI(zzeVarZzb);
                            }
                        });
                    }
                } else {
                    zzfdbVar.zzi().zzdI(zzeVarZzb);
                    ((zzcsm) zzfdbVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
                }
                zzfjh.zza(zzeVarZzb.zza, th, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbid.zzc.zze()).booleanValue() || (zzfnoVar = this.zzb) == null) {
                    zzfnr zzfnrVarZzk = zzfdbVar.zzk();
                    zzfne zzfneVar = this.zzc;
                    zzfneVar.zzh(zzeVarZzb);
                    zzfneVar.zzj(th);
                    zzfneVar.zzd(false);
                    zzfnrVarZzk.zzb(zzfneVar.zzm());
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
        zzfdb zzfdbVar = this.zze;
        zzcvk zzcvkVar = (zzcvk) obj;
        synchronized (zzfdbVar) {
            if (zzcvkVar != null) {
                try {
                    zzcvkVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzfdbVar.zzl(null);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjs)).booleanValue()) {
                zzcvkVar.zzq().zzc(zzfdbVar.zzi());
            }
            this.zza.zzb(zzcvkVar);
            if (!((Boolean) zzbid.zzc.zze()).booleanValue() || (zzfnoVar = this.zzb) == null) {
                zzfnr zzfnrVarZzk = zzfdbVar.zzk();
                zzfne zzfneVar = this.zzc;
                zzfneVar.zzg(zzcvkVar.zzr().zzb);
                zzfneVar.zzi(zzcvkVar.zzn().zze());
                zzfneVar.zzd(true);
                zzfnrVarZzk.zzb(zzfneVar.zzm());
            } else {
                zzfnoVar.zze(zzcvkVar.zzr().zzb);
                zzfnoVar.zzg(zzcvkVar.zzn().zze());
                zzfne zzfneVar2 = this.zzc;
                zzfneVar2.zzd(true);
                zzfnoVar.zza(zzfneVar2);
                zzfnoVar.zzh();
            }
        }
    }
}

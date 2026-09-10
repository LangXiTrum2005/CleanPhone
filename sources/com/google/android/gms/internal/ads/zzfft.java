package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfft implements zzgyj {
    final /* synthetic */ zzere zza;
    final /* synthetic */ zzfno zzb;
    final /* synthetic */ zzfne zzc;
    final /* synthetic */ zzdkz zzd;
    final /* synthetic */ zzffv zze;

    public zzfft(zzffv zzffvVar, zzere zzereVar, zzfno zzfnoVar, zzfne zzfneVar, zzdkz zzdkzVar) {
        this.zza = zzereVar;
        this.zzb = zzfnoVar;
        this.zzc = zzfneVar;
        this.zzd = zzdkzVar;
        Objects.requireNonNull(zzffvVar);
        this.zze = zzffvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        zzfno zzfnoVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgF)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
        }
        zzdkz zzdkzVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzdkzVar.zzb().zzg(th);
        zzffv zzffvVar = this.zze;
        synchronized (zzffvVar) {
            try {
                zzffvVar.zzi(null);
                zzdkzVar.zza().zzdI(zzeVarZzg);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjt)).booleanValue()) {
                    zzffvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzf().zzdI(zzeVarZzg);
                        }
                    });
                    zzffvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffr
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdI(zzeVarZzg);
                        }
                    });
                }
                zzfjh.zza(zzeVarZzg.zza, th, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbid.zzc.zze()).booleanValue() || (zzfnoVar = this.zzb) == null) {
                    zzfnr zzfnrVarZzh = zzffvVar.zzh();
                    zzfne zzfneVar = this.zzc;
                    zzfneVar.zzh(zzeVarZzg);
                    zzfneVar.zzj(th);
                    zzfneVar.zzd(false);
                    zzfnrVarZzh.zzb(zzfneVar.zzm());
                } else {
                    zzfnoVar.zzf(zzeVarZzg);
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
        zzffv zzffvVar = this.zze;
        zzdjs zzdjsVar = (zzdjs) obj;
        synchronized (zzffvVar) {
            if (zzdjsVar != null) {
                try {
                    zzdjsVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzffvVar.zzi(null);
            zzbgb zzbgbVar = zzbgk.zzjt;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
                zzdea zzdeaVarZzq = zzdjsVar.zzq();
                zzdeaVarZzq.zza(zzffvVar.zzf());
                zzdeaVarZzq.zzd(zzffvVar.zzg());
            }
            this.zza.zzb(zzdjsVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
                zzffvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzg();
                    }
                });
                zzffvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzg().zzg();
                    }
                });
            }
            if (!((Boolean) zzbid.zzc.zze()).booleanValue() || (zzfnoVar = this.zzb) == null) {
                zzfnr zzfnrVarZzh = zzffvVar.zzh();
                zzfne zzfneVar = this.zzc;
                zzfneVar.zzg(zzdjsVar.zzr().zzb);
                zzfneVar.zzi(zzdjsVar.zzn().zze());
                zzfneVar.zzd(true);
                zzfnrVarZzh.zzb(zzfneVar.zzm());
            } else {
                zzfnoVar.zze(zzdjsVar.zzr().zzb);
                zzfnoVar.zzg(zzdjsVar.zzn().zze());
                zzfne zzfneVar2 = this.zzc;
                zzfneVar2.zzd(true);
                zzfnoVar.zza(zzfneVar2);
                zzfnoVar.zzh();
            }
        }
    }
}

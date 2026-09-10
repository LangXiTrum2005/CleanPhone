package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfeb implements zzgyj {
    final /* synthetic */ zzfno zza;
    final /* synthetic */ zzfne zzb;
    final /* synthetic */ zzcuh zzc;
    final /* synthetic */ zzfef zzd;

    public zzfeb(zzfef zzfefVar, zzfno zzfnoVar, zzfne zzfneVar, zzcuh zzcuhVar) {
        this.zza = zzfnoVar;
        this.zzb = zzfneVar;
        this.zzc = zzcuhVar;
        Objects.requireNonNull(zzfefVar);
        this.zzd = zzfefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        zzfno zzfnoVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgF)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
        }
        zzfef zzfefVar = this.zzd;
        synchronized (zzfefVar) {
            try {
                zzcuh zzcuhVar = this.zzc;
                com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzcuhVar.zzc().zzg(th);
                zzfefVar.zzs(zzeVarZzg);
                zzcuhVar.zzb().zzdI(zzeVarZzg);
                zzfjh.zza(zzeVarZzg.zza, th, "BannerAdLoader.onFailure");
                if (zzfefVar.zzr()) {
                    zzfefVar.zzn();
                    zzfefVar.zzo().zzd(zzfefVar.zzq().zzc());
                }
                if (!((Boolean) zzbid.zzc.zze()).booleanValue() || (zzfnoVar = this.zza) == null) {
                    zzfnr zzfnrVarZzp = zzfefVar.zzp();
                    zzfne zzfneVar = this.zzb;
                    zzfneVar.zzh(zzeVarZzg);
                    zzfneVar.zzj(th);
                    zzfneVar.zzd(false);
                    zzfnrVarZzp.zzb(zzfneVar.zzm());
                } else {
                    zzfnoVar.zzf(zzeVarZzg);
                    zzfne zzfneVar2 = this.zzb;
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
        zzfef zzfefVar = this.zzd;
        zzctc zzctcVar = (zzctc) obj;
        synchronized (zzfefVar) {
            if (zzctcVar != null) {
                try {
                    zzctcVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zzfefVar.zzr()) {
                zzfefVar.zzc();
            }
            if (!((Boolean) zzbid.zzc.zze()).booleanValue() || (zzfnoVar = this.zza) == null) {
                zzfnr zzfnrVarZzp = zzfefVar.zzp();
                zzfne zzfneVar = this.zzb;
                zzfneVar.zzg(zzctcVar.zzr().zzb);
                zzfneVar.zzi(zzctcVar.zzn().zze());
                zzfneVar.zzd(true);
                zzfnrVarZzp.zzb(zzfneVar.zzm());
            } else {
                zzfnoVar.zze(zzctcVar.zzr().zzb);
                zzfnoVar.zzg(zzctcVar.zzn().zze());
                zzfne zzfneVar2 = this.zzb;
                zzfneVar2.zzd(true);
                zzfnoVar.zza(zzfneVar2);
                zzfnoVar.zzh();
            }
        }
    }
}

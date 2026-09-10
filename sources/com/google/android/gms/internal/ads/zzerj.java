package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzerj implements zzgyj {
    final /* synthetic */ zzere zza;
    final /* synthetic */ zzfno zzb;
    final /* synthetic */ zzfne zzc;
    final /* synthetic */ zzdlv zzd;
    final /* synthetic */ zzerm zze;

    public zzerj(zzerm zzermVar, zzere zzereVar, zzfno zzfnoVar, zzfne zzfneVar, zzdlv zzdlvVar) {
        this.zza = zzereVar;
        this.zzb = zzfnoVar;
        this.zzc = zzfneVar;
        this.zzd = zzdlvVar;
        Objects.requireNonNull(zzermVar);
        this.zze = zzermVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        zzfno zzfnoVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgF)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
        }
        zzdlv zzdlvVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzdlvVar.zza().zzg(th);
        zzdlvVar.zzb().zzdI(zzeVarZzg);
        zzerm zzermVar = this.zze;
        zzermVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzerh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze.zzf().zze().zzdI(zzeVarZzg);
            }
        });
        zzfjh.zza(zzeVarZzg.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbid.zzc.zze()).booleanValue() || (zzfnoVar = this.zzb) == null) {
            zzfnr zzfnrVarZzg = zzermVar.zzg();
            zzfne zzfneVar = this.zzc;
            zzfneVar.zzh(zzeVarZzg);
            zzfneVar.zzj(th);
            zzfneVar.zzd(false);
            zzfnrVarZzg.zzb(zzfneVar.zzm());
            return;
        }
        zzfnoVar.zzf(zzeVarZzg);
        zzfne zzfneVar2 = this.zzc;
        zzfneVar2.zzj(th);
        zzfneVar2.zzd(false);
        zzfnoVar.zza(zzfneVar2);
        zzfnoVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfno zzfnoVar;
        zzerm zzermVar = this.zze;
        zzcvk zzcvkVar = (zzcvk) obj;
        synchronized (zzermVar) {
            if (zzcvkVar != null) {
                try {
                    zzcvkVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzcvkVar.zzq().zza(zzermVar.zzf().zzc());
            this.zza.zzb(zzcvkVar);
            zzermVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeri
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze.zzf().zzd().zzg();
                }
            });
            if (!((Boolean) zzbid.zzc.zze()).booleanValue() || (zzfnoVar = this.zzb) == null) {
                zzfnr zzfnrVarZzg = zzermVar.zzg();
                zzfne zzfneVar = this.zzc;
                zzfneVar.zzg(zzcvkVar.zzr().zzb);
                zzfneVar.zzi(zzcvkVar.zzn().zze());
                zzfneVar.zzd(true);
                zzfnrVarZzg.zzb(zzfneVar.zzm());
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

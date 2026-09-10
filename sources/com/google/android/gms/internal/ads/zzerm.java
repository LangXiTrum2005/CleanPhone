package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzerm implements zzerf {
    private final zzfij zza;
    private final zzclg zzb;
    private final Context zzc;
    private final zzerc zzd;
    private final zzfnr zze;
    private zzcvz zzf;

    public zzerm(zzclg zzclgVar, Context context, zzerc zzercVar, zzfij zzfijVar) {
        this.zzb = zzclgVar;
        this.zzc = context;
        this.zzd = zzercVar;
        this.zza = zzfijVar;
        this.zze = zzclgVar.zzx();
        zzfijVar.zzt(zzercVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzerf
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzerd zzerdVar, zzere zzereVar) throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcX)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzc();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zzc;
        if (com.google.android.gms.ads.internal.util.zzs.zzM(context) && zzmVar.zzs == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzerl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
            return false;
        }
        if (str == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzerk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        boolean z2 = zzmVar.zzf;
        zzfjh.zzb(context, z2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkl)).booleanValue() && z2) {
            this.zzb.zzw().zzc(true);
        }
        int i4 = ((zzerg) zzerdVar).zza;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        String strZza = zzdwm.PUBLIC_API_CALL.zza();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Bundle bundleZza = zzdwo.zza(new Pair(strZza, lValueOf), new Pair(zzdwm.DYNAMITE_ENTER.zza(), lValueOf));
        zzfij zzfijVar = this.zza;
        zzfijVar.zza(zzmVar);
        zzfijVar.zzv(bundleZza);
        zzfijVar.zzl(i4);
        zzfik zzfikVarZzA = zzfijVar.zzA();
        zzfne zzfneVarZzo = zzfne.zzo(context, zzfnn.zzg(zzfikVarZzA), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzco zzcoVar = zzfikVarZzA.zzo;
        if (zzcoVar != null) {
            this.zzd.zzc().zzn(zzcoVar);
        }
        zzclg zzclgVar = this.zzb;
        zzdlu zzdluVarZzo = zzclgVar.zzo();
        zzczs zzczsVar = new zzczs();
        zzczsVar.zza(context);
        zzczsVar.zzb(zzfikVarZzA);
        zzdluVarZzo.zzf(zzczsVar.zze());
        zzdgj zzdgjVar = new zzdgj();
        zzerc zzercVar = this.zzd;
        zzdgjVar.zze(zzercVar.zzc(), zzclgVar.zzb());
        zzdluVarZzo.zzg(zzdgjVar.zzn());
        zzdluVarZzo.zze(zzercVar.zzb());
        zzfno zzfnoVarZzc = null;
        zzdluVarZzo.zzd(new zzcsz(null));
        zzdlv zzdlvVarZzh = zzdluVarZzo.zzh();
        if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
            zzfnoVarZzc = zzdlvVarZzh.zzc();
            zzfnoVarZzc.zzi(8);
            zzfnoVarZzc.zzc(zzmVar.zzp);
            zzfnoVarZzc.zzd(zzmVar.zzm);
        }
        zzfno zzfnoVar = zzfnoVarZzc;
        zzclgVar.zzv().zza(1);
        zzgyw zzgywVarZzc = zzflk.zzc();
        ScheduledExecutorService scheduledExecutorServiceZzc = zzclgVar.zzc();
        zzcwo zzcwoVarZza = zzdlvVarZzh.zza();
        zzcvz zzcvzVar = new zzcvz(zzgywVarZzc, scheduledExecutorServiceZzc, zzcwoVarZza.zzc(zzcwoVarZza.zzb()));
        this.zzf = zzcvzVar;
        zzcvzVar.zza(new zzerj(this, zzereVar, zzfnoVar, zzfneVarZzo, zzdlvVarZzh));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzerf
    public final boolean zzb() {
        zzcvz zzcvzVar = this.zzf;
        return zzcvzVar != null && zzcvzVar.zzb();
    }

    public final /* synthetic */ void zzc() {
        this.zzd.zze().zzdI(zzfjm.zzd(4, null, null));
    }

    public final /* synthetic */ void zzd() {
        this.zzd.zze().zzdI(zzfjm.zzd(6, null, null));
    }

    public final /* synthetic */ zzclg zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzerc zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzfnr zzg() {
        return this.zze;
    }
}

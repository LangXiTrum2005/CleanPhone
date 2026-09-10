package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzffv implements zzerf {
    private final Context zza;
    private final Executor zzb;
    private final zzclg zzc;
    private final zzeqp zzd;
    private final zzfgv zze;
    private zzbhf zzf;
    private final zzfnr zzg;
    private final zzfij zzh;
    private ListenableFuture zzi;

    public zzffv(Context context, Executor executor, zzclg zzclgVar, zzeqp zzeqpVar, zzfgv zzfgvVar, zzfij zzfijVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzclgVar;
        this.zzd = zzeqpVar;
        this.zzh = zzfijVar;
        this.zze = zzfgvVar;
        this.zzg = zzclgVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzerf
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzerd zzerdVar, zzere zzereVar) {
        zzdkz zzdkzVarZzh;
        zzfno zzfnoVarZzc;
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcX)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzc();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkl)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzw().zzc(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzffo) zzerdVar).zza;
        Bundle bundleZza = zzdwo.zza(new Pair(zzdwm.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdwm.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzfij zzfijVar = this.zzh;
        zzfijVar.zzg(str);
        zzfijVar.zzc(zzrVar);
        zzfijVar.zza(zzmVar);
        zzfijVar.zzv(bundleZza);
        Context context = this.zza;
        zzfik zzfikVarZzA = zzfijVar.zzA();
        zzfne zzfneVarZzo = zzfne.zzo(context, zzfnn.zzg(zzfikVarZzA), 4, zzmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjt)).booleanValue()) {
            zzdky zzdkyVarZzm = this.zzc.zzm();
            zzczs zzczsVar = new zzczs();
            zzczsVar.zza(context);
            zzczsVar.zzb(zzfikVarZzA);
            zzdkyVarZzm.zze(zzczsVar.zze());
            zzdgj zzdgjVar = new zzdgj();
            zzeqp zzeqpVar = this.zzd;
            Executor executor = this.zzb;
            zzdgjVar.zzm(zzeqpVar, executor);
            zzdgjVar.zze(zzeqpVar, executor);
            zzdkyVarZzm.zzf(zzdgjVar.zzn());
            zzdkyVarZzm.zzd(new zzeow(this.zzf));
            zzdkzVarZzh = zzdkyVarZzm.zzh();
        } else {
            zzdgj zzdgjVar2 = new zzdgj();
            zzfgv zzfgvVar = this.zze;
            if (zzfgvVar != null) {
                Executor executor2 = this.zzb;
                zzdgjVar2.zza(zzfgvVar, executor2);
                zzdgjVar2.zzb(zzfgvVar, executor2);
                zzdgjVar2.zzc(zzfgvVar, executor2);
            }
            zzdky zzdkyVarZzm2 = this.zzc.zzm();
            zzczs zzczsVar2 = new zzczs();
            zzczsVar2.zza(context);
            zzczsVar2.zzb(zzfikVarZzA);
            zzdkyVarZzm2.zze(zzczsVar2.zze());
            zzeqp zzeqpVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdgjVar2.zzm(zzeqpVar2, executor3);
            zzdgjVar2.zza(zzeqpVar2, executor3);
            zzdgjVar2.zzb(zzeqpVar2, executor3);
            zzdgjVar2.zzc(zzeqpVar2, executor3);
            zzdgjVar2.zzf(zzeqpVar2, executor3);
            zzdgjVar2.zzg(zzeqpVar2, executor3);
            zzdgjVar2.zze(zzeqpVar2, executor3);
            zzdgjVar2.zzk(zzeqpVar2, executor3);
            zzdgjVar2.zzd(zzeqpVar2, executor3);
            zzdkyVarZzm2.zzf(zzdgjVar2.zzn());
            zzdkyVarZzm2.zzd(new zzeow(this.zzf));
            zzdkzVarZzh = zzdkyVarZzm2.zzh();
        }
        zzdkz zzdkzVar = zzdkzVarZzh;
        if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
            zzfnoVarZzc = zzdkzVar.zzc();
            zzfnoVarZzc.zzi(4);
            zzfnoVarZzc.zzc(zzmVar.zzp);
            zzfnoVarZzc.zzd(zzmVar.zzm);
        } else {
            zzfnoVarZzc = null;
        }
        zzfno zzfnoVar = zzfnoVarZzc;
        zzcwo zzcwoVarZzb = zzdkzVar.zzb();
        ListenableFuture listenableFutureZzc = zzcwoVarZzb.zzc(zzcwoVarZzb.zzb());
        this.zzi = listenableFutureZzc;
        zzgym.zzr(listenableFutureZzc, new zzfft(this, zzereVar, zzfnoVar, zzfneVarZzo, zzdkzVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzerf
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzi;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    public final void zzc(zzbhf zzbhfVar) {
        this.zzf = zzbhfVar;
    }

    public final /* synthetic */ void zzd() {
        this.zzd.zzdI(zzfjm.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzeqp zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzfgv zzg() {
        return this.zze;
    }

    public final /* synthetic */ zzfnr zzh() {
        return this.zzg;
    }

    public final /* synthetic */ void zzi(ListenableFuture listenableFuture) {
        this.zzi = null;
    }
}

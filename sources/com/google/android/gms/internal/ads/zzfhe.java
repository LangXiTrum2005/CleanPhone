package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfhe implements zzerf {
    private final Context zza;
    private final Executor zzb;
    private final zzclg zzc;
    private final zzfgv zzd;
    private final zzffj zze;
    private final zzfid zzf;
    private final zzfnr zzg;
    private final zzfij zzh;
    private ListenableFuture zzi;

    public zzfhe(Context context, Executor executor, zzclg zzclgVar, zzffj zzffjVar, zzfgv zzfgvVar, zzfij zzfijVar, zzfid zzfidVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzclgVar;
        this.zze = zzffjVar;
        this.zzd = zzfgvVar;
        this.zzh = zzfijVar;
        this.zzf = zzfidVar;
        this.zzg = zzclgVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdti zze(zzffh zzffhVar) {
        zzdti zzdtiVarZzp = this.zzc.zzp();
        zzczs zzczsVar = new zzczs();
        zzczsVar.zza(this.zza);
        zzczsVar.zzb(((zzfhd) zzffhVar).zza);
        zzczsVar.zzf(this.zzf);
        zzdtiVarZzp.zzd(zzczsVar.zze());
        zzdtiVarZzp.zze(new zzdgj().zzn());
        return zzdtiVarZzp;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzerf
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzerd zzerdVar, zzere zzereVar) throws RemoteException {
        zzfno zzfnoVar;
        zzbzt zzbztVar = new zzbzt(zzmVar, str);
        String str2 = zzbztVar.zzb;
        if (str2 == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcX)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzc();
        }
        if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
            zzffj zzffjVar = this.zze;
            if (zzffjVar.zzd() != null) {
                zzfno zzfnoVarZzd = ((zzdtj) zzffjVar.zzd()).zzd();
                zzfnoVarZzd.zzi(5);
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzbztVar.zza;
                zzfnoVarZzd.zzc(zzmVar2.zzp);
                zzfnoVarZzd.zzd(zzmVar2.zzm);
                zzfnoVar = zzfnoVarZzd;
            } else {
                zzfnoVar = null;
            }
        } else {
            zzfnoVar = null;
        }
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar3 = zzbztVar.zza;
        boolean z2 = zzmVar3.zzf;
        zzfjh.zzb(context, z2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkl)).booleanValue() && z2) {
            this.zzc.zzw().zzc(true);
        }
        Bundle bundleZza = zzdwo.zza(new Pair(zzdwm.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar3.zzz)), new Pair(zzdwm.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzfij zzfijVar = this.zzh;
        zzfijVar.zzg(str2);
        zzfijVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
        zzfijVar.zza(zzmVar3);
        zzfijVar.zzv(bundleZza);
        zzfik zzfikVarZzA = zzfijVar.zzA();
        zzfne zzfneVarZzo = zzfne.zzo(context, zzfnn.zzg(zzfikVarZzA), 5, zzmVar3);
        zzfhd zzfhdVar = new zzfhd(null);
        zzfhdVar.zza = zzfikVarZzA;
        ListenableFuture listenableFutureZzc = this.zze.zzc(new zzffk(zzfhdVar, null), new zzffi() { // from class: com.google.android.gms.internal.ads.zzfhb
            @Override // com.google.android.gms.internal.ads.zzffi
            public final /* synthetic */ zzczq zza(zzffh zzffhVar) {
                return this.zza.zzd(zzffhVar);
            }
        }, null);
        this.zzi = listenableFutureZzc;
        zzgym.zzr(listenableFutureZzc, new zzfha(this, zzereVar, zzfnoVar, zzfneVarZzo, zzfhdVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzerf
    public final boolean zzb() {
        throw null;
    }

    public final /* synthetic */ void zzc() {
        this.zzd.zzdI(zzfjm.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzfgv zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzffj zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzfnr zzi() {
        return this.zzg;
    }

    public final void zzj(int i2) {
        this.zzh.zzj().zza(i2);
    }
}

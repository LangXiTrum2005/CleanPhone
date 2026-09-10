package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzekk implements zzejm {
    private final Context zza;
    private final zzcuh zzb;
    private final Executor zzc;

    public zzekk(Context context, zzcuh zzcuhVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcuhVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final void zza(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        zzfik zzfikVar = zzficVar.zza.zza;
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzfikVar.zzf;
        if (zzrVar2.zzn) {
            zzrVar = new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzb(zzrVar2.zze, zzrVar2.zzb));
        } else {
            zzrVar = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziY)).booleanValue() && zzfhrVar.zzag) ? new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzc(zzrVar2.zze, zzrVar2.zzb)) : zzfiq.zza(this.zza, zzfhrVar.zzu);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziY)).booleanValue() && zzfhrVar.zzag) {
            ((zzfji) zzejjVar.zzb).zzb(this.zza, zzrVar3, zzfikVar.zzd, zzfhrVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfhrVar.zzs), (zzbtf) zzejjVar.zzc);
        } else {
            ((zzfji) zzejjVar.zzb).zzg(this.zza, zzrVar3, zzfikVar.zzd, zzfhrVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfhrVar.zzs), (zzbtf) zzejjVar.zzc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzejm
    public final /* bridge */ /* synthetic */ Object zzb(zzfic zzficVar, final zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir, zzemv {
        final View viewZza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziY)).booleanValue() && zzfhrVar.zzag) {
            zzbti zzbtiVarZzc = ((zzfji) zzejjVar.zzb).zzc();
            if (zzbtiVarZzc == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfir(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.unwrap(zzbtiVarZzc.zze());
                boolean zZzf = zzbtiVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfir(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzgym.zzj(zzgym.zza(null), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzeki
                            @Override // com.google.android.gms.internal.ads.zzgxu
                            public final /* synthetic */ ListenableFuture zza(Object obj) {
                                return this.zza.zzc(viewZza, zzfhrVar, obj);
                            }
                        }, zzcdo.zzf).get();
                    } catch (InterruptedException | ExecutionException e2) {
                        throw new zzfir(e2);
                    }
                }
            } catch (RemoteException e3) {
                throw new zzfir(e3);
            }
        } else {
            viewZza = ((zzfji) zzejjVar.zzb).zza();
        }
        zzcuh zzcuhVar = this.zzb;
        zzcwa zzcwaVar = new zzcwa(zzficVar, zzfhrVar, zzejjVar.zza);
        final zzfji zzfjiVar = (zzfji) zzejjVar.zzb;
        Objects.requireNonNull(zzfjiVar);
        zzctd zzctdVarZzf = zzcuhVar.zzf(zzcwaVar, new zzctj(viewZza, null, new zzcvi() { // from class: com.google.android.gms.internal.ads.zzekj
            @Override // com.google.android.gms.internal.ads.zzcvi
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() {
                return zzfjiVar.zzt();
            }
        }, (zzfhs) zzfhrVar.zzu.get(0)));
        zzctdVarZzf.zzk().zza(viewZza);
        zzctdVarZzf.zza().zzq(new zzcqq(zzfjiVar), this.zzc);
        ((zzekv) zzejjVar.zzc).zzc(zzctdVarZzf.zzf());
        return zzctdVarZzf.zzi();
    }

    public final /* synthetic */ ListenableFuture zzc(View view, zzfhr zzfhrVar, Object obj) {
        return zzgym.zza(zzcuw.zza(this.zza, view, zzfhrVar));
    }
}

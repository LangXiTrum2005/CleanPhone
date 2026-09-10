package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.applovin.impl.Z;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzekg implements zzejg {
    private final zzcuh zza;
    private final Context zzb;
    private final zzdua zzc;
    private final zzfik zzd;
    private final Executor zze;
    private final zzgpr zzf;
    private final zzdwy zzg;

    public zzekg(zzcuh zzcuhVar, Context context, Executor executor, zzdua zzduaVar, zzfik zzfikVar, zzgpr zzgprVar, zzdwy zzdwyVar) {
        this.zzb = context;
        this.zza = zzcuhVar;
        this.zze = executor;
        this.zzc = zzduaVar;
        this.zzd = zzfikVar;
        this.zzf = zzgprVar;
        this.zzg = zzdwyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean zza(zzfic zzficVar, zzfhr zzfhrVar) {
        zzfhw zzfhwVar = zzfhrVar.zzs;
        return (zzfhwVar == null || zzfhwVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final ListenableFuture zzb(final zzfic zzficVar, final zzfhr zzfhrVar) {
        return zzgym.zzj(zzgym.zza(null), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzekf
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzficVar, zzfhrVar, obj);
            }
        }, this.zze);
    }

    public final /* synthetic */ ListenableFuture zzc(zzfic zzficVar, zzfhr zzfhrVar, Object obj) throws zzcjg {
        zzbgb zzbgbVar = zzbgk.zzcL;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(this.zzg.zze(), zzdwm.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVarZza = zzfiq.zza(context, zzfhrVar.zzu);
        final zzcir zzcirVarZza = this.zzc.zza(zzrVarZza, zzfhrVar, zzficVar.zzb.zzb);
        zzcirVarZza.zzaw(zzfhrVar.zzW);
        View viewZza = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziY)).booleanValue() && zzfhrVar.zzag) ? zzcuw.zza(context, zzcirVarZza.zzE(), zzfhrVar) : new zzdud(context, zzcirVarZza.zzE(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzfhrVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(this.zzg.zze(), zzdwm.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcuh zzcuhVar = this.zza;
        final zzctd zzctdVarZzf = zzcuhVar.zzf(new zzcwa(zzficVar, zzfhrVar, null), new zzctj(viewZza, zzcirVarZza, new zzcvi() { // from class: com.google.android.gms.internal.ads.zzekb
            @Override // com.google.android.gms.internal.ads.zzcvi
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() {
                return zzcirVarZza.zzh();
            }
        }, zzfiq.zzb(zzrVarZza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(this.zzg.zze(), zzdwm.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdtz zzdtzVarZzj = zzctdVarZzf.zzj();
        zzdwy zzdwyVar = this.zzg;
        zzdtzVarZzj.zzi(zzcirVarZza, false, null, zzdwyVar.zze());
        zzdbc zzdbcVarZzd = zzctdVarZzf.zzd();
        zzdbe zzdbeVar = new zzdbe() { // from class: com.google.android.gms.internal.ads.zzekc
            @Override // com.google.android.gms.internal.ads.zzdbe
            public final /* synthetic */ void zzdr() {
                zzcir zzcirVar = zzcirVarZza;
                if (zzcirVar.zzP() != null) {
                    zzcirVar.zzP().zzq();
                }
            }
        };
        zzgyw zzgywVar = zzcdo.zzg;
        zzdbcVarZzd.zzq(zzdbeVar, zzgywVar);
        zzfhw zzfhwVar = zzfhrVar.zzs;
        String strZza = zzfhwVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgh)).booleanValue() && zzctdVarZzf.zzm().zza(true)) {
            strZza = zzcki.zza(strZza, zzcki.zzb(zzfhrVar));
        }
        zzctdVarZzf.zzj();
        ListenableFuture listenableFutureZzj = zzdtz.zzj(zzcirVarZza, zzfhwVar.zzb, strZza, zzdwyVar.zze(), zzcuhVar.zze());
        if (zzfhrVar.zzM) {
            listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeka
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcirVarZza.zzav();
                }
            }, this.zze);
        }
        listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(zzcirVarZza);
            }
        }, this.zze);
        return zzgym.zzk(listenableFutureZzj, new zzgpr() { // from class: com.google.android.gms.internal.ads.zzeke
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj2) {
                return zzctdVarZzf.zzi();
            }
        }, zzgywVar);
    }

    public final /* synthetic */ void zzd(zzcir zzcirVar) {
        zzcirVar.zzJ();
        zzfik zzfikVar = this.zzd;
        zzcjx zzcjxVarZzh = zzcirVar.zzh();
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzfikVar.zza;
        if (zzgaVar != null && zzcjxVarZzh != null) {
            zzcjxVarZzh.zzc(zzgaVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbN)).booleanValue() || zzcirVar.isAttachedToWindow()) {
            return;
        }
        zzcirVar.onPause();
        zzcirVar.zzaG(true);
    }
}

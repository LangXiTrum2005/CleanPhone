package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.impl.Z;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzejr implements zzejg {
    private final zzcsq zza;
    private final zzdua zzb;
    private final zzfik zzc;
    private final Executor zzd;
    private final VersionInfoParcel zze;
    private final zzbnq zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkk)).booleanValue();
    private final zzeif zzh;
    private final zzdwy zzi;
    private final zzdxe zzj;

    public zzejr(zzcsq zzcsqVar, Context context, Executor executor, zzdua zzduaVar, zzfik zzfikVar, VersionInfoParcel versionInfoParcel, zzbnq zzbnqVar, zzeif zzeifVar, zzdwy zzdwyVar, zzdxe zzdxeVar) {
        this.zza = zzcsqVar;
        this.zzd = executor;
        this.zzb = zzduaVar;
        this.zzc = zzfikVar;
        this.zze = versionInfoParcel;
        this.zzf = zzbnqVar;
        this.zzh = zzeifVar;
        this.zzi = zzdwyVar;
        this.zzj = zzdxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean zza(zzfic zzficVar, zzfhr zzfhrVar) {
        zzfhw zzfhwVar = zzfhrVar.zzs;
        return (zzfhwVar == null || zzfhwVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final ListenableFuture zzb(final zzfic zzficVar, final zzfhr zzfhrVar) {
        final zzdue zzdueVar = new zzdue();
        ListenableFuture listenableFutureZza = zzgym.zza(null);
        zzgxu zzgxuVar = new zzgxu() { // from class: com.google.android.gms.internal.ads.zzejp
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfhrVar, zzficVar, zzdueVar, obj);
            }
        };
        Executor executor = this.zzd;
        ListenableFuture listenableFutureZzj = zzgym.zzj(listenableFutureZza, zzgxuVar, executor);
        listenableFutureZzj.addListener(new Runnable(zzdueVar) { // from class: com.google.android.gms.internal.ads.zzejq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return listenableFutureZzj;
    }

    public final /* synthetic */ ListenableFuture zzc(final zzfhr zzfhrVar, zzfic zzficVar, zzdue zzdueVar, Object obj) throws zzcjg {
        zzbgb zzbgbVar = zzbgk.zzcL;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(this.zzi.zze(), zzdwm.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzdua zzduaVar = this.zzb;
        zzfik zzfikVar = this.zzc;
        final zzcir zzcirVarZza = zzduaVar.zza(zzfikVar.zzf, zzfhrVar, zzficVar.zzb.zzb);
        zzcirVarZza.zzaw(zzfhrVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(this.zzi.zze(), zzdwm.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcdt zzcdtVar = new zzcdt();
        zzcsq zzcsqVar = this.zza;
        zzcwa zzcwaVar = new zzcwa(zzficVar, zzfhrVar, null);
        VersionInfoParcel versionInfoParcel = this.zze;
        boolean z2 = this.zzg;
        zzbnq zzbnqVar = this.zzf;
        final zzcsn zzcsnVarZzf = zzcsqVar.zzf(zzcwaVar, new zzdjw(new zzejt(versionInfoParcel, zzcdtVar, zzfhrVar, zzcirVarZza, zzfikVar, z2, zzbnqVar, this.zzh, this.zzj), zzcirVarZza), new zzcso(zzfhrVar.zzaa));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(this.zzi.zze(), zzdwm.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdtz zzdtzVarZzi = zzcsnVarZzf.zzi();
        zzbnq zzbnqVar2 = true == z2 ? zzbnqVar : null;
        zzdwy zzdwyVar = this.zzi;
        zzdtzVarZzi.zzi(zzcirVarZza, false, zzbnqVar2, zzdwyVar.zze());
        zzcdtVar.zzc(zzcsnVarZzf);
        zzcsnVarZzf.zzd().zzq(new zzdbe() { // from class: com.google.android.gms.internal.ads.zzejn
            @Override // com.google.android.gms.internal.ads.zzdbe
            public final /* synthetic */ void zzdr() {
                zzcir zzcirVar = zzcirVarZza;
                if (zzcirVar.zzP() != null) {
                    zzcirVar.zzP().zzq();
                }
            }
        }, zzcdo.zzg);
        zzfhw zzfhwVar = zzfhrVar.zzs;
        String strZza = zzfhwVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgh)).booleanValue() && zzcsnVarZzf.zzk().zza(true)) {
            strZza = zzcki.zza(strZza, zzcki.zzb(zzfhrVar));
        }
        zzcsnVarZzf.zzi();
        return zzgym.zzk(zzdtz.zzj(zzcirVarZza, zzfhwVar.zzb, strZza, zzdwyVar.zze(), zzcsqVar.zzd()), new zzgpr(this) { // from class: com.google.android.gms.internal.ads.zzejo
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj2) {
                zzcir zzcirVar = zzcirVarZza;
                if (zzfhrVar.zzM) {
                    zzcirVar.zzav();
                }
                zzcsn zzcsnVar = zzcsnVarZzf;
                zzcirVar.zzJ();
                zzcirVar.onPause();
                return zzcsnVar.zzh();
            }
        }, this.zzd);
    }
}

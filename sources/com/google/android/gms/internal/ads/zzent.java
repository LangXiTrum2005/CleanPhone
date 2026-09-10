package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.impl.Z;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzent implements zzejg {
    private final Context zza;
    private final zzdua zzb;
    private final zzdtj zzc;
    private final zzfik zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbnq zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkk)).booleanValue();
    private final zzeif zzi;
    private final zzdwy zzj;
    private final zzdxe zzk;

    public zzent(Context context, VersionInfoParcel versionInfoParcel, zzfik zzfikVar, Executor executor, zzdtj zzdtjVar, zzdua zzduaVar, zzbnq zzbnqVar, zzeif zzeifVar, zzdwy zzdwyVar, zzdxe zzdxeVar) {
        this.zza = context;
        this.zzd = zzfikVar;
        this.zzc = zzdtjVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzduaVar;
        this.zzg = zzbnqVar;
        this.zzi = zzeifVar;
        this.zzj = zzdwyVar;
        this.zzk = zzdxeVar;
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
        zzgxu zzgxuVar = new zzgxu() { // from class: com.google.android.gms.internal.ads.zzens
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfhrVar, zzficVar, zzdueVar, obj);
            }
        };
        Executor executor = this.zze;
        ListenableFuture listenableFutureZzj = zzgym.zzj(listenableFutureZza, zzgxuVar, executor);
        listenableFutureZzj.addListener(new Runnable(zzdueVar) { // from class: com.google.android.gms.internal.ads.zzenm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return listenableFutureZzj;
    }

    public final /* synthetic */ ListenableFuture zzc(final zzfhr zzfhrVar, zzfic zzficVar, zzdue zzdueVar, Object obj) throws zzcjg {
        zzbgb zzbgbVar = zzbgk.zzcL;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(this.zzj.zze(), zzdwm.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzdua zzduaVar = this.zzb;
        zzfik zzfikVar = this.zzd;
        final zzcir zzcirVarZza = zzduaVar.zza(zzfikVar.zzf, zzfhrVar, zzficVar.zzb.zzb);
        zzcirVarZza.zzaw(zzfhrVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(this.zzj.zze(), zzdwm.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcdt zzcdtVar = new zzcdt();
        zzdtj zzdtjVar = this.zzc;
        zzcwa zzcwaVar = new zzcwa(zzficVar, zzfhrVar, null);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzf;
        zzbnq zzbnqVar = this.zzg;
        boolean z2 = this.zzh;
        zzeif zzeifVar = this.zzi;
        zzdwy zzdwyVar = this.zzj;
        final zzdtf zzdtfVarZzf = zzdtjVar.zzf(zzcwaVar, new zzdtg(new zzenp(context, zzduaVar, zzfikVar, versionInfoParcel, zzfhrVar, zzcdtVar, zzcirVarZza, zzbnqVar, z2, zzeifVar, zzdwyVar, this.zzk), zzcirVarZza));
        zzcdtVar.zzc(zzdtfVarZzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(zzdwyVar.zze(), zzdwm.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzbog.zzb(zzcirVarZza, zzdtfVarZzf.zzk());
        zzdtfVarZzf.zzd().zzq(new zzdbe() { // from class: com.google.android.gms.internal.ads.zzenq
            @Override // com.google.android.gms.internal.ads.zzdbe
            public final /* synthetic */ void zzdr() {
                zzcir zzcirVar = zzcirVarZza;
                if (zzcirVar.zzP() != null) {
                    zzcirVar.zzP().zzq();
                }
            }
        }, zzcdo.zzg);
        zzdtfVarZzf.zzl().zzi(zzcirVarZza, true, true != z2 ? null : zzbnqVar, zzdwyVar.zze());
        zzfhw zzfhwVar = zzfhrVar.zzs;
        String strZza = zzfhwVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgh)).booleanValue() && zzdtfVarZzf.zzo().zza(true)) {
            strZza = zzcki.zza(strZza, zzcki.zzb(zzfhrVar));
        }
        zzdtfVarZzf.zzl();
        return zzgym.zzk(zzdtz.zzj(zzcirVarZza, zzfhwVar.zzb, strZza, zzdwyVar.zze(), zzdtjVar.zzd()), new zzgpr(this) { // from class: com.google.android.gms.internal.ads.zzenr
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj2) {
                zzcir zzcirVar = zzcirVarZza;
                if (zzfhrVar.zzM) {
                    zzcirVar.zzav();
                }
                zzdtf zzdtfVar = zzdtfVarZzf;
                zzcirVar.zzJ();
                zzcirVar.onPause();
                return zzdtfVar.zzh();
            }
        }, this.zze);
    }
}

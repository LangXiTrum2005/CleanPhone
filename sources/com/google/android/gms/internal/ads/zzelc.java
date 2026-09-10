package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.impl.Z;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzelc implements zzejg {
    private final Context zza;
    private final zzdua zzb;
    private final zzdkz zzc;
    private final zzfik zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbnq zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkk)).booleanValue();
    private final zzeif zzi;
    private final zzdwy zzj;
    private final zzdxe zzk;

    public zzelc(Context context, VersionInfoParcel versionInfoParcel, zzfik zzfikVar, Executor executor, zzdkz zzdkzVar, zzdua zzduaVar, zzbnq zzbnqVar, zzeif zzeifVar, zzdwy zzdwyVar, zzdxe zzdxeVar) {
        this.zza = context;
        this.zzd = zzfikVar;
        this.zzc = zzdkzVar;
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
        zzgxu zzgxuVar = new zzgxu() { // from class: com.google.android.gms.internal.ads.zzekz
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfhrVar, zzficVar, zzdueVar, obj);
            }
        };
        Executor executor = this.zze;
        ListenableFuture listenableFutureZzj = zzgym.zzj(listenableFutureZza, zzgxuVar, executor);
        listenableFutureZzj.addListener(new Runnable(zzdueVar) { // from class: com.google.android.gms.internal.ads.zzelb
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
        zzdkz zzdkzVar = this.zzc;
        zzcwa zzcwaVar = new zzcwa(zzficVar, zzfhrVar, null);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzf;
        boolean z2 = this.zzh;
        zzbnq zzbnqVar = this.zzg;
        final zzdjt zzdjtVarZzd = zzdkzVar.zzd(zzcwaVar, new zzdjw(new zzela(context, versionInfoParcel, zzcdtVar, zzfhrVar, zzcirVarZza, zzfikVar, z2, zzbnqVar, this.zzi, this.zzk), zzcirVarZza));
        zzcdtVar.zzc(zzdjtVarZzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(this.zzj.zze(), zzdwm.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdjtVarZzd.zzd().zzq(new zzdbe() { // from class: com.google.android.gms.internal.ads.zzekx
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgh)).booleanValue() && zzdjtVarZzd.zzl().zza(true)) {
            strZza = zzcki.zza(strZza, zzcki.zzb(zzfhrVar));
        }
        zzdtz zzdtzVarZzk = zzdjtVarZzd.zzk();
        zzbnq zzbnqVar2 = true != z2 ? null : zzbnqVar;
        zzdwy zzdwyVar = this.zzj;
        zzdtzVarZzk.zzi(zzcirVarZza, true, zzbnqVar2, zzdwyVar.zze());
        zzdjtVarZzd.zzk();
        return zzgym.zzk(zzdtz.zzj(zzcirVarZza, zzfhwVar.zzb, strZza, zzdwyVar.zze(), zzdkzVar.zzc()), new zzgpr(this) { // from class: com.google.android.gms.internal.ads.zzeky
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj2) {
                zzcir zzcirVar = zzcirVarZza;
                if (zzfhrVar.zzM) {
                    zzcirVar.zzav();
                }
                zzdjt zzdjtVar = zzdjtVarZzd;
                zzcirVar.zzJ();
                zzcirVar.onPause();
                return zzdjtVar.zzh();
            }
        }, this.zze);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdlm implements zzdak, zzdhw {
    private final zzcbt zza;
    private final Context zzb;
    private final zzcbw zzc;
    private final View zzd;
    private String zze;
    private final zzbfp.zza.EnumC0185zza zzf;

    public zzdlm(zzcbt zzcbtVar, Context context, zzcbw zzcbwVar, View view, zzbfp.zza.EnumC0185zza enumC0185zza) {
        this.zza = zzcbtVar;
        this.zzb = context;
        this.zzc = zzcbwVar;
        this.zzd = view;
        this.zzf = enumC0185zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    @ParametersAreNonnullByDefault
    public final void zzd(zzbzm zzbzmVar, String str, String str2) {
        zzcbw zzcbwVar = this.zzc;
        Context context = this.zzb;
        if (zzcbwVar.zza(context)) {
            try {
                zzcbwVar.zzo(context, zzcbwVar.zzj(context), this.zza.zzb(), zzbzmVar.zzb(), zzbzmVar.zzc());
            } catch (RemoteException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception to get reward item.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdJ() {
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzds() {
        this.zza.zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdt() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzg(view.getContext(), this.zze);
        }
        this.zza.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzh() {
        zzbfp.zza.EnumC0185zza enumC0185zza = this.zzf;
        if (enumC0185zza == zzbfp.zza.EnumC0185zza.APP_OPEN) {
            return;
        }
        String strZzf = this.zzc.zzf(this.zzb);
        this.zze = strZzf;
        this.zze = String.valueOf(strZzf).concat(enumC0185zza == zzbfp.zza.EnumC0185zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}

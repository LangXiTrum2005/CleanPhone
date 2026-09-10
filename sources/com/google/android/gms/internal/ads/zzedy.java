package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
final class zzedy implements zzddq {
    private final Context zza;
    private final zzcbw zzb;

    public zzedy(Context context, zzcbw zzcbwVar) {
        this.zza = context;
        this.zzb = zzcbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdO(zzbza zzbzaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdP(zzfic zzficVar) {
        String str = zzficVar.zzb.zzb.zze;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzcbw zzcbwVar = this.zzb;
        Context context = this.zza;
        zzcbwVar.zzc(context, zzficVar.zza.zza.zzd);
        zzcbwVar.zzm(context, str);
    }
}

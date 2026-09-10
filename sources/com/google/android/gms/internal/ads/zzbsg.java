package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbsg implements zzcdx {
    final /* synthetic */ zzbrl zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcdt zzc;
    final /* synthetic */ zzbsj zzd;

    public zzbsg(zzbsj zzbsjVar, zzbrl zzbrlVar, Object obj, zzcdt zzcdtVar) {
        this.zza = zzbrlVar;
        this.zzb = obj;
        this.zzc = zzcdtVar;
        Objects.requireNonNull(zzbsjVar);
        this.zzd = zzbsjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdx
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcdt zzcdtVar = this.zzc;
        this.zzd.zzc(this.zza, (zzbrs) obj, obj2, zzcdtVar);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbsh implements zzcdv {
    final /* synthetic */ zzcdt zza;
    final /* synthetic */ zzbrl zzb;

    public zzbsh(zzbsj zzbsjVar, zzcdt zzcdtVar, zzbrl zzbrlVar) {
        this.zza = zzcdtVar;
        this.zzb = zzbrlVar;
        Objects.requireNonNull(zzbsjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbru("Unable to obtain a JavascriptEngine."));
        this.zzb.zza();
    }
}

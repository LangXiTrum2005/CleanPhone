package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzbmr implements zzgyj {
    final /* synthetic */ zzcir zza;

    public zzbmr(zzcir zzcirVar) {
        this.zza = zzcirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcir zzcirVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbt(zzcirVar.getContext(), zzcirVar.zzs().afmaVersion, str, null, zzcirVar.zzC() != null ? zzcirVar.zzC().zzax : null).zzb();
    }
}

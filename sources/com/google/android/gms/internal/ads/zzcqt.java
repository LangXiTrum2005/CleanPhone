package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcqt implements zzgyj {
    final /* synthetic */ zzfpi zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    final /* synthetic */ zzcra zzd;

    public zzcqt(zzcra zzcraVar, zzfpi zzfpiVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfpiVar;
        this.zzb = str;
        this.zzc = zzvVar;
        Objects.requireNonNull(zzcraVar);
        this.zzd = zzcraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(final Throwable th) {
        final zzfpi zzfpiVar = this.zza;
        final String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlH)).booleanValue();
                Throwable th2 = th;
                zzcqt zzcqtVar = this.zza;
                if (zBooleanValue) {
                    zzcra zzcraVar = zzcqtVar.zzd;
                    zzbxx zzbxxVarZzc = zzbxv.zzc(zzcraVar.zzi());
                    zzcraVar.zzb = zzbxxVarZzc;
                    zzbxxVarZzc.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcra zzcraVar2 = zzcqtVar.zzd;
                    zzbxx zzbxxVarZza = zzbxv.zza(zzcraVar2.zzi());
                    zzcraVar2.zza = zzbxxVarZza;
                    zzbxxVarZza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfpiVar.zzb(str, zzvVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfpi zzfpiVar = this.zza;
        final String str = (String) obj;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfpiVar.zzb(str, zzvVar, null, null);
            }
        });
    }
}

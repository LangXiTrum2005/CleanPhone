package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbqx implements zzbnn {
    final /* synthetic */ zzbqm zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzbv zzb;
    final /* synthetic */ zzbrr zzc;

    public zzbqx(zzbrr zzbrrVar, zzayq zzayqVar, zzbqm zzbqmVar, com.google.android.gms.ads.internal.util.zzbv zzbvVar) {
        this.zza = zzbqmVar;
        this.zzb = zzbvVar;
        Objects.requireNonNull(zzbrrVar);
        this.zzc = zzbrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        zzbrr zzbrrVar = this.zzc;
        synchronized (zzbrrVar.zzg()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
                com.google.android.gms.ads.internal.util.client.zzo.zzh("JS Engine is requesting an update");
                if (zzbrrVar.zzk() == 0) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Starting reload.");
                    zzbrrVar.zzl(2);
                    zzbrrVar.zza(null);
                }
                this.zza.zzn("/requestReload", (zzbnn) this.zzb.zza());
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}

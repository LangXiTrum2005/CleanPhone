package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbra implements zzcdx {
    final /* synthetic */ zzbrq zza;
    final /* synthetic */ zzfne zzb;
    final /* synthetic */ zzbrr zzc;

    public zzbra(zzbrr zzbrrVar, zzbrq zzbrqVar, zzfne zzfneVar) {
        this.zza = zzbrqVar;
        this.zzb = zzfneVar;
        Objects.requireNonNull(zzbrrVar);
        this.zzc = zzbrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdx
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbrr zzbrrVar = this.zzc;
        synchronized (zzbrrVar.zzg()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                zzbrrVar.zzl(0);
                if (zzbrrVar.zzi() != null && this.zza != zzbrrVar.zzi()) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbrrVar.zzi().zzc();
                }
                zzbrrVar.zzj(this.zza);
                if (((Boolean) zzbid.zzd.zze()).booleanValue() && zzbrrVar.zzh() != null) {
                    zzfnr zzfnrVarZzh = zzbrrVar.zzh();
                    zzfne zzfneVar = this.zzb;
                    zzfneVar.zzd(true);
                    zzfnrVarZzh.zzb(zzfneVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}

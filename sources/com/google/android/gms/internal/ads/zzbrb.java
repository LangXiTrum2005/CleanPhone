package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbrb implements zzcdv {
    final /* synthetic */ zzbrq zza;
    final /* synthetic */ zzfne zzb;
    final /* synthetic */ zzbrr zzc;

    public zzbrb(zzbrr zzbrrVar, zzbrq zzbrqVar, zzfne zzfneVar) {
        this.zza = zzbrqVar;
        this.zzb = zzfneVar;
        Objects.requireNonNull(zzbrrVar);
        this.zzc = zzbrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbrr zzbrrVar = this.zzc;
        synchronized (zzbrrVar.zzg()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                zzbrrVar.zzl(1);
                com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzc();
                if (((Boolean) zzbid.zzd.zze()).booleanValue() && zzbrrVar.zzh() != null) {
                    zzfnr zzfnrVarZzh = zzbrrVar.zzh();
                    zzfne zzfneVar = this.zzb;
                    zzfneVar.zzk("Failed loading new engine");
                    zzfneVar.zzd(false);
                    zzfnrVarZzh.zzb(zzfneVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}

package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfez implements zzffj {
    private zzczr zza;

    @Override // com.google.android.gms.internal.ads.zzffj
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzczr zzd() {
        return this.zza;
    }

    public final synchronized ListenableFuture zzb(zzffk zzffkVar, zzffi zzffiVar, zzczr zzczrVar) {
        zzcwo zzcwoVarZza;
        try {
            if (zzczrVar != null) {
                this.zza = zzczrVar;
            } else {
                this.zza = (zzczr) zzffiVar.zza(zzffkVar.zzb).zzh();
            }
            zzcwoVarZza = this.zza.zza();
        } catch (Throwable th) {
            throw th;
        }
        return zzcwoVarZza.zzc(zzcwoVarZza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzffj
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzffk zzffkVar, zzffi zzffiVar, Object obj) {
        return zzb(zzffkVar, zzffiVar, null);
    }
}

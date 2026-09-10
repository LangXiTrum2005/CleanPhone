package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzffa implements zzffj {
    private final zzffj zza;
    private zzczr zzb;

    public zzffa(zzffj zzffjVar) {
        this.zza = zzffjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffj
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzczr zzd() {
        return this.zzb;
    }

    public final synchronized ListenableFuture zzb(zzffk zzffkVar, zzffi zzffiVar, zzczr zzczrVar) {
        zzbza zzbzaVar;
        this.zzb = zzczrVar;
        if (zzczrVar == null || (zzbzaVar = zzffkVar.zza) == null) {
            return ((zzfez) this.zza).zzb(zzffkVar, zzffiVar, zzczrVar);
        }
        zzcwo zzcwoVarZza = zzczrVar.zza();
        return zzcwoVarZza.zzc(zzcwoVarZza.zza(zzgym.zza(zzbzaVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzffj
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzffk zzffkVar, zzffi zzffiVar, Object obj) {
        return zzb(zzffkVar, zzffiVar, null);
    }
}

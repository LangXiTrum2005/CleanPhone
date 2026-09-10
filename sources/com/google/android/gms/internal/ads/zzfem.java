package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzfem implements zzfks {
    private final zzffj zza;

    public zzfem(zzffj zzffjVar) {
        this.zza = zzffjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfks
    public final ListenableFuture zza(zzfkt zzfktVar) {
        zzfep zzfepVar = (zzfep) zzfktVar;
        return ((zzfel) this.zza).zzb(zzfepVar.zzb, zzfepVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfks
    public final void zzb(zzfki zzfkiVar) {
        zzfkiVar.zza = ((zzfel) this.zza).zza();
    }
}

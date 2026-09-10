package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzabr implements zzadi {
    final /* synthetic */ zzabw zza;

    public zzabr(zzabw zzabwVar) {
        Objects.requireNonNull(zzabwVar);
        this.zza = zzabwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final void zza() {
        zzmh zzmhVarZzaY = this.zza.zzaY();
        if (zzmhVarZzaY != null) {
            zzmhVarZzaY.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final void zzb() {
        zzabw zzabwVar = this.zza;
        if (zzabwVar.zzbk() != null) {
            zzabwVar.zzbj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final void zzc() {
        zzabw zzabwVar = this.zza;
        if (zzabwVar.zzbk() != null) {
            zzabwVar.zzaw(0, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final void zzd(zzbv zzbvVar) {
    }
}

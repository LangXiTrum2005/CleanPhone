package com.google.android.gms.measurement.internal;

import com.applovin.impl.Z;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzmt implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzbg zzc;
    final /* synthetic */ zznl zzd;

    public zzmt(zznl zznlVar, boolean z2, zzr zzrVar, boolean z3, zzbg zzbgVar, String str) {
        this.zza = zzrVar;
        this.zzb = z3;
        this.zzc = zzbgVar;
        Objects.requireNonNull(zznlVar);
        this.zzd = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzd;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            Z.u(zznlVar.zzu, "Discarding data. Failed to send event to service");
            return;
        }
        zzr zzrVar = this.zza;
        Preconditions.checkNotNull(zzrVar);
        zznlVar.zzm(zzgbVarZzZ, this.zzb ? null : this.zzc, zzrVar);
        zznlVar.zzV();
    }
}

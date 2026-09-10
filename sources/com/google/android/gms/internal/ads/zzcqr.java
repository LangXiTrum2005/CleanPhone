package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcqr {
    private final zzcyl zza;

    @Nullable
    private final zzdar zzb;

    public zzcqr(zzcyl zzcylVar, @Nullable zzdar zzdarVar) {
        this.zza = zzcylVar;
        this.zzb = zzdarVar;
    }

    public final zzcyl zza() {
        return this.zza;
    }

    @Nullable
    public final zzdar zzb() {
        return this.zzb;
    }

    public final zzddk zzc() {
        zzdar zzdarVar = this.zzb;
        return zzdarVar != null ? new zzddk(zzdarVar, zzbzw.zzg) : new zzddk(new zzcqq(this), zzbzw.zzg);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnj {
    private zzbjv zza;

    public zzdnj(zzdmu zzdmuVar) {
        this.zza = zzdmuVar;
    }

    public final synchronized zzbjv zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbjv zzbjvVar) {
        this.zza = zzbjvVar;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzf {
    private final String zza;
    private final long zzb;

    public zzfzf() {
        this.zza = null;
        this.zzb = -1L;
    }

    public final String zza() {
        return this.zza;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb > 0;
    }

    public zzfzf(String str, long j) {
        this.zza = str;
        this.zzb = j;
    }
}

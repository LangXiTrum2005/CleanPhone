package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbfh {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbfh(InputStream inputStream, boolean z2, boolean z3, long j, boolean z4) {
        this.zza = inputStream;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = j;
        this.zze = z4;
    }

    public static zzbfh zza(InputStream inputStream, boolean z2, boolean z3, long j, boolean z4) {
        return new zzbfh(inputStream, z2, z3, j, z4);
    }

    public final InputStream zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzc;
    }

    public final long zze() {
        return this.zzd;
    }

    public final boolean zzf() {
        return this.zze;
    }
}

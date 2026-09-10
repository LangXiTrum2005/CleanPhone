package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzady {
    public static final zzady zza = new zzady(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzady(int i2, long j, long j2) {
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzady zza(long j, long j2) {
        return new zzady(-1, j, j2);
    }

    public static zzady zzb(long j, long j2) {
        return new zzady(-2, j, j2);
    }

    public static zzady zzc(long j) {
        return new zzady(0, -9223372036854775807L, j);
    }

    public final /* synthetic */ int zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }
}

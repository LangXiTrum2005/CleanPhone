package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzakv {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzv zzg;
    public final int zzh;
    public final long[] zzi;
    public final long[] zzj;
    public final int zzk;
    private final zzakw[] zzl;

    public zzakv(int i2, int i3, long j, long j2, long j3, long j4, zzv zzvVar, int i4, zzakw[] zzakwVarArr, int i5, long[] jArr, long[] jArr2) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = zzvVar;
        this.zzh = i4;
        this.zzl = zzakwVarArr;
        this.zzk = i5;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final zzakw zza(int i2) {
        return this.zzl[i2];
    }

    public final zzakv zzb(zzv zzvVar) {
        return new zzakv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzvVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzh {
    private int zza;
    private int zzb;
    private int zzc;
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzh() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
        this.zze = -1;
        this.zzf = -1;
    }

    public final zzh zza(int i2) {
        this.zza = i2;
        return this;
    }

    public final zzh zzb(int i2) {
        this.zzb = i2;
        return this;
    }

    public final zzh zzc(int i2) {
        this.zzc = i2;
        return this;
    }

    public final zzh zzd(byte[] bArr) {
        this.zzd = bArr;
        return this;
    }

    public final zzh zze(int i2) {
        this.zze = i2;
        return this;
    }

    public final zzh zzf(int i2) {
        this.zzf = i2;
        return this;
    }

    public final zzi zzg() {
        return new zzi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }

    public /* synthetic */ zzh(zzi zziVar, byte[] bArr) {
        this.zza = zziVar.zzb;
        this.zzb = zziVar.zzc;
        this.zzc = zziVar.zzd;
        this.zzd = zziVar.zze;
        this.zze = zziVar.zzf;
        this.zzf = zziVar.zzg;
    }
}

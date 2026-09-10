package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzclb {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzclb(int i2, int i3, int i4) {
        this.zzc = i2;
        this.zzb = i3;
        this.zza = i4;
    }

    public static zzclb zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        if (zzrVar.zzd) {
            return new zzclb(3, 0, 0);
        }
        if (zzrVar.zzi) {
            return new zzclb(2, 0, 0);
        }
        return zzrVar.zzh ? new zzclb(0, 0, 0) : new zzclb(1, zzrVar.zzf, zzrVar.zzc);
    }

    public static zzclb zzb() {
        return new zzclb(0, 0, 0);
    }

    public static zzclb zzc(int i2, int i3) {
        return new zzclb(1, i2, i3);
    }

    public static zzclb zzd() {
        return new zzclb(4, 0, 0);
    }

    public static zzclb zze() {
        return new zzclb(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}

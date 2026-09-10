package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhe extends zzmf implements zznn {
    private static final zzhe zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzhe zzheVar = new zzhe();
        zzk = zzheVar;
        zzmf.zzcp(zzhe.class, zzheVar);
    }

    private zzhe() {
    }

    public static zzhd zzh() {
        return (zzhd) zzk.zzck();
    }

    public static zzhe zzi() {
        return zzk;
    }

    public final boolean zza() {
        return this.zzd;
    }

    public final boolean zzb() {
        return this.zze;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    public final boolean zzd() {
        return this.zzg;
    }

    public final boolean zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        return this.zzj;
    }

    public final /* synthetic */ void zzj(boolean z2) {
        this.zzb |= 1;
        this.zzd = z2;
    }

    public final /* synthetic */ void zzk(boolean z2) {
        this.zzb |= 2;
        this.zze = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzmf.zzcq(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new zzhe();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzhd(bArr);
        }
        if (i3 == 5) {
            return zzk;
        }
        throw null;
    }

    public final /* synthetic */ void zzm(boolean z2) {
        this.zzb |= 4;
        this.zzf = z2;
    }

    public final /* synthetic */ void zzn(boolean z2) {
        this.zzb |= 8;
        this.zzg = z2;
    }

    public final /* synthetic */ void zzo(boolean z2) {
        this.zzb |= 16;
        this.zzh = z2;
    }

    public final /* synthetic */ void zzp(boolean z2) {
        this.zzb |= 32;
        this.zzi = z2;
    }

    public final /* synthetic */ void zzq(boolean z2) {
        this.zzb |= 64;
        this.zzj = z2;
    }
}

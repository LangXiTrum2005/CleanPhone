package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqe extends zziar implements zzicd {
    private static final zzhqe zzj;
    private static volatile zzick zzk;
    private int zza;
    private int zzb;
    private zzhqg zzc;
    private zzhzl zzd;
    private zzhzl zze;
    private zzhzl zzf;
    private zzhzl zzg;
    private zzhzl zzh;
    private zzhzl zzi;

    static {
        zzhqe zzhqeVar = new zzhqe();
        zzj = zzhqeVar;
        zziar.zzbu(zzhqe.class, zzhqeVar);
    }

    private zzhqe() {
        zzhzl zzhzlVar = zzhzl.zzb;
        this.zzd = zzhzlVar;
        this.zze = zzhzlVar;
        this.zzf = zzhzlVar;
        this.zzg = zzhzlVar;
        this.zzh = zzhzlVar;
        this.zzi = zzhzlVar;
    }

    public static zzhqe zzj(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhqe) zziar.zzbT(zzj, zzhzlVar, zziabVar);
    }

    public static zzhqd zzk() {
        return (zzhqd) zzj.zzbn();
    }

    public static zzick zzl() {
        return zzj.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqg zzb() {
        zzhqg zzhqgVar = this.zzc;
        return zzhqgVar == null ? zzhqg.zzh() : zzhqgVar;
    }

    public final zzhzl zzc() {
        return this.zzd;
    }

    public final zzhzl zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzhqe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqd(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzk;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzhqe.class) {
            try {
                zziamVar = zzk;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzj);
                    zzk = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final zzhzl zze() {
        return this.zzf;
    }

    public final zzhzl zzg() {
        return this.zzg;
    }

    public final zzhzl zzh() {
        return this.zzh;
    }

    public final zzhzl zzi() {
        return this.zzi;
    }

    public final /* synthetic */ void zzm(int i2) {
        this.zzb = 0;
    }

    public final /* synthetic */ void zzn(zzhqg zzhqgVar) {
        zzhqgVar.getClass();
        this.zzc = zzhqgVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzo(zzhzl zzhzlVar) {
        this.zzd = zzhzlVar;
    }

    public final /* synthetic */ void zzp(zzhzl zzhzlVar) {
        this.zze = zzhzlVar;
    }

    public final /* synthetic */ void zzq(zzhzl zzhzlVar) {
        this.zzf = zzhzlVar;
    }

    public final /* synthetic */ void zzr(zzhzl zzhzlVar) {
        this.zzg = zzhzlVar;
    }

    public final /* synthetic */ void zzs(zzhzl zzhzlVar) {
        this.zzh = zzhzlVar;
    }

    public final /* synthetic */ void zzt(zzhzl zzhzlVar) {
        this.zzi = zzhzlVar;
    }
}

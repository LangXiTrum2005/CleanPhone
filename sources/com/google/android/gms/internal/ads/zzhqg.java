package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqg extends zziar implements zzicd {
    private static final zzhqg zzf;
    private static volatile zzick zzg;
    private int zza;
    private int zzb;
    private zzhqc zzc;
    private zzhzl zzd;
    private zzhzl zze;

    static {
        zzhqg zzhqgVar = new zzhqg();
        zzf = zzhqgVar;
        zziar.zzbu(zzhqg.class, zzhqgVar);
    }

    private zzhqg() {
        zzhzl zzhzlVar = zzhzl.zzb;
        this.zzd = zzhzlVar;
        this.zze = zzhzlVar;
    }

    public static zzhqg zze(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhqg) zziar.zzbT(zzf, zzhzlVar, zziabVar);
    }

    public static zzhqf zzg() {
        return (zzhqf) zzf.zzbn();
    }

    public static zzhqg zzh() {
        return zzf;
    }

    public static zzick zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqc zzb() {
        zzhqc zzhqcVar = this.zzc;
        return zzhqcVar == null ? zzhqc.zzc() : zzhqcVar;
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
            return zziar.zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhqg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqf(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzg;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzhqg.class) {
            try {
                zziamVar = zzg;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzf);
                    zzg = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final /* synthetic */ void zzj(zzhqc zzhqcVar) {
        zzhqcVar.getClass();
        this.zzc = zzhqcVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzk(zzhzl zzhzlVar) {
        this.zzd = zzhzlVar;
    }

    public final /* synthetic */ void zzl(zzhzl zzhzlVar) {
        this.zze = zzhzlVar;
    }
}

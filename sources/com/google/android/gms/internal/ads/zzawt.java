package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzawt extends zziar implements zzicd {
    private static final zzawt zzf;
    private static volatile zzick zzg;
    private int zza;
    private zzhzl zzb;
    private zzhzl zzc;
    private zzhzl zzd;
    private zzhzl zze;

    static {
        zzawt zzawtVar = new zzawt();
        zzf = zzawtVar;
        zziar.zzbu(zzawt.class, zzawtVar);
    }

    private zzawt() {
        zzhzl zzhzlVar = zzhzl.zzb;
        this.zzb = zzhzlVar;
        this.zzc = zzhzlVar;
        this.zzd = zzhzlVar;
        this.zze = zzhzlVar;
    }

    public static zzawt zze(byte[] bArr, zziab zziabVar) throws zzibg {
        return (zzawt) zziar.zzbV(zzf, bArr, zziabVar);
    }

    public static zzaws zzg() {
        return (zzaws) zzf.zzbn();
    }

    public final zzhzl zza() {
        return this.zzb;
    }

    public final zzhzl zzb() {
        return this.zzc;
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
            return zziar.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzawt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaws(bArr);
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
        synchronized (zzawt.class) {
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

    public final /* synthetic */ void zzh(zzhzl zzhzlVar) {
        this.zza |= 1;
        this.zzb = zzhzlVar;
    }

    public final /* synthetic */ void zzi(zzhzl zzhzlVar) {
        this.zza |= 2;
        this.zzc = zzhzlVar;
    }

    public final /* synthetic */ void zzj(zzhzl zzhzlVar) {
        this.zza |= 4;
        this.zzd = zzhzlVar;
    }

    public final /* synthetic */ void zzk(zzhzl zzhzlVar) {
        this.zza |= 8;
        this.zze = zzhzlVar;
    }
}

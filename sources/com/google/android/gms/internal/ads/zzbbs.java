package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbbs extends zziar implements zzicd {
    private static final zzbbs zze;
    private static volatile zzick zzf;
    private int zza;
    private zzbby zzb;
    private zzhzl zzc;
    private zzhzl zzd;

    static {
        zzbbs zzbbsVar = new zzbbs();
        zze = zzbbsVar;
        zziar.zzbu(zzbbs.class, zzbbsVar);
    }

    private zzbbs() {
        zzhzl zzhzlVar = zzhzl.zzb;
        this.zzc = zzhzlVar;
        this.zzd = zzhzlVar;
    }

    public static zzbbs zzd(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzbbs) zziar.zzbT(zze, zzhzlVar, zziabVar);
    }

    public static zzbbs zze(byte[] bArr, zziab zziabVar) throws zzibg {
        return (zzbbs) zziar.zzbV(zze, bArr, zziabVar);
    }

    public final zzbby zza() {
        zzbby zzbbyVar = this.zzb;
        return zzbbyVar == null ? zzbby.zzj() : zzbbyVar;
    }

    public final zzhzl zzb() {
        return this.zzc;
    }

    public final zzhzl zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzbbs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbbr(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzf;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzbbs.class) {
            try {
                zziamVar = zzf;
                if (zziamVar == null) {
                    zziamVar = new zziam(zze);
                    zzf = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}

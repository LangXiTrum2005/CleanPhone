package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbbw extends zziar implements zzicd {
    private static final zzbbw zzf;
    private static volatile zzick zzg;
    private int zza;
    private zzbca zzb;
    private zzhzl zzc = zzhzl.zzb;
    private long zzd;
    private long zze;

    static {
        zzbbw zzbbwVar = new zzbbw();
        zzf = zzbbwVar;
        zziar.zzbu(zzbbw.class, zzbbwVar);
    }

    private zzbbw() {
    }

    public static zzbbw zzd() {
        return zzf;
    }

    public final zzbca zza() {
        zzbca zzbcaVar = this.zzb;
        return zzbcaVar == null ? zzbca.zzc() : zzbcaVar;
    }

    public final zzhzl zzb() {
        return this.zzc;
    }

    public final long zzc() {
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
            return zziar.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzbbw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbbv(bArr);
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
        synchronized (zzbbw.class) {
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
}

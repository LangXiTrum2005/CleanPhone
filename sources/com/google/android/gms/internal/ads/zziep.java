package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zziep extends zziar implements zzicd {
    private static final zziep zze;
    private static volatile zzick zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private zzhzl zzd = zzhzl.zzb;

    static {
        zziep zziepVar = new zziep();
        zze = zziepVar;
        zziar.zzbu(zziep.class, zziepVar);
    }

    private zziep() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", zzieo.zza, "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zziep();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzien(bArr);
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
        synchronized (zziep.class) {
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

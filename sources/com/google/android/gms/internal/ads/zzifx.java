package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzifx extends zziar implements zzicd {
    private static final zzifx zzf;
    private static volatile zzick zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzifx zzifxVar = new zzifx();
        zzf = zzifxVar;
        zziar.zzbu(zzifx.class, zzifxVar);
    }

    private zzifx() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", zzifw.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzifx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzifv(bArr);
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
        synchronized (zzifx.class) {
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

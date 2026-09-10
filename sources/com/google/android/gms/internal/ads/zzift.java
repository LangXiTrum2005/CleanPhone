package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzift extends zziar implements zzicd {
    private static final zzift zze;
    private static volatile zzick zzf;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzd;

    static {
        zzift zziftVar = new zzift();
        zze = zziftVar;
        zziar.zzbu(zzift.class, zziftVar);
    }

    private zzift() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zziax zziaxVar = zzifr.zza;
            return zziar.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", zziaxVar, "zzc", "zzd", zziaxVar});
        }
        if (iOrdinal == 3) {
            return new zzift();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzifs(bArr);
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
        synchronized (zzift.class) {
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

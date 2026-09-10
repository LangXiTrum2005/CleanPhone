package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zziff extends zziar implements zzicd {
    private static final zziff zzf;
    private static volatile zzick zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    static {
        zziff zziffVar = new zziff();
        zzf = zziffVar;
        zziar.zzbu(zziff.class, zziffVar);
    }

    private zziff() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", zzife.zza, "zzc", zzifc.zza, "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zziff();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzifd(bArr);
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
        synchronized (zziff.class) {
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

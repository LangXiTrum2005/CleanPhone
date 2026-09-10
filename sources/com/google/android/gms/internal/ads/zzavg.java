package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzavg extends zziar implements zzicd {
    private static final zzavg zzc;
    private static volatile zzick zzd;
    private int zza;
    private int zzb = 2;

    static {
        zzavg zzavgVar = new zzavg();
        zzc = zzavgVar;
        zziar.zzbu(zzavg.class, zzavgVar);
    }

    private zzavg() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzc, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zza", "zzb", zzavh.zza});
        }
        if (iOrdinal == 3) {
            return new zzavg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavf(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzd;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzavg.class) {
            try {
                zziamVar = zzd;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzc);
                    zzd = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}

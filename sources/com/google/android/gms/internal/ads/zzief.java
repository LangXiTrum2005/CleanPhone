package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzief extends zziar implements zzicd {
    private static final zzief zzc;
    private static volatile zzick zzd;
    private zziaz zza = zziar.zzbC();
    private zziaz zzb = zziar.zzbC();

    static {
        zzief zziefVar = new zzief();
        zzc = zziefVar;
        zziar.zzbu(zzief.class, zziefVar);
    }

    private zzief() {
    }

    public static zzief zzc(byte[] bArr, zziab zziabVar) throws zzibg {
        return (zzief) zziar.zzbV(zzc, bArr, zziabVar);
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzief();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziee(bArr);
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
        synchronized (zzief.class) {
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

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfoh extends zziar implements zzicd {
    private static final zzfoh zzb;
    private static volatile zzick zzc;
    private boolean zza;

    static {
        zzfoh zzfohVar = new zzfoh();
        zzb = zzfohVar;
        zziar.zzbu(zzfoh.class, zzfohVar);
    }

    private zzfoh() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzfoh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfog(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzc;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzfoh.class) {
            try {
                zziamVar = zzc;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzb);
                    zzc = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}

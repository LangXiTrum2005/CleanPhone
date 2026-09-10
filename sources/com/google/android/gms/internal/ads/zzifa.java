package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzifa extends zziar implements zzicd {
    private static final zzifa zzc;
    private static volatile zzick zzd;
    private int zza;
    private zzhzl zzb = zzhzl.zzb;

    static {
        zzifa zzifaVar = new zzifa();
        zzc = zzifaVar;
        zziar.zzbu(zzifa.class, zzifaVar);
    }

    private zzifa() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzifa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziez(bArr);
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
        synchronized (zzifa.class) {
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

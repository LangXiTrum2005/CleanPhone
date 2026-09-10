package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhoa extends zziar implements zzicd {
    private static final zzhoa zza;
    private static volatile zzick zzb;

    static {
        zzhoa zzhoaVar = new zzhoa();
        zza = zzhoaVar;
        zziar.zzbu(zzhoa.class, zzhoaVar);
    }

    private zzhoa() {
    }

    public static zzhoa zza(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhoa) zziar.zzbT(zza, zzhzlVar, zziabVar);
    }

    public static zzhoa zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (iOrdinal == 2) {
            return zziar.zzbv(zza, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new zzhoa();
        }
        if (iOrdinal == 4) {
            return new zzhnz(bArr);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzb;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzhoa.class) {
            try {
                zziamVar = zzb;
                if (zziamVar == null) {
                    zziamVar = new zziam(zza);
                    zzb = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}

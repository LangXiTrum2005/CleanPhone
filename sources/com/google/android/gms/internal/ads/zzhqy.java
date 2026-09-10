package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqy extends zziar implements zzicd {
    private static final zzhqy zzb;
    private static volatile zzick zzc;
    private int zza;

    static {
        zzhqy zzhqyVar = new zzhqy();
        zzb = zzhqyVar;
        zziar.zzbu(zzhqy.class, zzhqyVar);
    }

    private zzhqy() {
    }

    public static zzhqy zzb(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhqy) zziar.zzbT(zzb, zzhzlVar, zziabVar);
    }

    public static zzhqy zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhqy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqx(bArr);
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
        synchronized (zzhqy.class) {
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

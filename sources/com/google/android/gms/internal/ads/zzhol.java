package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhol extends zziar implements zzicd {
    private static final zzhol zzb;
    private static volatile zzick zzc;
    private int zza;

    static {
        zzhol zzholVar = new zzhol();
        zzb = zzholVar;
        zziar.zzbu(zzhol.class, zzholVar);
    }

    private zzhol() {
    }

    public static zzhol zzb(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhol) zziar.zzbT(zzb, zzhzlVar, zziabVar);
    }

    public static zzhol zzc() {
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
            return new zzhol();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhok(bArr);
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
        synchronized (zzhol.class) {
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

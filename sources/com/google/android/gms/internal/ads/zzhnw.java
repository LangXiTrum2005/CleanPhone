package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhnw extends zziar implements zzicd {
    private static final zzhnw zzc;
    private static volatile zzick zzd;
    private int zza;
    private int zzb;

    static {
        zzhnw zzhnwVar = new zzhnw();
        zzc = zzhnwVar;
        zziar.zzbu(zzhnw.class, zzhnwVar);
    }

    private zzhnw() {
    }

    public static zzhnw zzc(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhnw) zziar.zzbT(zzc, zzhzlVar, zziabVar);
    }

    public static zzhnv zzd() {
        return (zzhnv) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (iOrdinal == 3) {
            return new zzhnw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhnv(bArr);
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
        synchronized (zzhnw.class) {
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

    public final /* synthetic */ void zze(int i2) {
        this.zza = i2;
    }
}

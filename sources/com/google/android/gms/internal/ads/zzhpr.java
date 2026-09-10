package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpr extends zziar implements zzicd {
    private static final zzhpr zzb;
    private static volatile zzick zzc;
    private String zza = "";

    static {
        zzhpr zzhprVar = new zzhpr();
        zzb = zzhprVar;
        zziar.zzbu(zzhpr.class, zzhprVar);
    }

    private zzhpr() {
    }

    public static zzhpr zzb(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhpr) zziar.zzbT(zzb, zzhzlVar, zziabVar);
    }

    public static zzhpq zzc() {
        return (zzhpq) zzb.zzbn();
    }

    public static zzhpr zzd() {
        return zzb;
    }

    public final String zza() {
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
            return zziar.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhpr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpq(bArr);
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
        synchronized (zzhpr.class) {
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

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzavj extends zziar implements zzicd {
    private static final zzavj zzh;
    private static volatile zzick zzi;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzavj zzavjVar = new zzavj();
        zzh = zzavjVar;
        zziar.zzbu(zzavj.class, zzavjVar);
    }

    private zzavj() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzavj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavi(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzi;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzavj.class) {
            try {
                zziamVar = zzi;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzh);
                    zzi = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zziie extends zziar implements zzicd {
    private static final zziie zzj;
    private static volatile zzick zzk;
    private int zza;
    private zzihn zzh;
    private String zzb = "";
    private String zzc = "";
    private zzibd zzd = zziar.zzbM();
    private zzibd zze = zziar.zzbM();
    private zzibd zzf = zziar.zzbM();
    private int zzg = -1;
    private String zzi = "";

    static {
        zziie zziieVar = new zziie();
        zzj = zziieVar;
        zziar.zzbu(zziie.class, zziieVar);
    }

    private zziie() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", zzihr.class, "zze", zzihy.class, "zzg", "zzb", "zzf", zziil.class, "zzi", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zziie();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziid(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzk;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zziie.class) {
            try {
                zziamVar = zzk;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzj);
                    zzk = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}

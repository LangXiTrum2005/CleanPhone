package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zziil extends zziar implements zzicd {
    private static final zziil zzd;
    private static volatile zzick zze;
    private int zza;
    private String zzb = "";
    private zzibd zzc = zziar.zzbM();

    static {
        zziil zziilVar = new zziil();
        zzd = zziilVar;
        zziar.zzbu(zziil.class, zziilVar);
    }

    private zziil() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zza", "zzb", "zzc", zziij.class});
        }
        if (iOrdinal == 3) {
            return new zziil();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziik(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zze;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zziil.class) {
            try {
                zziamVar = zze;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzd);
                    zze = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}

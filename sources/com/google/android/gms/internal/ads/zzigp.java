package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzigp extends zziar implements zzicd {
    private static final zzigp zzf;
    private static volatile zzick zzg;
    private int zza;
    private String zzb = "";
    private zzibd zzc = zziar.zzbM();
    private zzibd zzd = zziar.zzbM();
    private String zze = "";

    static {
        zzigp zzigpVar = new zzigp();
        zzf = zzigpVar;
        zziar.zzbu(zzigp.class, zzigpVar);
    }

    private zzigp() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzigp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzigo(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzg;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzigp.class) {
            try {
                zziamVar = zzg;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzf);
                    zzg = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}

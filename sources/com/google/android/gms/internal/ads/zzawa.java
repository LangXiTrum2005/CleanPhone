package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzawa extends zziar implements zzicd {
    private static final zzawa zze;
    private static volatile zzick zzf;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;
    private int zzd = 1000;

    static {
        zzawa zzawaVar = new zzawa();
        zze = zzawaVar;
        zziar.zzbu(zzawa.class, zzawaVar);
    }

    private zzawa() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zziax zziaxVar = zzawx.zza;
            return zziar.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", "zzc", zziaxVar, "zzd", zziaxVar});
        }
        if (iOrdinal == 3) {
            return new zzawa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavz(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzf;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzawa.class) {
            try {
                zziamVar = zzf;
                if (zziamVar == null) {
                    zziamVar = new zziam(zze);
                    zzf = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}

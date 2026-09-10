package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzihj extends zziar implements zzicd {
    private static final zzihj zzp;
    private static volatile zzick zzu;
    private int zza;
    private boolean zzh;
    private double zzi;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private zzibd zze = zziar.zzbM();
    private String zzf = "";
    private String zzg = "";
    private zzibd zzj = zziar.zzbM();

    static {
        zzihj zzihjVar = new zzihj();
        zzp = zzihjVar;
        zziar.zzbu(zzihj.class, zzihjVar);
    }

    private zzihj() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", zzihi.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzihh.class, "zzc", "zzk", zzihf.zza, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iOrdinal == 3) {
            return new zzihj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzihe(bArr);
        }
        if (iOrdinal == 5) {
            return zzp;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzu;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzihj.class) {
            try {
                zziamVar = zzu;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzp);
                    zzu = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zziic extends zziar implements zzicd {
    private static final zziic zzl;
    private static volatile zzick zzm;
    private int zza;
    private long zzd;
    private zziie zzi;
    private zziig zzj;
    private zzhxg zzk;
    private zzhzl zzb = zzhzl.zzb;
    private zziaz zzc = zziar.zzbC();
    private zziaz zze = zziar.zzbC();
    private zzibd zzf = zziar.zzbM();
    private String zzg = "";
    private zzibd zzh = zziar.zzbM();

    static {
        zziic zziicVar = new zziic();
        zzl = zziicVar;
        zziar.zzbu(zziic.class, zziicVar);
    }

    private zziic() {
    }

    public static zziic zzc(byte[] bArr, zziab zziabVar) throws zzibg {
        return (zziic) zziar.zzbV(zzl, bArr, zziabVar);
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", zzihr.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zziic();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziib(bArr);
        }
        if (iOrdinal == 5) {
            return zzl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzm;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zziic.class) {
            try {
                zziamVar = zzm;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzl);
                    zzm = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbbm extends zziar implements zzicd {
    private static final zzbbm zzh;
    private static volatile zzick zzi;
    private int zza;
    private long zzc;
    private long zzf;
    private zzhzl zzb = zzhzl.zzb;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        zzbbm zzbbmVar = new zzbbm();
        zzh = zzbbmVar;
        zziar.zzbu(zzbbm.class, zzbbmVar);
    }

    private zzbbm() {
    }

    public static zzbbl zza() {
        return (zzbbl) zzh.zzbn();
    }

    public final /* synthetic */ void zzb(zzhzl zzhzlVar) {
        this.zza |= 1;
        this.zzb = zzhzlVar;
    }

    public final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzbbm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbbl(bArr);
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
        synchronized (zzbbm.class) {
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

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void zzg(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }
}

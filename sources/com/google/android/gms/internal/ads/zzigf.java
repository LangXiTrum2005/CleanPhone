package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzigf extends zziar implements zzicd {
    private static final zzigf zzf;
    private static volatile zzick zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzhzl zzd;
    private zzhzl zze;

    static {
        zzigf zzigfVar = new zzigf();
        zzf = zzigfVar;
        zziar.zzbu(zzigf.class, zzigfVar);
    }

    private zzigf() {
        zzhzl zzhzlVar = zzhzl.zzb;
        this.zzd = zzhzlVar;
        this.zze = zzhzlVar;
    }

    public static zzigd zzc() {
        return (zzigd) zzf.zzbn();
    }

    public final /* synthetic */ void zzd(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", zzige.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzigf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzigd(bArr);
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
        synchronized (zzigf.class) {
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

    public final /* synthetic */ void zze(zzhzl zzhzlVar) {
        zzhzlVar.getClass();
        this.zza |= 4;
        this.zzd = zzhzlVar;
    }

    public final /* synthetic */ void zzh(int i2) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}

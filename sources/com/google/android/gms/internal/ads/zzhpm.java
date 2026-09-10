package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpm extends zziar implements zzicd {
    private static final zzhpm zze;
    private static volatile zzick zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        zzhpm zzhpmVar = new zzhpm();
        zze = zzhpmVar;
        zziar.zzbu(zzhpm.class, zzhpmVar);
    }

    private zzhpm() {
    }

    public static zzhpl zza() {
        return (zzhpl) zze.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzc(int i2) {
        this.zzc = i2;
    }

    public final /* synthetic */ void zzd(zzhpw zzhpwVar) {
        this.zzd = zzhpwVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhpm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpl(bArr);
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
        synchronized (zzhpm.class) {
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

    public final /* synthetic */ void zzg(int i2) {
        this.zzb = zzhpb.zza(i2);
    }
}

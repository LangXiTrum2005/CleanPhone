package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpd extends zziar implements zzicd {
    private static final zzhpd zzd;
    private static volatile zzick zze;
    private String zza = "";
    private zzhzl zzb = zzhzl.zzb;
    private int zzc;

    static {
        zzhpd zzhpdVar = new zzhpd();
        zzd = zzhpdVar;
        zziar.zzbu(zzhpd.class, zzhpdVar);
    }

    private zzhpd() {
    }

    public static zzhpd zzd(byte[] bArr, zziab zziabVar) throws zzibg {
        return (zzhpd) zziar.zzbV(zzd, bArr, zziabVar);
    }

    public static zzhpc zze() {
        return (zzhpc) zzd.zzbn();
    }

    public static zzhpc zzg(zzhpd zzhpdVar) {
        return (zzhpc) zzd.zzbo(zzhpdVar);
    }

    public static zzhpd zzh() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzhzl zzb() {
        return this.zzb;
    }

    public final zzhpw zzc() {
        zzhpw zzhpwVarZzb = zzhpw.zzb(this.zzc);
        return zzhpwVarZzb == null ? zzhpw.UNRECOGNIZED : zzhpwVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhpd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpc(bArr);
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
        synchronized (zzhpd.class) {
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

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzj(zzhzl zzhzlVar) {
        zzhzlVar.getClass();
        this.zzb = zzhzlVar;
    }

    public final /* synthetic */ void zzk(zzhpw zzhpwVar) {
        this.zzc = zzhpwVar.zza();
    }
}

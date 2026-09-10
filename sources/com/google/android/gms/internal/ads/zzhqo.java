package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqo extends zziar implements zzicd {
    private static final zzhqo zzf;
    private static volatile zzick zzg;
    private int zza;
    private int zzb;
    private zzhqk zzc;
    private zzhzl zzd;
    private zzhzl zze;

    static {
        zzhqo zzhqoVar = new zzhqo();
        zzf = zzhqoVar;
        zziar.zzbu(zzhqo.class, zzhqoVar);
    }

    private zzhqo() {
        zzhzl zzhzlVar = zzhzl.zzb;
        this.zzd = zzhzlVar;
        this.zze = zzhzlVar;
    }

    public static zzhqo zze(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhqo) zziar.zzbT(zzf, zzhzlVar, zziabVar);
    }

    public static zzhqn zzg() {
        return (zzhqn) zzf.zzbn();
    }

    public static zzhqo zzh() {
        return zzf;
    }

    public static zzick zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqk zzb() {
        zzhqk zzhqkVar = this.zzc;
        return zzhqkVar == null ? zzhqk.zze() : zzhqkVar;
    }

    public final zzhzl zzc() {
        return this.zzd;
    }

    public final zzhzl zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhqo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqn(bArr);
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
        synchronized (zzhqo.class) {
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

    public final /* synthetic */ void zzj(int i2) {
        this.zzb = 0;
    }

    public final /* synthetic */ void zzk(zzhqk zzhqkVar) {
        zzhqkVar.getClass();
        this.zzc = zzhqkVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzl(zzhzl zzhzlVar) {
        this.zzd = zzhzlVar;
    }

    public final /* synthetic */ void zzm(zzhzl zzhzlVar) {
        this.zze = zzhzlVar;
    }
}

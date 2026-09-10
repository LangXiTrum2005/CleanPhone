package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqa extends zziar implements zzicd {
    private static final zzhqa zze;
    private static volatile zzick zzf;
    private int zza;
    private zzhqc zzb;
    private int zzc;
    private zzhzl zzd = zzhzl.zzb;

    static {
        zzhqa zzhqaVar = new zzhqa();
        zze = zzhqaVar;
        zziar.zzbu(zzhqa.class, zzhqaVar);
    }

    private zzhqa() {
    }

    public static zzhqa zzd(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhqa) zziar.zzbT(zze, zzhzlVar, zziabVar);
    }

    public static zzhpz zze() {
        return (zzhpz) zze.zzbn();
    }

    public final zzhqc zza() {
        zzhqc zzhqcVar = this.zzb;
        return zzhqcVar == null ? zzhqc.zzc() : zzhqcVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final zzhzl zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhqa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpz(bArr);
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
        synchronized (zzhqa.class) {
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

    public final /* synthetic */ void zzg(zzhqc zzhqcVar) {
        zzhqcVar.getClass();
        this.zzb = zzhqcVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(int i2) {
        this.zzc = i2;
    }

    public final /* synthetic */ void zzi(zzhzl zzhzlVar) {
        this.zzd = zzhzlVar;
    }
}

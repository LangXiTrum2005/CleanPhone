package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgcq extends zziar implements zzicd {
    private static final zzgcq zzf;
    private static volatile zzick zzg;
    private int zza;
    private zzgcs zzb;
    private zzhzl zzc;
    private zzhzl zzd;
    private int zze;

    static {
        zzgcq zzgcqVar = new zzgcq();
        zzf = zzgcqVar;
        zziar.zzbu(zzgcq.class, zzgcqVar);
    }

    private zzgcq() {
        zzhzl zzhzlVar = zzhzl.zzb;
        this.zzc = zzhzlVar;
        this.zzd = zzhzlVar;
    }

    public static zzgcp zzd() {
        return (zzgcp) zzf.zzbn();
    }

    public final zzgcs zza() {
        zzgcs zzgcsVar = this.zzb;
        return zzgcsVar == null ? zzgcs.zzg() : zzgcsVar;
    }

    public final zzhzl zzb() {
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
            return zziar.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzgdg.zza});
        }
        if (iOrdinal == 3) {
            return new zzgcq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgcp(bArr);
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
        synchronized (zzgcq.class) {
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

    public final /* synthetic */ void zze(zzgcs zzgcsVar) {
        zzgcsVar.getClass();
        this.zzb = zzgcsVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(zzhzl zzhzlVar) {
        zzhzlVar.getClass();
        this.zza |= 2;
        this.zzc = zzhzlVar;
    }

    public final /* synthetic */ void zzh(zzhzl zzhzlVar) {
        zzhzlVar.getClass();
        this.zza |= 4;
        this.zzd = zzhzlVar;
    }

    public final int zzj() {
        int iZza = zzgdh.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final /* synthetic */ void zzk(int i2) {
        this.zze = i2 - 1;
        this.zza |= 8;
    }
}

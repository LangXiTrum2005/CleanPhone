package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhnc extends zziar implements zzicd {
    private static final zzhnc zzd;
    private static volatile zzick zze;
    private int zza;
    private zzhng zzb;
    private zzhov zzc;

    static {
        zzhnc zzhncVar = new zzhnc();
        zzd = zzhncVar;
        zziar.zzbu(zzhnc.class, zzhncVar);
    }

    private zzhnc() {
    }

    public static zzhnc zzc(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhnc) zziar.zzbT(zzd, zzhzlVar, zziabVar);
    }

    public static zzhnb zzd() {
        return (zzhnb) zzd.zzbn();
    }

    public final zzhng zza() {
        zzhng zzhngVar = this.zzb;
        return zzhngVar == null ? zzhng.zzd() : zzhngVar;
    }

    public final zzhov zzb() {
        zzhov zzhovVar = this.zzc;
        return zzhovVar == null ? zzhov.zzg() : zzhovVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhnc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhnb(bArr);
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
        synchronized (zzhnc.class) {
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

    public final /* synthetic */ void zze(zzhng zzhngVar) {
        zzhngVar.getClass();
        this.zzb = zzhngVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(zzhov zzhovVar) {
        zzhovVar.getClass();
        this.zzc = zzhovVar;
        this.zza |= 2;
    }
}

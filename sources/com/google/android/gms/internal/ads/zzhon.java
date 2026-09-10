package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhon extends zziar implements zzicd {
    private static final zzhon zze;
    private static volatile zzick zzf;
    private int zza;
    private int zzb;
    private zzhzl zzc = zzhzl.zzb;
    private zzhop zzd;

    static {
        zzhon zzhonVar = new zzhon();
        zze = zzhonVar;
        zziar.zzbu(zzhon.class, zzhonVar);
    }

    private zzhon() {
    }

    public static zzhon zzd(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhon) zziar.zzbT(zze, zzhzlVar, zziabVar);
    }

    public static zzhom zze() {
        return (zzhom) zze.zzbn();
    }

    public static zzick zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhzl zzb() {
        return this.zzc;
    }

    public final zzhop zzc() {
        zzhop zzhopVar = this.zzd;
        return zzhopVar == null ? zzhop.zze() : zzhopVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhon();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhom(bArr);
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
        synchronized (zzhon.class) {
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

    public final /* synthetic */ void zzh(zzhzl zzhzlVar) {
        this.zzc = zzhzlVar;
    }

    public final /* synthetic */ void zzi(zzhop zzhopVar) {
        zzhopVar.getClass();
        this.zzd = zzhopVar;
        this.zza |= 1;
    }
}

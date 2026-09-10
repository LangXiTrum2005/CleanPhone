package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgcs extends zziar implements zzicd {
    private static final zzgcs zze;
    private static volatile zzick zzf;
    private int zza;
    private int zzb = 0;
    private Object zzc;
    private int zzd;

    static {
        zzgcs zzgcsVar = new zzgcs();
        zze = zzgcsVar;
        zziar.zzbu(zzgcs.class, zzgcsVar);
    }

    private zzgcs() {
    }

    public static zzgcs zzd(zzhzl zzhzlVar) throws zzibg {
        return (zzgcs) zziar.zzbS(zze, zzhzlVar);
    }

    public static zzgcr zze() {
        return (zzgcr) zze.zzbn();
    }

    public static zzgcs zzg() {
        return zze;
    }

    public final zzbby zza() {
        return this.zzb == 1 ? (zzbby) this.zzc : zzbby.zzj();
    }

    public final zzbbw zzb() {
        return this.zzb == 2 ? (zzbbw) this.zzc : zzbbw.zzd();
    }

    public final zzbbq zzc() {
        zzbbq zzbbqVarZzb = zzbbq.zzb(this.zzd);
        return zzbbqVarZzb == null ? zzbbq.UNSUPPORTED : zzbbqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zze, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"zzc", "zzb", "zza", zzbby.class, zzbbw.class, "zzd", zzbbq.zzc()});
        }
        if (iOrdinal == 3) {
            return new zzgcs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgcr(bArr);
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
        synchronized (zzgcs.class) {
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

    public final /* synthetic */ void zzh(zzbby zzbbyVar) {
        zzbbyVar.getClass();
        this.zzc = zzbbyVar;
        this.zzb = 1;
    }

    public final /* synthetic */ void zzi(zzbbw zzbbwVar) {
        zzbbwVar.getClass();
        this.zzc = zzbbwVar;
        this.zzb = 2;
    }

    public final /* synthetic */ void zzj(zzbbq zzbbqVar) {
        this.zzd = zzbbqVar.zza();
        this.zza |= 1;
    }
}

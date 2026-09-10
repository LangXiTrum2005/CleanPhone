package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhmw extends zziar implements zzicd {
    private static final zzhmw zzd;
    private static volatile zzick zze;
    private int zza;
    private int zzb;
    private zzhmy zzc;

    static {
        zzhmw zzhmwVar = new zzhmw();
        zzd = zzhmwVar;
        zziar.zzbu(zzhmw.class, zzhmwVar);
    }

    private zzhmw() {
    }

    public static zzhmw zzc(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhmw) zziar.zzbT(zzd, zzhzlVar, zziabVar);
    }

    public static zzhmv zzd() {
        return (zzhmv) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhmy zzb() {
        zzhmy zzhmyVar = this.zzc;
        return zzhmyVar == null ? zzhmy.zzc() : zzhmyVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhmw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhmv(bArr);
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
        synchronized (zzhmw.class) {
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

    public final /* synthetic */ void zze(int i2) {
        this.zzb = i2;
    }

    public final /* synthetic */ void zzg(zzhmy zzhmyVar) {
        zzhmyVar.getClass();
        this.zzc = zzhmyVar;
        this.zza |= 1;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhnm extends zziar implements zzicd {
    private static final zzhnm zzd;
    private static volatile zzick zze;
    private int zza;
    private zzhno zzb;
    private int zzc;

    static {
        zzhnm zzhnmVar = new zzhnm();
        zzd = zzhnmVar;
        zziar.zzbu(zzhnm.class, zzhnmVar);
    }

    private zzhnm() {
    }

    public static zzhnm zzc(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhnm) zziar.zzbT(zzd, zzhzlVar, zziabVar);
    }

    public static zzhnl zzd() {
        return (zzhnl) zzd.zzbn();
    }

    public final zzhno zza() {
        zzhno zzhnoVar = this.zzb;
        return zzhnoVar == null ? zzhno.zzc() : zzhnoVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhnm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhnl(bArr);
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
        synchronized (zzhnm.class) {
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

    public final /* synthetic */ void zze(zzhno zzhnoVar) {
        zzhnoVar.getClass();
        this.zzb = zzhnoVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(int i2) {
        this.zzc = i2;
    }
}

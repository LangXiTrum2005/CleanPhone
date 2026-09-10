package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxg extends zziar implements zzicd {
    private static final zzaxg zzf;
    private static volatile zzick zzg;
    private int zza;
    private zzibd zzb = zziar.zzbM();
    private zzhzl zzc = zzhzl.zzb;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzaxg zzaxgVar = new zzaxg();
        zzf = zzaxgVar;
        zziar.zzbu(zzaxg.class, zzaxgVar);
    }

    private zzaxg() {
    }

    public static zzaxf zza() {
        return (zzaxf) zzf.zzbn();
    }

    public final /* synthetic */ void zzb(zzhzl zzhzlVar) {
        zzibd zzibdVar = this.zzb;
        if (!zzibdVar.zza()) {
            this.zzb = zziar.zzbN(zzibdVar);
        }
        this.zzb.add(zzhzlVar);
    }

    public final /* synthetic */ void zzc(zzhzl zzhzlVar) {
        this.zza |= 1;
        this.zzc = zzhzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", zzaxa.zza, "zze", zzaww.zza});
        }
        if (iOrdinal == 3) {
            return new zzaxg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxf(bArr);
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
        synchronized (zzaxg.class) {
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

    public final /* synthetic */ void zze(int i2) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void zzg(int i2) {
        this.zze = i2 - 1;
        this.zza |= 4;
    }
}

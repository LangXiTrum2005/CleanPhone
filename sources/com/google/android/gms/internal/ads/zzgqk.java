package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgqk extends zzgxr implements zzgzd {
    private static final zzgqk zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgqq zze;
    private zzgsb zzf;

    static {
        zzgqk zzgqkVar = new zzgqk();
        zza = zzgqkVar;
        zzgxr.zzbZ(zzgqk.class, zzgqkVar);
    }

    private zzgqk() {
    }

    public static zzgqi zzb() {
        return (zzgqi) zza.zzaZ();
    }

    public static zzgqk zzd(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgqk) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static zzgzk zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzi(zzgqk zzgqkVar, zzgqq zzgqqVar) {
        zzgqqVar.getClass();
        zzgqkVar.zze = zzgqqVar;
        zzgqkVar.zzc |= 1;
    }

    public static /* synthetic */ void zzj(zzgqk zzgqkVar, zzgsb zzgsbVar) {
        zzgsbVar.getClass();
        zzgqkVar.zzf = zzgsbVar;
        zzgqkVar.zzc |= 2;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzgqk();
        }
        zzgqj zzgqjVar = null;
        if (iOrdinal == 4) {
            return new zzgqi(zzgqjVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgqk.class) {
                try {
                    zzgxmVar = zzb;
                    if (zzgxmVar == null) {
                        zzgxmVar = new zzgxm(zza);
                        zzb = zzgxmVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzgxmVar;
    }

    public final zzgqq zzf() {
        zzgqq zzgqqVar = this.zze;
        return zzgqqVar == null ? zzgqq.zzd() : zzgqqVar;
    }

    public final zzgsb zzg() {
        zzgsb zzgsbVar = this.zzf;
        return zzgsbVar == null ? zzgsb.zzd() : zzgsbVar;
    }
}

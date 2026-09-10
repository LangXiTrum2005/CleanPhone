package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzauu extends zziar implements zzicd {
    private static final zzauu zzj;
    private static volatile zzick zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzavl zzg;
    private zzavr zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        zzauu zzauuVar = new zzauu();
        zzj = zzauuVar;
        zziar.zzbu(zzauu.class, zzauuVar);
    }

    private zzauu() {
    }

    public static zzaut zze() {
        return (zzaut) zzj.zzbn();
    }

    public final String zza() {
        return this.zzd;
    }

    @Deprecated
    public final boolean zzb() {
        return this.zze;
    }

    public final zzavl zzc() {
        zzavl zzavlVar = this.zzg;
        return zzavlVar == null ? zzavl.zzg() : zzavlVar;
    }

    public final zzavr zzd() {
        zzavr zzavrVar = this.zzh;
        return zzavrVar == null ? zzavr.zza() : zzavrVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", zzaux.zza, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzauu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaut(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzk;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzauu.class) {
            try {
                zziamVar = zzk;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzj);
                    zzk = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void zzh(boolean z2) {
        this.zza |= 8;
        this.zze = z2;
    }
}

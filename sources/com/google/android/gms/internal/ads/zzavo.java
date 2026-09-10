package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzavo extends zziar implements zzicd {
    private static final zzavo zzi;
    private static volatile zzick zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzavo zzavoVar = new zzavo();
        zzi = zzavoVar;
        zziar.zzbu(zzavo.class, zzavoVar);
    }

    private zzavo() {
    }

    public static zzavn zza() {
        return (zzavn) zzi.zzbn();
    }

    public final /* synthetic */ void zzb(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", zzavp.zza, "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzavo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavn(bArr);
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzj;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzavo.class) {
            try {
                zziamVar = zzj;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzi);
                    zzj = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void zzg(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    public final /* synthetic */ void zzh(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void zzj(int i2) {
        this.zzd = i2 - 1;
        this.zza |= 4;
    }
}

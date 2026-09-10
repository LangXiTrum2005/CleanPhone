package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgci extends zziar implements zzicd {
    private static final zzgci zzc;
    private static volatile zzick zzd;
    private int zza;
    private zzauw zzb;

    static {
        zzgci zzgciVar = new zzgci();
        zzc = zzgciVar;
        zziar.zzbu(zzgci.class, zzgciVar);
    }

    private zzgci() {
    }

    public static zzgch zza() {
        return (zzgch) zzc.zzbn();
    }

    public final /* synthetic */ void zzb(zzauw zzauwVar) {
        zzauwVar.getClass();
        this.zzb = zzauwVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzgci();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgch(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzd;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzgci.class) {
            try {
                zziamVar = zzd;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzc);
                    zzd = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}

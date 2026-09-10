package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zziel extends zziar implements zzicd {
    private static final zziel zzb;
    private static volatile zzick zzc;
    private zzibd zza = zziar.zzbM();

    static {
        zziel zzielVar = new zziel();
        zzb = zzielVar;
        zziar.zzbu(zziel.class, zzielVar);
    }

    private zziel() {
    }

    public static zziek zzc() {
        return (zziek) zzb.zzbn();
    }

    public final /* synthetic */ void zzd(zziej zziejVar) {
        zziejVar.getClass();
        zzibd zzibdVar = this.zza;
        if (!zzibdVar.zza()) {
            this.zza = zziar.zzbN(zzibdVar);
        }
        this.zza.add(zziejVar);
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zziej.class});
        }
        if (iOrdinal == 3) {
            return new zziel();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziek(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzc;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zziel.class) {
            try {
                zziamVar = zzc;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzb);
                    zzc = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfoj extends zziar implements zzicd {
    private static final zzfoj zzc;
    private static volatile zzick zzd;
    private zzibd zza = zziar.zzbM();
    private long zzb;

    static {
        zzfoj zzfojVar = new zzfoj();
        zzc = zzfojVar;
        zziar.zzbu(zzfoj.class, zzfojVar);
    }

    private zzfoj() {
    }

    public static zzfoi zza() {
        return (zzfoi) zzc.zzbn();
    }

    public final /* synthetic */ void zzb(zzfnd zzfndVar) {
        zzfndVar.getClass();
        zzibd zzibdVar = this.zza;
        if (!zzibdVar.zza()) {
            this.zza = zziar.zzbN(zzibdVar);
        }
        this.zza.add(zzfndVar);
    }

    public final /* synthetic */ void zzc(long j) {
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzfnd.class, "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfoj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfoi(bArr);
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
        synchronized (zzfoj.class) {
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

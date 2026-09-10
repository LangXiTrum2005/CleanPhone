package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpn extends zziar implements zzicd {
    private static final zzhpn zzc;
    private static volatile zzick zzd;
    private int zza;
    private zzibd zzb = zziar.zzbM();

    static {
        zzhpn zzhpnVar = new zzhpn();
        zzc = zzhpnVar;
        zziar.zzbu(zzhpn.class, zzhpnVar);
    }

    private zzhpn() {
    }

    public static zzhpk zza() {
        return (zzhpk) zzc.zzbn();
    }

    public final /* synthetic */ void zzb(int i2) {
        this.zza = i2;
    }

    public final /* synthetic */ void zzc(zzhpm zzhpmVar) {
        zzhpmVar.getClass();
        zzibd zzibdVar = this.zzb;
        if (!zzibdVar.zza()) {
            this.zzb = zziar.zzbN(zzibdVar);
        }
        this.zzb.add(zzhpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhpm.class});
        }
        if (iOrdinal == 3) {
            return new zzhpn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpk(bArr);
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
        synchronized (zzhpn.class) {
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

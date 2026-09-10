package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpj extends zziar implements zzicd {
    private static final zzhpj zzc;
    private static volatile zzick zzd;
    private int zza;
    private zzibd zzb = zziar.zzbM();

    static {
        zzhpj zzhpjVar = new zzhpj();
        zzc = zzhpjVar;
        zziar.zzbu(zzhpj.class, zzhpjVar);
    }

    private zzhpj() {
    }

    public static zzhpj zze(byte[] bArr, zziab zziabVar) throws zzibg {
        return (zzhpj) zziar.zzbV(zzc, bArr, zziabVar);
    }

    public static zzhpj zzg(InputStream inputStream, zziab zziabVar) throws IOException {
        return (zzhpj) zziar.zzbX(zzc, inputStream, zziabVar);
    }

    public static zzhpg zzh() {
        return (zzhpg) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhpi zzd(int i2) {
        return (zzhpi) this.zzb.get(i2);
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhpi.class});
        }
        if (iOrdinal == 3) {
            return new zzhpj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpg(bArr);
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
        synchronized (zzhpj.class) {
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

    public final /* synthetic */ void zzi(int i2) {
        this.zza = i2;
    }

    public final /* synthetic */ void zzj(zzhpi zzhpiVar) {
        zzhpiVar.getClass();
        zzibd zzibdVar = this.zzb;
        if (!zzibdVar.zza()) {
            this.zzb = zziar.zzbN(zzibdVar);
        }
        this.zzb.add(zzhpiVar);
    }
}

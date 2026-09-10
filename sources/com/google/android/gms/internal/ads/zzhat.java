package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhat {
    public static byte[] zza(zzhan zzhanVar) throws GeneralSecurityException {
        return ((zzhka) zzhje.zza().zzk(zzhanVar, zzhka.class)).zzc().zzaN();
    }

    public static zzhan zzb(byte[] bArr) throws GeneralSecurityException {
        try {
            zzhpd zzhpdVarZzd = zzhpd.zzd(bArr, zziab.zza());
            zzhje zzhjeVarZza = zzhje.zza();
            zzhka zzhkaVarZzb = zzhka.zzb(zzhpdVarZzd);
            return !zzhjeVarZza.zzi(zzhkaVarZzb) ? new zzhin(zzhkaVarZzb) : zzhjeVarZza.zzj(zzhkaVarZzb);
        } catch (IOException e2) {
            throw new GeneralSecurityException("Failed to parse proto", e2);
        }
    }
}

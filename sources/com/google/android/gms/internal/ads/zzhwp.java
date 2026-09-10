package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhwp implements zzhmn {
    public static zzhmn zzb(zzhml zzhmlVar) throws GeneralSecurityException {
        zzhmn zzhmnVarZzb = zzhmr.zzb(zzhmlVar);
        try {
            return new zzhwo(zzhmnVarZzb, zzhms.zzb(zzhmlVar), null);
        } catch (GeneralSecurityException unused) {
            return zzhmnVarZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhmn
    public final byte[] zza(byte[] bArr, int i2) throws GeneralSecurityException {
        throw null;
    }
}

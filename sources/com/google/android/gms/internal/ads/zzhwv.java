package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* JADX INFO: loaded from: classes4.dex */
final class zzhwv implements zzhap {
    public /* synthetic */ zzhwv(RSAPrivateCrtKey rSAPrivateCrtKey, zzhwl zzhwlVar, zzhwl zzhwlVar2, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (zzhhc.zza()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhxa.zzb(zzhwlVar);
        if (!zzhwlVar.equals(zzhwlVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzhxa.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzhxa.zzd(rSAPrivateCrtKey.getPublicExponent());
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}

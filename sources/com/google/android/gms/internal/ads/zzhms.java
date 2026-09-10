package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhms implements zzhmn {
    private final Key zza;
    private final Provider zzb;

    private zzhms(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.zza = new SecretKeySpec(bArr, "AES");
        this.zzb = provider;
    }

    public static zzhmn zzb(zzhml zzhmlVar) throws GeneralSecurityException {
        Provider providerZza = zzhhf.zza();
        if (providerZza == null) {
            throw new GeneralSecurityException("Conscrypt not available");
        }
        Mac.getInstance("AESCMAC", providerZza);
        return new zzhms(zzhmlVar.zzd().zzc(zzgzv.zza()), providerZza);
    }

    @Override // com.google.android.gms.internal.ads.zzhmn
    public final byte[] zza(byte[] bArr, int i2) throws GeneralSecurityException {
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Provider provider = this.zzb;
        Key key = this.zza;
        Mac mac = Mac.getInstance("AESCMAC", provider);
        mac.init(key);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i2 == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i2);
    }
}

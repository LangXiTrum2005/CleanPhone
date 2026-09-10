package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhul implements zzhap {
    private static final byte[] zza = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    private zzhul(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        KeyFactory.getInstance("Ed25519", provider).generatePrivate(new PKCS8EncodedKeySpec(zzhvp.zza(zza, bArr)));
    }

    public static zzhap zzb(zzhrp zzhrpVar) throws GeneralSecurityException {
        Provider providerZza = zzhhf.zza();
        if (providerZza != null) {
            return new zzhul(zzhrpVar.zzf().zzc(zzgzv.zza()), zzhrpVar.zze().zze().zzc(), zzhrpVar.zzd().zzc().equals(zzhrn.zzc) ? new byte[]{0} : new byte[0], providerZza);
        }
        throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}

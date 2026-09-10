package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvf implements zzhap {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzhvf(RSAPrivateCrtKey rSAPrivateCrtKey, zzhtg zzhtgVar, zzhtg zzhtgVar2, int i2, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhhb.zza(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhxa.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzhxa.zzd(rSAPrivateCrtKey.getPublicExponent());
        zzhvg.zzc(zzhtgVar);
        zzhvg.zzd(zzhtgVar, zzhtgVar2, i2);
    }

    public static zzhap zzb(zzhtk zzhtkVar) throws GeneralSecurityException {
        Provider providerZzb = zzhvg.zzb();
        if (providerZzb == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerZzb);
        zzhti zzhtiVarZzd = zzhtkVar.zzd();
        return new zzhvf((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(zzhtkVar.zze().zzd(), zzhtiVarZzd.zzd(), zzhtkVar.zzi().zzb(zzgzv.zza()), zzhtkVar.zzf().zzb(zzgzv.zza()), zzhtkVar.zzh().zzb(zzgzv.zza()), zzhtkVar.zzj().zzb(zzgzv.zza()), zzhtkVar.zzk().zzb(zzgzv.zza()), zzhtkVar.zzl().zzb(zzgzv.zza()))), zzhtiVarZzd.zzf(), zzhtiVarZzd.zzg(), zzhtiVarZzd.zzh(), zzhtkVar.zze().zze().zzc(), zzhtiVarZzd.zze().equals(zzhth.zzc) ? zzb : zza, providerZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}

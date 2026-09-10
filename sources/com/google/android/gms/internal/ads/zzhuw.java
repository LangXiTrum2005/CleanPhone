package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhuw implements zzhap {
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};
    private static final byte[] zzd = {1, 2, 3};

    @Nullable
    Provider zza;
    private final RSAPrivateCrtKey zze;
    private final String zzf;
    private final byte[] zzg;
    private final byte[] zzh;
    private final zzhaq zzi;

    private zzhuw(RSAPrivateCrtKey rSAPrivateCrtKey, zzhsu zzhsuVar, byte[] bArr, byte[] bArr2, zzhaq zzhaqVar, @Nullable Provider provider) throws GeneralSecurityException {
        if (!zzhhb.zza(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (zzhsuVar != zzhsu.zza && zzhsuVar != zzhsu.zzb && zzhsuVar != zzhsu.zzc) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(zzhsuVar)));
        }
        zzhxa.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzhxa.zzd(rSAPrivateCrtKey.getPublicExponent());
        this.zze = rSAPrivateCrtKey;
        this.zzf = zzhux.zzc(zzhsuVar);
        this.zzg = bArr;
        this.zzh = bArr2;
        this.zzi = zzhaqVar;
        this.zza = provider;
    }

    public static zzhap zzb(zzhsy zzhsyVar) throws GeneralSecurityException {
        Provider providerZzb = zzhux.zzb();
        zzhuw zzhuwVar = new zzhuw((RSAPrivateCrtKey) (providerZzb != null ? KeyFactory.getInstance("RSA", providerZzb) : (KeyFactory) zzhwc.zzf.zzb("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzhsyVar.zze().zzd(), zzhsyVar.zzd().zzd(), zzhsyVar.zzi().zzb(zzgzv.zza()), zzhsyVar.zzf().zzb(zzgzv.zza()), zzhsyVar.zzh().zzb(zzgzv.zza()), zzhsyVar.zzj().zzb(zzgzv.zza()), zzhsyVar.zzk().zzb(zzgzv.zza()), zzhsyVar.zzl().zzb(zzgzv.zza()))), zzhsyVar.zzd().zzf(), zzhsyVar.zze().zze().zzc(), zzhsyVar.zzd().zze().equals(zzhsv.zzc) ? zzc : zzb, providerZzb != null ? zzhux.zze(zzhsyVar.zze(), providerZzb) : zzhwu.zzb(zzhsyVar.zze()), providerZzb);
        zzhuwVar.zza(zzd);
        return zzhuwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        Signature signature;
        Provider provider = this.zza;
        if (provider != null) {
            signature = Signature.getInstance(this.zzf, provider);
        } else {
            signature = (Signature) zzhwc.zzc.zzb(this.zzf);
        }
        signature.initSign(this.zze);
        signature.update(bArr);
        byte[] bArr2 = this.zzh;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.zzg;
        if (bArr3.length > 0) {
            bArrSign = zzhvp.zza(bArr3, bArrSign);
        }
        try {
            this.zzi.zza(bArrSign, bArr);
            return bArrSign;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException("RSA signature computation error", e2);
        }
    }
}

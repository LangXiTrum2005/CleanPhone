package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzhtc implements zzhhz {
    static final /* synthetic */ zzhtc zza = new zzhtc();

    private /* synthetic */ zzhtc() {
    }

    @Override // com.google.android.gms.internal.ads.zzhhz
    public final /* synthetic */ zzgzx zza(zzhan zzhanVar, Integer num) throws GeneralSecurityException {
        zzhsw zzhswVar = (zzhsw) zzhanVar;
        int i2 = zzhte.zza;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhwc.zze.zzb("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhswVar.zzc(), new BigInteger(1, zzhswVar.zzd().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        zzhsz zzhszVar = new zzhsz(null);
        zzhszVar.zza(zzhswVar);
        zzhszVar.zzb(rSAPublicKey.getModulus());
        zzhszVar.zzc(num);
        zzhta zzhtaVarZzd = zzhszVar.zzd();
        zzhsx zzhsxVar = new zzhsx(null);
        zzhsxVar.zza(zzhtaVarZzd);
        zzhsxVar.zzb(zzhxd.zza(rSAPrivateCrtKey.getPrimeP(), zzgzv.zza()), zzhxd.zza(rSAPrivateCrtKey.getPrimeQ(), zzgzv.zza()));
        zzhsxVar.zzc(zzhxd.zza(rSAPrivateCrtKey.getPrivateExponent(), zzgzv.zza()));
        zzhsxVar.zzd(zzhxd.zza(rSAPrivateCrtKey.getPrimeExponentP(), zzgzv.zza()), zzhxd.zza(rSAPrivateCrtKey.getPrimeExponentQ(), zzgzv.zza()));
        zzhsxVar.zze(zzhxd.zza(rSAPrivateCrtKey.getCrtCoefficient(), zzgzv.zza()));
        return zzhsxVar.zzf();
    }
}

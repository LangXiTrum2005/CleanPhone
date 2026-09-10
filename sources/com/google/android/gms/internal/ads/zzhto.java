package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzhto implements zzhhz {
    static final /* synthetic */ zzhto zza = new zzhto();

    private /* synthetic */ zzhto() {
    }

    @Override // com.google.android.gms.internal.ads.zzhhz
    public final /* synthetic */ zzgzx zza(zzhan zzhanVar, Integer num) throws GeneralSecurityException {
        zzhti zzhtiVar = (zzhti) zzhanVar;
        int i2 = zzhtq.zza;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhwc.zze.zzb("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhtiVar.zzc(), new BigInteger(1, zzhtiVar.zzd().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        zzhtl zzhtlVar = new zzhtl(null);
        zzhtlVar.zza(zzhtiVar);
        zzhtlVar.zzb(rSAPublicKey.getModulus());
        zzhtlVar.zzc(num);
        zzhtm zzhtmVarZzd = zzhtlVar.zzd();
        zzhtj zzhtjVar = new zzhtj(null);
        zzhtjVar.zza(zzhtmVarZzd);
        zzhtjVar.zzb(zzhxd.zza(rSAPrivateCrtKey.getPrimeP(), zzgzv.zza()), zzhxd.zza(rSAPrivateCrtKey.getPrimeQ(), zzgzv.zza()));
        zzhtjVar.zzc(zzhxd.zza(rSAPrivateCrtKey.getPrivateExponent(), zzgzv.zza()));
        zzhtjVar.zzd(zzhxd.zza(rSAPrivateCrtKey.getPrimeExponentP(), zzgzv.zza()), zzhxd.zza(rSAPrivateCrtKey.getPrimeExponentQ(), zzgzv.zza()));
        zzhtjVar.zze(zzhxd.zza(rSAPrivateCrtKey.getCrtCoefficient(), zzgzv.zza()));
        return zzhtjVar.zzf();
    }
}

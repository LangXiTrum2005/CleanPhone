package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzhrk implements zzhhz {
    static final /* synthetic */ zzhrk zza = new zzhrk();

    private /* synthetic */ zzhrk() {
    }

    @Override // com.google.android.gms.internal.ads.zzhhz
    public final /* synthetic */ zzgzx zza(zzhan zzhanVar, Integer num) throws GeneralSecurityException {
        zzhre zzhreVar = (zzhre) zzhanVar;
        int i2 = zzhrm.zza;
        ECParameterSpec eCParameterSpecZza = zzhreVar.zzd().zza();
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhwc.zze.zzb("EC");
        keyPairGenerator.initialize(eCParameterSpecZza);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
        zzhrh zzhrhVar = new zzhrh(null);
        zzhrhVar.zza(zzhreVar);
        zzhrhVar.zzc(num);
        zzhrhVar.zzb(eCPublicKey.getW());
        zzhri zzhriVarZzd = zzhrhVar.zzd();
        zzhrf zzhrfVar = new zzhrf(null);
        zzhrfVar.zza(zzhriVarZzd);
        zzhrfVar.zzb(zzhxd.zza(eCPrivateKey.getS(), zzgzv.zza()));
        return zzhrfVar.zzc();
    }
}

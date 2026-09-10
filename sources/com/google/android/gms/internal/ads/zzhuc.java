package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhuc implements zzhap {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzhuc(ECPrivateKey eCPrivateKey, zzhwl zzhwlVar, zzhvv zzhvvVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhhb.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        zzhwz.zza(zzhwlVar);
    }

    public static zzhap zzb(zzhrg zzhrgVar) throws GeneralSecurityException {
        Provider providerZza = zzhhf.zza();
        return new zzhuc((ECPrivateKey) (providerZza != null ? KeyFactory.getInstance("EC", providerZza) : (KeyFactory) zzhwc.zzf.zzb("EC")).generatePrivate(new ECPrivateKeySpec(zzhrgVar.zzf().zzb(zzgzv.zza()), zzhvw.zzb((zzhvu) zzhud.zzc.zzb(zzhrgVar.zzd().zzd())))), (zzhwl) zzhud.zza.zzb(zzhrgVar.zzd().zze()), (zzhvv) zzhud.zzb.zzb(zzhrgVar.zzd().zzc()), zzhrgVar.zze().zze().zzc(), zzhrgVar.zzd().zzf().equals(zzhrd.zzc) ? zzb : zza, providerZza);
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhww implements zzhap {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    public static zzhap zzb(zzhtk zzhtkVar) throws GeneralSecurityException {
        try {
            return zzhvf.zzb(zzhtkVar);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) ((KeyFactory) zzhwc.zzf.zzb("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzhtkVar.zze().zzd(), zzhtkVar.zzd().zzd(), zzhtkVar.zzi().zzb(zzgzv.zza()), zzhtkVar.zzf().zzb(zzgzv.zza()), zzhtkVar.zzh().zzb(zzgzv.zza()), zzhtkVar.zzj().zzb(zzgzv.zza()), zzhtkVar.zzk().zzb(zzgzv.zza()), zzhtkVar.zzl().zzb(zzgzv.zza())));
            zzhti zzhtiVarZzd = zzhtkVar.zzd();
            zzhhs zzhhsVar = zzhwy.zza;
            return new zzhwv(rSAPrivateCrtKey, (zzhwl) zzhhsVar.zzb(zzhtiVarZzd.zzf()), (zzhwl) zzhhsVar.zzb(zzhtiVarZzd.zzg()), zzhtiVarZzd.zzh(), zzhtkVar.zze().zze().zzc(), zzhtkVar.zzd().zze().equals(zzhth.zzc) ? zzb : zza, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}

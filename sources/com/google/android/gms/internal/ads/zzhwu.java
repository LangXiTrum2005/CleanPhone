package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhwu implements zzhaq {
    static final zzhhs zza;
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};

    static {
        zzhhr zzhhrVarZza = zzhhs.zza();
        zzhhrVarZza.zza(zzhwl.SHA256, zzhsu.zza);
        zzhhrVarZza.zza(zzhwl.SHA384, zzhsu.zzb);
        zzhhrVarZza.zza(zzhwl.SHA512, zzhsu.zzc);
        zza = zzhhrVarZza.zzb();
    }

    public static zzhaq zzb(zzhta zzhtaVar) throws GeneralSecurityException {
        try {
            return zzhux.zzd(zzhtaVar);
        } catch (NoSuchProviderException unused) {
            return new zzhwt((RSAPublicKey) ((KeyFactory) zzhwc.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhtaVar.zzd(), zzhtaVar.zzf().zzd())), (zzhwl) zza.zzb(zzhtaVar.zzf().zzf()), zzhtaVar.zze().zzc(), zzhtaVar.zzf().zze().equals(zzhsv.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}

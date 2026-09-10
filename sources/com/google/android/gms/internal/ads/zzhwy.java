package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhwy implements zzhaq {
    static final zzhhs zza;
    private static final byte[] zzb;
    private static final byte[] zzc;

    static {
        zzhhr zzhhrVarZza = zzhhs.zza();
        zzhhrVarZza.zza(zzhwl.SHA256, zzhtg.zza);
        zzhhrVarZza.zza(zzhwl.SHA384, zzhtg.zzb);
        zzhhrVarZza.zza(zzhwl.SHA512, zzhtg.zzc);
        zza = zzhhrVarZza.zzb();
        zzb = new byte[0];
        zzc = new byte[]{0};
    }

    public static zzhaq zzb(zzhtm zzhtmVar) throws GeneralSecurityException {
        try {
            return zzhvg.zze(zzhtmVar);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) zzhwc.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhtmVar.zzd(), zzhtmVar.zzf().zzd()));
            zzhti zzhtiVarZzf = zzhtmVar.zzf();
            zzhhs zzhhsVar = zza;
            return new zzhwx(rSAPublicKey, (zzhwl) zzhhsVar.zzb(zzhtiVarZzf.zzf()), (zzhwl) zzhhsVar.zzb(zzhtiVarZzf.zzg()), zzhtiVarZzf.zzh(), zzhtmVar.zze().zzc(), zzhtmVar.zzf().zze().equals(zzhth.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}

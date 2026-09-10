package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvs implements zzhap {
    private final byte[] zza;

    private zzhvs(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        byte[] bArrZzb = zzhhm.zzb(bArr);
        this.zza = bArrZzb;
        zzhhm.zza(bArrZzb);
    }

    public static zzhap zzb(zzhrp zzhrpVar) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhul.zzb(zzhrpVar);
        } catch (GeneralSecurityException unused) {
            return new zzhvs(zzhrpVar.zzf().zzc(zzgzv.zza()), zzhrpVar.zze().zze().zzc(), zzhrpVar.zzd().zzc().equals(zzhrn.zzc) ? new byte[]{0} : new byte[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}

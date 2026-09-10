package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvl implements zzgzq {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzhvl(byte[] bArr, zzhxc zzhxcVar) throws GeneralSecurityException {
        if (!zzhhb.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzhfh.zzb(bArr);
        this.zzb = zzhxcVar.zzc();
    }

    public static zzgzq zzb(zzhcd zzhcdVar) throws GeneralSecurityException {
        zzhcdVar.zzf();
        zzhcdVar.zzf();
        return new zzhvl(zzhcdVar.zze().zzc(zzgzv.zza()), zzhcdVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgzq
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhkl.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecZzc = zzhfh.zzc(bArr, length2, 12);
        SecretKey secretKey = this.zza;
        Cipher cipherZza = zzhfh.zza();
        cipherZza.init(2, secretKey, algorithmParameterSpecZzc);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        return cipherZza.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}

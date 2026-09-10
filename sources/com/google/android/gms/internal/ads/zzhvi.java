package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvi implements zzhwn {
    private static final ThreadLocal zza = new zzhvh();
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    public zzhvi(byte[] bArr, int i2) throws GeneralSecurityException {
        if (!zzhhb.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhxa.zza(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) zza.get()).getBlockSize();
        this.zzd = blockSize;
        if (i2 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhwn
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.zzc;
        if (length < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        int i3 = length - i2;
        byte[] bArr3 = new byte[i3];
        Cipher cipher = (Cipher) zza.get();
        byte[] bArr4 = new byte[this.zzd];
        System.arraycopy(bArr2, 0, bArr4, 0, i2);
        cipher.init(2, this.zzb, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i2, i3, bArr3, 0) == i3) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}

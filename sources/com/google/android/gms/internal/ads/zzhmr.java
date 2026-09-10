package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhmr implements zzhmn {
    private static final ThreadLocal zzd = new zzhmq();
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzhmr(byte[] bArr) throws GeneralSecurityException {
        zzhxa.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher cipherZzc = zzc();
        cipherZzc.init(1, secretKeySpec);
        byte[] bArrZza = zzhmb.zza(cipherZzc.doFinal(new byte[16]));
        this.zzb = bArrZza;
        this.zzc = zzhmb.zza(bArrZza);
    }

    public static zzhmn zzb(zzhml zzhmlVar) throws GeneralSecurityException {
        return new zzhmr(zzhmlVar.zzd().zzc(zzgzv.zza()));
    }

    private static Cipher zzc() throws GeneralSecurityException {
        if (zzhhb.zza(1)) {
            return (Cipher) zzd.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zzd(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3) {
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3 + i2]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhmn
    public final byte[] zza(byte[] bArr, int i2) throws GeneralSecurityException {
        byte[] bArrZzb;
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.zza;
        Cipher cipherZzc = zzc();
        cipherZzc.init(1, secretKey);
        int length = bArr.length;
        int i3 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i4 = i3 - 1;
        int i5 = i4 * 16;
        if (i3 * 16 == length) {
            bArrZzb = zzhvp.zzb(bArr, i5, this.zzb, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            byte[] bArr2 = this.zzc;
            if (bArrCopyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrZzb = zzhvp.zzb(bArrCopyOf, 0, bArr2, 0, 16);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i6 = 0; i6 < i4; i6++) {
            zzd(bArr3, bArr, i6 * 16, bArr4);
            if (cipherZzc.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        zzd(bArr3, bArrZzb, 0, bArr4);
        if (cipherZzc.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return i2 == 16 ? bArr3 : Arrays.copyOf(bArr3, i2);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}

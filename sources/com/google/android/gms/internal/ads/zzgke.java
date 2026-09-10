package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgke implements zzgdn {
    private final byte[] zza;
    private final int zzb;
    private final zzgpy zzc;

    private zzgke(byte[] bArr, zzgvo zzgvoVar, int i) throws GeneralSecurityException {
        this.zzc = new zzgvi(bArr);
        this.zza = zzgvoVar.zzc();
        this.zzb = i;
    }

    public static zzgdn zzb(zzgif zzgifVar) throws GeneralSecurityException {
        return new zzgke(zzgifVar.zzd().zzd(zzgdw.zza()), zzgifVar.zzc(), zzgifVar.zzb().zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zza;
        int i = this.zzb;
        int length = bArr.length;
        if (length < bArr3.length + i + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgnu.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.zza;
        int i2 = this.zzb;
        int length2 = bArr4.length;
        int i3 = i2 + length2;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i3);
        byte[] bArr5 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr6 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr6, 4, length3);
        byte[] bArr7 = new byte[32];
        System.arraycopy(this.zzc.zza(bArr5, 16), 0, bArr7, 0, 16);
        System.arraycopy(this.zzc.zza(bArr6, 16), 0, bArr7, 16, 16);
        if (!zzgks.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyZzc = zzgjd.zzc(bArr7);
        int i4 = i3 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i3, i4);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i3 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgjd.zza(bArrCopyOfRange2, 0, 12);
        Cipher cipherZzb = zzgjd.zzb();
        cipherZzb.init(2, secretKeyZzc, algorithmParameterSpecZza);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZzb.updateAAD(bArr2);
        }
        return cipherZzb.doFinal(bArr, i4, length - i4);
    }
}

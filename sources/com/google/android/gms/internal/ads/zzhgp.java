package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhgp implements zzgzq {
    private final byte[] zza;
    private final byte[] zzb;
    private final Provider zzc;

    private zzhgp(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = bArr;
        this.zzb = bArr2;
        this.zzc = provider;
    }

    public static zzgzq zzb(zzhep zzhepVar) throws GeneralSecurityException {
        return new zzhgp(zzhepVar.zze().zzc(zzgzv.zza()), zzhepVar.zzc().zzc(), zzhfu.zzc().getProvider());
    }

    @Override // com.google.android.gms.internal.ads.zzgzq
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhkl.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, length2, bArr4, 0, 24);
        int[] iArrZze = zzhga.zze(zzhga.zzd(this.zza), zzhga.zzd(bArr4));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrZze.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZze);
        SecretKeySpec secretKeySpec = new SecretKeySpec(byteBufferOrder.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        Provider provider = this.zzc;
        int i2 = zzhfu.zza;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 24 + length2, (length - length2) - 24);
    }
}

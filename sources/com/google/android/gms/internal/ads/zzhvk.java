package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvk implements zzgzq {
    private static final ThreadLocal zza = new zzhvj();
    private final byte[] zzb;
    private final zzhmn zzc;
    private final SecretKeySpec zzd;
    private final int zze;

    private zzhvk(byte[] bArr, int i2, byte[] bArr2) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i2 != 12 && i2 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zze = i2;
        int length = bArr.length;
        zzhxa.zza(length);
        this.zzd = new SecretKeySpec(bArr, "AES");
        this.zzc = zzhwp.zzb(zzhml.zzc(zzhmm.zzb(length), zzhxe.zza(bArr, zzgzv.zza())));
        this.zzb = bArr2;
    }

    public static zzgzq zzb(zzhbv zzhbvVar) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        zzhbvVar.zzf();
        return new zzhvk(zzhbvVar.zze().zzc(zzgzv.zza()), zzhbvVar.zzf().zzd(), zzhbvVar.zzc().zzc());
    }

    private final byte[] zzc(int i2, byte[] bArr, int i3, int i4) throws GeneralSecurityException {
        byte[] bArr2 = new byte[i4 + 16];
        bArr2[15] = (byte) i2;
        System.arraycopy(bArr, i3, bArr2, 16, i4);
        return this.zzc.zza(bArr2, 16);
    }

    @Override // com.google.android.gms.internal.ads.zzgzq
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i2 = this.zze;
        int i3 = ((length - length2) - i2) - 16;
        if (i3 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhkl.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrZzc = zzc(0, bArr, length2, i2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrZzc2 = zzc(1, bArr2, 0, bArr2.length);
        byte[] bArrZzc3 = zzc(2, bArr, length2 + i2, i3);
        int i4 = length - 16;
        byte b2 = 0;
        for (int i5 = 0; i5 < 16; i5++) {
            b2 = (byte) (b2 | (((bArr[i4 + i5] ^ bArrZzc2[i5]) ^ bArrZzc[i5]) ^ bArrZzc3[i5]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, this.zzd, new IvParameterSpec(bArrZzc));
        return cipher.doFinal(bArr, bArr3.length + i2, i3);
    }
}

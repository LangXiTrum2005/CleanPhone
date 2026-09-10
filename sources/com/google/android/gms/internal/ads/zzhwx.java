package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzhwx implements zzhaq {
    private final RSAPublicKey zza;
    private final zzhwl zzb;
    private final zzhwl zzc;
    private final int zzd;
    private final byte[] zze;
    private final byte[] zzf;

    public /* synthetic */ zzhwx(RSAPublicKey rSAPublicKey, zzhwl zzhwlVar, zzhwl zzhwlVar2, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (zzhhc.zza()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhxa.zzb(zzhwlVar);
        if (!zzhwlVar.equals(zzhwlVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzhxa.zzc(rSAPublicKey.getModulus().bitLength());
        zzhxa.zzd(rSAPublicKey.getPublicExponent());
        this.zza = rSAPublicKey;
        this.zzb = zzhwlVar;
        this.zzc = zzhwlVar2;
        this.zzd = i2;
        this.zze = bArr;
        this.zzf = bArr2;
    }

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = modulus.bitLength() + 7;
        int iBitLength2 = modulus.bitLength() + 6;
        if (iBitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrZzb = zzhhe.zzb(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        zzhwl zzhwlVar = this.zzb;
        zzhxa.zzb(zzhwlVar);
        zzhwc zzhwcVar = zzhwc.zzd;
        MessageDigest messageDigest = (MessageDigest) zzhwcVar.zzb(zzhwz.zzb(zzhwlVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzf;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrZzb.length;
        int i2 = this.zzd;
        if (length < digestLength + i2 + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrZzb[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i3 = length - digestLength;
        int i4 = i3 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrZzb, i4);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrZzb, length2, length2 + digestLength);
        int i5 = 0;
        while (true) {
            long j = (((long) length) * 8) - ((long) iBitLength3);
            if (i5 < j) {
                if (((bArrCopyOf[i5 / 8] >> (7 - (i5 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i5++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) zzhwcVar.zzb(zzhwz.zzb(this.zzc));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i4];
                int i6 = 0;
                int i7 = 0;
                while (i6 <= (i3 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    int i8 = i2;
                    messageDigest2.update(zzhhe.zzb(BigInteger.valueOf(i6), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i7, Math.min(length3, i4 - i7));
                    i7 += length3;
                    i6++;
                    i2 = i8;
                    messageDigest2 = messageDigest2;
                }
                int i9 = i2;
                byte[] bArr5 = new byte[i4];
                for (int i10 = 0; i10 < i4; i10++) {
                    bArr5[i10] = (byte) (bArr4[i10] ^ bArrCopyOf[i10]);
                }
                for (int i11 = 0; i11 <= j; i11++) {
                    int i12 = i11 / 8;
                    bArr5[i12] = (byte) ((~(1 << (7 - (i11 % 8)))) & bArr5[i12]);
                }
                int i13 = 0;
                while (true) {
                    int i14 = (i3 - i9) - 2;
                    if (i13 >= i14) {
                        if (bArr5[i14] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, i4 - i9, i4);
                        int i15 = digestLength + 8;
                        byte[] bArr6 = new byte[i15 + i9];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i15, bArrCopyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i13] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i13++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        int length = bArr3.length;
        if (length == 0) {
            zzb(bArr, bArr2);
        } else {
            if (!zzhkl.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzb(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}

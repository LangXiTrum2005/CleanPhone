package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzhwt implements zzhaq {
    private final RSAPublicKey zza;
    private final zzhwl zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    public /* synthetic */ zzhwt(RSAPublicKey rSAPublicKey, zzhwl zzhwlVar, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (zzhhc.zza()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        zzhxa.zzb(zzhwlVar);
        zzhxa.zzc(rSAPublicKey.getModulus().bitLength());
        zzhxa.zzd(rSAPublicKey.getPublicExponent());
        this.zza = rSAPublicKey;
        this.zzb = zzhwlVar;
        this.zzc = bArr;
        this.zzd = bArr2;
    }

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza;
        int i2;
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrZzb = zzhhe.zzb(bigInteger.modPow(publicExponent, modulus), iBitLength);
        zzhwl zzhwlVar = this.zzb;
        zzhxa.zzb(zzhwlVar);
        MessageDigest messageDigest = (MessageDigest) zzhwc.zzd.zzb(zzhwz.zzb(zzhwlVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzd;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = zzhwlVar.ordinal();
        int i3 = 2;
        if (iOrdinal == 2) {
            bArrZza = zzhwm.zza("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrZza = zzhwm.zza("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(zzhwlVar.toString()));
            }
            bArrZza = zzhwm.zza("3051300d060960864801650304020305000440");
        }
        int length = bArrZza.length + bArrDigest.length;
        if (iBitLength < length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i4 = 0;
        while (true) {
            i2 = i3 + 1;
            if (i4 >= (iBitLength - length) - 3) {
                break;
            }
            bArr4[i3] = -1;
            i4++;
            i3 = i2;
        }
        bArr4[i3] = 0;
        int length2 = bArrZza.length;
        System.arraycopy(bArrZza, 0, bArr4, i2, length2);
        System.arraycopy(bArrDigest, 0, bArr4, i2 + length2, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrZzb, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
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

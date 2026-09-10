package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xq1 implements hf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f21973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sq1 f21974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sq1 f21975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f21977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f21978f;

    public /* synthetic */ xq1(RSAPublicKey rSAPublicKey, sq1 sq1Var, sq1 sq1Var2, int i10, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (uh1.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        ic1.f(sq1Var);
        if (!sq1Var.equals(sq1Var2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        ic1.i(rSAPublicKey.getModulus().bitLength());
        ic1.k(rSAPublicKey.getPublicExponent());
        this.f21973a = rSAPublicKey;
        this.f21974b = sq1Var;
        this.f21975c = sq1Var2;
        this.f21976d = i10;
        this.f21977e = bArr;
        this.f21978f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f21977e;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!rj1.c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.f21973a;
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
        byte[] bArrI = jd1.i(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        sq1 sq1Var = this.f21974b;
        ic1.f(sq1Var);
        qq1 qq1Var = qq1.f19166e;
        MessageDigest messageDigest = (MessageDigest) qq1Var.f19169a.zza(gc1.h(sq1Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f21978f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrI.length;
        int i10 = this.f21976d;
        if (length < digestLength + i10 + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrI[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i11 = length - digestLength;
        int i12 = i11 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrI, i12);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrI, length2, length2 + digestLength);
        int i13 = 0;
        while (true) {
            long j10 = (((long) length) * 8) - ((long) iBitLength3);
            if (i13 < j10) {
                if (((bArrCopyOf[i13 / 8] >> (7 - (i13 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i13++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) qq1Var.f19169a.zza(gc1.h(this.f21975c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i12];
                int i14 = 0;
                int i15 = 0;
                while (i14 <= (i11 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    messageDigest2.update(jd1.i(BigInteger.valueOf(i14), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i15, Math.min(length3, i12 - i15));
                    i15 += length3;
                    i14++;
                    messageDigest2 = messageDigest2;
                }
                byte[] bArr5 = new byte[i12];
                for (int i16 = 0; i16 < i12; i16++) {
                    bArr5[i16] = (byte) (bArr4[i16] ^ bArrCopyOf[i16]);
                }
                for (int i17 = 0; i17 <= j10; i17++) {
                    int i18 = i17 / 8;
                    bArr5[i18] = (byte) ((~(1 << (7 - (i17 % 8)))) & bArr5[i18]);
                }
                int i19 = 0;
                while (true) {
                    int i20 = (i11 - i10) - 2;
                    if (i19 >= i20) {
                        if (bArr5[i20] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, i12 - i10, i12);
                        int i21 = digestLength + 8;
                        byte[] bArr6 = new byte[i10 + i21];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i21, bArrCopyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i19] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i19++;
                }
            }
        }
    }
}

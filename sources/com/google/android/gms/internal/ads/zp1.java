package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zp1 implements hf1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f22690f = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22691a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f22692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f22693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PublicKey f22694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Serializable f22695e;

    public /* synthetic */ zp1(RSAPublicKey rSAPublicKey, sq1 sq1Var, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (uh1.a()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        ic1.f(sq1Var);
        ic1.i(rSAPublicKey.getModulus().bitLength());
        ic1.k(rSAPublicKey.getPublicExponent());
        this.f22694d = rSAPublicKey;
        this.f22695e = sq1Var;
        this.f22692b = bArr;
        this.f22693c = bArr2;
    }

    public static zp1 b(zo1 zo1Var) throws GeneralSecurityException {
        Provider providerD = v71.d();
        if (providerD == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (jc1.e(1)) {
            return new zp1(zo1Var.f22683c.b(), zo1Var.f22684d.b(), zo1Var.f22682b.f21561a.equals(vo1.f21224d) ? new byte[]{0} : new byte[0], providerD);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f22691a) {
            case 0:
                byte[] bArr3 = this.f22692b;
                int length = bArr3.length;
                if (bArr.length != length + 64) {
                    throw new GeneralSecurityException("Invalid signature length: 64");
                }
                if (!rj1.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                Signature signature = Signature.getInstance("Ed25519", (Provider) this.f22695e);
                signature.initVerify(this.f22694d);
                signature.update(bArr2);
                signature.update(this.f22693c);
                try {
                    if (signature.verify(bArr, length, 64)) {
                        return;
                    }
                } catch (RuntimeException unused) {
                }
                throw new GeneralSecurityException("Signature check failed.");
            default:
                byte[] bArr4 = this.f22692b;
                int length2 = bArr4.length;
                if (length2 == 0) {
                    c(bArr, bArr2);
                    return;
                } else {
                    if (!rj1.c(bArr4, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    c(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                    return;
                }
        }
    }

    public void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrD;
        int i10;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.f22694d;
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
        byte[] bArrI = jd1.i(bigInteger.modPow(publicExponent, modulus), iBitLength);
        sq1 sq1Var = (sq1) this.f22695e;
        ic1.f(sq1Var);
        MessageDigest messageDigest = (MessageDigest) qq1.f19166e.f19169a.zza(gc1.h(sq1Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f22693c;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = sq1Var.ordinal();
        int i11 = 2;
        if (iOrdinal == 2) {
            bArrD = jd1.d("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrD = jd1.d("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(sq1Var.toString()));
            }
            bArrD = jd1.d("3051300d060960864801650304020305000440");
        }
        int length = bArrD.length + bArrDigest.length;
        if (iBitLength < length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i12 = 0;
        while (true) {
            i10 = i11 + 1;
            if (i12 >= (iBitLength - length) - 3) {
                break;
            }
            bArr4[i11] = -1;
            i12++;
            i11 = i10;
        }
        bArr4[i11] = 0;
        int length2 = bArrD.length;
        System.arraycopy(bArrD, 0, bArr4, i10, length2);
        System.arraycopy(bArrDigest, 0, bArr4, i10 + length2, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrI, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    public zp1(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (jc1.e(1)) {
            if (bArr.length == 32) {
                this.f22694d = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(jc1.f(f22690f, bArr)));
                this.f22692b = bArr2;
                this.f22693c = bArr3;
                this.f22695e = provider;
                return;
            }
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }
}
